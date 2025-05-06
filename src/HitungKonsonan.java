import java.util.Scanner;

public class HitungKonsonan {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Masukkan Kalimat");
    String kalimat = input.nextLine();

    int hitungKonsonan = hitungKonsonan(kalimat);
    System.out.println("Jumlah KOnsonan" + hitungKonsonan);
    input.close();
  }

  public static int hitungKonsonan(String kalimat) {
    int jumlahKonsonan = 0;
    kalimat = kalimat.toLowerCase();
    for (int i = 0; i < kalimat.length(); i++) {
      char karakter = kalimat.charAt(i);
      if (
        karakter >= 'a' &&
        karakter <= 'z' &&
        karakter != 'a' &&
        karakter != 'i' &&
        karakter != 'u' &&
        karakter != 'e' &&
        karakter != 'o'
      ) {
        jumlahKonsonan++;
      }
    }

    return jumlahKonsonan;
  }
}
