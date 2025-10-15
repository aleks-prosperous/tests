//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33601.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="17.10.2013 18:26:38">
//     Copyright (c) 2001-2011 Aspose Pty Ltd. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------------------------------------------

package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarcodeQualityMode;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.XDimensionMode;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;


@Test(description = "Tests for Issue33601.")
public class Issue33601
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33601");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testTif101()
    {
        String fileName = Global.pathCombine(folder, "101.tif");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("001122334455", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testTif107()
    {
        String fileName = Global.pathCombine(folder, "107.tif");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);
        reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("096200022011", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testTif108()
    {
        String fileName = Global.pathCombine(folder, "108.tif");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("BBHS09620007201100000009", reader.getFoundBarCodes()[0].getCodeText());
    }
}

