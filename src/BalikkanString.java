import java.util.Scanner;

public class BalikkanString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan string: ");
        String inputUser = input.nextLine();

        String reversedString = "";

        for (int i = inputUser.length() - 1; i >= 0; i--) {
            reversedString += inputUser.charAt(i);
        }

        System.out.println(reversedString);
    }
}
