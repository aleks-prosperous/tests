package com.aspose.barcode.auxiliary;

import java.awt.*;

public class HexToJavaColor {

    public static void main(String[] args) {
        String hex = "#D9B38CCC";
        Color color = colorFromHex(hex);
        System.out.println("RGBA = " + color.getRed() + "," + color.getGreen() + "," + color.getBlue() + "," + color.getAlpha());
//        System.out.println("Red: " + color.getRed());
//        System.out.println("Green: " + color.getGreen());
//        System.out.println("Blue: " + color.getBlue());
//        System.out.println("Alpha: " + color.getAlpha());
    }

    public static Color colorFromHex(String hex) {
        // Remove the '#' character if it is present
        if (hex.charAt(0) == '#') {
            hex = hex.substring(1);
        }

        // Depending on the length of the string, we process values
        if (hex.length() == 6) {
            // Если длина 6, то это RGB
            return new Color(
                    Integer.parseInt(hex.substring(0, 2), 16),
                    Integer.parseInt(hex.substring(2, 4), 16),
                    Integer.parseInt(hex.substring(4, 6), 16));
        } else if (hex.length() == 8) {
            // If the length is 8, it is RGBA
            return new Color(
                    Integer.parseInt(hex.substring(0, 2), 16),
                    Integer.parseInt(hex.substring(2, 4), 16),
                    Integer.parseInt(hex.substring(4, 6), 16),
                    Integer.parseInt(hex.substring(6, 8), 16));
        } else {
            throw new IllegalArgumentException("Hex string must be 6 or 8 characters long.");
        }
    }
}
