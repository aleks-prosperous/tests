package com.aspose.barcode.auxiliary;

/**
 * Converts hexadecimal RGBA to decimal
 */
public class RgbaHexToDecimal {

    public static void main(String[] args) {
        String hex = "#CCD9B38C";
        int[] rgba = hexToRgba(hex);
        System.out.printf("RGBA: (%d, %d, %d, %d)%n", rgba[0], rgba[1], rgba[2], rgba[3]);
    }

    public static int[] hexToRgba(String hex) {
        // Delete the '#' character at the beginning of the line if it is present
        if (hex.startsWith("#")) {
            hex = hex.substring(1);
        }

        // Check that the string length corresponds to 8 characters
        if (hex.length() != 8) {
            throw new IllegalArgumentException("Invalid RGBA hex string. Expected 8 characters.");
        }

        // Преобразуем каждую компоненту из шестнадцатеричного формата в десятичный
        int r = Integer.parseInt(hex.substring(0, 2), 16);
        int g = Integer.parseInt(hex.substring(2, 4), 16);
        int b = Integer.parseInt(hex.substring(4, 6), 16);
        int a = Integer.parseInt(hex.substring(6, 8), 16);

        return new int[]{r, g, b, a};
    }
}
