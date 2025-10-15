//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33569.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="12.06.2013 12:24:37">
//     Copyright (c) 2001-2011 Aspose Pty Ltd. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------------------------------------------

package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

//import com.aspose.barcode.barcoderecognition.RecognitionHints;


@Test(description = "Tests for Issue33569.")
public class Issue33569
{
    final String folder = Global.getTestDataFolder("Issues/Issue33569");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
    public void original1()
    {
        String fileName = Global.pathCombine(folder, "Page1.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        {
            reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("TMG1000000000090000000800000001", reader.getFoundBarCodes()[0].getCodeText());
            //Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
    public void original2()
    {
        String fileName = Global.pathCombine(folder, "Output1.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("TMG1000000000090000000800000001", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void extractor()
    {
        String fileName = Global.pathCombine(folder, "IMG0ext.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("TMG1000000000090000000800000001", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void converterFullBug() throws IOException
        {
        String fileName = Global.pathCombine(folder, "IMG0convFull.png");
        BarCodeReader reader = new BarCodeReader(ImageIO.read(new File(fileName)), new Rectangle(93, 2245, 40, 950), DecodeType.CODE_128);
        {
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("TMG1000000000090000000800000001", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void converterFullImage()
    {
        String fileName = Global.pathCombine(folder, "IMG0convFull.png");
        BarCodeReader reader = new BarCodeReader((fileName), DecodeType.CODE_128);
        {
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("TMG1000000000090000000800000001", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void fullRectangleCutManual()
    {
        String fileName = Global.pathCombine(folder, "2.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        {
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("TMG1000000000090000000800000001", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void small()
    {
        String fileName = Global.pathCombine(folder, "IMG0Small.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("TMG1000000000090000000800000001", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void rectangleTest()
    {
        String fileName = Global.pathCombine(folder, "aspose2.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("TMG1000000000090000000800000001", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void rectangleTestSection() throws IOException
        {
        String fileName = Global.pathCombine(folder, "aspose2.png");
        BarCodeReader reader = new BarCodeReader(ImageIO.read(new File(fileName)), new Rectangle(260, 175, 120, 500), (DecodeType.CODE_128));
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("TMG1000000000090000000800000001", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}

