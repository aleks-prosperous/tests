//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33429.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="05.02.2013 16:36:49">
//     Copyright (c) 2001-2011 Aspose Pty Ltd. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------------------------------------------

package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


@Test(description = "Tests for Issue33429.")
public class Issue33429
{
    final String folder = Global.getTestDataFolder("Issues/Issue33429");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }


    @Test
    public void test1()
    {
        String fileName = Global.pathCombine(folder, "bigQR.png");
        BarCodeReader reader = new BarCodeReader(fileName);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(DecodeType.QR, reader.getFoundBarCodes()[0].getCodeType());
    }

    @Test
    public void test2()
    {
        String fileName = Global.pathCombine(folder, "tmp.bmp");
        BarCodeReader reader = new BarCodeReader(fileName);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(DecodeType.PDF_417, reader.getFoundBarCodes()[0].getCodeType());
    }

    @Test
    public void test3()
    {
        String fileName = Global.pathCombine(folder, "Outputpage68.bmp");
        BarCodeReader reader = new BarCodeReader(fileName);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(DecodeType.DATA_MATRIX, reader.getFoundBarCodes()[0].getCodeType());
    }

    @Test
    public void test4()
    {
        int count = 0;
        String fileName = Global.pathCombine(folder, "Test4.jpg");
        BarCodeReader reader = new BarCodeReader(fileName);
        {
            reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
            for(BarCodeResult result : reader.readBarCodes())
                count++;
            Assert.assertEquals(6, count);
        }
    }
}

