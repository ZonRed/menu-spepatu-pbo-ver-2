package view;

import controller.DataTransaksiController;
import entity.DataTransaksiEntity;
import entity.TransaksiEntity;
import model.DataSepatuModel;
import model.DataTransaksiModel;

import java.util.Scanner;


public class DataTransaksiView implements InterfaceView{
    Scanner input = new Scanner(System.in);
    DataTransaksiController data = new DataTransaksiController();

    @Override
    public void inputBeli(){
        String Id;
        String Nama,Alamat;
        try{
            System.out.println("=============================================");
            System.out.print("Masukkan Id Pembeli            = ");
            Id = input.nextLine();
            System.out.print("Masukkan Atas Nama Pembeli     = ");
            Nama = input.nextLine();
            System.out.print("Masukkan Alamat Pembeli        = ");
            Alamat = input.nextLine();
            System.out.println("=============================================");

            TransaksiEntity objekTransaksi = pilihSepatu();
            data.beli(Id,Nama,Alamat,objekTransaksi);
            System.out.println("Data successfully entered");
        }catch(Exception e){
            System.err.println("Data not entered");
        }

    }

    private TransaksiEntity pilihSepatu(){
        boolean pilih = false;
        String jenis;
        TransaksiEntity transaksi;

        do {
            System.out.print("Masukkan Jenis         = ");
            jenis = input.nextLine();
            transaksi = DataSepatuModel.cari(jenis);
            if (transaksi!=null) {
                char pilihSepatuIni = 'n';

                System.out.println("=============================================");
                System.out.println("Jenis Sepatu  = " + transaksi.getBarang().getJenisSepatu());
                System.out.println("Ukuran Sepatu = " + transaksi.getUkuran());
                System.out.println("Bahan Sepatu  = " + transaksi.getBarang().getBahan());
                System.out.println("Harga Sepatu  = " + transaksi.getHarga());
                System.out.println("=============================================");

                System.out.print("  Pilih Sepatu ini (y/n) : ");
               pilihSepatuIni = input.nextLine().charAt(0);

                if (pilihSepatuIni == 'y') {
                    pilih = true;
                    System.out.print("Masukkan Jumlah Sepatu Yang dibeli = ");
                    int harga = input.nextInt();
                    input.nextLine();
                    transaksi.setTotalHarga(harga);
                    break;
                }
            } else {
                System.err.println("------------ Can't Find Data -----------");
            }
        } while (pilih == false);

        return transaksi;
    }

    @Override
    public void display(){
        if(DataTransaksiModel.all().isEmpty()) {
            System.err.println("Blank Data");
        }
        else{
            for (DataTransaksiEntity dataTransaksi : DataTransaksiModel.all()) {
                System.out.println();
                System.out.println("=============== Struct Kyoni ================");
                System.out.println("Nama Pembeli              = " + dataTransaksi.getPengunjung().getNama());
                System.out.println("Alamat Pembeli            = " + dataTransaksi.getPengunjung().getAlamat());
                System.out.println("Jenis Sepatu yang dibeli  = " + dataTransaksi.getTransaksi().getBarang().getJenisSepatu());
                System.out.println("Ukuran Sepatu yang dibeli = " + dataTransaksi.getTransaksi().getUkuran());
                System.out.println("Bahan Sepatu yang dibeli  = " + dataTransaksi.getTransaksi().getBarang().getBahan());
                System.out.println("Total Harga               = " + dataTransaksi.getTransaksi().getTotalHarga());
                System.out.println("=============================================");
                System.out.println();
            }
        }

    }
    public void hapusData(){
        System.out.print("Masukkan Nama Yang Akan Dihapus = ");
        String nama = input.nextLine();
        DataTransaksiEntity ObjekData = DataTransaksiModel.dataCari(nama);
        if(ObjekData!=null){
            data.hapus(nama);
            System.out.println("Clear Done");
        }
        else{
            System.out.println("Nama " + nama + " Tidak Ditemukan");
        }
    }
}
