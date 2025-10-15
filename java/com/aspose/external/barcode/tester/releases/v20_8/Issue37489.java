package com.aspose.external.barcode.tester.releases.v20_8;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarcodeQualityMode;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.QualitySettings;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

public class Issue37489
{
    /// <summary>
    /// Path to folder with files for testing Issue37489.
    /// </summary>
    private String Folder = Global.getTestDataFolder("Issues\\Issue37489");

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
        String fileName = Global.pathCombine(Folder, "multipage_1.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("X19228835", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void test_Health_Form_1_AllTypes()
    {
        String fileName = Global.pathCombine(Folder, "multipage_1.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("X19228835", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void test_Health_Form_2_Code39()
    {
        String fileName = Global.pathCombine(Folder, "multipage_2.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());
            Assert.assertEquals(0, reader.readBarCodes().length);
        }
    }

    @Test(enabled = false)
    public void test_Health_Form_2_AllTypes()
    {
        String fileName = Global.pathCombine(Folder, "multipage_2.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(0, reader.readBarCodes().length);
        }
    }

        @Test(enabled = false)
    public void test_Health_Form_3_Code39()
    {
        String fileName = Global.pathCombine(Folder, "multipage_3.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("X19228836", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void test_Health_Form_3_AllTypes()
    {
        String fileName = Global.pathCombine(Folder, "multipage_3.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("X19228836", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void test_Health_Form_4_Code39()
    {
        String fileName = Global.pathCombine(Folder, "multipage_4.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());
            Assert.assertEquals(0, reader.readBarCodes().length);
        }
    }

        @Test
    public void test_Health_Form_4_AllTypes()
    {
        String fileName = Global.pathCombine(Folder, "multipage_4.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());
            Assert.assertEquals(0, reader.readBarCodes().length);
        }
    }

        @Test
    public void test_Health_Form_5_Code39()
    {
        String fileName = Global.pathCombine(Folder, "multipage_5.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39);
        {
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("X19228832", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void test_Health_Form_5_AllTypes()
    {
        String fileName = Global.pathCombine(Folder, "multipage_5.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);
        {
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("X19228832", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void test_Health_Form_6_Code39()
    {
        String fileName = Global.pathCombine(Folder, "multipage_6.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());
            Assert.assertEquals(0, reader.readBarCodes().length);
        }
    }

        @Test
    public void test_Health_Form_6_AllTypes()
    {
        String fileName = Global.pathCombine(Folder, "multipage_6.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());
            Assert.assertEquals(0, reader.readBarCodes().length);
        }
    }

        @Test
    public void test_Health_Form_7_Code39()
    {
        String fileName = Global.pathCombine(Folder, "multipage_7.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("X19228833", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void test_Health_Form_7_AllTypes()
    {
        String fileName = Global.pathCombine(Folder, "multipage_7.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("X19228833", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void test_Health_Form_8_Code39()
    {
        String fileName = Global.pathCombine(Folder, "multipage_8.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());
            Assert.assertEquals(0, reader.readBarCodes().length);
        }
    }

        @Test
    public void test_Health_Form_8_AllTypes()
    {
        String fileName = Global.pathCombine(Folder, "multipage_8.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());
            //Assert.assertEquals(0, reader.readBarCodes().length); // TODO: Fix this test
        }
    }

        @Test
    public void test_Health_Form_9_Code39()
    {
        String fileName = Global.pathCombine(Folder, "multipage_9.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("X19228834", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void test_Health_Form_9_AllTypes()
    {
        String fileName = Global.pathCombine(Folder, "multipage_9.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("X19228834", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void test_Health_Form_10_Code39()
    {
        String fileName = Global.pathCombine(Folder, "multipage_10.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());
            Assert.assertEquals(0, reader.readBarCodes().length);
        }
    }

        @Test
    public void test_Health_Form_10_AllTypes()
    {
        String fileName = Global.pathCombine(Folder, "multipage_10.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());
            Assert.assertEquals(0, reader.readBarCodes().length);
        }
    }
}
