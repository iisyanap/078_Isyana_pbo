/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package welcome.java;

/**
 *
 * @author HP
 */
public class Soal1 {
    public static void main (String[] args) {
        byte angka1 = 125; //variabel angka1 yang bertipe data byte yang berisi 125
        byte angka2 = 6; //variabel angka2 yang bertipe data byte yang berisi 6
        byte hasil = (byte) (angka1+angka2); //variabel hasil yang bertipe data byteyang berisi hasil dari penjumlahan angka1 + angka 2
        
        System.out.println("Hasil 1 "+hasil); //menampilkan ke layar hasil dari penjumlahan
    }
}
//hasil dari penjumlah angka1+angka2 adalah 131, tapi dikarenakan hasil yang diinginkan adalah bertipe data byte 
//dan nilai minimum dari byte adalah -128, maksimumnya adalah 127, maka 131 adalah hasil yang overflow, oleh karena itu
//131 akan dikurangin oleh range tipe data byte sebesar 256, jadi hasil akhirnya adalah 131-256= - 125.
