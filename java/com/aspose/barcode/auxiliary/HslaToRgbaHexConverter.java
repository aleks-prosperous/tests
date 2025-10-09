package com.aspose.barcode.auxiliary;

public class HslaToRgbaHexConverter
{

    public static void main(String[] args) {
        double h = 30;    // Hue (от 0 до 360)
        double s = 50;    // Saturation (от 0 до 100)
        double l = 70;    // Lightness (от 0 до 100)
        double a = 0.8;   // Alpha (от 0.0 до 1.0)

        String hex = hslaToRgbaHex(h, s, l, a);
        System.out.println("Hex: " + hex);
    }

    public static String hslaToRgbaHex(double h, double s, double l, double a) {
        // Преобразуем насыщенность и яркость в доли (от 0 до 1)
        s /= 100;
        l /= 100;

        double c = (1 - Math.abs(2 * l - 1)) * s;
        double x = c * (1 - Math.abs((h / 60) % 2 - 1));
        double m = l - c / 2;

        double r = 0, g = 0, b = 0;

        if (0 <= h && h < 60) {
            r = c;
            g = x;
            b = 0;
        } else if (60 <= h && h < 120) {
            r = x;
            g = c;
            b = 0;
        } else if (120 <= h && h < 180) {
            r = 0;
            g = c;
            b = x;
        } else if (180 <= h && h < 240) {
            r = 0;
            g = x;
            b = c;
        } else if (240 <= h && h < 300) {
            r = x;
            g = 0;
            b = c;
        } else if (300 <= h && h < 360) {
            r = c;
            g = 0;
            b = x;
        }

        // Преобразуем r, g, b в диапазон от 0 до 255
        int red = (int) Math.round((r + m) * 255);
        int green = (int) Math.round((g + m) * 255);
        int blue = (int) Math.round((b + m) * 255);
        int alpha = (int) Math.round(a * 255);

        // Преобразуем в шестнадцатеричное представление
        String hexR = String.format("%02X", red);
        String hexG = String.format("%02X", green);
        String hexB = String.format("%02X", blue);
        String hexA = String.format("%02X", alpha);

        return "#" + hexR + hexG + hexB + hexA;
    }
}
