import java.util.Scanner;

public class factorOfNumber {

  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    System.out.println("masukkan : ");
    int number = userInput.nextInt();

    System.out.println("faktor dari " + number + " adalah : ");
    for (int i = 1; i <= number; i++) {
      if (number % i == 0) {
        System.out.println(i + " ");
      }
    }
  }
}
