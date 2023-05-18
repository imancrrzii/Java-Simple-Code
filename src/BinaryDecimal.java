import java.util.Scanner;

public class BinaryDecimal {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("masukkan binary  : ");
        long num = userInput.nextLong();
        int decimal = convertBinaryToDecimal(num);
        System.out.printf("%d in binary = %d in decimal", num, decimal);
        userInput.close();
    }

    public static int convertBinaryToDecimal(long number){
        int decimalNumber = 0;
        int i = 0;

        long remainder;
        while (number != 0){
            remainder = number % 10;
            number /= 10;
            decimalNumber += remainder * Math.pow(2, i);
            i++;
        }
        return decimalNumber;
    }
}
