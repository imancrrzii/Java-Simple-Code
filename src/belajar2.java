import java.util.Arrays;
import java.util.Scanner;

public class belajar2 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("");
        int n = userInput.nextInt();

        int[] x = new int[n];

        System.out.print("");
        for (int i = 0; i < n; i++) {
            x[i] = userInput.nextInt();
        }

        Arrays.sort(x);

        double median;
        if (n % 2 == 0) {
            int mid1 = n / 2 - 1;
            int mid2 = n / 2;
            median = (x[mid1] + x[mid2]) / 2.0;
        } else {
            int mid = n / 2;
            median = x[mid];
        }

        if (median % 1 == 0) {
            System.out.println((int) median);
        } else {
            System.out.println(median);
        }
    }
}
