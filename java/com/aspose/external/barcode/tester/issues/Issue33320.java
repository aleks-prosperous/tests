//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33320.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="29.08.2012 15:43:46">
//     Copyright (c) 2001-2011 Aspose Pty Ltd. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------------------------------------------

package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;


@Test(description = "Tests for Issue-33320.")
public class Issue33320
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33320");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void recognize()
    {
        String fileName = Global.pathCombine(folder, "sk2_1.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39, DecodeType.CODE_39_FULL_ASCII);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("11208A00002", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void recognizeOriginal()
    {
        String fileName = Global.pathCombine(folder, "SKMBT_60112091216320_0011.tif");
        BarCodeReader reader = new BarCodeReader(fileName);
        reader.getQualitySettings().setAllowIncorrectBarcodes(true);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("11208A00002", reader.getFoundBarCodes()[0].getCodeText());
    }
}

