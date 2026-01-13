/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package function;
import java.util.*;

/**
 *
 * @author M S I
 */
public class recursif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();
        System.out.println("Anda memasukkan nilai = " + nilai);
        
        printNilai(nilai);
    }
    
    public static void printNilai(int parameter) {
        System.out.println("Nilai = " + parameter);
        if (parameter == 0) {
            return;
        }
        parameter--;
        printNilai(parameter);
    }
}
