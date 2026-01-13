package firstjava;
import java.util.Scanner;

public class inputJava {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama, alamat;
        int umur;
        
        System.out.print("Nama   : ");
        nama = input.nextLine();
        System.out.print("Alamat : ");
        alamat = input.nextLine();
        System.out.print("Umur   : ");
        umur = input.nextInt();
        System.out.println("======================================");
        System.out.println(nama + " lahir di " + alamat);
        System.out.println("Berumur " + umur);
    }
}
