package array;
import java.util.Arrays;

public class passByReference {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = new int[5];
        
        System.out.println(array1);
        System.out.println(array2);
        
        array2 = array1;
        System.out.println("Arrays 1 -> " + Arrays.toString(array1));
        System.out.println("Arrays 2 -> " + Arrays.toString(array2));
        
        System.out.println();
        
        System.out.println(array1);
        System.out.println(array2);
        
        ubahArray(array1);
        System.out.println("Arrays 1 -> " + Arrays.toString(array1));
        System.out.println("Arrays 2 -> " + Arrays.toString(array2));
    }
    
    // method yyang argumentnya adalah reference, pass by reference bukan pass by value
    private static void ubahArray(int[] dataArray) {
        for(int data: dataArray){
            System.out.println(data);
        }
        dataArray[0] = 123;
        for(int data: dataArray){
            System.out.println(data);
        }
    }
}
