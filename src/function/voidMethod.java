/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package function;

/**
 *
 * @author M S I
 */
public class voidMethod {
    public static void main (String[] args) {
        
        // void itu artinya adalah hampa jadi ga perlu return
        
        System.out.println(simple());
        fungsiVoid("Apapun itu");
        selamatPagi("Emak");
        selamatPagi("Abah");
    }
    
    private static void selamatPagi(String nama) {
        System.out.println("Selamat pagi " + nama);
    }
    
    // fungsi atau method tanpa kembalian
    private static void fungsiVoid(String input) {
        System.out.println(input);
    }
    
    // fungsi atau method dengan kembalian
    private static float simple(){
        return 10.0f;
    }
}
