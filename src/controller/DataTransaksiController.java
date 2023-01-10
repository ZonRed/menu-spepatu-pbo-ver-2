package controller;

import entity.PengunjungEntity;
import entity.TransaksiEntity;
import model.DataSepatuModel;
import model.DataTransaksiModel;
import view.DataTransaksiView;
import view.MenuTransaksi;
import view.TransaksiView;

public class DataTransaksiController {

    public void menuDataToAmin(){
        MenuTransaksi menuTransaksi = new MenuTransaksi();
        menuTransaksi.menuData();
    }

    public void inputToMenu(){
        DataTransaksiView dataTransaksiView = new DataTransaksiView();
        dataTransaksiView.inputBeli();
    }

    public void displayTtoMenu(){
        TransaksiView transaksiView = new TransaksiView();
        transaksiView.display();
    }

    public void displayDtoMenu(){
        DataTransaksiView dataTransaksiView = new DataTransaksiView();
        dataTransaksiView.display();
    }

    public void hapusdata(){
        DataTransaksiView view = new DataTransaksiView();
        view.hapusData();
    }

    public boolean cari(String jenis){
        TransaksiEntity transaksi = DataSepatuModel.cari(jenis);
        if(transaksi!=null){
            return true;
        }
        else{
            return false;
        }
    }
    public void beli(String id, String nama,String alamat,TransaksiEntity transaksi){
        DataTransaksiModel.beli(new PengunjungEntity( id,nama, alamat), transaksi);
    }
    public void hapus(String nama){
        DataTransaksiModel.hapus(nama);
    }
}