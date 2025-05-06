import java.util.Scanner;

public class Tambah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan angka pertama: ");
        int hasil = 0;
        int x = input.nextInt();
        int arr[] = new int[x];

        for(int i = 0; i < arr.length; i++){
            // System.out.println("Masukkan angka ke-0" +i);
            int y = input.nextInt();
            hasil += y;
        }
        System.out.println(hasil);

        int average = hasil / arr.length;
        System.out.println(average);
        
        



        // System.out.print("Masukkan angka pertama: ");
        // int angka1 = input.nextInt();
        // int angka2 = input.nextInt();

        // int hasil = angka1 + angka2;
        // System.out.println("Hasil penjumlahan: " + hasil);
    }
}
