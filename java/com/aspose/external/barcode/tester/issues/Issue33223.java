//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33223.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="10.05.2012 16:00:25">
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


@Test(description = "Tests for Issue-33223.")
public class Issue33223
{
    final String folder = Global.getTestDataFolder("Issues/Issue33223");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }


    @Test
    public void test1() throws IOException
    {
        String fileName = Global.pathCombine(folder, "1234567.jpg");
        BufferedImage bitmap = ImageIO.read(new File(fileName));
        BarCodeReader reader = new BarCodeReader(bitmap, DecodeType.PDF_417);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("1234567", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test2() throws IOException
    {
        String fileName = Global.pathCombine(folder, "1234567.png");
        BufferedImage bitmap = ImageIO.read(new File(fileName));
        BarCodeReader reader = new BarCodeReader(bitmap, DecodeType.PDF_417);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("1234567", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test3() throws IOException
    {
        String fileName = Global.pathCombine(folder, "TempImage.bmp");
        BufferedImage bitmap = ImageIO.read(new File(fileName));
        BarCodeReader reader = new BarCodeReader(bitmap, DecodeType.PDF_417);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("Aspose.BarCode Sample.[83157778315777] Generation OK.", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test4() throws IOException
    {
        String fileName = Global.pathCombine(folder, "text.jpg");
        BufferedImage bitmap = ImageIO.read(new File(fileName));
        BarCodeReader reader = new BarCodeReader(bitmap, DecodeType.PDF_417);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("Aspose.BarCode Sample.[83157778315777] Generation OK.", reader.getFoundBarCodes()[0].getCodeText());
    }
}

