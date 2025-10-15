package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.CodeLocation;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.image.BufferedImage;


@Test(description = "Tests for Issue33327.")
public class Issue33327
{
    private final String folder = Global.getTestDataFolder("Issues/Issue33327");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void test16x36()
    {
            final String text = "abcdefghijklmnopqrstuvwxyzabcdef";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATA_MATRIX, text);
            gen.getParameters().getBarcode().getDataMatrix().setRows(16);
            gen.getParameters().getBarcode().getDataMatrix().setColumns(36);
            BufferedImage bitmap = gen.generateBarCodeImage();

        BarCodeReader reader = new BarCodeReader(bitmap, DecodeType.DATA_MATRIX);

        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(text, reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test16x36BrutForce()
    {
        final int capacity = 32;
        String text = "";
        int c = 0;
        for (int i = 0; i < capacity; i++)
        {
            text = text + (char) (c + 'a');
            c++;
            if (c >= 26)
            {
                c = 0;
            }
            BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATA_MATRIX, text);
                gen.getParameters().getBarcode().getDataMatrix().setRows(16);
                gen.getParameters().getBarcode().getDataMatrix().setColumns(36);
                gen.getParameters().getBarcode().getCodeTextParameters().setLocation(CodeLocation.NONE);
                BufferedImage bitmap = gen.generateBarCodeImage();

            BarCodeReader reader = new BarCodeReader(bitmap, DecodeType.DATA_MATRIX);

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(text, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test72x72()
    {
        final int capacity = 368;
        String text = "";
        int c = 0;
        for (int i = 0; i < capacity; i++)
        {
            text += (char) (c + 'a');
            c++;
            if (c >= 26)
            {
                c = 0;
            }
        }
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATA_MATRIX, text);
            gen.getParameters().getBarcode().getDataMatrix().setRows(72);
            gen.getParameters().getBarcode().getDataMatrix().setColumns(72);
            BufferedImage bitmap = gen.generateBarCodeImage();

        BarCodeReader reader = new BarCodeReader(bitmap, DecodeType.DATA_MATRIX);

        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(text, reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test132x132()
    {
        final int capacity = 368;
        String text = "";
        int c = 0;
        for (int i = 0; i < capacity; i++)
        {
            text += (char) (c + 'a');
            c++;
            if (c >= 26)
            {
                c = 0;
            }
        }
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATA_MATRIX, text);
            gen.getParameters().getBarcode().getDataMatrix().setRows(132);
            gen.getParameters().getBarcode().getDataMatrix().setColumns(132);
            BufferedImage bitmap = gen.generateBarCodeImage();
        BarCodeReader reader = new BarCodeReader(bitmap, DecodeType.DATA_MATRIX);

        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(text, reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test72x72BrutForce()
    {
        final int capacity = 368;
        String text = "";
        int c = 0;
        for (int i = 0; i < capacity; i++)
        {
            text += (char) (c + 'a');
            c++;
            if (c >= 26)
            {
                c = 0;
            }

            BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATA_MATRIX, text);
                gen.getParameters().getBarcode().getDataMatrix().setRows(72);
                gen.getParameters().getBarcode().getDataMatrix().setColumns(72);
                gen.getParameters().getBarcode().getCodeTextParameters().setLocation(CodeLocation.NONE);
                BufferedImage bitmap = gen.generateBarCodeImage();
            BarCodeReader reader = new BarCodeReader(bitmap, DecodeType.DATA_MATRIX);

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(text, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void testtest16x36bmp()
    {
        String fileName = Global.pathCombine(folder, "test16x36.bmp");
        BarCodeReader reader = new BarCodeReader(fileName);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("test rectangular datamatrix", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testaaa16x36png()
    {
        String fileName = Global.pathCombine(folder, "aaa16x36.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("abcdefghijklmnopqrstuvwxyzabcdef", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testaaa72x72png()
    {
        String fileName = Global.pathCombine(folder, "aaa72x72.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
                String text = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcd";
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(text, reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testdatamatrix144x144gif()
    {
        String fileName = Global.pathCombine(folder, "datamatrix144x144.gif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
    }

    @Test
    public void test144x144()
    {
        final int capacity = 368;
        String text = "";
        int c = 0;
        for (int i = 0; i < capacity; i++)
        {
            text += (char) (c + 'a');
            c++;
            if (c >= 26)
            {
                c = 0;
            }
        }
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATA_MATRIX, text);
            gen.getParameters().getBarcode().getDataMatrix().setRows(144);
            gen.getParameters().getBarcode().getDataMatrix().setColumns(144);
            BufferedImage bitmap = gen.generateBarCodeImage();
        BarCodeReader reader = new BarCodeReader(bitmap, DecodeType.DATA_MATRIX);

        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(text, reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test144x144Maximum()
    {
        String text = "";
        int c = 0;
        for (int j = 0; j < 1558; j++)
        {
            text += (char) ('a' + c);
            c++;
            if (c >= 26)
            {
                c = 0;
            }
        }
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATA_MATRIX, text);
            gen.getParameters().getBarcode().getDataMatrix().setRows(144);
            gen.getParameters().getBarcode().getDataMatrix().setColumns(144);
            BufferedImage bitmap = gen.generateBarCodeImage();
        BarCodeReader reader = new BarCodeReader(bitmap, DecodeType.DATA_MATRIX);

        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(text, reader.getFoundBarCodes()[0].getCodeText());
    }
}

