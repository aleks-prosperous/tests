package com.aspose.external.barcode.tester.releases.v20_5;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarcodeQualityMode;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

public class Issue37422
{
    /// <summary>
    /// Path to folder with files for testing Issue37391.
    /// </summary>
    private String Folder = Global.getTestDataFolder("Issues\\Issue37422");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void SetUp()
    {
        LicenseAssistant.setupLicense();
    }

        @Test
    public void test_Health_Form_1_Code39()
    {
        String fileName = Global.pathCombine(Folder, "20031819000001_nfnb.tiff");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39);
        {
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("X19228835", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void test_Health_Form_1_AllTypes()
    {
        String fileName = Global.pathCombine(Folder, "20031819000001_nfnb.tiff");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);
        {
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("X19228835", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void test_Health_Form_2_Code39()
    {
        String fileName = Global.pathCombine(Folder, "20031819000002_nfnb.tiff");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39);
        {
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("X19228836", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void test_Health_Form_2_AllTypes()
    {
        String fileName = Global.pathCombine(Folder, "20031819000002_nfnb.tiff");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);
        {
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("X19228836", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void test_Health_Form_3_Code39()
    {
        String fileName = Global.pathCombine(Folder, "20031819000003_nfnb.tiff");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("X19228832", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void test_Health_Form_3_AllTypes()
    {
        String fileName = Global.pathCombine(Folder, "20031819000003_nfnb.tiff");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("X19228832", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

}
