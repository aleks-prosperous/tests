//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33650.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="07.08.2013 16:15:10">
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


@Test(description = "Tests for Issue-33650.")
public class Issue33650
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33650");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void degree180()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(folder, "mc180.png"), DecodeType.ALL_SUPPORTED_TYPES);
        reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("\rhttp://themediaguru.blogspot.com", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals(DecodeType.DATA_MATRIX, reader.getFoundBarCodes()[0].getCodeType());
        Assert.assertEquals(180d, reader.getFoundBarCodes()[0].getRegion().getAngle());
    }

    @Test
    public void degree90()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(folder, "mc90.png"), DecodeType.ALL_SUPPORTED_TYPES);
        reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("\rhttp://themediaguru.blogspot.com", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals(DecodeType.DATA_MATRIX, reader.getFoundBarCodes()[0].getCodeType());
        Assert.assertEquals(90d, reader.getFoundBarCodes()[0].getRegion().getAngle());
    }

    @Test
    public void degree270()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(folder, "mc270.png"), DecodeType.ALL_SUPPORTED_TYPES);
        reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("\rhttp://themediaguru.blogspot.com", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals(DecodeType.DATA_MATRIX, reader.getFoundBarCodes()[0].getCodeType());
        Assert.assertEquals(270d, reader.getFoundBarCodes()[0].getRegion().getAngle());
    }

    @Test
    public void original()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(folder, "media_guru_Cool_Datamatrix.png"), DecodeType.ALL_SUPPORTED_TYPES);
        reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("\rhttp://themediaguru.blogspot.com", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals(DecodeType.DATA_MATRIX, reader.getFoundBarCodes()[0].getCodeType());
        Assert.assertEquals(0d, reader.getFoundBarCodes()[0].getRegion().getAngle());
    }
}

