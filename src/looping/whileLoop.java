/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package looping;

/**
 *
 * @author M S I
 */
public class whileLoop {
    public static void main(String[] args){
        //    while () {
        //        aksi
        //    }
        
        int a = 0;
        boolean kondisi = true;
        System.out.println("Awal program");
        while (kondisi) {
            System.out.println("while loop a ke " + a);
            a++;
            if (a == 10) {
                kondisi = false;
            }
        }
        System.out.println("Akhir program");
    }
}
