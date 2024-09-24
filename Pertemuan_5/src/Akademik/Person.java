package Akademik;

// Person.java
public abstract class Person {
    protected String id;
    protected String nama;
    protected String alamat;
    protected String telepon;

    public Person(String id, String nama, String alamat, String telepon) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getTelepon() {
        return telepon;
    }

    public abstract void displayInfo();
}
