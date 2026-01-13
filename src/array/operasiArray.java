/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;
import java.util.Arrays;
/**
 *
 * @author M S I
 */
public class operasiArray {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = new int[5];
        
        // merubah array jadi string
        printArr(array1);
        printArr(array2);
        
        // Mengkopi dengan loop
        System.out.println();
        for(int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
        }
        printArr(array1);
        printArr(array2);
        System.out.println(array1);
        System.out.println(array2);
        
        // Mengkopi dengan copyOf
        System.out.println();
        int[] array3 = Arrays.copyOf(array1, 3);
        printArr(array1);
        printArr(array3);
        System.out.println(array1);
        System.out.println(array3);
        
        // Mengcopy dengan copyOfRange
        System.out.println();
        int[] array4 = Arrays.copyOfRange(array1, 2, 5);
        printArr(array1);
        printArr(array4);
        System.out.println(array1);
        System.out.println(array4);
        
        // fill array
        System.out.println();
        int[] array5 = new int[10];
        printArr(array5);
        Arrays.fill(array5, 1);
        printArr(array5);
        
        // Komparasi array
        System.out.println();
        int[] array6 = {1,2,3,4,5};
        int[] array7 = {1,2,3,4,0};
        System.out.println(Arrays.equals(array6, array7));
        if (Arrays.equals(array6, array7)) {
            System.out.println("Array ini sama");
        } else {
            System.out.println("Array ini tidak sama");
        }
        System.out.println(Arrays.compare(array6, array7)); // mana array yang lebih besar
        System.out.println(Arrays.mismatch(array6, array7)); // mana index yang berbeda
        
        // Search array
        System.out.println();
        int[] array8 = {1,2,3,4,5,6};
        printArr(array8);
        int angka = 3;
        int posisi = Arrays.binarySearch(array8, angka);
        System.out.println("Angka " + angka + " ada di index " + posisi);
        
        // Sort array
        System.out.println();
        int[] array9 = {1,12,3,24,5,6};
        printArr(array9);
        Arrays.sort(array9);
        printArr(array9);
        
        // Sort kebalik
        System.out.println();
        int panjang = array9.length;
        int[] array10 = new int[panjang];
        int index = 0;
        for (int i = panjang - 1; i >= 0; i--) {
            array10[index] = array9[i];
            index++;
        }
        printArr(array9);
        printArr(array10);
        
        // Penjumlahan 2 buah array
        System.out.println();
        int[] array11 = new int[panjang];
        for (int i = 0; i < panjang; i++) {
            array11[i] = array9[i] + array10[i];
        }
        printArr(array9);
        printArr(array10);
        printArr(array11);
        
        // Menggabungkan 2 array
        System.out.println();
        int pjg = (array11.length) + (array10.length);
        int[] array12 = new int[pjg];
        int idx = 0;
        for (int i = 0; i < array10.length; i++) {
            array12[idx] = array10[i];
            idx++;
        }
        for (int i = 0; i < array11.length; i++) {
            array12[idx] = array11[i];
            idx++;
        }
        printArr(array10);
        printArr(array11);
        printArr(array12);
        
    }
    
    private static void printArr(int[] data) {
        System.out.println("Array = " + Arrays.toString(data));
    }
}
