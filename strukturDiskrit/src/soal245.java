public class soal245 {
    public static void main(String[] args) {
        String binary = "10111101001.110001";
        String[] parts = binary.split("\\.");

        String integerHex = convertBinaryToHex(parts[0]);

        String fractionalHex = convertFractionalBinaryToHex(parts[1]);

        String hex = integerHex + "." + fractionalHex;

        System.out.println(binary + " : " + hex);
    }

    private static String convertBinaryToHex(String binary) {
        int length = binary.length();
        int remainder = length % 4;

        if (remainder != 0) {
            for (int i = 0; i < 4 - remainder; i++) {
                binary = "0" + binary;
            }
        }

        StringBuilder hex = new StringBuilder();
        for (int i = 0; i < binary.length(); i += 4) {
            String fourBits = binary.substring(i, i + 4);
            int decimal = Integer.parseInt(fourBits, 2);
            hex.append(Integer.toHexString(decimal).toUpperCase());
        }

        return hex.toString();
    }

    private static String convertFractionalBinaryToHex(String binary) {
        while (binary.length() % 4 != 0) {
            binary += "0";
        }

        StringBuilder hex = new StringBuilder();
        for (int i = 0; i < binary.length(); i += 4) {
            String fourBits = binary.substring(i, i + 4);
            int decimal = Integer.parseInt(fourBits, 2);
            hex.append(Integer.toHexString(decimal).toUpperCase());
        }

        return hex.toString();
    }
}
