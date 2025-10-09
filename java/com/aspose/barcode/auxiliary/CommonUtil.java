package com.aspose.barcode.auxiliary;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CommonUtil
{
    public static void printFileExist(String filePath)
    {
        boolean exists = Files.exists(Paths.get(filePath));
        if (exists)
        {
            System.out.println("File " + filePath + " exists");
        } else
        {
            System.out.println("File " + filePath + " doesn't exists");
        }
    }

    public static boolean isFileExists(String filePath)
    {
        return Files.exists(Paths.get(filePath));
    }

    public static boolean isFileNotExists(String filePath)
    {
        return Files.notExists(Paths.get(filePath));
    }

    public static void saveImageToPath(BufferedImage bufferedImage, String format, String path)
    {
        try
        {
            ImageIO.write(bufferedImage, format,  new File(path));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
