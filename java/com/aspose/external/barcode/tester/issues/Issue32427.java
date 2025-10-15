// Copyright (c) 2001-2012 Aspose Pty Ltd. All Rights Reserved.

package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


@Test(description = "Tests for Issue-32427.")
public class Issue32427
{
    private final String folder = Global.getTestDataFolder("Issues/Issue32427");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
    public void testRecognitionDatamatrixSeparatrix30_color_101010()
    {
        String fileName = Global.pathCombine(folder, "color_101010_NOTHING_FOUND.bmp");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("NOTHING FOUND", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void testRecognitionDatamatrixSeparatrix30_color_000099_1()
    {
        String fileName = Global.pathCombine(folder, "color_000099_abc.bmp");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("abc", reader.getFoundBarCodes()[0].getCodeText());
    }

        @Test
    public void testRecognitionDatamatrixSeparatrix30_color_000099_2()
    {
        String fileName = Global.pathCombine(folder, "color_000099_MAMA_MILA_RAMU_123.bmp");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("MAMA_MILA_RAMU_123", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void testRecognitionDatamatrixSeparatrix30_color_Yellow_1()
    {
        String fileName = Global.pathCombine(folder, "01.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("01", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.DATA_MATRIX, reader.getFoundBarCodes()[0].getCodeType());
        }
    }

        @Test
    public void testRecognitionDatamatrixSeparatrix30_color_Yellow_2()
    {
        String fileName = Global.pathCombine(folder, "color_yellow_abc.bmp");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("abc", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.DATA_MATRIX, reader.getFoundBarCodes()[0].getCodeType());
        }
    }

        @Test
    public void testRecognitionDatamatrixSeparatrix30_color_Green()
    {
        String fileName = Global.pathCombine(folder, "color_green_abc.bmp");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("abc", reader.getFoundBarCodes()[0].getCodeText());
    }

        @Test
    public void testRecognitionDatamatrixSeparatrix30_color_White()
    {
        String fileName = Global.pathCombine(folder, "32768-C.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("32768-C", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.DATA_MATRIX, reader.getFoundBarCodes()[0].getCodeType());
        }
    }

        @Test
    public void OneMoreTest()
    {
        final String expTxt = "abc";

        String fileName = Global.pathCombine(folder, "dataMatrix_WhiteBG.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(expTxt, reader.getFoundBarCodes()[0].getCodeText());

        fileName = Global.pathCombine(folder, "dataMatrix_GreenBG.png");
        reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(expTxt, reader.getFoundBarCodes()[0].getCodeText());
    }
}

