package com.aspose.barcode.auxiliary;

import java.io.*;
import java.io.File;
import java.util.List;

public class CommonHelper
{
    public static boolean isFileExists(String filePath)
    {
        File file = new File(filePath);
        return file.exists();
    }

    public static void echoFileExists(String filePath)
    {
        if (isFileExists(filePath))
        {
            System.out.println("File " + filePath + " exists");
        }
        else
        {
            System.out.println("File " + filePath + " absent");

        }
    }

    public static <T> void print(List<T> list)
    {
        for (T el : list)
        {
            print(el);
        }
    }

    public static <T> void print(T el)
    {
        System.out.println(el);
    }

    public static String readFromInputStream(InputStream inputStream) throws IOException
    {
        StringBuilder resultStringBuilder = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream)))
        {
            String line;
            while ((line = br.readLine()) != null)
            {
                resultStringBuilder.append(line).append("\n");
            }
        }
        return resultStringBuilder.toString();

    }
}
