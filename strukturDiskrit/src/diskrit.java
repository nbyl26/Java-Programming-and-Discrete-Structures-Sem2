import java.util.Scanner;
public class diskrit{
    public static void decimalToBinaryFraction() {
    Scanner input = new Scanner(System.in);
        System.out.print("Enter the decimal number: ");
        double decimalNumber = input.nextDouble();

        System.out.print("Enter amount of digits after comma: ");
        int digitsAfterDecimalPoint = input.nextInt();

        int wholeNumberPart = (int) decimalNumber;
        double fractionalPart = decimalNumber - wholeNumberPart;

        System.out.println("\nFor before comma:");
        String binaryRepresentation = "";
        System.out.println("2\t" + wholeNumberPart);
        while (wholeNumberPart > 0) {
            int remainder = wholeNumberPart % 2;

            System.out.println("\t" + wholeNumberPart / 2 + "\t" + remainder);
            wholeNumberPart = wholeNumberPart / 2;
            binaryRepresentation = remainder + binaryRepresentation;
        }

        binaryRepresentation += ".";
        int fractionalStartIndex = binaryRepresentation.length();
        System.out.println("Temporary result: " + binaryRepresentation + "\n");

        System.out.println("For after comma:");
        System.out.println("\t" + fractionalPart + " 2");
        for (int i = 0; i < digitsAfterDecimalPoint; i++) {
            fractionalPart *= 2;
            int integerPart = (int) fractionalPart;
            System.out.println(integerPart + "\t" + fractionalPart * 2);
            binaryRepresentation += integerPart;
            fractionalPart -= integerPart;
        }

        System.out.println("Fractional result: ." + binaryRepresentation.substring(fractionalStartIndex) + "\n");
        System.out.println("Result: " + binaryRepresentation);
        System.out.println("Something is wrong:");

        input.close();
    }

// Example 2.4.1
public static void decimalToOctalFraction() {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Enter the decimal number: ");
        double decimalNumber = sc.nextDouble();

        System.out.print("Enter amount of digits after comma: ");
        int digitsAfterDecimalPoint = sc.nextInt();

        int wholeNumberPart = (int) decimalNumber;
        double fractionalPart = decimalNumber - wholeNumberPart;

        System.out.println("\nFor before comma:");
        String octalRepresentation = "";
        System.out.println("8\t" + wholeNumberPart);
        while (wholeNumberPart > 0) {
            int remainder = wholeNumberPart % 8;

            System.out.println("\t" + wholeNumberPart / 8 + "\t" + remainder);
            wholeNumberPart = wholeNumberPart / 8;
            octalRepresentation = remainder + octalRepresentation;
        }

        octalRepresentation += ".";
        int fractionalStartIndex = octalRepresentation.length();
        System.out.println("Temporary result: " + octalRepresentation + "\n");

        System.out.println("For after comma:");
        System.out.println("\t" + fractionalPart + " 8");
        for (int i = 0; i < digitsAfterDecimalPoint; i++) {
            fractionalPart *= 8;
            int integerPart = (int) fractionalPart;
            System.out.println(integerPart + "\t" + fractionalPart * 8);
            octalRepresentation += integerPart;
            fractionalPart -= integerPart;
        }

        System.out.println("Fractional result: ." + octalRepresentation.substring(fractionalStartIndex) + "\n");
        System.out.println("Result: " + octalRepresentation);
    } catch (Exception e) {
        System.out.println("Something is wrong:");
        e.printStackTrace();
    }
}

// Example 2.4.2
public static void decimalToHexadecimalFraction() {
    try (Scanner sc = new Scanner(System.in)) {
        char[] hexDigits = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };

        System.out.print("Enter the decimal number: ");
        double decimalNumber = sc.nextDouble();

        System.out.print("Enter amount of digits after comma: ");
        int digitsAfterDecimalPoint = sc.nextInt();

        int wholeNumberPart = (int) decimalNumber;
        double fractionalPart = decimalNumber - wholeNumberPart;

        System.out.println("\nFor before comma:");
        String hexadecimalRepresentation = "";
        System.out.println("16\t" + wholeNumberPart);
        while (wholeNumberPart > 0) {
            int remainder = wholeNumberPart % 16;

            System.out.println("\t" + wholeNumberPart / 16 + "\t" + remainder);
            wholeNumberPart = wholeNumberPart / 16;
            hexadecimalRepresentation = hexDigits[remainder] + hexadecimalRepresentation;
        }

        hexadecimalRepresentation += ".";
        int fractionalStartIndex = hexadecimalRepresentation.length();
        System.out.println("Temporary result: " + hexadecimalRepresentation + "\n");

        System.out.println("For after comma:");
        System.out.println("\t" + fractionalPart + " 16");
        for (int i = 0; i < digitsAfterDecimalPoint; i++) {
            fractionalPart *= 16;
            int integerPart = (int) fractionalPart;
            System.out.println(integerPart + "\t" + fractionalPart * 16);
            hexadecimalRepresentation += hexDigits[integerPart];
            ;
            fractionalPart -= integerPart;
        }

        System.out
                .println("Fractional result: ." + hexadecimalRepresentation.substring(fractionalStartIndex) + "\n");
        System.out.println("Result: " + hexadecimalRepresentation);
    } catch (Exception e) {
        System.out.println("Something is wrong:");
        e.printStackTrace();
    }
}

// Example 2.4.3
public static void binaryToOctalFraction() {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Enter the binary number: ");
        String binaryNumber = sc.next();

        String[] parts = binaryNumber.split("\\.");
        String wholeNumberPart = parts[0];
        String fractionalPart = parts.length > 1 ? parts[1] : "";

        System.out.println("\nFor before comma:");
        String octalRepresentation = "";
        while (wholeNumberPart.length() % 3 != 0) {
            wholeNumberPart = "0" + wholeNumberPart;
        }
        for (int i = 0; i < wholeNumberPart.length(); i += 3) {
            String binaryChunk = wholeNumberPart.substring(i, i + 3);
            int octalDigit = Integer.parseInt(binaryChunk, 2);
            System.out.println(binaryChunk + " -> " + octalDigit);
            octalRepresentation += octalDigit;
        }

        octalRepresentation += ".";
        int fractionalStartIndex = octalRepresentation.length();
        System.out.println("Temporary result: " + octalRepresentation + "\n");

        System.out.println("For after comma:");
        while (fractionalPart.length() % 3 != 0) {
            fractionalPart += "0";
        }
        for (int i = 0; i < fractionalPart.length(); i += 3) {
            String binaryChunk = fractionalPart.substring(i, i + 3);
            int octalDigit = Integer.parseInt(binaryChunk, 2);
            System.out.println(binaryChunk + " -> " + octalDigit);
            octalRepresentation += octalDigit;
        }

        System.out.println("Fractional result: ." + octalRepresentation.substring(fractionalStartIndex) + "\n");
        System.out.println("Result: " + octalRepresentation);
    } catch (Exception e) {
        System.out.println("Something is wrong:");
        e.printStackTrace();
    }
}

// Example 2.4.4
public static void octalToBinaryFraction() {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Enter the octal number: ");
        String octalNumber = sc.next();

        String[] parts = octalNumber.split("\\.");
        String wholeNumberPart = parts[0];
        String fractionalPart = parts.length > 1 ? parts[1] : "";

        System.out.println("\nFor before comma:");
        String binaryRepresentation = "";
        for (char digit : wholeNumberPart.toCharArray()) {
            int octalDigit = Character.getNumericValue(digit);
            String binaryChunk = Integer.toBinaryString(octalDigit);
            while (binaryChunk.length() < 3) {
                binaryChunk = "0" + binaryChunk;
            }
            System.out.println(digit + " -> " + binaryChunk);
            binaryRepresentation += binaryChunk;
        }

        binaryRepresentation += ".";
        int fractionalStartIndex = binaryRepresentation.length();
        System.out.println("Temporary result: " + binaryRepresentation + "\n");

        System.out.println("For after comma:");
        for (char digit : fractionalPart.toCharArray()) {
            int octalDigit = Character.getNumericValue(digit);
            String binaryChunk = Integer.toBinaryString(octalDigit);
            while (binaryChunk.length() < 3) {
                binaryChunk = "0" + binaryChunk;
            }
            System.out.println(digit + " -> " + binaryChunk);
            binaryRepresentation += binaryChunk;
        }

        System.out.println("Fractional result: ." + binaryRepresentation.substring(fractionalStartIndex) + "\n");
        System.out.println("Result: " + binaryRepresentation);
    } catch (Exception e) {
        System.out.println("Something is wrong:");
        e.printStackTrace();
    }
}

// Example 2.4.5
public static void binaryToHexadecimalFraction() {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Enter the binary number: ");
        String binaryNumber = sc.next();

        String[] parts = binaryNumber.split("\\.");
        String wholeNumberPart = parts[0];
        String fractionalPart = parts.length > 1 ? parts[1] : "";

        System.out.println("\nFor before comma:");
        String hexadecimalRepresentation = "";
        while (wholeNumberPart.length() % 4 != 0) {
            wholeNumberPart = "0" + wholeNumberPart;
        }
        for (int i = 0; i < wholeNumberPart.length(); i += 4) {
            String binaryChunk = wholeNumberPart.substring(i, i + 4);
            int hexadecimalDigit = Integer.parseInt(binaryChunk, 2);
            System.out.println(binaryChunk + " -> " + Integer.toHexString(hexadecimalDigit).toUpperCase());
            hexadecimalRepresentation += Integer.toHexString(hexadecimalDigit).toUpperCase();
        }

        hexadecimalRepresentation += ".";
        int fractionalStartIndex = hexadecimalRepresentation.length();
        System.out.println("Temporary result: " + hexadecimalRepresentation + "\n");

        System.out.println("For after comma:");
        while (fractionalPart.length() % 4 != 0) {
            fractionalPart += "0";
        }
        for (int i = 0; i < fractionalPart.length(); i += 4) {
            String binaryChunk = fractionalPart.substring(i, i + 4);
            int hexadecimalDigit = Integer.parseInt(binaryChunk, 2);
            System.out.println(binaryChunk + " -> " + Integer.toHexString(hexadecimalDigit).toUpperCase());
            hexadecimalRepresentation += Integer.toHexString(hexadecimalDigit).toUpperCase();
        }

        System.out
                .println("Fractional result: ." + hexadecimalRepresentation.substring(fractionalStartIndex) + "\n");
        System.out.println("Result: " + hexadecimalRepresentation);
    } catch (Exception e) {
        System.out.println("Something is wrong:");
        e.printStackTrace();
    }
}

// Example 2.4.6
public static void hexadecimalToBinaryFraction() {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Enter the hexadecimal number: ");
        String hexadecimalNumber = sc.next();

        String[] parts = hexadecimalNumber.split("\\.");
        String wholeNumberPart = parts[0];
        String fractionalPart = parts.length > 1 ? parts[1] : "";

        System.out.println("\nFor before comma:");
        String binaryRepresentation = "";
        for (char digit : wholeNumberPart.toCharArray()) {
            int hexadecimalDigit = Integer.parseInt(String.valueOf(digit), 16);
            String binaryChunk = Integer.toBinaryString(hexadecimalDigit);
            while (binaryChunk.length() < 4) {
                binaryChunk = "0" + binaryChunk;
            }
            System.out.println(digit + " -> " + binaryChunk);
            binaryRepresentation += binaryChunk;
        }

        binaryRepresentation += ".";
        int fractionalStartIndex = binaryRepresentation.length();
        System.out.println("Temporary result: " + binaryRepresentation + "\n");

        System.out.println("For after comma:");
        for (char digit : fractionalPart.toCharArray()) {
            int hexadecimalDigit = Integer.parseInt(String.valueOf(digit), 16);
            String binaryChunk = Integer.toBinaryString(hexadecimalDigit);
            while (binaryChunk.length() < 4) {
                binaryChunk = "0" + binaryChunk;
            }
            System.out.println(digit + " -> " + binaryChunk);
            binaryRepresentation += binaryChunk;
        }

        System.out.println("Fractional result: ." + binaryRepresentation.substring(fractionalStartIndex) + "\n");
        System.out.println("Result: " + binaryRepresentation);
    } catch (Exception e) {
        System.out.println("Something is wrong:");
        e.printStackTrace();
        }
    }
}
