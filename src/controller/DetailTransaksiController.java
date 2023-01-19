package controller;

import entity.PengunjungEntity;
import entity.DetailTransaksiEntity;
import entity.TransaksiEntity;
import model.DataSepatuModel;
import java.util.ArrayList;
import model.DetailTransaksiModel;

public class DetailTransaksiController {

    public ArrayList<TransaksiEntity> allTransaksi(){
        return DataSepatuModel.all();
    }

    public ArrayList<DetailTransaksiEntity> allDetail(){
       return DetailTransaksiModel.all();
    }

    public TransaksiEntity cari(String jenis){
        return DataSepatuModel.cari(jenis);
    }

    public void beli(int id, String nama,String alamat,TransaksiEntity transaksi){
        DetailTransaksiModel.beli(new PengunjungEntity( id, nama, alamat), transaksi);
    }
    public boolean datacari(String nama){
         DetailTransaksiEntity data = DetailTransaksiModel.dataCari(nama);
        if(data!=null){
            return true;
        }
        else {
            return false;
        }
    }
    public void hapus(String nama) {
        DetailTransaksiModel.hapus(nama);
    }
}