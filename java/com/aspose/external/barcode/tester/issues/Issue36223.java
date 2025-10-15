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

public class Issue36223
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue36223");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testPage1PngCode128()
    {
        BarCodeReader reader = new BarCodeReader(folder + "Page1.png", DecodeType.CODE_128);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("40193240260010201111", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testPage3PngCode128()
    {
        BarCodeReader reader = new BarCodeReader(folder + "Page3.png", DecodeType.CODE_128);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("40193132350010201111", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testPage4PngCode128()
    {
        BarCodeReader reader = new BarCodeReader(folder + "Page4.png", DecodeType.CODE_128);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("40192979040010201111", reader.getFoundBarCodes()[0].getCodeText());
    }
}
