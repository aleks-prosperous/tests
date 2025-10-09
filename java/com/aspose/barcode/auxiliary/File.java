package com.aspose.barcode.auxiliary;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class File
{
    public static byte[] readAllBytes(String filePath)
    {

        FileInputStream fileInputStream = null;
        byte[] bytesArray = null;

        try
        {
            java.io.File file = new java.io.File(filePath);
            bytesArray = new byte[(int) file.length()];

            //read file into bytes[]
            fileInputStream = new FileInputStream(file);
            fileInputStream.read(bytesArray);

        } catch (IOException e)
        {
            e.printStackTrace();
        } finally
        {
            if (fileInputStream != null)
            {
                try
                {
                    fileInputStream.close();
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
            }

        }
        return bytesArray;
    }


    public static String readAllText(String filePath)
    {
        byte[] encoded = new byte[0];
        try
        {
            encoded = Files.readAllBytes(Paths.get(filePath));
        } catch (IOException e)
        {
            e.printStackTrace();
        }
        return new String(encoded, Charset.forName("UTF-8"));
    }


    public static byte[] readBytes(InputStream inputStream, int size)
    {
        byte[] bytesArray = new byte[size];
        try
        {
            inputStream.read(bytesArray, 0, size);
        } catch (IOException e)
        {
            e.printStackTrace();
        }
        return bytesArray;
    }

    public static void copy(String sourceFileName, String destFileName, boolean overwrite) throws Exception
    {

        if (sourceFileName == null)
        {
            throw new NullPointerException("sourceFileName");
        }
        if (destFileName == null)
        {
            throw new NullPointerException("destFileName");
        }
        if (sourceFileName.length() == 0)
        {
            throw new Exception("An empty file name is not valid.");
        }
        if (sourceFileName.trim().length() == 0)
        {
            throw new Exception("The file name is not valid.");
        }
        if (destFileName.length() == 0)
        {
            throw new Exception("An empty file name is not valid.");
        }
        if (destFileName.trim().length() == 0)
        {
            throw new Exception("The file name is not valid.");
        }


        java.io.File fromFile = new java.io.File(sourceFileName);
        java.io.File toFile = new java.io.File(destFileName);

        if (!fromFile.exists())
        {
            throw new FileNotFoundException("FileCopy: no such source file: " + sourceFileName);
        }
        if (!fromFile.isFile())
        {
            throw new IOException("FileCopy: can't copy directory: " + sourceFileName);
        }
        if (!fromFile.canRead())
        {
            throw new IOException("FileCopy: source file is unreadable: " + sourceFileName);
        }
        if (sourceFileName.equals(destFileName))
        {
            throw new IOException("Can't copy file to itsalf : " + sourceFileName);
        }

        if (toFile.isDirectory())
        {
            toFile = new java.io.File(toFile, fromFile.getName());
        }

        if (toFile.exists())
        {
            if (!overwrite)
            {
                throw new IOException("Destination file alresdy exist :" + toFile.getAbsolutePath());
            }
        } else
        {
            String parent = toFile.getParent();
            if (parent == null)
            {
                parent = System.getProperty("user.dir");
            }
            java.io.File dir = new java.io.File(parent);
            if (!dir.exists())
            {
                throw new IOException("FileCopy: destination directory doesn't exist: " + parent);
            }
            if (dir.isFile())
            {
                throw new IOException("FileCopy: destination is not a directory: " + parent);
            }
            if (!dir.canWrite())
            {
                throw new IOException("FileCopy: destination directory is unwriteable: " + parent);
            }
        }

        FileInputStream from = null;
        FileOutputStream to = null;
        try
        {
            from = new FileInputStream(fromFile);
            to = new FileOutputStream(toFile);
            byte[] buffer = new byte[4096];
            int bytesRead;

            while ((bytesRead = from.read(buffer)) != -1)
            {
                to.write(buffer, 0, bytesRead); // write
            }
        } catch (FileNotFoundException ex)
        {
            throw new FileNotFoundException(ex.getMessage());
        } catch (IOException ex)
        {
            throw new IOException(ex.getMessage());
        } finally
        {
            if (from != null)
            {
                try
                {
                    from.close();
                } catch (IOException e)
                {
                }
            }
            if (to != null)
            {
                try
                {
                    to.close();
                } catch (IOException e)
                {
                }
            }
        }
    }

}
