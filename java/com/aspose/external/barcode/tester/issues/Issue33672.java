//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33672.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="30.09.2013 13:07:00">
//     Copyright (c) 2001-2011 Aspose Pty Ltd. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------------------------------------------

package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.ComplexBackgroundMode;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//import com.aspose.barcode.barcoderecognition.RecognitionHints;


@Test(description = "Tests for Issue33672.")
public class Issue33672
{
    final String folder = Global.getTestDataFolder("Issues/Issue33672");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void QR()
    {
        String filename = Global.pathCombine(folder, "QR.png");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("DARK IMAGE: QR - Color [A=255, R=35, G=35, B=35] !!!", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void PDF417()
    {
        String filename = Global.pathCombine(folder, "PDF417.png");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.PDF_417);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("DARK IMAGE: Pdf417 - Color [DarkGreen] !!!", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void aztec()
    {
        String filename = Global.pathCombine(folder, "Aztec.png");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.AZTEC);
        reader.getQualitySettings().setComplexBackground(ComplexBackgroundMode.ENABLED);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("DARK IMAGE: Aztec - Color [DarkBlue] !!!", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void datamatrix()
    {
        String filename = Global.pathCombine(folder, "Datamatrix.png");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.DATA_MATRIX);
        reader.getQualitySettings().setComplexBackground(ComplexBackgroundMode.ENABLED);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("DARK IMAGE: DataMatrix - Color [A=255, R=35, G=35, B=100] !!!", reader.getFoundBarCodes()[0].getCodeText());
    }

        @Test
    public void Sample1()
    {
        String filename = Global.pathCombine(folder, "630QR-Code2.jpg");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("http://plinks.me/iusxvh", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void sample2()
    {
        String filename = Global.pathCombine(folder, "dmsample.png");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.DATA_MATRIX);
        reader.getQualitySettings().setComplexBackground(ComplexBackgroundMode.ENABLED);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("abc", reader.getFoundBarCodes()[0].getCodeText());
    }

        @Test
    public void Sample3()
    {
        String filename = Global.pathCombine(folder, "Capture2.png");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("https://smart.amaris.com/candidate.aspx?ID=161660", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void rotated()
    {
        String filename = Global.pathCombine(folder, "PDF417-90.png");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.PDF_417);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("DARK IMAGE: Pdf417 - Color [DarkGreen] !!!", reader.getFoundBarCodes()[0].getCodeText());
    }
}

