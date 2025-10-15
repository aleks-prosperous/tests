package com.aspose.external.barcode.tester.releases.v18_4;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Issue36794
{
    /// <summary>
    /// Path to folder with files for testing Issue36794.
    /// </summary>
    private final String folder = Global.getTestDataFolder("Issues\\Issue36794");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
        @BeforeMethod
    public void SetUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_AllSupportedTypes_img0()
    {
        String file = Global.pathCombine(folder, "img0.png");
        BarCodeReader reader = new BarCodeReader(file);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
        //[Category("Standard2of5")]
    public void test_Standard2of5_img0()
    {
        String file = Global.pathCombine(folder, "img0.png");
        BarCodeReader reader = new BarCodeReader(file, DecodeType.STANDARD_2_OF_5);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
    public void test_Code128_cutImg0()
    {
        BarCodeReader.getProcessorSettings().setUseAllCores(false);
        BarCodeReader.getProcessorSettings().setUseOnlyThisCoresCount(1);
        String file = Global.pathCombine(folder, "page1_cutCode128.png");
        BarCodeReader reader = new BarCodeReader(file, DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }


    @Test
    public void test_Code128_cutImg0_edited()
    {
        String file = Global.pathCombine(folder, "page1_cutCode128_edited.png");
        BarCodeReader reader = new BarCodeReader(file, DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
        //[Category("DataMatrix")]
    public void test_DataMatrix_cutImg0()
    {
        String file = Global.pathCombine(folder, "page1_cutDataMatrix.png");
        BarCodeReader reader = new BarCodeReader(file, DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
        //[Category("DataMatrix")]
    public void test_DataMatrix_cutImg0_edited()
    {
        String file = Global.pathCombine(folder, "page1_cutDataMatrix_edited_rotated.png");
        BarCodeReader reader = new BarCodeReader(file, DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_AllSupportedTypes_img1()
    {
        String file = Global.pathCombine(folder, "img1.png");
        BarCodeReader reader = new BarCodeReader(file);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }
}
