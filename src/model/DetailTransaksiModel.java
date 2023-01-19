package model;
import java.util.Scanner;
import java.util.ArrayList;

import entity.TransaksiEntity;
import entity.PengunjungEntity;
import entity.DetailTransaksiEntity;

public class DetailTransaksiModel {
    static ArrayList<DetailTransaksiEntity> arrayData = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void beli(PengunjungEntity pengunjung, TransaksiEntity transaksi){
        arrayData.add(new DetailTransaksiEntity(pengunjung, transaksi));
    }

    public static ArrayList<DetailTransaksiEntity> all(){
        return arrayData;
    }
    public static DetailTransaksiEntity dataCari(String nama){
        for(DetailTransaksiEntity objek : arrayData){
            if(objek.getPengunjung().getNama().equals(nama)){
                return objek;
            }
        }
        return null;
    }

    public static int Index(String nama){
        DetailTransaksiEntity objekData = dataCari(nama);
        return arrayData.indexOf(objekData);
    }

    public static void hapus(String nama){
        int index = Index(nama);
        if (index!=-1){
            arrayData.remove(index);
        }
    }
}