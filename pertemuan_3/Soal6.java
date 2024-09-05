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
import java.math.BigInteger;
import java.util.Scanner;
public class Soal6 {
    public static void main(String[] args) {
        System.out.println("Masukan angka: ");
        Scanner scanner = new Scanner(System.in);
        
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        
        scanner.close();
        
        BigInteger bigA = new BigInteger(a);
        BigInteger bigB = new BigInteger(b);
        
        BigInteger sum = bigA.add(bigB);
        BigInteger product = bigA.multiply(bigB);
        
        System.out.println("Hasil penjumlahan = " + sum);
        System.out.println("Hasil perkalian = " + product);
    }
}
