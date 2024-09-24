package Akademik;

// Mahasiswa.java
public class Mahasiswa extends Person {
    private String nim;
    private ProgramStudi programStudi;

    public Mahasiswa(String id, String nama, String alamat, String telepon, String nim, ProgramStudi programStudi) {
        super(id, nama, alamat, telepon);
        this.nim = nim;
        this.programStudi = programStudi;
    }

    public String getNim() {
        return nim;
    }

    public ProgramStudi getProgramStudi() {
        return programStudi;
    }

    @Override
    public void displayInfo() {
        // Format: Nama, NIM, Prodi, Jurusan, Alamat, No Telepon
        System.out.println("Nama: " + nama + ", " + "NIM: " + nim + ", " + "Prodi: " + programStudi.getNamaProgram() + ", " 
                           + "Jurusan: " + programStudi.getJurusan().getNamaJurusan() + ", " 
                           + "Alamat: " + alamat + ", " + "Telepon: " + telepon);
    }
}
