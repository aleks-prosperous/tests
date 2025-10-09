package com.aspose.barcode.auxiliary;

/**
 * Converts decimal RGBA to hexadecimal
 */
public class RgbaDecimalToHex {

    public static void main(String[] args) {
        int r = 217;
        int g = 179;
        int b = 140;
        double a = 0.80; // Alpha channel as floating point number

        String hex = rgbaToHex(r, g, b, a);
        System.out.println("Hex: " + hex);
    }

    public static String rgbaToHex(int r, int g, int b, double a) {
        // Check that the values are in the range of 0 to 255 for RGB and 0 to 1 for A
        if (r < 0 || r > 255 || g < 0 || g > 255 || b < 0 || b > 255 || a < 0.0 || a > 1.0) {
            throw new IllegalArgumentException("RGB values must be between 0 and 255 and alpha must be between 0.0 and 1.0.");
        }

        // Convert alpha channel to integer from 0 to 255
        int alpha = (int) Math.round(a * 255);

        // Convert each value to hexadecimal, add zeros if necessary
        String hexR = String.format("%02X", r);
        String hexG = String.format("%02X", g);
        String hexB = String.format("%02X", b);
        String hexA = String.format("%02X", alpha);

        // Merge values into one line
        return "#" + hexR + hexG + hexB + hexA;
    }
}
