import java.util.Scanner;

public class soal241 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double decimal, fractionalPart;
        int integerPart, digit;

        System.out.print("Masukkan angka desimal: ");
        decimal = input.nextDouble();

        integerPart = (int) decimal;
        fractionalPart = decimal - integerPart;

        String octalIntegerPart = Integer.toOctalString(integerPart);

        System.out.print("Octal equivalent: " + octalIntegerPart + ".");

        for (int i = 0; i < 5; i++) {
            fractionalPart *= 8;
            digit = (int) fractionalPart;
            System.out.print(digit);
            fractionalPart -= digit;
        }

        System.out.println();

        input.close();
    }
}
