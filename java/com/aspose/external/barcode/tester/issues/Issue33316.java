//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33316.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="29.08.2012 15:43:46">
//     Copyright (c) 2001-2011 Aspose Pty Ltd. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------------------------------------------

package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.QualitySettings;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;


@Test(description = "Tests for Issue-33316.")
public class Issue33316
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33316");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void recognize1()
    {
        String fileName = Global.pathCombine(folder, "Scan0001.jpg");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39, DecodeType.CODE_39_FULL_ASCII);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("1L8E000016", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void recognize2()
    {
        String fileName = Global.pathCombine(folder, "Scan0002.jpg");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39, DecodeType.CODE_39_FULL_ASCII);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("1L8E000016", reader.getFoundBarCodes()[0].getCodeText());

    }

    @Test
    public void recognize3()
    {
        String fileName = Global.pathCombine(folder, "Scan0003.jpg");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("1L8E000016", reader.getFoundBarCodes()[0].getCodeText());

    }
}

