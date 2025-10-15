//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33413.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="10.05.2012 16:00:25">
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


@Test(description = "Tests for Issue-33413.")
public class Issue33413
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33413");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test_Code39()
    {
        String fileName = Global.pathCombine(folder, "photo+4.jpg");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39, DecodeType.CODE_39_FULL_ASCII);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("IJN8AZ1MW1BW185369", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test_VIN()
    {
        String fileName = Global.pathCombine(folder, "photo+4.jpg");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.VIN);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("JN8AZ1MW1BW185369", reader.getFoundBarCodes()[0].getCodeText());
    }
}

