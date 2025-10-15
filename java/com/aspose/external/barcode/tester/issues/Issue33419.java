//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33419.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="28.01.2013 12:00:08">
//     Copyright (c) 2001-2011 Aspose Pty Ltd. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------------------------------------------

package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.QualitySettings;
import com.aspose.barcode.barcoderecognition.XDimensionMode;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


@Test(description = "Tests for Issue33419.")
public class Issue33419
{
    final String folder = Global.getTestDataFolder("Issues/Issue33419");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void test1()
    {
        String fileName = Global.pathCombine(folder, "code93-21.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_93, DecodeType.CODE_93);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("Z/G9Z 7JYWCC7", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test2()
    {
        String fileName = Global.pathCombine(folder, "code93-24.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_93, DecodeType.CODE_93);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("7Z8XE1E6DQ6Y1QKZFS", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test3()
    {
        String fileName = Global.pathCombine(folder, "code93-25.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_93, DecodeType.CODE_93);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("DJK7QI6PF6", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test4()
    {
        String fileName = Global.pathCombine(folder, "code93-29.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_93, DecodeType.CODE_93);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("2S KMER-5P0D4BRE3QE341", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test5()
    {
        String fileName = Global.pathCombine(folder, "auspost-0.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.AUSTRALIA_POST);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("1187665441", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test6()
    {
        String fileName = Global.pathCombine(folder, "code11.bmp");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_11);
        reader.getQualitySettings().setXDimension( XDimensionMode.SMALL);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("1234", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test7()
    {
        String fileName = Global.pathCombine(folder, "1_1.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PDF_417);
        Assert.assertEquals(reader.readBarCodes().length, 2);
        Assert.assertEquals("PDF417 SDK INT Projects", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals("PDF417 SDK INT Projects", reader.getFoundBarCodes()[1].getCodeText());
    }

    @Test
    public void test8()
    {
        String fileName = Global.pathCombine(folder, "1_2.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PDF_417);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("PDF417 SDK INT Projects", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test9()
    {
        String fileName = Global.pathCombine(folder, "barcodecards.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39, DecodeType.CODE_39_FULL_ASCII);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("100251", reader.getFoundBarCodes()[0].getCodeText());
    }
}

