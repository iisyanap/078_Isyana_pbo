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
public class Soal5 {
    public static void main(String[] args) {
        System.out.println("Masukan plat nomor: ");
        Scanner scanner = new Scanner(System.in);
        
        String plat1 = scanner.next();
        String plat2 = scanner.next();
        String plat3 = scanner.next();
        String plat4 = scanner.next();
        
        String gabunganPlat = plat1 + plat2 + plat3 + plat4;
        
        long gabunganAngka = Long.parseLong(gabunganPlat);
        
        if ((gabunganAngka - 999999) % 5 == 0) {
            System.out.println("Berhenti");
        } else {
            System.out.println("Jalan");
        }
        
        scanner.close();
    }
}

