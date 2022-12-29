package view;

import entity.TransaksiEntity;
import model.DataSepatuModel;

public class TransaksiView {

    public void display(){
        for (TransaksiEntity transaksiEntity : DataSepatuModel.all()) {
            System.out.println("============================================");
            System.out.println("Jenis Sepatu  = " + transaksiEntity.getBarang().getJenisSepatu());
            System.out.println("Bahan Sepatu  = " + transaksiEntity.getBarang().getBahan());
            System.out.println("Harga Sepatu  = " + transaksiEntity.getHarga());
            System.out.println("============================================");
        }  
    }
}