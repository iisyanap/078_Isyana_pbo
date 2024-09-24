package Akademik;

// Main.java
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Inisialisasi Jurusan dan Program Studi
        Jurusan jurusanTeknik = new Jurusan("JTK", "Teknik Komputer dan Informatika");
        ProgramStudi psInformatika = new ProgramStudi("PSI", "D3 - Teknik Informatika", jurusanTeknik);

        // Inisialisasi Mata Kuliah
        MataKuliah mk1 = new MataKuliah("21IF2011", "Pemograman Berbasis Objek (TE)");
        MataKuliah mk2 = new MataKuliah("21IF2015", "Komputer Grafik (TE)");
        MataKuliah mk3 = new MataKuliah("21IF2010", "Matematika Diskrit 2");
        MataKuliah mk4 = new MataKuliah("21IF2012", "Basis Data (TE)");
        MataKuliah mk5 = new MataKuliah("21IF2014", "Aljabar Linear");
        MataKuliah mk6 = new MataKuliah("21IF2013", "Pengantar Rekayasa Perangkat Lunak (TE)");
        MataKuliah mk7 = new MataKuliah("21IF2013", "Proyek 3: Pengembangan Perangkat Lunak Berbasis Web (TE)");
        MataKuliah mk8 = new MataKuliah("21IF2011", "Pemograman Berbasis Objek (PR)");
        MataKuliah mk9 = new MataKuliah("21IF2015", "Komputer Grafik (PR)");
        MataKuliah mk10 = new MataKuliah("21IF2012", "Basis Data (PR)");
        MataKuliah mk11 = new MataKuliah("21IF2013", "Proyek 3: Pengembangan Perangkat Lunak Berbasis Web (PR)");
        MataKuliah mk12 = new MataKuliah("21IF2013", "Pengantar Rekayasa Perangkat Lunak (PR)");

        // Inisialisasi Ruangan
        Ruangan r1 = new Ruangan("R001", "D217-Kelas", 30);
        Ruangan r2 = new Ruangan("R002", "D102-Lab. MT", 30);
        Ruangan r3 = new Ruangan("R003", "D101-Kelas", 30);
        Ruangan r4 = new Ruangan("R004", "D106-Lab. SDB", 30);

        // Inisialisasi Dosen
        List<Dosen> dosenList = new ArrayList<>();
        dosenList.add(new Dosen("KO052N", "Yadhi Aditya P.", "Jl. Pattimura, No. 1, Bandung", "08123456781", "00001"));
        dosenList.add(new Dosen("KO013N", "Yudi Widhiyasana", "Jl. Cipto, No. 2, Bandung", "08123456782", "00002"));
        dosenList.add(new Dosen("KO022N", "Suprihanto", "Jl. Cipto, No. 3, Bandung", "08123456783", "00003"));
        dosenList.add(new Dosen("KO001N", "Ade Chandra Nugraha", "Jl. Kartini, No. 4, Bandung", "08123456784", "00004"));
        dosenList.add(new Dosen("KO074N", "Muhammad Rizqi S", "Jl. Soekarno, No. 5, Bandung", "08123456785", "00005"));
        dosenList.add(new Dosen("KO009N", "Santi Sundari", "Jl. Hatta, No. 6, Bandung", "08123456786", "00006"));
        dosenList.add(new Dosen("KO078N", "Trisna Gelar A", "Jl. Dewi Sartika, No. 7, Bandung", "08123456787", "00007"));
        dosenList.add(new Dosen("KO006N", "Irawan Thamrin", "Jl. Cut Nyak Dien, No. 9, Bandung", "08123456788", "00008"));
        dosenList.add(new Dosen("KO045N", "Irwan Setiawan", "Jl. Diponegoro, No. 9, Bandung", "08123456789", "00009"));
        dosenList.add(new Dosen("KO061N", "Zulkifli Arsyad", "Jl. Soedirman, No. 10, Bandung", "081234567810", "000010"));
        dosenList.add(new Dosen("KO060N", "Ade Hodijah", "Jl. Ahmad Yani, No. 11, Bandung", "081234567811", "000011"));
        

        // Inisialisasi Mahasiswa
        List<Mahasiswa> mahasiswaList = new ArrayList<>();
        mahasiswaList.add(new Mahasiswa("M01", "Agra Anisa Ibtisamah", "Jl. Mawar, No. 1, Bandung", "081298761", "231511065", psInformatika));
        mahasiswaList.add(new Mahasiswa("M02", "Aulia Putri Ramadhani", "Jl. Melati, No. 2, Bandung", "081298762", "231511070", psInformatika));
        mahasiswaList.add(new Mahasiswa("M03", "Berliana Novianti", "Jl. Tulip, No. 3, Bandung", "081298763", "231511072", psInformatika));
        mahasiswaList.add(new Mahasiswa("M04", "Elsa Monika Sinaga", "Jl. Lily, No. 4, Bandung", "081298764", "231511074", psInformatika));
        mahasiswaList.add(new Mahasiswa("M05", "Isyana Putri Indriana", "Jl. Sakura, No. 5, Bandung", "081298765", "231511078", psInformatika));
        mahasiswaList.add(new Mahasiswa("M06", "Jihan Humaira", "Jl. Matahari, No. 6, Bandung", "081298766", "231511079", psInformatika));
        mahasiswaList.add(new Mahasiswa("M07", "Melly Dwiliani", "Jl. Anggrek, No. 7, Bandung", "081298767", "231511080", psInformatika));
        mahasiswaList.add(new Mahasiswa("M08", "Sifa Wafiqna", "Jl. Bougenville, No. 8, Bandung", "081298768", "231511092", psInformatika));
        mahasiswaList.add(new Mahasiswa("M09", "Syahla Salsabila", "Jl. Lavender, No. 9, Bandung", "081298769", "231511095", psInformatika));
        mahasiswaList.add(new Mahasiswa("M10", "Yulina Anggraeni", "Jl. Alamanda, No. 10, Bandung", "0812987610", "231511096", psInformatika));

        // Inisialisasi Jadwal Kuliah
        List<JadwalKuliah> jadwalList = new ArrayList<>();
        jadwalList.add(new JadwalKuliah("Senin", mk1, dosenList.get(0), r1, "08:40 - 10:40"));
        jadwalList.add(new JadwalKuliah("Senin", mk2, dosenList.get(1), r1, "10:40 - 12:20"));
        jadwalList.add(new JadwalKuliah("Senin", mk3, dosenList.get(2), r1, "13:00 - 15:30"));
        jadwalList.add(new JadwalKuliah("Senin", mk9, dosenList.get(6), r2, "15:50 - 18:20"));
        jadwalList.add(new JadwalKuliah("Selasa", mk4, dosenList.get(3), r3, "07:00 - 08:40"));
        jadwalList.add(new JadwalKuliah("Selasa", mk5, dosenList.get(4), r3, "08:40 - 10:40"));
        jadwalList.add(new JadwalKuliah("Selasa", mk6, dosenList.get(5), r3, "10:40 - 12:20"));
        jadwalList.add(new JadwalKuliah("Rabu", mk7, dosenList.get(6), r2, "07:00 - 07:50"));
        jadwalList.add(new JadwalKuliah("Rabu", mk7, dosenList.get(6), r2, "07:50 - 16:40"));
        jadwalList.add(new JadwalKuliah("Rabu", mk11, dosenList.get(7), r2, "07:50 - 16:40"));
        jadwalList.add(new JadwalKuliah("Rabu", mk11, dosenList.get(8), r2, "07:50 - 16:40"));
        jadwalList.add(new JadwalKuliah("Kamis", mk12, dosenList.get(0), r4, "09:50 - 15:30"));
        jadwalList.add(new JadwalKuliah("Kamis", mk8, dosenList.get(9), r4, "15:50 - 18:20"));
        jadwalList.add(new JadwalKuliah("Jumat", mk10, dosenList.get(10), r4, "07:00 - 13:50"));

        List<Ruangan> ruanganList = new ArrayList<>();
        ruanganList.add(new Ruangan("R001", "D217-Kelas", 30));
        ruanganList.add(new Ruangan("R002", "D102-Lab. MT", 30));
        ruanganList.add(new Ruangan("R003", "D101-Kelas", 30));
        ruanganList.add(new Ruangan("R004", "D106-Lab. SDB", 30));

        List<ProgramStudi> programstudiList = new ArrayList<>();
        programstudiList.add(new ProgramStudi("PSI", "D3 - Teknik Informatika", jurusanTeknik));

        List<Jurusan> jurusanList = new ArrayList<>();
        jurusanList.add(new Jurusan("JTK", "Teknik Komputer dan Informatika"));

        // Menampilkan Data Mahasiswa
        System.out.println("\n=========================================================================== Data Mahasiswa ==================================================================================\n");
        for(Mahasiswa mhs : mahasiswaList) {
            mhs.displayInfo();
        }
        System.out.println("\n===============================================================================================================================================================================");

        // Menampilkan Data Dosen
        System.out.println("\n====================================== Data Dosen ================================================\n");
        for(Dosen dos : dosenList) {
            dos.displayInfo();
        }
        System.out.println("\n===================================================================================================");

        // Menampilkan Jadwal Kuliah Senin - Jumat
        System.out.println("\n============================================================= Jadwal Perkuliahan ================================================================\n");
        List<String> hariList = List.of("Senin", "Selasa", "Rabu", "Kamis", "Jumat");
        for(String hari : hariList) {
            System.out.println("Jadwal Perkuliahan Hari " + hari + ":");
            for(JadwalKuliah jadwal : jadwalList) {
                if(jadwal.getHari().equalsIgnoreCase(hari)) {
                    jadwal.displayJadwal();
                }
            }
            System.out.println();
        }
        System.out.println("==================================================================================================================================================");

        System.out.println("\n====================== Data Ruangan ============================\n");
        for(Ruangan ruangan : ruanganList) {
            ruangan.displayRuangan();
        }
        System.out.println("\n=================================================================");

        System.out.println("\n====================== Data Program Studi ========================\n");
        for(ProgramStudi programstudi : programstudiList) {
            programstudi.displayProdi();
        }
        System.out.println("\n==================================================================");

        System.out.println("\n======================== Data Jurusan =============================\n");
        for(Jurusan jurusan : jurusanList) {
            jurusan.displayJurusan();
        }
        System.out.println("\n===================================================================");
    }
}
