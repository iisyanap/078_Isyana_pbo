package Akademik;

// ProgramStudi.java
public class ProgramStudi {
    private String kodeProgram;
    private String namaProgram;
    private Jurusan jurusan;

    public ProgramStudi(String kodeProgram, String namaProgram, Jurusan jurusan) {
        this.kodeProgram = kodeProgram;
        this.namaProgram = namaProgram;
        this.jurusan = jurusan;
    }

    public String getKodeProgram() {
        return kodeProgram;
    }

    public String getNamaProgram() {
        return namaProgram;
    }

    public Jurusan getJurusan() {
        return jurusan;
    }

    public void displayProdi() {
        System.out.println("Prodi: " + namaProgram);
    }
}


