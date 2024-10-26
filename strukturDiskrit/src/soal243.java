public class soal243 {
    public static void main(String[] args) {
        String binaryNumber = "10100011.10111";

        // Split the binary number into integer and fractional parts
        String[] parts = binaryNumber.split("\\.");

        // Convert the integer part to octal
        int decimalIntegerPart = Integer.parseInt(parts[0], 2);
        String octalIntegerPart = Integer.toOctalString(decimalIntegerPart);

        // Convert the fractional part to octal
        double fractionalPart = Double.parseDouble("0." + parts[1]);
        System.out.print("Octal equivalent: " + octalIntegerPart + ".");

        for (int i = 0; i < 2; i++) {
            fractionalPart *= 8;
            int digit = (int) fractionalPart;
            System.out.print(digit);
        }

        System.out.println();
    }
}
