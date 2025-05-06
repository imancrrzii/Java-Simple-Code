import java.util.Scanner;

public class belajar1 {

  // public static void main(String[] args) {
  //     Scanner scanner = new Scanner(System.in);

  //     System.out.print("Masukkan 10 angka acak:");
  //     int[] x = new int[10];

  //     for (int i = 0; i < 10; i++) {
  //         x[i] = scanner.nextInt();
  //     }

  //     boolean[] dikunjungi = new boolean[10];
  //     boolean diulangi = false;

  //     System.out.print("Angka-angka yang mengalami perulangan: ");
  //     for (int i = 0; i < 10; i++) {
  //         if (!dikunjungi[i]) {
  //             for (int j = i + 1; j < 10; j++) {
  //                 if (x[i] == x[j]) {
  //                     dikunjungi[j] = true;
  //                     diulangi = true;
  //                 }
  //             }
  //             if (diulangi) {
  //                 System.out.print(x[i] + " ");
  //                 dikunjungi[i] = true;
  //             }
  //             diulangi = false;
  //         }
  //     }
  //     System.out.println();

  //     if (!diulangi) {
  //         System.out.print("Tidak ada angka yang mengalami perulangan.");
  //     }
  // }

  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);

    int[] n = new int[10];
    System.out.print("");
    for (int i = 0; i < 10; i++) {
      n[i] = userInput.nextInt();
    }

    boolean diulangi = false;

    for (int i = 0; i < n.length; i++) {
      for (int j = i + 1; j < n.length; j++) {
        if (n[i] == n[j]) {
          diulangi = true;
          System.out.print(n[i] + " ");
          break;
        }
      }
    }

    if (!diulangi) {
      System.out.println("");
    }
  }
}
