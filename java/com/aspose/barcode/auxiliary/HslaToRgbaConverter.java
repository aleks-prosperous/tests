package com.aspose.barcode.auxiliary;

/**
 * Converts HSLA decimal to RGBA decimal
 */
public class HslaToRgbaConverter {

    public static void main(String[] args) {
        double h = 30;
        double s = 50;
        double l = 70;
        double a = 0.8;

        int[] rgba = hslaToRgba(h, s, l, a);
        System.out.printf("RGBA: (%d, %d, %d, %.2f)%n", rgba[0], rgba[1], rgba[2], a);
    }

    public static int[] hslaToRgba(double h, double s, double l, double a) {
        s /= 100;
        l /= 100;

        double c = (1 - Math.abs(2 * l - 1)) * s;
        double x = c * (1 - Math.abs((h / 60) % 2 - 1));
        double m = l - c / 2;

        double rPrime = 0, gPrime = 0, bPrime = 0;

        if (0 <= h && h < 60) {
            rPrime = c;
            gPrime = x;
            bPrime = 0;
        } else if (60 <= h && h < 120) {
            rPrime = x;
            gPrime = c;
            bPrime = 0;
        } else if (120 <= h && h < 180) {
            rPrime = 0;
            gPrime = c;
            bPrime = x;
        } else if (180 <= h && h < 240) {
            rPrime = 0;
            gPrime = x;
            bPrime = c;
        } else if (240 <= h && h < 300) {
            rPrime = x;
            gPrime = 0;
            bPrime = c;
        } else if (300 <= h && h < 360) {
            rPrime = c;
            gPrime = 0;
            bPrime = x;
        }

        int r = (int) Math.round((rPrime + m) * 255);
        int g = (int) Math.round((gPrime + m) * 255);
        int b = (int) Math.round((bPrime + m) * 255);

        return new int[]{r, g, b};
    }
}
