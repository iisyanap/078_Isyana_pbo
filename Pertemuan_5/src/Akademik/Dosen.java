package Akademik;

// Dosen.java
public class Dosen extends Person {
    private String nip; // Mengganti NIDN menjadi NIP sesuai permintaan

    public Dosen(String id, String nama, String alamat, String telepon, String nip) {
        super(id, nama, alamat, telepon);
        this.nip = nip;
    }

    public String getNip() {
        return nip;
    }


    @Override
    public void displayInfo() {
        // Format: Nama, NIP, Alamat, No Telepon
        System.out.println("Nama: " + nama + ", " + "NIP: " + nip + ", " + "Alamat: " + alamat + ", " + "Telepon: " + telepon);
    }
}
