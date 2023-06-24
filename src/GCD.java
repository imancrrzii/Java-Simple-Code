import java.util.Scanner;

public class GCD {
    private int n1;
    private int n2;

    public GCD(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public int calculateGCD() {
        int gcd = 1;
        for (int i = 1; i <= n1 && i <= n2; ++i) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Masukkan n1: ");
        int n1 = userInput.nextInt();
        System.out.print("Masukkan n2: ");
        int n2 = userInput.nextInt();

        GCD gcdCalculator = new GCD(n1, n2);
        int gcd = gcdCalculator.calculateGCD();
        System.out.println("GCD = " + gcd);
    }
}
