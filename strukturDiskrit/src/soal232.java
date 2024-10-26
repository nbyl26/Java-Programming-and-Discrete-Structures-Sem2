public class soal232 {
    public static void main(String[] args) {
        double decimal = 0.32;
        int integerPart, digit;
        double fractionalPart;
        String binaryIntegerPart;
  
        integerPart = (int) decimal;
        fractionalPart = decimal - integerPart;
        binaryIntegerPart = Integer.toBinaryString(integerPart);

        System.out.print("Binary equivalent: " + binaryIntegerPart + ".");

        for (int i = 0; i < 5; i++) {
            fractionalPart *= 2;
            digit = (int) fractionalPart;
            System.out.print(digit);
            fractionalPart -= digit;
        }

        System.out.println();
    }
}

