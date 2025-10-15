//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33702.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="10.09.2013 11:08:48">
//     Copyright (c) 2001-2011 Aspose Pty Ltd. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------------------------------------------

package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.XDimensionMode;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


@Test(description = "Tests for Issue33702.")
public class Issue33702
{
    private final String folder = Global.getTestDataFolder("Issues/Issue33702");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void valid1()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(folder, "Valid-1.jpg"), DecodeType.QR);
        reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("1122|3344|5566|7788|9900|1112", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void valid2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(folder, "Valid-2.jpg"), DecodeType.QR);
        reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("1234|2345|3456|4567|5678|6789|", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void valid3()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(folder, "Valid-3.jpg"), DecodeType.QR);
        reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("1001|2002|3003|4004|5005|6006|", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void valid4()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(folder, "Valid-4.jpg"), DecodeType.QR);
        reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("1230|2340|3450|4560|5670|67800|", reader.getFoundBarCodes()[0].getCodeText());
    }

        @Test
    public void Valid5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(folder, "Valid-5.jpg"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("899311|HELEN|MEHESY|AL|167|EP5115|", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}

