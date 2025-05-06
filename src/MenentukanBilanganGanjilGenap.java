import java.util.Scanner;

public class MenentukanBilanganGanjilGenap {

  public static void main(String[] args) {
    Scanner inputUser = new Scanner(System.in);

    System.out.println("Masukkan bilangan: ");
    int bilangan = inputUser.nextInt();

    if (bilangan % 2 == 0) {
      System.out.println(bilangan + " adalah bilangan genap");
    } else {
      System.out.println(bilangan + " adalah bilangan ganjil");
    }
    inputUser.close();
  }
}
