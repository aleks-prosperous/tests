//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33283.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="17.10.2013 18:26:38">
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
import java.util.ArrayList;
import java.util.List;


@Test(description = "Tests for Issue33283.")
public class Issue33283
{
    final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33283");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testMultiTif()
    {
        List<String> values = new ArrayList<String>();
        values.add("DJ1146585");
        values.add("DJ1146590");
        values.add("DJ1146586");
        values.add("DJ1146591");

        BarCodeReader reader = new BarCodeReader(Global.pathCombine(folder, "SD_01+08+46+%5bPM%5dMonJul02.tiff"), DecodeType.CODE_128);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertTrue(values.contains(reader.getFoundBarCodes()[0].getCodeText()), reader.getFoundBarCodes()[0].getCodeText());
    }
}

