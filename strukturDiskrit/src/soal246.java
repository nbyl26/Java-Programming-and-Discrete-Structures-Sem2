public class soal246 {
    public static void main(String[] args) {
        String hexaNumber = "B2.5D6";
        String binaryIntegerPart, binaryFractionalPart;
        
        String[] parts = hexaNumber.split("\\.");

        binaryIntegerPart = Long.toBinaryString(Long.parseLong(parts[0], 16));

        binaryFractionalPart = hexFractionToBinary(parts[1]);

        System.out.println("Binary equivalent: " + binaryIntegerPart + "." + binaryFractionalPart);
    }

    private static String hexFractionToBinary(String hexaFraction) {
        String binaryFraction = "";

        for (char hexaDigit : hexaFraction.toCharArray()) {
            binaryFraction += String.format("%4s", Integer.toBinaryString(Integer.parseInt(String.valueOf(hexaDigit), 16))).replace(' ', '0');
        }

        return binaryFraction;
    }
}
