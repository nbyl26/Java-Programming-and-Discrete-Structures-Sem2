public class soal242 {
    public static void main(String[] args) {
        double decimalNumber = 985.78125;

        int integerPart = (int) decimalNumber;
        double fractionalPart = decimalNumber - integerPart;

        String hexadecimalInteger = convertIntegerToHexadecimal(integerPart);

        String hexadecimalFractional = convertFractionalToHexadecimal(fractionalPart);

        String hexadecimalResult = hexadecimalInteger + "." + hexadecimalFractional;

        System.out.println(decimalNumber + " : " + hexadecimalResult);
    }

    public static String convertIntegerToHexadecimal(int num) {
        StringBuilder hex = new StringBuilder();
        while (num > 0) {
            int remainder = num % 16;
            hex.insert(0, Integer.toHexString(remainder).toUpperCase());
            num /= 16;
        }
        return hex.toString();
    }

    public static String convertFractionalToHexadecimal(double num) {
        StringBuilder hex = new StringBuilder();
        while (num > 0) {
            num *= 16;
            int digit = (int) num;
            hex.append(Integer.toHexString(digit).toUpperCase());
            num -= digit;
        }
        return hex.toString();
    }
}
