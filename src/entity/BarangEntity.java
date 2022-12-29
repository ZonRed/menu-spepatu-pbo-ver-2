package entity;

public class BarangEntity {
    private String JenisSepatu;
    private String Bahan;

    public BarangEntity(String JenisSepatu, String Bahan) {
        this.JenisSepatu =JenisSepatu;
        this.Bahan = Bahan;

    }
    public String getJenisSepatu() {
        return this.JenisSepatu;
    }
    public void setJenisSepatu(String JenisSepatu) {
        this.JenisSepatu =JenisSepatu;
    }
    public String getBahan() {
        return this.Bahan;
    }
    public void setBahan(String Bahan) {
        this.Bahan = Bahan;
    }
}