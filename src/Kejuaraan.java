import java.util.Scanner;

public class Kejuaraan {
    private int jumlahLawan;
    private int[] kemampuanLawan;
    private int kemampuanPemain;

    public Kejuaraan() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah lawan: ");
        jumlahLawan = input.nextInt();

        kemampuanLawan = new int[jumlahLawan];

        for (int i = 0; i < jumlahLawan; i++) {
            System.out.print("Masukkan kemampuan lawan ke-" + (i+1) + ": ");
            kemampuanLawan[i] = input.nextInt();
        }

        System.out.print("Masukkan kemampuan Anda: ");
        kemampuanPemain = input.nextInt();
    }

    public void pertandingan() {
        for (int i = 0; i < jumlahLawan; i++) {
            if (kemampuanPemain >= kemampuanLawan[i]) {
                System.out.println("Anda berhasil mengalahkan lawan ke-" + (i+1) + "!");
                kemampuanPemain += kemampuanLawan[i];
            } else {
                System.out.println("Anda kalah melawan lawan ke-" + (i+1) + "!");
            }
        }
    }

    public void printKemampuanPemain() {
        System.out.println("Kemampuan Anda setelah melawan semua lawan: " + kemampuanPemain);
    }

    public static void main(String[] args) {
        Kejuaraan kejuaraan = new Kejuaraan();
        kejuaraan.pertandingan();
        kejuaraan.printKemampuanPemain();
    }
}
