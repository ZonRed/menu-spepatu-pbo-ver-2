package entity;

public abstract class UserEntity {
    private String nama;
    private String id;
    public UserEntity(String id,String nama) {
        this.id = id;
        this.nama = nama;
    }
    public UserEntity() {
    }
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getNama() {
        return this.nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

}