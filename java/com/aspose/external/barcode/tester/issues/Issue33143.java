package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.QualitySettings;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


@Test(description = "Tests for Issue-33143.")
public class Issue33143
{
    final String folder = Global.getTestDataFolder("Issues/Issue33143");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void recognize1()
    {
        String fileName = Global.pathCombine(folder, "document1.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("<FNC1>D00000001863", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void recognize2()
    {
        String fileName = Global.pathCombine(folder, "document2.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("<FNC1>D00000001864", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void recognize3()
    {
        String fileName = Global.pathCombine(folder, "document3.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("<FNC1>D00000001865", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void recognize4()
    {
        String fileName = Global.pathCombine(folder, "document4.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("<FNC1>D00000001866", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void recognize5()
    {
        String fileName = Global.pathCombine(folder, "document5.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("<FNC1>D00000001867", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void recognize6()
    {
        String fileName = Global.pathCombine(folder, "document6.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("<FNC1>D00000001868", reader.getFoundBarCodes()[0].getCodeText());
    }
}

