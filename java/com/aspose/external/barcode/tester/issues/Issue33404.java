//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33404.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="10.05.2012 16:00:25">
//     Copyright (c) 2001-2011 Aspose Pty Ltd. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------------------------------------------

package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.ChecksumValidation;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.QualitySettings;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;


@Test(description = "Tests for Issue-33404.")
public class Issue33404
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33404");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test()
    {
        String fileName = Global.pathCombine(folder, "Code11-A.bmp");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_11);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.OFF);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("02340678905", reader.getFoundBarCodes()[0].getCodeText());
    }
}

