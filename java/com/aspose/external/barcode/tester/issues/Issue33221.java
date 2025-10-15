//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33221.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="10.05.2012 16:00:25">
//     Copyright (c) 2001-2011 Aspose Pty Ltd. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------------------------------------------

package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


@Test(description = "Tests for Issue-33221.")
public class Issue33221
{
    final String folder = Global.getTestDataFolder("Issues/Issue33221");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void test1() throws IOException
    {
        String fileName = Global.pathCombine(folder, "IDAutomationStreamingDataMatrix.gif");
        BufferedImage bitmap = ImageIO.read(new File(fileName));
        BarCodeReader reader = new BarCodeReader(bitmap, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("0123456789", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test2() throws IOException
    {
        String fileName = Global.pathCombine(folder, "DataMatrix-NET-Control_1.png");
        BufferedImage bitmap = ImageIO.read(new File(fileName));
        BarCodeReader reader = new BarCodeReader(bitmap, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("1234567DEMO", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test3() throws IOException
    {
        String fileName = Global.pathCombine(folder, "4588.jpg");
        BufferedImage bitmap = ImageIO.read(new File(fileName));
        BarCodeReader reader = new BarCodeReader(bitmap, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("http://scn.by/9t9ab0htw8glry", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test4() throws IOException
    {
        String fileName = Global.pathCombine(folder, "dmbinary.png");
        BufferedImage bitmap = ImageIO.read(new File(fileName));
        BarCodeReader reader = new BarCodeReader(bitmap, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("111 Sunny", reader.getFoundBarCodes()[0].getCodeText());
    }
}

