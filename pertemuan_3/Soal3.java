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
public class Soal3 {
    public static void main(String[] args) {
        System.out.println("Format: angka<spasi>operasi<spasi>angka");
        System.out.println("Masukkan angka dan operator yang ingin dioperasikan:");
        
        Scanner input = new Scanner(System.in);
        
        int A = input.nextInt();
        char operator = input.next().charAt(0);
        int B = input.nextInt();
        
        // Memastikan bahwa A >= 1 dan B <= 1000
        if (A < 1 || B > 1000) {
            System.out.println("Input tidak valid. A harus >= 1 dan B harus <= 1000.");
            input.close();
            return;
        }
        
        int result = 0;

        switch (operator) {
            case '+':
                result = A + B;
                break;
            case '-':
                result = A - B;
                break;
            case '*':
                result = A * B;
                break;
            case '/':
                if (A % B == 0) {
                    result = A / B;
                } else {
                    System.out.println("A tidak habis dibagi B.");
                    input.close();
                    return;
                }
                break;
            case '%':
                result = A % B;
                break;
            default:
                System.out.println("Operator tidak valid.");
                input.close();
                return;
        }

        System.out.println(result);

        input.close();
    }
}