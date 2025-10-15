package com.aspose.external.barcode.tester.releases.v18_2;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarcodeQualityMode;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.QualitySettings;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;

public class Issue36727
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue36727");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testSKMC454e17110716121Page2()
    {
        String fileName = folder + "SKM_C454e17110716121_page2.jpg";
        BarCodeReader reader = new BarCodeReader(fileName);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("Separator", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals("Separator", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testSKMC454e17110716121Page4()
    {
        String fileName = folder + "SKM_C454e17110716121_page4.jpg";
        BarCodeReader reader = new BarCodeReader(fileName);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("Separator", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testSKMC454e17110716121Page3Fake()
    {
        String fileName = folder + "SKM_C454e17110716121_page3_2.jpg";
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PHARMACODE);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.NORMAL);
        Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
    }

    @Test
    public void testSKMC454e17110716121Page5Fake()
    {
        String fileName = folder + "SKM_C454e17110716121_page5_2.jpg";
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.MICR_E_13_B);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.NORMAL);
        Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
    }

    @Test
    public void testSKMC454e17111010590Page1Fake()
    {
        String fileName = folder + "SKM_C454e17111010590_page1.png";
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PHARMACODE);
        Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
    }

    @Test
    public void testSKMC454e17111010590Page3()
    {
        String fileName = folder + "SKM_C454e17111010590_page3.jpg";
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("SEPARATOR", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testSKMC454e17111010590Page6()
    {
        String fileName = folder + "SKM_C454e17111010590_page6.jpg";
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("SEPARATOR", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testWallsInvoiceWithBarcodeSeparatorPage3()
    {
        String fileName = folder + "Walls Invoice with barcode separator_page3.jpg";
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.NORMAL);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("Separator", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testWallsInvoiceWithBarcodeSeparatorPage5()
    {
        String fileName = folder + "Walls Invoice with barcode separator_page5.jpg";
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.NORMAL);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("Separator", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testWallsInvoiceWithBarcodeSeparatorPage8()
    {
        String fileName = folder + "Walls Invoice with barcode separator_page8.jpg";
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.NORMAL);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("Separator", reader.getFoundBarCodes()[0].getCodeText());
    }
}
