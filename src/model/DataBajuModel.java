package model;

import entity.BarangEntity;
import entity.TransaksiEntity;

import java.util.ArrayList;
import java.util.Scanner;

public class DataBajuModel {
    static Scanner input = new Scanner(System.in);
    static ArrayList<TransaksiEntity> arrayTransaksi = new ArrayList<>();
    static TransaksiEntity objTransaksi = new TransaksiEntity();

    public static void dataBarang(){
        arrayTransaksi.add(new TransaksiEntity(new BarangEntity("sneakers", "kulit sapi"), 500000));
        arrayTransaksi.add(new TransaksiEntity(new BarangEntity("sport", "kulit sapi"), 700000));
    }

    public static TransaksiEntity cari(String jenis){
        for(TransaksiEntity objectTransaksi : arrayTransaksi){
            if(objectTransaksi.getBarang().getJenisSepatu().equals(jenis)){
                return objectTransaksi;
            }
        }
        return null;
    }

    public static ArrayList<TransaksiEntity> all(){
        return arrayTransaksi;
    } 
}