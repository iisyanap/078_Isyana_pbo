/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

/**
 *
 * @author HP
 */

import java.util.Scanner;
    public class Stringoperation {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan Kata pertama : ");
        String kataPertama = scanner.nextLine();
        System.out.print("Masukkan Kata kedua : ");
        String kataKedua = scanner.nextLine();
        
        int panjangkata = kataPertama.length() + kataKedua.length(); //menghitung jumlah dari katapertama dan katakedua
        System.out.println(panjangkata);
        
        if (kataPertama.compareTo(kataKedua) > 0) { //jika katapertama lebih besar dari katakedua maka akan
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        String hasilKataPertama = kataPertama.substring(0, 1).toUpperCase() + kataPertama.substring(1);
        String hasilkataKedua = kataKedua.substring(0, 1).toUpperCase() + kataKedua.substring(1);
        System.out.println(hasilKataPertama + " " + hasilkataKedua);
        
        scanner.close();
}
}
