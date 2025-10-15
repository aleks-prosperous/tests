//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33245.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="11.05.2012 16:31:51">
//     Copyright (c) 2001-2011 Aspose Pty Ltd. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------------------------------------------

package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.BarCodeImageFormat;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.DataMatrixEncodeMode;
import com.aspose.barcode.generation.EncodeTypes;
import com.aspose.barcode.logger.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;


@Test(description = "Tests for Issue-33245.")
public class Issue33245
{
    @BeforeMethod
    public void setUp(Method testMethod)
    {
        LicenseAssistant.setupLicense();
        Logger.methodStarted(getClass().getName() + "." + testMethod.getName());
    }

    @Test
    public void testGood_1() throws IOException
    {
        final DataMatrixEncodeMode mode = DataMatrixEncodeMode.AUTO;
        testDatamatrix(setCodeText(mode, 1556), mode);
    }

    @Test
    public void testGood_2() throws IOException
    {
        final DataMatrixEncodeMode mode = DataMatrixEncodeMode.BYTES;
        testDatamatrix(setCodeText(mode, 1556), mode);
    }

    @Test
    public void testException1() throws IOException
    {
        try
        {
            DataMatrixEncodeMode mode = DataMatrixEncodeMode.AUTO;
            testDatamatrix(setCodeText(mode, 1556 + 1), mode);
        } catch (InvalidCodeException ex)
        {
            return;
        }
        Assert.fail("InvalidCodeException expected");
    }

    @Test
    public void testException2() throws IOException
    {
        try
        {
            final DataMatrixEncodeMode mode = DataMatrixEncodeMode.BYTES;
            testDatamatrix(setCodeText(mode, 1556 + 1), mode);
        } catch (InvalidCodeException ex)
        {
            return;
        }
        Assert.fail("InvalidCodeException expected");
    }

    @Test
    public void testException3() throws IOException
    {
        try
        {
            final DataMatrixEncodeMode mode = DataMatrixEncodeMode.ASCII;
            testDatamatrix(setCodeText(mode, 3116 + 1), mode);
        } catch (InvalidCodeException ex)
        {
            return;
        }
        Assert.fail("InvalidCodeException expected");
    }

    private static void testDatamatrix(String codeText, DataMatrixEncodeMode mode) throws IOException
    {
        final BarcodeGenerator builder = new BarcodeGenerator(EncodeTypes.DATA_MATRIX);
            builder.getParameters().getBarcode().getDataMatrix().setDataMatrixEncodeMode(mode);
            builder.setCodeText(codeText);

            ByteArrayOutputStream imgStream = new ByteArrayOutputStream();
            builder.save(imgStream, BarCodeImageFormat.PNG);
            //imgStream.setPosition(0);
            final BarCodeReader reader = new BarCodeReader(new ByteArrayInputStream(imgStream.toByteArray()), DecodeType.DATA_MATRIX);

        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(codeText, reader.getFoundBarCodes()[0].getCodeText());
    }

    private static char getCharToEncode(DataMatrixEncodeMode mode)
    {
        switch (mode)
        {
            case AUTO:
            case BYTES:
                return (char) 240;
            case ASCII:
                return '0';
            default:
                throw new IllegalArgumentException("Mode is unknown.");
        }
    }

    private static String setCodeText(DataMatrixEncodeMode mode, int maxCharsCount)
    {
        char charS = getCharToEncode(mode);

        String codeText = "";
        for (int i = 0; i < maxCharsCount; ++i)
        {
            codeText += charS;
        }
        return codeText;
    }

        @Test
    public void testDataLimitExceptionAlphabetic()
    {
        int[] sizes = new int[]
                {
                        10, 12, 14, 16, 18, 20, 22, 24, 26, 32, 36, 40, 44, 48, 52, 64, 72, 80, 88, 96, 104,
                        120,
                        132, 144
                };
        int[] countes = new int[]
                {
                        3, 5, 8, 12, 18, 22, 30, 36, 44, 62, 86, 114, 144, 174, 204, 280, 368, 456, 576, 696
                        ,
                        816, 1050, 1304, 1558
                };
        for (int i = 0; i < sizes.length; i++)
        {
            String text = "";
            int c = 0;
            for (int j = 0; j < countes[i]; j++)
            {
                text += (char) (c + 'a');
                c++;
                if (c >= 26)
                    c = 0;
            }
            BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATA_MATRIX, text);
            {
                gen.getParameters().getBarcode().getDataMatrix().setRows(sizes[i]);
                gen.getParameters().getBarcode().getDataMatrix().setColumns(sizes[i]);
                gen.getParameters().getBarcode().getDataMatrix().setDataMatrixEncodeMode(DataMatrixEncodeMode.ASCII);
                BufferedImage bitmap = gen.generateBarCodeImage();
                text += (char)(c + 'a');
                gen.setCodeText(text);
                try
                {
                    bitmap = gen.generateBarCodeImage();
                    Assert.fail("Musts trow exception.");
                }
                catch (InvalidCodeException e)
                {
                }
                
            }
        }
    }

        @Test
    public void testDataLimitExceptionRectanglesAlphabetic()
    {
        int[] rows = new int[] {8, 8, 12, 12, 16, 16};
        int[] columns = new int[] {18, 32, 26, 36, 36, 48};
        int[] countes = new int[] {5, 10, 16, 22, 32, 49};
        for (int i = 0; i < rows.length; i++)
        {
            String text = "";
            int c = 0;
            for (int j = 0; j < countes[i]; j++)
            {
                text += (char) (c + 'a');
                c++;
                if (c >= 26)
                    c = 0;
            }
            BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATA_MATRIX, text);
            {
                gen.getParameters().getBarcode().getDataMatrix().setRows(rows[i]);
                gen.getParameters().getBarcode().getDataMatrix().setColumns(columns[i]);
                gen.getParameters().getBarcode().getDataMatrix().setDataMatrixEncodeMode(DataMatrixEncodeMode.ASCII);
                BufferedImage bitmap = gen.generateBarCodeImage();

                text += (char)(c + 'a');
                gen.setCodeText(text);
                try
                {
                    bitmap = gen.generateBarCodeImage();
                    Assert.fail("Musts trow exception.");
                }
                catch (InvalidCodeException e)
                {
                }
                
            }
        }
    }

        @Test
    public void testDataLimitExceptionNumeric()
    {
        int[] sizes = new int[]
                {
                        10, 12, 14, 16, 18, 20, 22, 24, 26, 32, 36, 40, 44, 48, 52, 64, 72, 80, 88, 96, 104,
                        120,
                        132, 144
                };
        int[] countes = new int[]
                {
                        6, 10, 16, 24, 36, 44, 60, 72, 88, 124, 172, 228, 288, 348, 408, 560, 736, 912, 1152
                        ,
                        1392, 1632, 2100, 2608, 3116
                };
        for (int i = 0; i < sizes.length; i++)
        {
            String text = "";
            int c = 0;
            for (int j = 0; j < countes[i]; j++)
            {
                text += (char) (c + '0');
                c++;
                if (c >= 10)
                    c = 0;
            }
            BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATA_MATRIX, text);
            {
                gen.getParameters().getBarcode().getDataMatrix().setRows(sizes[i]);
                gen.getParameters().getBarcode().getDataMatrix().setColumns(sizes[i]);
                gen.getParameters().getBarcode().getDataMatrix().setDataMatrixEncodeMode(DataMatrixEncodeMode.ASCII);
                BufferedImage bitmap = gen.generateBarCodeImage();

                text += (char)(c + 'a');
                gen.setCodeText(text);
                try
                {
                    bitmap = gen.generateBarCodeImage();
                    Assert.fail("Musts trow exception.");
                }
                catch (InvalidCodeException e)
                {
                }
                
            }
        }
    }

        @Test
    public void testDataLimitExceptionRectanglesNumeric()
    {
        int[] rows = new int[] {8, 8, 12, 12, 16, 16};
        int[] columns = new int[] {18, 32, 26, 36, 36, 48};
        int[] countes = new int[] {10, 20, 32, 44, 64, 98};
        for (int i = 0; i < rows.length; i++)
        {
            String text = "";
            int c = 0;
            for (int j = 0; j < countes[i]; j++)
            {
                text += (char) (c + '0');
                c++;
                if (c >= 10)
                    c = 0;
            }
            BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATA_MATRIX, text);
            {
                gen.getParameters().getBarcode().getDataMatrix().setRows(rows[i]);
                gen.getParameters().getBarcode().getDataMatrix().setColumns(columns[i]);
                gen.getParameters().getBarcode().getDataMatrix().setDataMatrixEncodeMode(DataMatrixEncodeMode.ASCII);
                BufferedImage bitmap = gen.generateBarCodeImage();

                text += (char)(c + 'a');
                gen.setCodeText(text);
                try
                {
                    bitmap = gen.generateBarCodeImage();
                    Assert.fail("Musts trow exception.");
                }
                catch (InvalidCodeException e)
                {
                }
                
            }
        }
    }

        @Test
    public void testDataLimitExceptionBinary()
    {
        int[] sizes = new int[]
        {
            10, 12, 14, 16, 18, 20, 22, 24, 26, 32, 36, 40, 44, 48, 52, 64, 72, 80, 88, 96, 104, 120, 132, 144
        };
        int[] countes = new int[]
        {
            2, 4, 7, 11, 17, 21, 29, 35, 43, 61, 85, 113, 143, 173, 203, 279, 367, 455, 575, 695, 815, 1049, 1303, 1557
        };
        for (int i = 0; i < sizes.length; i++)
        {
            String text = "";
            int c = 0;
            for (int j = 0; j < countes[i]; j++)
            {
                if (c > 255 - 'a')
                    c = 0;
                text += (char) (c);
                c++;
            }

            BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATA_MATRIX, text);
            {
                gen.getParameters().getBarcode().getDataMatrix().setRows(sizes[i]);
                gen.getParameters().getBarcode().getDataMatrix().setColumns(sizes[i]);
                gen.getParameters().getBarcode().getDataMatrix().setDataMatrixEncodeMode(DataMatrixEncodeMode.BYTES);
                BufferedImage bitmap = gen.generateBarCodeImage();

                text += (char)(c + 'a');
                gen.setCodeText(text);

                try
                {
                    bitmap = gen.generateBarCodeImage();
                    Assert.fail("Musts trow exception.");
                }
                catch (InvalidCodeException e)
                {
                }
            }
        }
    }

        @Test
    public void testDataLimitExceptionRectanglesBinary()
    {
        int[] rows = new int[] {8, 8, 12, 12, 16, 16};
        int[] columns = new int[] {18, 32, 26, 36, 36, 48};
        int[] countes = new int[] {4, 9, 15, 21, 31, 48};
        for (int i = 0; i < rows.length; i++)
        {
            String text = "";
            int c = 0;
            for (int j = 0; j < countes[i]; j++)
            {
                text += (char) (c);
                c++;
                if (c >= 256)
                    c = 0;
            }
            BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATA_MATRIX, text);
            {
                gen.getParameters().getBarcode().getDataMatrix().setRows(rows[i]);
                gen.getParameters().getBarcode().getDataMatrix().setColumns(columns[i]);
                gen.getParameters().getBarcode().getDataMatrix().setDataMatrixEncodeMode(DataMatrixEncodeMode.BYTES);
                BufferedImage bitmap = gen.generateBarCodeImage();

                text += (char)(c + 'a');
                gen.setCodeText(text);
                try
                {
                    bitmap = gen.generateBarCodeImage();
                    Assert.fail("Musts trow exception.");
                }
                catch (InvalidCodeException e)
                {
                }
                
            }
        }
    }

        @Test
    public void testDataLimitExceptionBinaryDemo()
    {
        String text = "";
        int c = 0;
        for (int j = 0; j < 1556; j++)
        {
            text += (char) (c);
            c++;
            if (c >= 256)
                c = 0;
        }
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATA_MATRIX, text);
        {
            gen.getParameters().getBarcode().getDataMatrix().setDataMatrixEncodeMode(DataMatrixEncodeMode.BYTES);
            BufferedImage bitmap = gen.generateBarCodeImage();

            text += (char)(c + 'a');
            gen.setCodeText(text);
            try
            {
                bitmap = gen.generateBarCodeImage();
                Assert.fail("Musts trow exception.");
            }
            catch (InvalidCodeException e)
            {
            }
            
        }
    }

        @Test
    public void testDataLimitExceptionBinaryDemo2()
    {
        String text = "";
        int c = 0;
        for (int j = 0; j < 1645; j++)
        {
            text += (char)(c);
            c++;
            if (c >= 256)
                c = 0;
        }
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATA_MATRIX, text);
        {
            BufferedImage bitmap = gen.generateBarCodeImage();

            text += (char)(c + 'a');
            gen.setCodeText(text);
            try
            {
                bitmap = gen.generateBarCodeImage();
                Assert.fail("Musts trow exception.");
            }
            catch (InvalidCodeException e)
            {
            }
            
        }
    }

        @Test
    public void testDataLimitExceptionNumericDemo()
    {
        String text = "";
        int c = 0;
        for (int j = 0; j < 3116; j++)
        {
            text += (char)(c+'0');
            c++;
            if (c >= 10)
                c = 0;
        }
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATA_MATRIX, text);
        {
            gen.getParameters().getBarcode().getDataMatrix().setDataMatrixEncodeMode(DataMatrixEncodeMode.ASCII);
            BufferedImage bitmap = gen.generateBarCodeImage();

            text += (char)(c + '0');
            gen.setCodeText(text);
            try
            {
                bitmap = gen.generateBarCodeImage();
                Assert.fail("Musts trow exception.");
            }
            catch (InvalidCodeException e)
            {
            }
            
        }
    }

        @Test
    public void testDataLimitExceptionNumericDemo2()
    {
        String text = "";
        int c = 0;
        for (int j = 0; j < 3116; j++)
        {
            text += (char)(c+'0');
            c++;
            if (c >= 10)
                c = 0;
        }
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATA_MATRIX, text);
        {
            BufferedImage bitmap = gen.generateBarCodeImage();

            text += (char)(c + '0');
            gen.setCodeText(text);
            try
            {
                bitmap = gen.generateBarCodeImage();
                Assert.fail("Musts trow exception.");
            }
            catch (InvalidCodeException e)
            {
            }
            
        }
    }

        @Test
    public void testDataLimitExceptionAlphabeticDemo()
    {
        String text = "";
        int c = 0;
        for (int j = 0; j < 1558; j++)
        {
            text += (char)(c + 'a');
            c++;
            if (c >= 26)
                c = 0;
        }
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATA_MATRIX, text);
        {
            gen.getParameters().getBarcode().getDataMatrix().setDataMatrixEncodeMode(DataMatrixEncodeMode.ASCII);
            BufferedImage bitmap = gen.generateBarCodeImage();

            text += (char)(c + 'a');
            gen.setCodeText(text);
            try
            {
                bitmap = gen.generateBarCodeImage();
                Assert.fail("Musts trow exception.");
            }
            catch (InvalidCodeException e)
            {
            }
            
        }
    }

        @Test
    public void testDataLimitExceptionAlphabeticDemo2()
    {
        String text = "";
        int c = 0;
        for (int j = 0; j < 2335; j++)
        {
            text += (char)(c + 'a');
            c++;
            if (c >= 26)
                c = 0;
        }
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATA_MATRIX, text);
        {
            BufferedImage bitmap = gen.generateBarCodeImage();

            text += (char)(c + 'a');
            gen.setCodeText(text);
            try
            {
                bitmap = gen.generateBarCodeImage();
                Assert.fail("Musts trow exception.");
            }
            catch (InvalidCodeException e)
            {
            }
            
        }
    }
}

