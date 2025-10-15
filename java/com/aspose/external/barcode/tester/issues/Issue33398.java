package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.QualitySettings;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


@Test(description = "Tests for Issue33398.")
public class Issue33398
{
    final String folder = Global.getTestDataFolder("Issues/Issue33398");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void testCode128WithCode128Symbology()
    {
        String fileName = Global.pathCombine(folder, "code128.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("What about your 10,000 promises ?", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testCode128()
    {
        String fileName = Global.pathCombine(folder, "code128.png");
        BarCodeReader reader = new BarCodeReader(fileName);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("What about your 10,000 promises ?", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testCode39WithCode39Symbology()
    {
        String fileName = Global.pathCombine(folder, "code39.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39_FULL_ASCII);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("What about your 10,000 promises ?", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testCode39()
    {
        String fileName = Global.pathCombine(folder, "code39.png");
        BarCodeReader reader = new BarCodeReader(fileName);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("What about your 10,000 promises ?", reader.getFoundBarCodes()[0].getCodeText());
    }
}

