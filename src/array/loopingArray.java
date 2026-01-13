package array;
import java.util.Arrays;

public class loopingArray {
    public static void main(String[] args) {
        int array[] = {11,12,13,14,15,16,17,18,19,20};
        System.out.println("");
        
        // Looping standart
        for(int i = 0; i < 10; i++) {
            System.out.println("Index ke " + i + " adalah " + array[i]);
        }
        System.out.println();
        // Looping dengan properti array
        for (int i = 0; i < array.length; i++) {
            System.out.println("Index ke " + i + " adalah " + array[i]);
        }
        System.out.println();
        // Looping khususon untuk collection <- array
        int i = 0;
        for(int angka : array) {
            System.out.println("Index ke " + i + " adalah " + angka);
            i++;
        }
    }
}
