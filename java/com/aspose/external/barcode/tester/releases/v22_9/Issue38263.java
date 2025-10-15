package com.aspose.external.barcode.tester.releases.v22_9;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarcodeQualityMode;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

public class Issue38263
{
    /// <summary>
    /// Path to folder with files for testing Issue38263.
    /// </summary>
    private final static String Folder = Global.getTestDataFolder("Issues\\Issue38263");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test_2022062002002241()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "2022062002002259.tiff"), DecodeType.CODE_39, DecodeType.CODE_39_FULL_ASCII);
        {
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("RM2022062000149", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_code39_wiped_bars()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "code39_wiped_bars.png"), DecodeType.CODE_39, DecodeType.CODE_39_FULL_ASCII);
        {
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("RM2022062000149", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_code39_marked()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "code39_marked.png"), DecodeType.CODE_39, DecodeType.CODE_39_FULL_ASCII);
        {
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("RM2022062000149", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_code39_fixed()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "code39_fixed.png"), DecodeType.CODE_39, DecodeType.CODE_39_FULL_ASCII);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("RM2022062000149", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_2022062002002259()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "2022062002002241.tiff"), DecodeType.CODE_39, DecodeType.CODE_39_FULL_ASCII);
        {
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("RM2022062000851", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_code39_wiped_bars_second()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "code39_wiped_bars_second.png"), DecodeType.CODE_39, DecodeType.CODE_39_FULL_ASCII);
        {
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("RM2022062000851", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_code39_marked_second()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "code39_marked_second.png"), DecodeType.CODE_39, DecodeType.CODE_39_FULL_ASCII);
        {
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("RM2022062000851", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_code39_fixed_second()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "code39_fixed_second.png"), DecodeType.CODE_39, DecodeType.CODE_39_FULL_ASCII);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("RM2022062000851", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
