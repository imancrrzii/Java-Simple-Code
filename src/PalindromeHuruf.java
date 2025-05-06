import java.util.Scanner;

public class PalindromeHuruf {

    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);

        System.out.println("Masukkan kalimat: ");
        String kalimat = inputUser.nextLine();

        boolean isPalindrome = true;
        for (int i = 0; i < kalimat.length() / 2; i++) {
            if (kalimat.charAt(i) != kalimat.charAt(kalimat.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Kalimat tersebut adalah palindrome.");
        } else {
            System.out.println("Kalimat tersebut bukan palindrome.");
        }
    }
}
