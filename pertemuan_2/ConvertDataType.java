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
public class ConvertDataType {
    static short methodOne(long l)
    {
    int i = (int) l;
    return (short)i;
    }
    public static void main(String[] args)
    {
    double d = 10.25; //variabel d dengan tipe data double
    float f = (float) d; //data yang berada pada variabel d akan di ubah menjadi float
    byte b = (byte) methodOne((long) f); //dalam methodone float akan di ubah menjadi long, selanjutnya long diubah menjadi int, int menjadi short, short menjadi byte
    System.out.println(b);
    }

}
