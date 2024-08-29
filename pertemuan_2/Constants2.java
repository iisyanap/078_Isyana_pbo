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
public class Constants2 {
    public static final double CM_PER_INCH = 2.54; //public static final double disebut juga dengan variabel global, yang mana bisa akses di luar fungsinya itu sendiri
    public static void main(String[] args) {
    double paperWidth = 8.5;
    double paperHeight = 11; 
    System.out.println("Paper size in centimeters: " + paperWidth *
    CM_PER_INCH + " by " + paperHeight * CM_PER_INCH); //menampilkan paper size
 } 
}
