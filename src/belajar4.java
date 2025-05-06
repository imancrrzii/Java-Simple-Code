import java.util.Scanner;

public class belajar4 {

  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);

    int n = userInput.nextInt();

    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = userInput.nextInt();
    }

    int jumlahMaks = arr[0];
    int jumlahSekarang = arr[0];
    int panjangMaks = 1;
    int panjangSekarang = 1;

    for (int i = 1; i < n; i++) {
      if (jumlahSekarang + arr[i] > arr[i]) {
        jumlahSekarang += arr[i];
        panjangSekarang++;
      } else {
        jumlahSekarang = arr[i];
        panjangSekarang = 1;
      }

      if (jumlahSekarang > jumlahMaks) {
        jumlahMaks = jumlahSekarang;
        panjangMaks = panjangSekarang;
      }
    }

    System.out.println(panjangMaks);
  }
}
