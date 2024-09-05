package pobpr050924;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Soal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukan string dan integer:");
        String[] strings = new String[3];
        int[] numbers = new int[3];

        for (int i = 0; i < 3; i++) {
            strings[i] = sc.next();
            numbers[i] = sc.nextInt();
        }

        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%-15s%03d%n", strings[i], numbers[i]);
        }
        System.out.println("================================");

        sc.close();
    }
}

