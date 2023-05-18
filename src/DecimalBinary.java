import java.util.Scanner;

public class DecimalBinary {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("masukkan decimal  : ");
        int num = userInput.nextInt();
        long binary = convertDecimalToBinary(num);
        System.out.printf("%d in decimal = %d in binary", num, binary);
        userInput.close();
    }

    public static long convertDecimalToBinary(int number){
        long binaryNumber = 0;
        int sisa;
        int i = 1;
        int langkah = 1;

        while (number != 0){
            sisa = number % 2;
            System.out.printf("Langkah %d: %d/2, sisa = %d, Hasil Bagi = %d\n", langkah++, number, sisa, number/2);
            number /=2;
            binaryNumber += sisa * i;
            i *= 10;
        }
        return binaryNumber;
    }
    
}

