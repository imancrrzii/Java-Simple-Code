import java.util.Scanner;

public class Kejuaraan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah lawan: ");
        int jumlahLawan = input.nextInt();

        int[] kemampuanLawan = new int[jumlahLawan];

        for (int i = 0; i < jumlahLawan; i++) {
            System.out.print("Masukkan kemampuan lawan ke-" + (i+1) + ": ");
            kemampuanLawan[i] = input.nextInt();
        }

        System.out.print("Masukkan kemampuan Anda: ");
        int kemampuanPemain = input.nextInt();

        for (int i = 0; i < jumlahLawan; i++) {
            if (kemampuanPemain >= kemampuanLawan[i]) {
                System.out.println("Anda berhasil mengalahkan lawan ke-" + (i+1) + "!");
                kemampuanPemain += kemampuanLawan[i];
            } else {
                System.out.println("Anda kalah melawan lawan ke-" + (i+1) + "!");
            }
        }

        System.out.println("Kemampuan Anda setelah melawan semua lawan: " + kemampuanPemain);
    }
}
