/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package looping;

/**
 *
 * @author M S I
 */
public class controlFlow {
    public static void main(String[] args) {
        int a = 0;
        while(true) {
            a++;
            if (a == 10) {
                break;
            } else if (a == 5) {
                continue;
            } else if (a == 7) {
                return;
            }
            System.out.println("Looping ke " + a);
        }
        System.out.println("Akhir program");
    }
}
