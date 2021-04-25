package Martyr2;

public class DecimalBinaryConverter {
    public static int decimalToBinary(int decimal) {
        StringBuilder binary = new StringBuilder();

        do {
            if (decimal % 2 == 0) {
                binary.insert(0, "0");
            } else {
                binary.insert(0, "1");
            }
            decimal = decimal / 2;
        } while (decimal > 0);

        return Integer.parseInt(binary.toString());
    }

    public static int binaryToDecimal(int binary) {
        int decimal = 0;

        String bin = String.valueOf(binary);

        for (int i = 0; i < bin.length(); i++) {
            decimal += (int) (Math.pow(2, i) * Integer.parseInt(String.valueOf(bin.charAt(bin.length() - 1 - i))));
        }

        return decimal;
    }
}
