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
    public static DetailTransaksiEntity dataCari(int id){
        for(DetailTransaksiEntity objek : arrayData){
            if(objek.getPengunjung().getId() == id){
                return objek;
            }
        }
        return null;
    }

    public static int Index(int id){
        DetailTransaksiEntity objekData = dataCari(id);
        return arrayData.indexOf(objekData);
    }

    public static void hapus(int id){
        int index = Index(id);
        if (index!=-1){
            arrayData.remove(index);
        }
    }
}