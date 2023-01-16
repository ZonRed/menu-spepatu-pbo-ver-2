package entity;

public class BarangEntity {
    private String jenisSepatu;
    private String bahan;
    private int ukuran;

    public BarangEntity(String jenisSepatu, String bahan,int ukuran) {
        this.jenisSepatu = jenisSepatu;
        this.bahan = bahan;
        this.ukuran = ukuran;
    }

    public String getJenisSepatu() {
        return this.jenisSepatu;
    }

    public void setJenisSepatu(String jenisBaju) {
        this.jenisSepatu = jenisBaju;
    }

    public String getBahan() {
        return this.bahan;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }


    public int getUkuran() {
        return this.ukuran;
    }

    public void setUkuran(int ukuran) {
        this.ukuran = ukuran;
    }

}