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
      String greeting = "Welcome to Core Java!";
      System.out.println(greeting);
      for (int i = 0; i < greeting.length(); i++)
        System.out.print("=");
        System.out.println();
    }
    
}
