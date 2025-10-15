//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue12527.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="01.08.2012 18:50:34">
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

@Test(description = "Tests for Issue-12527.")
public class Issue12527
{
    final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue12527");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test_java_adapted()
    {
        String fullPath = Global.pathCombine(folder, "fax-20091208140854" + File.separator + "Page 1.tiff");
        BarCodeReader reader = new BarCodeReader(fullPath, DecodeType.CODE_39, DecodeType.CODE_39_FULL_ASCII);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("VBO0000035", reader.getFoundBarCodes()[0].getCodeText());
    }
}

