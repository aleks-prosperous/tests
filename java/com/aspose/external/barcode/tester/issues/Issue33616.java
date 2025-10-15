//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33616.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="24.07.2013 13:42:52">
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


@Test(description = "Tests for Issue33616.")
public class Issue33616
{
    private final String folder = Global.getTestDataFolder("Issues/Issue33616");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void code128()
    {
        String fileName = Global.pathCombine(folder, "ean14-13.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("<FNC1>0117174591806423", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void code128StripFNC()
    {
        String fileName = Global.pathCombine(folder, "ean14-13.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        reader.getBarcodeSettings().setStripFNC(true);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("0117174591806423", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void swissPostParcel()
    {
        String fileName = Global.pathCombine(folder, "ean14-13.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.SWISS_POST_PARCEL);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("<FNC1>0117174591806423", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void swissPostParcelFNC()
    {
        String fileName = Global.pathCombine(folder, "ean14-13.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.SWISS_POST_PARCEL);
            reader.getBarcodeSettings().setStripFNC(true);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("0117174591806423", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void SCC14()
    {
        String fileName = Global.pathCombine(folder, "ean14-13.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.SCC_14);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("(01)17174591806423", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void SCC14FNC()
    {
        String fileName = Global.pathCombine(folder, "ean14-13.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.SCC_14);
            reader.getBarcodeSettings().setStripFNC(true);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)17174591806423", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void allSupportedTypes()
    {
        String fileName = Global.pathCombine(folder, "ean14-13.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("(01)17174591806423", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void allSupportedTypesFNC()
    {
        String fileName = Global.pathCombine(folder, "ean14-13.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);
            reader.getBarcodeSettings().setStripFNC(true);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)17174591806423", reader.getFoundBarCodes()[0].getCodeText());
    }
}

