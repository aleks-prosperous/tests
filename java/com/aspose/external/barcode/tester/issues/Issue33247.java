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

@Test(description = "Tests for Issue33247.")
public class Issue33247
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33247");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testAspose()
    {
        String fileName = Global.pathCombine(folder, "aspose.png");
        final BarCodeReader reader = new BarCodeReader(fileName);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("010203115810\\4", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testUserAllSupportedTypes()
    {
        String fileName = Global.pathCombine(folder, "user.png");
        final BarCodeReader reader = new BarCodeReader(fileName);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("010203115810\\4", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testUser()
    {
        String fileName = Global.pathCombine(folder, "user.png");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("010203115810\\4", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testUserEdited()
    {
        String fileName = Global.pathCombine(folder, "useredited.png");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("010203115810\\4", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testUserOriginal()
    {
        String fileName = Global.pathCombine(folder, "test.tif");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("010203115810\\4", reader.getFoundBarCodes()[0].getCodeText());
    }
}

