package com.aspose.external.barcode.tester.releases.v17_11;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.QualitySettings;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;

public class Issue36695
{
    private String folder = Global.getTestDataFolder("Issues" + File.separatorChar + "Issue36695");

    /**
     * <p>
     * Prepares to run these tests.
     * </p>
     */
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test(enabled = false, description = "Fix me.")
    public void test_image35_AllSupportedTypes()
    {
        String fileName = Global.pathCombine(folder, "35.png");
        BarCodeReader barcodeReader = new BarCodeReader(fileName);
        barcodeReader.setQualitySettings(QualitySettings.getHighPerformance());
        Assert.assertEquals(barcodeReader.readBarCodes().length, 0, "false is ok");
    }

        @Test
        ////[Category("MSI")]
    public void test_image35_MSI()
    {
        String fileName = Global.pathCombine(folder, "35.png");
        BarCodeReader barcodeReader = new BarCodeReader(fileName, DecodeType.MSI);
        Assert.assertEquals(barcodeReader.readBarCodes().length, 0, "false is ok");
    }

        @Test
        ////[Category("Supplement")]
    public void test_image35_Supplement()
    {
        String fileName = Global.pathCombine(folder, "35.png");
        BarCodeReader barcodeReader = new BarCodeReader(fileName, DecodeType.SUPPLEMENT);
        {
            barcodeReader.setQualitySettings(QualitySettings.getHighPerformance());
            Assert.assertEquals(barcodeReader.readBarCodes().length, 0, "false is ok");
        }
    }

    @Test(enabled = false)
    public void test_image17_AllSupportedTypes()
    {
        String fileName = Global.pathCombine(folder, "17.png");
        BarCodeReader barcodeReader = new BarCodeReader(fileName);
        {
            barcodeReader.setQualitySettings(QualitySettings.getHighPerformance());
            Assert.assertEquals(barcodeReader.readBarCodes().length, 0, "false is ok");
        }
    }

        @Test
        ////[Category("MSI")]
    public void test_image17_MSI()
    {
        String fileName = Global.pathCombine(folder, "17.png");
        BarCodeReader barcodeReader = new BarCodeReader(fileName, DecodeType.MSI);
        Assert.assertEquals(barcodeReader.readBarCodes().length, 0, "false is ok");
    }

        @Test
        ////[Category("Supplement")]
    public void test_image17_Supplement()
    {
        String fileName = Global.pathCombine(folder, "17.png");
        BarCodeReader barcodeReader = new BarCodeReader(fileName, DecodeType.SUPPLEMENT);
        barcodeReader.setQualitySettings(QualitySettings.getHighPerformance());
        Assert.assertEquals(barcodeReader.readBarCodes().length, 0, "false is ok");
    }

        @Test
        ////[Category("AllSupportedTypes")]
        ////[Category("Code39Standard")]
    public void test_page1_AllSupportedTypes()
    {
        String fileName = Global.pathCombine(folder, "page1.png");
        BarCodeReader reader = new BarCodeReader(fileName);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("2358765321-2", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals(DecodeType.CODE_39, reader.getFoundBarCodes()[0].getCodeType());
    }

        @Test
        ////[Category("AllSupportedTypes")]
        ////[Category("Code39Standard")]
    public void test_page4_AllSupportedTypes()
    {
        String fileName = Global.pathCombine(folder, "page4.png");
        BarCodeReader reader = new BarCodeReader(fileName);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("6547655640-1", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals(DecodeType.CODE_39, reader.getFoundBarCodes()[0].getCodeType());
    }
}
