//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33324.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="29.08.2012 15:43:46">
//     Copyright (c) 2001-2011 Aspose Pty Ltd. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------------------------------------------

package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;


@Test(description = "Tests for Issue-33324.")
public class Issue33324
{
    final String folder = Global.getTestDataFolder("Issues/Issue33324");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void recognize1()
    {
        String fileName = Global.pathCombine(folder, "skk2_1.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39, DecodeType.CODE_39_FULL_ASCII);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("11208A000012", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void recognize1OriginalCut()
    {
        String fileName = Global.pathCombine(folder, "11208A000012.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39, DecodeType.CODE_39_FULL_ASCII);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        reader.getQualitySettings().setAllowIncorrectBarcodes(true);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("11208A000012", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void recognize2()
    {
        String fileName = Global.pathCombine(folder, "skk3_1.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39, DecodeType.CODE_39_FULL_ASCII);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("11208A000013", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void recognize2OriginalCut()
    {
        String fileName = Global.pathCombine(folder, "11208A000013.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39, DecodeType.CODE_39_FULL_ASCII);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        reader.getQualitySettings().setAllowIncorrectBarcodes(true);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("11208A000013", reader.getFoundBarCodes()[0].getCodeText());
    }

        @Test
    public void RecognizeOriginal()
    {
        List<String> result = new ArrayList<String>();

        String fileName = Global.pathCombine(folder, "SKMBT_60112091915220_0001.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39, DecodeType.CODE_39_FULL_ASCII);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());
            reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
            reader.getQualitySettings().setAllowIncorrectBarcodes(true);
            for (BarCodeResult barcoderesult : reader.readBarCodes())
            result.add(barcoderesult.getCodeText());

            Assert.assertEquals(5, result.size());
            Assert.assertTrue(result.contains("11208A000005"));
            Assert.assertTrue(result.contains("11208A000006"));
            Assert.assertTrue(result.contains("11208A000012"));
            Assert.assertTrue(result.contains("11208A000013"));
            Assert.assertTrue(result.contains("EV23062"));
        }
    }

        @Test
    public void RecognizeOriginalAllTypes()
    {
        List<String> result = new ArrayList<String>();

        String fileName = Global.pathCombine(folder, "SKMBT_60112091915220_0001.tif");
        BarCodeReader reader = new BarCodeReader(fileName);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());
            reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
            reader.getQualitySettings().setAllowIncorrectBarcodes(true);
            for(BarCodeResult barcoderesult : reader.readBarCodes())
                result.add(barcoderesult.getCodeText());

            Assert.assertEquals(5, result.size());
            Assert.assertTrue(result.contains("11208A000005"));
            Assert.assertTrue(result.contains("11208A000006"));
            Assert.assertTrue(result.contains("11208A000012"));
            Assert.assertTrue(result.contains("11208A000013"));
            Assert.assertTrue(result.contains("EV23062"));
        }
    }
}

