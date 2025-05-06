import java.util.Scanner;

public class belajar3 {

  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);

    int N = userInput.nextInt();
    int M = userInput.nextInt();

    int[] Ki = new int[N];
    int[] Li = new int[N];

    for (int i = 0; i < N; i++) {
      Ki[i] = userInput.nextInt();
    }

    for (int i = 0; i < N; i++) {
      Li[i] = userInput.nextInt();
    }

    int kemampuanMaks = M;

    for (int i = 0; i < N; i++) {
      if (Ki[i] <= kemampuanMaks) {
        kemampuanMaks = kemampuanMaks + Li[i];
      }
    }

    System.out.println(kemampuanMaks);
  }
}
