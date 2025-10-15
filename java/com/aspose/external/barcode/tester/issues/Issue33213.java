package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;


@Test(description = "Tests for Issue33213.")
public class Issue33213
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33213");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testDemo()
    {
        String fileName = Global.pathCombine(folder, "MMo15810_A+5.pdf.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("010203115810\\4", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test_Cutted()
    {
        String fileName = Global.pathCombine(folder, "MMo15810_A+5.pdf_cutted.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("010203115810\\4", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test_Cutted2()
    {
        String fileName = Global.pathCombine(folder, "MMO.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("010203115810\\4", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testDemoSecond()
    {
        String fileName = Global.pathCombine(folder, "MMo15810_A+5.tif");
        BarCodeReader reader = new BarCodeReader(fileName);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("010203115810\\4", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testDemoNewVersionOfPicture()
    {
        String fileName = Global.pathCombine(folder, "MMo15.png");
        BarCodeReader reader = new BarCodeReader(fileName);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("010203115810\\4", reader.getFoundBarCodes()[0].getCodeText());
    }
}
