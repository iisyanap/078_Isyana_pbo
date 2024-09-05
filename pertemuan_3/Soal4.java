/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pobpr050924;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Soal4 {
    public static void main(String[] args) {
        int gajiPokok = 500000;
        int hargaItem = 50000;
        
        System.out.println("Jumlah penjualan: ");
        Scanner sc = new Scanner(System.in);
        int jumlahPenjualan = sc.nextInt();
        sc.close();
        
        int totalGaji = gajiPokok;
        
        if (jumlahPenjualan >= 80) {
            int totalPenjualan = jumlahPenjualan * hargaItem;
            totalGaji += totalPenjualan * 0.35;
        } else if (jumlahPenjualan >= 40) {
            int totalPenjualan = jumlahPenjualan * hargaItem;
            totalGaji += totalPenjualan * 0.25;
        } else if (jumlahPenjualan < 15) {
            int kekuranganItem = 15 - jumlahPenjualan;
            totalGaji -= kekuranganItem * hargaItem * 0.15;
        } else {
            int totalPenjualan = jumlahPenjualan * hargaItem;
            totalGaji += totalPenjualan * 0.10;
        }
        
        System.out.println("Total Gaji: Rp." + totalGaji);
}
}
