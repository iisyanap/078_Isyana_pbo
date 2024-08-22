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
public class WelcomeJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
      String greeting = "Welcome to Core Java!"; //variabel greeting yang bertipe data string yang berisi "Welcome to Core Java"
      System.out.println(greeting); //isi dari variabel greeting akan ditampilkan ke layar dan membuat barisan baru
      for (int i = 0; i < greeting.length(); i++) //jika i kurang dari panjang isi dari variabel greeting 
        System.out.print("="); //maka akan menambahkan "=" sampai akhir panjang variabel greeting.
        System.out.println(); 
    }
    
}
