//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33209.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="08.05.2012 13:27:24">
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


@Test(description = "Tests for Issue-33882.")
public class Issue33882
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33882");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testImage()
    {
        String fileName = Global.pathCombine(folder, "image095020101129.tif");

        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("179848", reader.getFoundBarCodes()[0].getCodeText());
    }
}

