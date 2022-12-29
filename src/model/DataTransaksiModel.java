package model;

import entity.DataTransaksiEntity;
import entity.PengunjungEntity;
import entity.TransaksiEntity;

import java.util.ArrayList;
import java.util.Scanner;

public class DataTransaksiModel {
    static ArrayList<DataTransaksiEntity> arrayData = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void beli(PengunjungEntity pengunjung, TransaksiEntity transaksi){
        arrayData.add(new DataTransaksiEntity(pengunjung, transaksi));
    }

    public static ArrayList<DataTransaksiEntity> all(){
        return arrayData;
    }

    public static DataTransaksiEntity dataCari(String nama){
        for(DataTransaksiEntity objek : arrayData){
            if(objek.getPengunjung().getNama().equals(nama)){
                return objek;
            }
        }
        return null;
    }

    public static int cariIndex(String nama){
        DataTransaksiEntity objekData = dataCari(nama);
        return arrayData.indexOf(objekData);
    }

    public static void hapus(String nama){
        int index = cariIndex(nama);
        if (index!=-1){
            arrayData.remove(index);
        }
    }
}