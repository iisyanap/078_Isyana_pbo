package Akademik;

// Ruangan.java
public class Ruangan {
    private String kodeRuangan;
    private String namaRuangan;
    private int kapasitas;

    public Ruangan(String kodeRuangan, String namaRuangan, int kapasitas) {
        this.kodeRuangan = kodeRuangan;
        this.namaRuangan = namaRuangan;
        this.kapasitas = kapasitas;
    }

    public String getKodeRuangan() {
        return kodeRuangan;
    }

    public String getNamaRuangan() {
        return namaRuangan;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public void displayRuangan() {
        System.out.println("Ruangan: " + namaRuangan);
    }
}
