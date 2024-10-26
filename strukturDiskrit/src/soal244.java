import java.util.Scanner;

public class soal244 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String octal, binaryResult;
        System.out.print("Masukkan angka oktal: ");
        octal = input.next();

        binaryResult = convertOctalToBinary(octal);

        System.out.println("Hasil konversi biner: " + binaryResult);

        input.close();
    }

    private static String convertOctalToBinary(String octal) {
        String binaryResult = "";

        for (int i = 0; i < octal.length(); i++) {
            char digit = octal.charAt(i);
            int decimalDigit;
            decimalDigit = Character.getNumericValue(digit);
            binaryResult += convertDecimalToBinary(decimalDigit, 3);
        }

        binaryResult += '.';

        for (int i = octal.indexOf('.') + 1; i < octal.length(); i++) {
            char digit = octal.charAt(i);
            int decimalDigit;
            decimalDigit = Character.getNumericValue(digit);
            binaryResult += convertDecimalToBinary(decimalDigit, 3);
        }

        return binaryResult;
    }

    private static String convertDecimalToBinary(int decimal, int bits) {
        String binaryResult = "";
        int bit;
        for (int i = bits - 1; i >= 0; i--) {
            bit = (decimal >> i) & 1;
            binaryResult += bit;
        }

        return binaryResult;
    }
}
