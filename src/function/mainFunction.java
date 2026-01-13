/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package function;

/**
 *
 * @author M S I
 */
public class mainFunction {
    public static void main(String[] args) {
        int y,x;
        x = 10;
        y = hitung(x);
        System.out.println("x = " + x + ", y = " + y);
    }
    
    static int hitung(int input) {
        int hasil;
        hasil = (input + 2) * input;
        return hasil;
    }
}
