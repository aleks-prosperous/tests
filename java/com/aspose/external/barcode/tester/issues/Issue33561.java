package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;


@Test(description = "Tests for Issue33561.")
public class Issue33561
{
    final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33561");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testAllPages()
    {
        BarCodeReader reader = new BarCodeReader(folder + "20130528092912147.tif", DecodeType.CODE_128);
        reader.getQualitySettings().setDeconvolution(DeconvolutionMode.SLOW);
        int countBarcodes = 0;
        for (BarCodeResult result : reader.readBarCodes())
        {
            Assert.assertEquals("EASYAPANEXO", result.getCodeText());
            countBarcodes++;
        }
        Assert.assertEquals(4, countBarcodes);
    }

    @Test
    public void page1()
    {
        final String fileName = "20130528092912147_Page1.png";
        String path = Global.pathCombine(folder, fileName);

        final BarCodeReader reader = new BarCodeReader(path, DecodeType.CODE_128);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
        Assert.assertEquals(reader.readBarCodes().length, 4);
        Assert.assertEquals("EASYAPANEXO", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals("EASYAPANEXO", reader.getFoundBarCodes()[1].getCodeText());
        Assert.assertEquals("EASYAPANEXO", reader.getFoundBarCodes()[2].getCodeText());
        Assert.assertEquals("EASYAPANEXO", reader.getFoundBarCodes()[3].getCodeText());
    }

    @Test
    public void page2()
    {
        final String fileName = "20130528092912147_Page2.png";
        String path = Global.pathCombine(folder, fileName);

        final BarCodeReader reader = new BarCodeReader(path, DecodeType.CODE_128);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        Assert.assertEquals(reader.readBarCodes().length, 4);
        Assert.assertEquals("EASYAPANEXO", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals("EASYAPANEXO", reader.getFoundBarCodes()[1].getCodeText());
        Assert.assertEquals("EASYAPANEXO", reader.getFoundBarCodes()[2].getCodeText());
        Assert.assertEquals("EASYAPANEXO", reader.getFoundBarCodes()[3].getCodeText());

    }

    @Test
    public void page3()
    {
        final String fileName = "20130528092912147_Page3.png";
        String path = Global.pathCombine(folder, fileName);

        final BarCodeReader reader = new BarCodeReader(path, DecodeType.CODE_128);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        Assert.assertEquals(reader.readBarCodes().length, 4);
        Assert.assertEquals("EASYAPANEXO", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals("EASYAPANEXO", reader.getFoundBarCodes()[1].getCodeText());
        Assert.assertEquals("EASYAPANEXO", reader.getFoundBarCodes()[2].getCodeText());
        Assert.assertEquals("EASYAPANEXO", reader.getFoundBarCodes()[3].getCodeText());
    }

    @Test
    public void page4()
    {
        final String fileName = "20130528092912147_Page4.png";
        String path = Global.pathCombine(folder, fileName);

        final BarCodeReader reader = new BarCodeReader(path, DecodeType.CODE_128);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        Assert.assertEquals(reader.readBarCodes().length, 4);
        Assert.assertEquals("EASYAPANEXO", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals("EASYAPANEXO", reader.getFoundBarCodes()[1].getCodeText());
        Assert.assertEquals("EASYAPANEXO", reader.getFoundBarCodes()[2].getCodeText());
        Assert.assertEquals("EASYAPANEXO", reader.getFoundBarCodes()[3].getCodeText());

    }

    @Test
    public void page5()
    {
        final String fileName = "20130528092912147_Page5.png";
        String path = Global.pathCombine(folder, fileName);

        final BarCodeReader reader = new BarCodeReader(path, DecodeType.CODE_128);
        reader.getQualitySettings().setDeconvolution(DeconvolutionMode.SLOW);
        Assert.assertEquals(reader.readBarCodes().length, 4);
        Assert.assertEquals("EASYAPANEXO", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals("EASYAPANEXO", reader.getFoundBarCodes()[1].getCodeText());
        Assert.assertEquals("EASYAPANEXO", reader.getFoundBarCodes()[2].getCodeText());
        Assert.assertEquals("EASYAPANEXO", reader.getFoundBarCodes()[3].getCodeText());
    }

    @Test
    public void page6()
    {
        final String fileName = "20130528092912147_Page6.png";
        String path = Global.pathCombine(folder, fileName);

        final BarCodeReader reader = new BarCodeReader(path, DecodeType.CODE_128);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        Assert.assertEquals(reader.readBarCodes().length, 4);
        Assert.assertEquals("EASYAPANEXO", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals("EASYAPANEXO", reader.getFoundBarCodes()[1].getCodeText());
        Assert.assertEquals("EASYAPANEXO", reader.getFoundBarCodes()[2].getCodeText());
        Assert.assertEquals("EASYAPANEXO", reader.getFoundBarCodes()[3].getCodeText());
    }
}

