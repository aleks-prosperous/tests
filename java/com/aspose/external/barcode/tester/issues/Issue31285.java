// Copyright (c) 2001-2011 Aspose Pty Ltd. All Rights Reserved.
package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.BarCodeImageFormat;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.CodeLocation;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;


@Test(description = "Tests for Issue-31285.")
public class Issue31285
{
    private final String folder = Global.getIssuesTestImagePath("Issue31285");

        @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
    public void Recognize10x10barcode()
    {
        String fullFileName = Global.pathCombine(folder, "abc10x10.bmp");
        BarCodeReader reader = new BarCodeReader(fullFileName, DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("abc", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void Recognize10x10barcode2()
    {
            String file = "abc10x10.bmp";
        String fullPath = Global.pathCombine(folder, file);
        BarCodeReader reader = new BarCodeReader(fullPath);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("abc", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void Recognize12x36barcode()
    {
            String file = "Aspose.BarCode12x36.bmp";
        String fullPath = Global.pathCombine(folder, file);
        BarCodeReader reader = new BarCodeReader(fullPath);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Aspose.BarCode", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void Recognize8x18barcode()
    {
            String file = "abc8x18.bmp";
        String fullPath = Global.pathCombine(folder, file);
        BarCodeReader reader = new BarCodeReader(fullPath);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("abc", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void Recognize16x48barcode()
    {
            String file = "Aspose.BarCode16x48.bmp";
        String fullPath = Global.pathCombine(folder, file);
        BarCodeReader reader = new BarCodeReader(fullPath);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Aspose.BarCode", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void Recognize72x72barcode()
    {
            String file = "Aspose.BarCode72x72.bmp";
        String fullPath = Global.pathCombine(folder, file);
        BarCodeReader reader = new BarCodeReader(fullPath);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Aspose.BarCode", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void Recognize144x144barcode()
    {
            String file = "Aspose.BarCode144x144.bmp";
        String fullPath = Global.pathCombine(folder, file);
        BarCodeReader reader = new BarCodeReader(fullPath, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
    }

        @Test
    public void RecognizeAutoSizebarcode()
    {
            String file = "Aspose.BarCodeAuto.bmp";
        String fullPath = Global.pathCombine(folder, file);
        BarCodeReader reader = new BarCodeReader(fullPath);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Aspose.BarCode", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void Recognize16x48barcode2()
    {
            String file = "MaximumText16x48.bmp";
        String fullPath = Global.pathCombine(folder, file);
        BarCodeReader reader = new BarCodeReader(fullPath);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvw", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void RecognizeWithoutBarCode()
    {
            String file = "TextTooLong.bmp";
        String fullPath = Global.pathCombine(folder, file);
        BarCodeReader reader = new BarCodeReader(fullPath);
        Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
    }

        @Test
    public void RecognizeASCIIEncodeMode()
    {
            String file = "ASCIIEncodeMode.png";
        String fullPath = Global.pathCombine(folder, file);
        BarCodeReader reader = new BarCodeReader(fullPath);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Aspose.BarCode", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void RecognizeFullEncodeMode()
    {
            String file = "FullEncodeMode.png";
        String fullPath = Global.pathCombine(folder, file);
        BarCodeReader reader = new BarCodeReader(fullPath);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Aspose.BarCode", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void RecognizeMaximumText()
    {
            final String file = "GeneratedMaximumText.png";
        String fullPath = Global.pathCombine(folder, file);
        BarCodeReader reader = new BarCodeReader(fullPath, DecodeType.DATA_MATRIX);
        {
                int textSize = 1558;
            StringBuilder code = new StringBuilder(textSize);
            for (int i = 0; i < textSize; i++)
            {
                code.append((char)('a' + i % 26));
            }
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(code.toString(), reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void Demo8x18()
    {
        try
        {
                final String strCodetext = "abc";
            BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATA_MATRIX, strCodetext);
            {
                gen.getParameters().getBarcode().getDataMatrix().setRows(8);
                gen.getParameters().getBarcode().getDataMatrix().setColumns(18);
                gen.getParameters().getBarcode().getCodeTextParameters().setLocation(CodeLocation.NONE);
                // Save the barcode to stream
                ByteArrayOutputStream imgStream = new ByteArrayOutputStream();
                {
                    gen.save(imgStream, BarCodeImageFormat.JPEG);
                    

                    BarCodeReader reader = new BarCodeReader(new ByteArrayInputStream(imgStream.toByteArray()), DecodeType.DATA_MATRIX);
                    {
                        Assert.assertEquals(reader.readBarCodes().length, 1);
                        Assert.assertEquals(strCodetext, reader.getFoundBarCodes()[0].getCodeText());
                    }
                }
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
            Assert.fail(ex.getMessage());
        }

        System.out.println("Press any key to exit....");
    }

        @Test
    public void Demo8x32() throws IOException
        {
        try
        {
                final String strCodetext = "datamatrix";
            BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATA_MATRIX, strCodetext);
                gen.getParameters().getBarcode().getDataMatrix().setRows(8);
                gen.getParameters().getBarcode().getDataMatrix().setColumns(32);
                gen.getParameters().getBarcode().getCodeTextParameters().setLocation(CodeLocation.NONE);
                // Save the barcode to stream
                ByteArrayOutputStream imgStream = new ByteArrayOutputStream();
                gen.save(imgStream, BarCodeImageFormat.JPEG);

                ByteArrayInputStream iStream = new ByteArrayInputStream(imgStream.toByteArray());
                BarCodeReader reader = new BarCodeReader(iStream, DecodeType.DATA_MATRIX);
                    {
                        Assert.assertEquals(reader.readBarCodes().length, 1);
                        Assert.assertEquals(strCodetext, reader.getFoundBarCodes()[0].getCodeText());
                    }
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
            Assert.fail(ex.getMessage());
        }

        System.out.println("Press any key to exit....");
    }

        @Test
    public void Demo12x26()
    {
        try
        {
                final String strCodetext = "test datamatrix";
            BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATA_MATRIX, strCodetext);
            {
                gen.getParameters().getBarcode().getDataMatrix().setRows(12);
                gen.getParameters().getBarcode().getDataMatrix().setColumns(26);
                gen.getParameters().getBarcode().getCodeTextParameters().setLocation(CodeLocation.NONE);
                // Save the barcode to stream
                ByteArrayOutputStream imgStream = new ByteArrayOutputStream();
                {
                    gen.save(imgStream, BarCodeImageFormat.JPEG);
                    

                    BarCodeReader reader = new BarCodeReader(new ByteArrayInputStream(imgStream.toByteArray()), DecodeType.DATA_MATRIX);
                    {
                        Assert.assertEquals(reader.readBarCodes().length, 1);
                        Assert.assertEquals(strCodetext, reader.getFoundBarCodes()[0].getCodeText());
                    }
                }
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
            Assert.fail(ex.getMessage());
        }

        System.out.println("Press any key to exit....");
    }

        @Test
    public void Demo12x36()
    {
        try
        {
                final String strCodetext = "test datamatrix";
            BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATA_MATRIX, strCodetext);
            {
                gen.getParameters().getBarcode().getDataMatrix().setRows(12);
                gen.getParameters().getBarcode().getDataMatrix().setColumns(36);
                gen.getParameters().getBarcode().getCodeTextParameters().setLocation(CodeLocation.NONE);
                // Save the barcode to stream
                ByteArrayOutputStream imgStream = new ByteArrayOutputStream();
                {
                    gen.save(imgStream, BarCodeImageFormat.JPEG);
                    

                    BarCodeReader reader = new BarCodeReader(new ByteArrayInputStream(imgStream.toByteArray()), DecodeType.DATA_MATRIX);
                    {
                        Assert.assertEquals(reader.readBarCodes().length, 1);
                        Assert.assertEquals(strCodetext, reader.getFoundBarCodes()[0].getCodeText());
                    }
                }
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
            Assert.fail(ex.getMessage());
        }

        System.out.println("Press any key to exit....");
    }

        @Test
    public void Demo120x120()
    {
        try
        {
                final String strCodetext = "test datamatrix";
            BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATA_MATRIX, strCodetext);
            {
                gen.getParameters().getBarcode().getDataMatrix().setRows(120);
                gen.getParameters().getBarcode().getDataMatrix().setColumns(120);
                gen.getParameters().getBarcode().getCodeTextParameters().setLocation(CodeLocation.NONE);
                // Save the barcode to stream
                ByteArrayOutputStream imgStream = new ByteArrayOutputStream();
                {
                    gen.save(imgStream, BarCodeImageFormat.JPEG);
                    

                    BarCodeReader reader = new BarCodeReader(new ByteArrayInputStream(imgStream.toByteArray()), DecodeType.DATA_MATRIX);
                    {
                        Assert.assertEquals(reader.readBarCodes().length, 1);
                        Assert.assertEquals(strCodetext, reader.getFoundBarCodes()[0].getCodeText());
                    }
                }
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
            Assert.fail(ex.getMessage());
        }

        System.out.println("Press any key to exit....");
    }

        @Test
    public void Demo10x10()
    {
        try
        {
                final String strCodetext = "abc";
            BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATA_MATRIX, strCodetext);
            {
                gen.getParameters().getBarcode().getDataMatrix().setRows(10);
                gen.getParameters().getBarcode().getDataMatrix().setColumns(10);
                gen.getParameters().getBarcode().getCodeTextParameters().setLocation(CodeLocation.NONE);
                // Save the barcode to stream
                ByteArrayOutputStream imgStream = new ByteArrayOutputStream();
                {
                    gen.save(imgStream, BarCodeImageFormat.JPEG);
                    

                    BarCodeReader reader = new BarCodeReader(new ByteArrayInputStream(imgStream.toByteArray()), DecodeType.DATA_MATRIX);
                    {
                        Assert.assertEquals(reader.readBarCodes().length, 1);
                        Assert.assertEquals(strCodetext, reader.getFoundBarCodes()[0].getCodeText());
                    }
                }
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
            Assert.fail(ex.getMessage());
        }

        System.out.println("Press any key to exit....");
    }

        @Test
    public void Demo144x144()
    {
        try
        {
                final String strCodetext = "test datamatrix";
            BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATA_MATRIX, strCodetext);
            {
                gen.getParameters().getBarcode().getDataMatrix().setRows(144);
                gen.getParameters().getBarcode().getDataMatrix().setColumns(144);
                gen.getParameters().getBarcode().getCodeTextParameters().setLocation(CodeLocation.NONE);
                // Save the barcode to stream
                ByteArrayOutputStream imgStream = new ByteArrayOutputStream();
                {
                    gen.save(imgStream, BarCodeImageFormat.JPEG);
                    

                    BarCodeReader reader = new BarCodeReader(new ByteArrayInputStream(imgStream.toByteArray()), DecodeType.DATA_MATRIX);
                    {
                        Assert.assertEquals(reader.readBarCodes().length, 1);
                        Assert.assertEquals(strCodetext, reader.getFoundBarCodes()[0].getCodeText());
                    }
                }
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
            Assert.fail(ex.getMessage());
        }

        System.out.println("Press any key to exit....");
    }

        @Test
    public void Demo16x36()
    {
        try
        {
                final String strCodetext = "test rectangular datamatrix";
            BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATA_MATRIX, strCodetext);
            {
                gen.getParameters().getBarcode().getDataMatrix().setRows(16);
                gen.getParameters().getBarcode().getDataMatrix().setColumns(36);
                gen.getParameters().getBarcode().getCodeTextParameters().setLocation(CodeLocation.NONE);
                // Save the barcode to stream
                ByteArrayOutputStream imgStream = new ByteArrayOutputStream();
                {
                    gen.save(imgStream, BarCodeImageFormat.JPEG);
                    gen.save(Global.getTempFolder("test16x36.bmp"), BarCodeImageFormat.BMP);

                    

                    BarCodeReader reader = new BarCodeReader(new ByteArrayInputStream(imgStream.toByteArray()), DecodeType.DATA_MATRIX);
                    {
                        Assert.assertEquals(reader.readBarCodes().length, 1);
                        Assert.assertEquals(strCodetext, reader.getFoundBarCodes()[0].getCodeText());
                    }
                }
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
            Assert.fail(ex.getMessage());
        }

        System.out.println("Press any key to exit....");
    }

        @Test
    public void Demo16x48()
    {
        try
        {
                final String strCodetext = "test rectangular datamatrix";
            BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATA_MATRIX, strCodetext);
            {
                gen.getParameters().getBarcode().getDataMatrix().setRows(16);
                gen.getParameters().getBarcode().getDataMatrix().setColumns(48);
                gen.getParameters().getBarcode().getCodeTextParameters().setLocation(CodeLocation.NONE);
                // Save the barcode to stream
                ByteArrayOutputStream imgStream = new ByteArrayOutputStream();
                {
                    gen.save(imgStream, BarCodeImageFormat.JPEG);
                    

                    BarCodeReader reader = new BarCodeReader(new ByteArrayInputStream(imgStream.toByteArray()), DecodeType.DATA_MATRIX);
                    {
                        Assert.assertEquals(reader.readBarCodes().length, 1);
                        Assert.assertEquals(strCodetext, reader.getFoundBarCodes()[0].getCodeText());
                    }
                }
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
            Assert.fail(ex.getMessage());
        }

        System.out.println("Press any key to exit....");
    }

        @Test
    public void Demo132x132()
    {
        try
        {
                final String strCodetext = "test rectangular datamatrix";
            BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATA_MATRIX, strCodetext);
            {
                gen.getParameters().getBarcode().getDataMatrix().setRows(132);
                gen.getParameters().getBarcode().getDataMatrix().setColumns(132);
                gen.getParameters().getBarcode().getCodeTextParameters().setLocation(CodeLocation.NONE);
                // Save the barcode to stream
                ByteArrayOutputStream imgStream = new ByteArrayOutputStream();
                {
                    gen.save(imgStream, BarCodeImageFormat.JPEG);
                    gen.save(Global.getTempFolder("test.bmp"), BarCodeImageFormat.BMP);
                    

                    BarCodeReader reader = new BarCodeReader(new ByteArrayInputStream(imgStream.toByteArray()), DecodeType.DATA_MATRIX);
                    {
                        Assert.assertEquals(reader.readBarCodes().length, 1);
                        Assert.assertEquals(strCodetext, reader.getFoundBarCodes()[0].getCodeText());
                    }
                }
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
            Assert.fail(ex.getMessage());
        }

        System.out.println("Press any key to exit....");
    }
}

