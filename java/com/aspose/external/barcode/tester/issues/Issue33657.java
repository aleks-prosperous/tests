//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33657.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="12.08.2013 10:21:41">
//     Copyright (c) 2001-2011 Aspose Pty Ltd. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------------------------------------------

package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.InverseImageMode;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;


@Test(description = "Tests for Issue33657.")
public class Issue33657
{
    final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33657");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void bad1()
    {
        String filename = Global.pathCombine(folder, "1code_2.png");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.DATA_MATRIX);
        reader.getQualitySettings().setInverseImage(InverseImageMode.ENABLED);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("8000258038", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void bad2()
    {
        String filename = Global.pathCombine(folder, "1code_2_inverted.png");
        final BarCodeReader reader = new BarCodeReader(filename, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("8000258038", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void good1()
    {
        String filename = Global.pathCombine(folder, "imageedit_3_8464163053.png");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("8000258038", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void good2()
    {
        String filename = Global.pathCombine(folder, "180.bmp");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("8000258038", reader.getFoundBarCodes()[0].getCodeText());
    }
}

