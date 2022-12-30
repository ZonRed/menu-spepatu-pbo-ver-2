package model;

import entity.BarangEntity;
import entity.TransaksiEntity;

import java.util.ArrayList;
import java.util.Scanner;

public class DataSepatuModel {
    static Scanner input = new Scanner(System.in);
    static ArrayList<TransaksiEntity> arrayTransaksi = new ArrayList<>();
    static TransaksiEntity objTransaksi = new TransaksiEntity();

    public static void dataBarang(){
        arrayTransaksi.add(new TransaksiEntity(new BarangEntity("sneakers1", "kulit sapi"),43, 400000));
        arrayTransaksi.add(new TransaksiEntity(new BarangEntity("sneakers2", "kulit sapi"),44, 450000));
        arrayTransaksi.add(new TransaksiEntity(new BarangEntity("sneakers3", "kulit sapi"),45, 500000));
        arrayTransaksi.add(new TransaksiEntity(new BarangEntity("sport1", "kulit sapi"),43, 600000));
        arrayTransaksi.add(new TransaksiEntity(new BarangEntity("sport2", "kulit sapi"),44, 650000));
        arrayTransaksi.add(new TransaksiEntity(new BarangEntity("sport3", "kulit sapi"),45, 700000));
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