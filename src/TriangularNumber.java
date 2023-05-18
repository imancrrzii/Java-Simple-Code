import java.util.*;
public class TriangularNumber {
    
    // fungsi untuk menghitung jumlah faktor dari n
    public static int jumlah_faktor(int n) {
        int jumlah = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                jumlah++;
                if (n / i != i) {
                    jumlah++;
                }
            }
        }
        return jumlah;
    }
    
    // fungsi untuk mencari bilangan segitiga pertama dengan jumlah faktor lebih dari m
    public static int cari_bil_segitiga_pertama(int m) {
        for (int n = 1; ; n++) {
            int bil_segitiga = n * (n + 1) / 2;
            int faktor = jumlah_faktor(bil_segitiga);
            if (faktor > m) {
                return bil_segitiga;
            }
        }
    }
    
    // contoh penggunaan fungsi
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("");
        int m = userInput.nextInt();
        int hasil = cari_bil_segitiga_pertama(m);
        System.out.println(hasil);
    }

}