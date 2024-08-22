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
public class Soal2 {
    
    public static void main (String[] args) {
        int i = 42; //variabel i bertipe data integer yang berisi 42
        String s = (i<40)?"life":(i>50)?"universe":"everything"; //variabel s bertipe data string yang berisi 
        //jika i kurang dari 40 maka akan menampilkan life
        //jika i lebih dari 50 akan menampilkan universe
        //jika tidak keduanya maka akan menampilkan everything
        //karena i berisi 42 maka akan menampilkan everything
        System.out.println(s);   //hasilnya akan ditampilkan ke layar
    }
}
