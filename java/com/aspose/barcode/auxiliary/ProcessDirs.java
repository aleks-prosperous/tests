package com.aspose.barcode.auxiliary;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class ProcessDirs
{
    public static void runDirectories(String source, String fileName, File dir)
    {
        File[] files = dir.listFiles();
        if ((files == null || files.length < 1))
        {
            return;
        }
        for (File current : files)
        {
            if (current.isDirectory())
            {
                if (isContainsDirectory(current))
                {
                    runDirectories(source, fileName, current);
                }
                else
                {
                    copyFileToDir(source, fileName, current.getAbsolutePath());
                }
            }
            else
            {
//                    System.out.println("file ->" + file.getCanonicalPath());
            }
        }
    }


    private static void copyFileToDir(String source, String fileName,  String target )
    {
        try
        {
            Files.copy(Paths.get(source + "/" + fileName), Paths.get(target + "/" + fileName), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("### Copied file " + fileName + " to directory " + target);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }





    private static boolean isContainsDirectory(File dir)
    {
        File[] files = dir.listFiles();
        if ((files == null || files.length < 1))
        {
            return false;
        }
        for (File f : files)
        {
            if (f.isDirectory())
            {
                return true;
            }
        }
        return false;
    }
}
