//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33632.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="12.08.2013 10:21:41">
//     Copyright (c) 2001-2011 Aspose Pty Ltd. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------------------------------------------

package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarcodeQualityMode;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;


@Test(description = "Tests for Issue33632.")
public class Issue33632
{
    final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33632");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void test0()
    {
        String filename = Global.pathCombine(folder, "media_guru_Cool_Datamatrix.png");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.DATA_MATRIX);
        reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("\rhttp://themediaguru.blogspot.com", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test90()
    {
        String filename = Global.pathCombine(folder, "mc90.png");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.DATA_MATRIX);
        reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("\rhttp://themediaguru.blogspot.com", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test180()
    {
        String filename = Global.pathCombine(folder, "mc180.png");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.DATA_MATRIX);
        reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("\rhttp://themediaguru.blogspot.com", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test270()
    {
        String filename = Global.pathCombine(folder, "mc270.png");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.DATA_MATRIX);
        reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("\rhttp://themediaguru.blogspot.com", reader.getFoundBarCodes()[0].getCodeText());
    }
}

