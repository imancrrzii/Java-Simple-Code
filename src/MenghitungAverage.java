import java.util.Scanner;

public class MenghitungAverage {

  //   public static void main(String[] args) {
  //     Scanner inputUser = new Scanner(System.in);

  //     System.out.println("Masukkan Bilangan");
  //     int bilangan1 = inputUser.nextInt();
  //     int bilangan2 = inputUser.nextInt();

  //     double average = (bilangan1 + bilangan2) / 2.0;

  //     System.out.println("Average = " + average);
  //     inputUser.close();
  //   }

  //   public static void main(String[] args) {
  //     Scanner inputUser = new Scanner(System.in);

  //     System.out.println("Masukkan Bilangan");
  //     int x = inputUser.nextInt();
  //     int bilangan[] = new int[x];

  //     for (int i = 0; i < bilangan.length; i++) {
  //       bilangan[i] = inputUser.nextInt();
  //     }

  //     double average = 0;
  //     for (int i = 0; i < bilangan.length; i++) {
  //       average = average + bilangan[i];
  //     }
  //     average /= bilangan.length;

  //     System.out.println("Average = " + average);
  //     inputUser.close();
  //   }
  // }

  public static void main(String[] args) {
    Scanner inputUser = new Scanner(System.in);

    System.out.println("Masukkan Bilangan");
    int bilangan = inputUser.nextInt();
    int bilangans[] = new int[bilangan];

    for (int i = 0; i < bilangans.length; i++) {
      bilangans[i] = inputUser.nextInt();
    }

    double total = 0;
    for (int i = 0; i < bilangans.length; i++) {
      total += bilangans[i];
    }
    double average = 0;
    average = total /= bilangans.length;

    System.out.println("average = " + average);
  }
}
