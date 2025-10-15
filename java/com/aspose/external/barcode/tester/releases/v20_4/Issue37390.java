package com.aspose.external.barcode.tester.releases.v20_4;

import com.aspose.barcode.auxiliary.Global;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

public class Issue37390
{
    /// <summary>
    /// Path to folder with files for testing Issue37390.
    /// </summary>
    private String Folder = Global.getIssuesTestImagePath("Issue37390");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void SetUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test_2019081901005423_nf4c_Normal()
    {
        String fileName = Global.pathCombine(Folder, "2019081901005423_nf4c.tiff");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39, DecodeType.CODE_39_FULL_ASCII, DecodeType.PATCH_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 3);
            Assert.assertEquals("Patch IV", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("RM2019081900439", reader.getFoundBarCodes()[1].getCodeText());
            Assert.assertEquals("Patch IV", reader.getFoundBarCodes()[2].getCodeText());
        }
    }

    @Test
    public void test_2019081901005423_nf4c_MaxQualityDetection()
    {
        String fileName = Global.pathCombine(Folder, "2019081901005423_nf4c.tiff");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39, DecodeType.CODE_39_FULL_ASCII, DecodeType.PATCH_CODE);
        {
            reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);

            Assert.assertEquals(reader.readBarCodes().length, 5);
            Assert.assertEquals("Patch IV", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("Patch IV", reader.getFoundBarCodes()[1].getCodeText());
            Assert.assertEquals("RM2019081900439", reader.getFoundBarCodes()[2].getCodeText());
            Assert.assertEquals("Patch IV", reader.getFoundBarCodes()[3].getCodeText());
            Assert.assertEquals("Patch IV", reader.getFoundBarCodes()[4].getCodeText());
        }
    }

    @Test
    public void test_2019081901005423_nf4c_HighPerformance()
    {
        String fileName = Global.pathCombine(Folder, "2019081901005423_nf4c.tiff");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39, DecodeType.CODE_39_FULL_ASCII, DecodeType.PATCH_CODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 3);
            Assert.assertEquals("Patch IV", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("RM2019081900439", reader.getFoundBarCodes()[1].getCodeText());
            Assert.assertEquals("Patch IV", reader.getFoundBarCodes()[2].getCodeText());
        }
    }

    @Test
    public void test_2019081901005423_nf4c_HighPerformance_AllSupportedTypes()
    {
        String fileName = Global.pathCombine(Folder, "2019081901005423_nf4c.tiff");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());
            reader.readBarCodes();
            Assert.assertEquals(reader.readBarCodes().length, 3);
            Assert.assertEquals("Patch IV", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("RM2019081900439", reader.getFoundBarCodes()[1].getCodeText());
            Assert.assertEquals("Patch IV", reader.getFoundBarCodes()[2].getCodeText());
        }
    }

    @Test
    public void test_code39_cut_Normal()
    {
        String fileName = Global.pathCombine(Folder, "code39_cut.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39, DecodeType.CODE_39_FULL_ASCII);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("RM2019081900439", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
