import java.util.Scanner;

public class Summ {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int n = input.nextInt();

    int total = 0;
    for (int i = 1; i <= n; i++) {
      System.out.println("Masukkan angka ke-" + i);
      int bilangan = input.nextInt();
      total += bilangan;
    }
    System.out.println(total);

    double average = total / n;
    System.out.println(average);
    
    input.close();
  }
}
