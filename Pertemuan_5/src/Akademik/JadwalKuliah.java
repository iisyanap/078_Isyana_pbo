package Akademik;

// JadwalKuliah.java
public class JadwalKuliah {
    private String hari;
    private MataKuliah mataKuliah;
    private Dosen dosen;
    private Ruangan ruangan;
    private String waktu;

    public JadwalKuliah(String hari, MataKuliah mataKuliah, Dosen dosen, Ruangan ruangan, String waktu) {
        this.hari = hari;
        this.mataKuliah = mataKuliah;
        this.dosen = dosen;
        this.ruangan = ruangan;
        this.waktu = waktu;
    }

    public String getHari() {
        return hari;
    }

    public MataKuliah getMataKuliah() {
        return mataKuliah;
    }

    public Dosen getDosen() {
        return dosen;
    }

    public Ruangan getRuangan() {
        return ruangan;
    }

    public String getWaktu() {
        return waktu;
    }

    public void displayJadwal() {
        // Format: Hari, Jam, Mata Kuliah, Ruangan, Dosen
        System.out.println("Hari: " + hari + ", " + "Waktu: " + waktu + ", " + "Matkul: " + mataKuliah.getNamaMK() + ", " 
                           + "Ruangan: " + ruangan.getNamaRuangan() + ", " + "Dosen: " + dosen.getNama());
    }
}


