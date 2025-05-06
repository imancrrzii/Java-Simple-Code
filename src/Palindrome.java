import java.util.Scanner;

public class Palindrome {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan bilangan: ");
    int bilangan = input.nextInt();

    int reverse = 0, temp = bilangan;

    while (temp != 0) {
      reverse = reverse * 10 + temp % 10;
      temp /= 10;
      System.out.println(reverse);
      // System.out.println(temp);
    }

    if (bilangan == reverse) {
      System.out.println(bilangan + " adalah bilangan palindrom");
    } else {
      System.out.println(bilangan + " bukan bilangan palindrom");
    }
  }
}
