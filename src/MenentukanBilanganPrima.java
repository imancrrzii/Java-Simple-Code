import java.util.Scanner;

public class MenentukanBilanganPrima {

  public static void main(String[] args) {
    Scanner inputUser = new Scanner(System.in);

    System.out.println("Masukkan bilangan: ");
    int bilangan = inputUser.nextInt();

    boolean isPrime = true;
    for (int i = 2; i < bilangan; i++) {
      if (bilangan % i == 0) {
        isPrime = false;
        break;
      }
    }

    if (isPrime) {
      System.out.println(bilangan + " adalah bilangan prima");
    } else {
      System.out.println(bilangan + " bukan bilangan prima");
    }
  }
}
