package Akademik;

// Jurusan.java
public class Jurusan {
    private String kodeJurusan;
    private String namaJurusan;

    public Jurusan(String kodeJurusan, String namaJurusan) {
        this.kodeJurusan = kodeJurusan;
        this.namaJurusan = namaJurusan;
    }

    public String getKodeJurusan() {
        return kodeJurusan;
    }

    public String getNamaJurusan() {
        return namaJurusan;
    }

    public void displayJurusan() {
        System.out.println("Jurusan: " + namaJurusan);
    }
}

