//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33252.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="14.06.2012 13:50:50">
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


@Test(description = "Tests for Issue-33252.")
public class Issue33252
{
    final String folder = Global.getTestDataFolder("Issues/Issue33252");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void testCode39FromPDF()
    {
        final String file = "IMG1.bmp";
        String fullPath = Global.pathCombine(folder, file);
        BarCodeReader reader = new BarCodeReader(fullPath, DecodeType.CODE_39, DecodeType.CODE_39_FULL_ASCII);
        reader.setQualitySettings(QualitySettings.getHighQuality());
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("110450100008826", reader.getFoundBarCodes()[0].getCodeText());
    }
}

