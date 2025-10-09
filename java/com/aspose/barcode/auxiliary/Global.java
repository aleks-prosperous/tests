package com.aspose.barcode.auxiliary;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Global
{
    public static String getTestDataFolder()
    {
        return ".." + File.separator + ".." + File.separator + "testdata";
    }

    public static String getTestDataFolder(String subFolder)
    {
        return getSpecificPath(".." + File.separator + ".." + File.separator + "testdata", subFolder);
    }

    public static String getRecognitionFolder(String subFolder)
    {
        return getTestDataFolder("Recognition" + File.separator + subFolder);
    }
    public static String getLicenseFolder(String subFolder)
    {
        return getTestDataFolder("License" + File.separator + subFolder);
    }

    public static String pathCombine(String folder, String fileName)
    {
        if ((folder == null || folder.isEmpty()) && (fileName == null || fileName.isEmpty()))
        {
            return "";
        }
        if (folder == null || folder.isEmpty())
        {
            return fileName;
        }
        if (fileName == null || fileName.isEmpty())
        {
            return folder;
        }

        if (folder.contains("\\"))
        {
            folder = folder.replaceAll("\\\\", "/");
        }
        if (fileName.contains("\\"))
        {
            fileName = fileName.replaceAll("\\\\", "/");
        }
        if (!folder.endsWith("/"))
        {
            folder += "/";
        }
        return folder.concat(fileName);
    }

    public static boolean isPathExists(String folderPath, String fileName)
    {
        return isPathExists(pathCombine(folderPath, fileName));
    }

    public static boolean isPathExists(String filePath)
    {
        return Files.exists(Paths.get(filePath));
    }

    public static void printPathExists(String filePath)
    {
        System.out.println("File path '" + filePath + "' exists - "  + isPathExists(filePath));
    }

    private static String getSpecificPath(String parentPath, String subPath)
    {
        String filePath = parentPath + File.separator + subPath;
        File f = new File(filePath);
        if (!f.exists())
        {
//            throw new RuntimeException("File " + filePath + " doesn't exist");
            System.out.println("Attention!!! File " + filePath + " doesn't exist");
        }
        return addSlash(filePath);
    }

    private static String getOrCreateSpecificFolder(String parentPath, String subPath)
    {
        String folderPath = parentPath + File.separator + subPath;
        File folder = new File(folderPath);
        if (!createFolderIfNotExists(folder))
        {
            String fullPath = folder.getAbsolutePath();
            if (!createFolderIfNotExists(new File(fullPath)))
            {
                throw new RuntimeException("Unable to find folder " + subPath);
            }
        }
        return addSlash(folderPath);
    }

    private static String addSlash(String s)
    {
        String lastSymbol = s.substring(s.length() - 1);
        if (!lastSymbol.equals(File.separator))
        {
            return s + File.separator;
        }
        return s;
    }

    private static boolean createFolderIfNotExists(File folder)
    {
        boolean created = true;
        if (!folder.exists())
        {
            try
            {
                created = folder.mkdirs();
            }
            catch (SecurityException se)
            {
                return false;
            }
        }
        return created;
    }

    public static BufferedImage getBufferedImageFromFile(String fileName)
    {
        BufferedImage image = null;
        try
        {
            File img = new File(fileName);
            image = ImageIO.read(img);
            System.out.println(image);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return image;
    }

    public static String getBarcodeJavaIssuesTestImagePath(String subPath)
    {
        return getTestDataFolder("barcodjava_issues" + File.separator + subPath);
    }

    public static String getTestDataFolderJR(String subPath)
    {
        return getTestDataFolder("JasperReports" + File.separator + subPath);
    }

    public static String getIssuesTestImagePath(String subPath)
    {
        return getTestDataFolder("Issues" + File.separator + subPath);
    }

    public static String getBuilderTestsPath(String subPath)
    {
        return getTestDataFolder("Builder" + File.separator + subPath);
    }

    public static String getGeneratedImagesFolder(String subPath)
    {
        return getTestDataFolder("Generated" + File.separator + subPath);
    }

    public static String getIssuesGeneratedImagesFolder(String subPath)
    {
        return getGeneratedImagesFolder("Issues" + File.separator + subPath);
    }

    public static String getTempFolder()
    {
        return getGeneratedImagesFolder("Temp");
    }

    public static String getTempFolder(String fileName)
    {
        return getTempFolder() + "/" + fileName;
    }

    public static String getBarcodejavaIssuesGeneratedImagesFolder(String subPath)
    {
        return getGeneratedImagesFolder("barcodjava_issues" + File.separator + subPath);
    }

    public static String getGeneratedFolderJR(String subPath)
    {
        return getTestDataFolderJR("Generated" + File.separator + subPath);
    }

    public static String getLicenseFilesPath(String subPath)
    {
        return getTestDataFolder("License" + File.separator + subPath);
    }


}