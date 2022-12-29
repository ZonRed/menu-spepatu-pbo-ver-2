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
}