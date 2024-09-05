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
public class Soal1 {
    public static void main(String[] args) {
        System.out.println ("Masukan kalimat: ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        scanner.close();
        
        if (s.length() == 0) {
            System.out.println(0);
            return;
        }

        String[] tokens = s.split("[^A-Za-z]+");

        System.out.println("Total token: " + tokens.length);

        for (String token : tokens) {
            System.out.println(token);
        }
    }
}