// Copyright (c) 2001-2011 Aspose Pty Ltd. All Rights Reserved.

package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.ChecksumValidation;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.QualitySettings;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


@Test(description = "Tests for Issue-33127.")
public class Issue33127
{
    final String folder = Global.getTestDataFolder("Issues/Issue33127");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void recognizeAllBarcodes()
    {
        final String file = "Three_Barcodes.png";
        String fullFileName = Global.pathCombine(folder, file);
        BarCodeReader reader = new BarCodeReader(fullFileName, DecodeType.ALL_SUPPORTED_TYPES);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.OFF);
        Assert.assertEquals(reader.readBarCodes().length, 3);
    }
}

