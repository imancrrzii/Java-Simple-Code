import java.util.Scanner;

public class HitungJumlahVokal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kalimat: ");
        String kalimat = scanner.nextLine();

        int jumlahVokal = hitungJumlahVokal(kalimat);
        System.out.println("Jumlah vokal dalam kalimat: " + jumlahVokal);
        scanner.close();
    }

    public static int hitungJumlahVokal(String kalimat) {
        int jumlahVokal = 0;
        kalimat = kalimat.toLowerCase();
        for (int i = 0; i < kalimat.length(); i++) {
            char karakter = kalimat.charAt(i);
            if (karakter == 'a' || karakter == 'e' || karakter == 'i' || karakter == 'o' || karakter == 'u') {
                jumlahVokal++;
            }
        }
        return jumlahVokal;
    }
}
