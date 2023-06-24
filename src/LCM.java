import java.util.Scanner;

public class LCM {
    private int n1;
    private int n2;

    public LCM(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public int calculateLCM() {
        int gcd = calculateGCD();
        return (n1 * n2) / gcd;
    }

    private int calculateGCD() {
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

        LCM lcm = new LCM(n1, n2);
        int result = lcm.calculateLCM();
        System.out.println("LCM = " + result);
    }
}
