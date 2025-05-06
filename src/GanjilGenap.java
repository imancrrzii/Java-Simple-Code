import java.util.Scanner;

public class GanjilGenap {
    int ganjil = 0, genap = 0;
    public void ganjilGenap(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                genap = genap + 1;
            } else {
                ganjil = ganjil + 1;
            }
        }
        System.out.println("Banyaknya bilangan genap: " + genap);
        System.out.println("Banyaknya bilangan ganjil: " + ganjil);
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Masukkan jumlah bilangan: ");
        int n = userInput.nextInt();
        GanjilGenap ganjilGenap = new GanjilGenap();
        ganjilGenap.ganjilGenap(n);
    }
}
