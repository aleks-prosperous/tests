//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33496.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="04.04.2013 17:57:12">
//     Copyright (c) 2001-2011 Aspose Pty Ltd. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------------------------------------------

package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.QualitySettings;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


@Test(description = "Tests for Issue33496.")
public class Issue33496
{
    private String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33496");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testFewSymbs()
    {
        List<String> values = new ArrayList<String>();

        String fileName = Global.pathCombine(folder, "MyBarCode1.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);
        for(BarCodeResult result : reader.readBarCodes())
        values.add(result.getCodeText());
        Assert.assertEquals(4, values.size());
        Assert.assertTrue(values.contains("12138"));
        Assert.assertTrue(values.contains("12139"));
        Assert.assertTrue(values.contains("12140"));
        Assert.assertTrue(values.contains("60336/SON"));
    }

    @Test
    public void testFewSymbsWithCode39Code128Types()
    {
        List<String> values = new ArrayList<String>();

        String fileName = Global.pathCombine(folder, "MyBarCode1.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39_FULL_ASCII, DecodeType.CODE_128);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        for(BarCodeResult result : reader.readBarCodes())
        values.add(result.getCodeText());
        Assert.assertEquals(4, values.size());
        Assert.assertTrue(values.contains("12138"));
        Assert.assertTrue(values.contains("12139"));
        Assert.assertTrue(values.contains("12140"));
        Assert.assertTrue(values.contains("60336/SON"));
    }
}

