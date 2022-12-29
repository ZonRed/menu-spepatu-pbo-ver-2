package entity;

public class TransaksiEntity {
    private BarangEntity barang;
    private int harga;
    private int ukuran;
    private int totalHarga;

    public TransaksiEntity(BarangEntity barang,int ukuran, int harga) {
        this.barang = barang;
        this.ukuran = ukuran;
        this.harga = harga;
    }

    public TransaksiEntity() {
    }
    public BarangEntity getBarang() {
        return this.barang;
    }
    public void setBarang(BarangEntity barang) {
        this.barang = barang;
    }
    public int getHarga() {
        return this.harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    public int getTotalHarga() {
        return this.totalHarga*this.harga;
    }
    public void setTotalHarga(int totalHarga) {
        this.totalHarga = totalHarga;
    }
    public int getUkuran() {
        return this.ukuran;
    }
    public void setUkuran(int ukuran) {
        this.ukuran = ukuran;
    }

}