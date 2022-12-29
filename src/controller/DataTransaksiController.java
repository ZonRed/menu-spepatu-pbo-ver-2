package controller;

import entity.PengunjungEntity;
import entity.TransaksiEntity;
import model.DataBajuModel;
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

    public boolean cari(String jenis){
        TransaksiEntity transaksi = DataBajuModel.cari(jenis);
        if(transaksi!=null){
            return true;
        }
        else{
            return false;
        }
    }
    public void beli(int id, String nama,String alamat,TransaksiEntity transaksi){
        DataTransaksiModel.beli(new PengunjungEntity( id,nama, alamat), transaksi);
    }
}