import java.util.Scanner;

public class factorOfNumber {
    private int number;

    public factorOfNumber(int number) {
        this.number = number;
    }

    public void displayFactors() {
        System.out.println("Faktor dari " + number + " adalah:");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int number = userInput.nextInt();

        factorOfNumber factor = new factorOfNumber(number);
        factor.displayFactors();
    }
}
