//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33371.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="23.10.2012 12:38:21">
//     Copyright (c) 2001-2011 Aspose Pty Ltd. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------------------------------------------

package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.QualitySettings;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


@Test(description = "Tests for Issue33371.")
public class Issue33371
{
    private final String folder = Global.getTestDataFolder("Issues/Issue33371");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void FATT1()
    {
        String fileName = Global.pathCombine(folder, "fatt1.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("FATTP00000000001", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void FATT5()
    {
        String fileName = Global.pathCombine(folder, "fatt5.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("FATTP00000000005", reader.getFoundBarCodes()[0].getCodeText());
    }
}

