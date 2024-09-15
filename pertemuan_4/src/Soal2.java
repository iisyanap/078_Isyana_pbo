import com.polban.jtk.inventory.*;

public class Soal2 {
    public static void main(String[] args) {
        // Membuat objek Inventori
        Inventori inventori = new Inventori();

        // Menampilkan daftar barang sebelum pengadaan
        System.out.println("Daftar barang sebelum pengadaan:");
        inventori.showBarang();

        // Melakukan pengadaan barang
        inventori.pengadaan();

        // Menampilkan daftar barang setelah pengadaan
        System.out.println("\nDaftar barang setelah pengadaan:");
        inventori.showBarang();
    }
}
