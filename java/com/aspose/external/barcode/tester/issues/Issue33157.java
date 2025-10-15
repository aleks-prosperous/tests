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


@Test(description = "Tests for Issue-33157.")
public class Issue33157
{
    final String folder = Global.getTestDataFolder("Issues/Issue33157");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void test1png()
    {
        String fileName = Global.pathCombine(folder, "1.png");
        BarCodeReader reader = new BarCodeReader(fileName);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.OFF);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("1234567812", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test1pngWithConcreteSymbology()
    {
        String fileName = Global.pathCombine(folder, "1.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_11);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.OFF);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("1234567812", reader.getFoundBarCodes()[0].getCodeText());
    }
}
