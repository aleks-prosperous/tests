package com.aspose.external.barcode.tester.releases.v19_12;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarcodeQualityMode;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Issue37034
{
    /// <summary>
    /// Path to folder with files for testing Issue37034.
    /// </summary>
    private static final String folder = Global.getIssuesTestImagePath("Issue37034");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
        @BeforeMethod
    public void SetUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
    public void test_varcode10()
    {
        String fileName = Global.pathCombine(folder, "varcod10.jpeg");
        BarCodeReader barcodeReader = new BarCodeReader(fileName, DecodeType.UPCA, DecodeType.EAN_13);
        {
            Assert.assertEquals(barcodeReader.readBarCodes().length, 1);
            Assert.assertTrue(barcodeReader.getFoundBarCodes()[0].getCodeText().startsWith("3160006008"));
        }
    }

        @Test
    public void test_varcode1()
    {
        String fileName = Global.pathCombine(folder, "varcode1.jpeg");
        BarCodeReader barcodeReader = new BarCodeReader(fileName, DecodeType.UPCA, DecodeType.EAN_13);
        {
            barcodeReader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
            Assert.assertEquals(barcodeReader.readBarCodes().length, 1);
            Assert.assertTrue(barcodeReader.getFoundBarCodes()[0].getCodeText().startsWith("3040030260"));
        }
    }

    @Test(enabled = false)
    public void test_varcode2()
    {
        String fileName = Global.pathCombine(folder, "varcode2.jpeg");
        BarCodeReader barcodeReader = new BarCodeReader(fileName, DecodeType.UPCA, DecodeType.EAN_13);
        {
            barcodeReader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
            Assert.assertEquals(barcodeReader.readBarCodes().length, 1);
            Assert.assertTrue(barcodeReader.getFoundBarCodes()[0].getCodeText().startsWith("3040030260"));
        }
    }

        @Test
    public void test_varcode3()
    {
        String fileName = Global.pathCombine(folder, "varcode3.jpeg");
        BarCodeReader barcodeReader = new BarCodeReader(fileName, DecodeType.UPCA, DecodeType.EAN_13);
        {
            barcodeReader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
            Assert.assertEquals(barcodeReader.readBarCodes().length, 1);
            Assert.assertTrue(barcodeReader.getFoundBarCodes()[0].getCodeText().startsWith("3040030260"));
        }
    }

        @Test
    public void test_varcode5()
    {
        String fileName = Global.pathCombine(folder, "varcode5.jpeg");
        BarCodeReader barcodeReader = new BarCodeReader(fileName, DecodeType.UPCA, DecodeType.EAN_13);
        {
            barcodeReader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
            Assert.assertEquals(barcodeReader.readBarCodes().length, 1);
            Assert.assertTrue(barcodeReader.getFoundBarCodes()[0].getCodeText().startsWith("3160006008"));
        }
    }

        @Test
    public void test_varcode6()
    {
        String fileName = Global.pathCombine(folder, "varcode6.jpeg");
        BarCodeReader barcodeReader = new BarCodeReader(fileName, DecodeType.UPCA, DecodeType.EAN_13);
        {
            Assert.assertEquals(barcodeReader.readBarCodes().length, 1);
            Assert.assertTrue(barcodeReader.getFoundBarCodes()[0].getCodeText().startsWith("3040030260"));
        }
    }

        @Test
    public void test_varcode7()
    {
        String fileName = Global.pathCombine(folder, "varcode7.jpeg");
        BarCodeReader barcodeReader = new BarCodeReader(fileName, DecodeType.UPCA, DecodeType.EAN_13);
        {
            Assert.assertEquals(barcodeReader.readBarCodes().length, 2);
            Assert.assertTrue(barcodeReader.getFoundBarCodes()[0].getCodeText().startsWith("3040030260"));
            Assert.assertTrue(barcodeReader.getFoundBarCodes()[1].getCodeText().startsWith("3040030260"));
        }
    }


    @Test
    public void test_varcode8()
    {
        String fileName = Global.pathCombine(folder, "varcode8.jpeg");
        BarCodeReader barcodeReader = new BarCodeReader(fileName, DecodeType.UPCA, DecodeType.EAN_13);
        {
            barcodeReader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
            Assert.assertEquals(barcodeReader.readBarCodes().length, 1);
            Assert.assertTrue(barcodeReader.getFoundBarCodes()[0].getCodeText().startsWith("3160006008"));
        }
    }
}
