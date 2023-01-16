package model;
import java.util.ArrayList;
import java.util.Scanner;

import entity.BarangEntity;
import entity.TransaksiEntity;

public class DataSepatuModel {
    static Scanner input = new Scanner(System.in);
    static ArrayList<TransaksiEntity> arrayTransaksi = new ArrayList<>();
    static TransaksiEntity objTransaksi = new TransaksiEntity();

    public static void dataBarang(){
        arrayTransaksi.add(new TransaksiEntity(new BarangEntity("Sport1", "Kulit Sapi",44), 500000));
        arrayTransaksi.add(new TransaksiEntity(new BarangEntity("Sport2", "Kulit sapi",45), 800000));
        arrayTransaksi.add(new TransaksiEntity(new BarangEntity("Sneakers1", "Kulit Sapi",44), 60000));
        arrayTransaksi.add(new TransaksiEntity(new BarangEntity("Sneakers2", "Kulit Sapi",45), 80000));
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