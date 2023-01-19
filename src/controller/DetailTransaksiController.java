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
    public boolean datacari(int id){
         DetailTransaksiEntity data = DetailTransaksiModel.dataCari(id);
        if(data!=null){
            return true;
        }
        else {
            return false;
        }
    }
    public void hapus(int id) {
        DetailTransaksiModel.hapus(id);
    }
}