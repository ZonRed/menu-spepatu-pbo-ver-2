package entity;

public class DataTransaksiEntity {
    private PengunjungEntity pengunjung;
    private TransaksiEntity transaksi;

    public DataTransaksiEntity(PengunjungEntity pengunjung, TransaksiEntity transaksi) {
        this.pengunjung = pengunjung;
        this.transaksi = transaksi;
    }
    public PengunjungEntity getPengunjung() {
        return this.pengunjung;
    }
    public void setPengunjung(PengunjungEntity pengunjung) {
        this.pengunjung = pengunjung;
    }
    public TransaksiEntity getTransaksi() {
        return this.transaksi;
    }
    public void setTransaksi(TransaksiEntity transaksi) {
        this.transaksi = transaksi;
    }
}