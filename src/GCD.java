import java.util.Scanner;

public class GCD {

  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    System.out.println("Masukkan n1 = ");
    int n1 = userInput.nextInt();
    System.out.println("Masukkan n2 = ");
    int n2 = userInput.nextInt();

    int gcd = 1;

    for (int i = 1; i <= n1 && i <= n2; ++i) {
      if (n1 % i == 0 && n2 % i == 0) gcd = i;
    }
    System.out.println("GCD = " + gcd);
  }
}
