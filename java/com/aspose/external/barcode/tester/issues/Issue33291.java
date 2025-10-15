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

@Test(description = "Tests for Issue-33291.")
public class Issue33291
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33291");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test1()
    {
        String fullPath = Global.pathCombine(folder, "1.jpg");
        BarCodeReader reader = new BarCodeReader(fullPath, DecodeType.CODE_128);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("07606060103", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test2()
    {
        String fullPath = Global.pathCombine(folder, "0001.tif");
        BarCodeReader reader = new BarCodeReader(fullPath, DecodeType.CODE_128);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("568200419711", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test3()
    {
        String fullPath = Global.pathCombine(folder, "0002.tif");
        BarCodeReader reader = new BarCodeReader(fullPath, DecodeType.CODE_128);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("243323339546", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test4()
    {
        String fullPath = Global.pathCombine(folder, "doc2.png");
        BarCodeReader reader = new BarCodeReader(fullPath, DecodeType.CODE_128);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("-A69751", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test5()
    {
        String fullPath = Global.pathCombine(folder, "AM1000a.tif");
        BarCodeReader reader = new BarCodeReader(fullPath, DecodeType.CODE_128);
        Assert.assertEquals(reader.readBarCodes().length, 2);
        Assert.assertEquals("<FNC1>AM1000", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals("<FNC1>AM1000", reader.getFoundBarCodes()[1].getCodeText());
    }

    @Test
    public void test6()
    {
        String fullPath = Global.pathCombine(folder, "AM1000b.tif");
        BarCodeReader reader = new BarCodeReader(fullPath, DecodeType.CODE_128);
        Assert.assertEquals(reader.readBarCodes().length, 2);
        Assert.assertEquals("<FNC1>AM1000", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals("<FNC1>AM1000", reader.getFoundBarCodes()[1].getCodeText());
    }

    @Test
    public void test7()
    {
        String fullPath = Global.pathCombine(folder, "AM1000c.tif");
        BarCodeReader reader = new BarCodeReader(fullPath, DecodeType.CODE_128);
        Assert.assertEquals(reader.readBarCodes().length, 2);
        Assert.assertEquals("<FNC1>AM1000", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals("<FNC1>AM1000", reader.getFoundBarCodes()[1].getCodeText());
    }
}

