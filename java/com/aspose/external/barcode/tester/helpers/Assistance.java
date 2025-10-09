package com.aspose.external.barcode.tester.helpers;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Assistance
{
    public static void saveBufferedImage(BufferedImage image, String formatName, String filePath)
    {
        try
        {
            ImageIO.write(image, formatName, new File(filePath));
        }
        catch (IOException e)
        {
            System.out.println("Cannot save image");
            e.printStackTrace();
        }
    }
}
