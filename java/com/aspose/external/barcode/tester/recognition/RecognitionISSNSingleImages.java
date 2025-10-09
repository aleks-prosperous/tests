package com.aspose.external.barcode.tester.recognition;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RecognitionISSNSingleImages
{

    private String _folder;

        @BeforeMethod
    public void SetupTestFixture()
    {
        this._folder = Global.getTestDataFolder("Recognition\\ISSN");
        com.aspose.barcode.LicenseAssistant.setupLicense();
    }

        @Test
        //[Category("ISSN")]
    public void test_12345679_gif_ISSN()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "12345679.gif"), DecodeType.ISSN);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345679", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ISSN")]
    public void test_issn_22_gif_ISSN()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "issn_22.gif"), DecodeType.ISSN);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345679", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ISSN")]
    public void test_03178471_png_ISSN()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "03178471.png"), DecodeType.ISSN);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("03178471", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ISSN")]
    public void test_issnbarcode_png_ISSN()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "issn-barcode.png"), DecodeType.ISSN);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("24965529", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ISSN")]
    public void test_0317834X_png_ISSN()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "0317834X.png"), DecodeType.ISSN);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("0317834X", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_ean971147396801_png_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ean971147396801.png"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("9711473968018", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertTrue(reader.getFoundBarCodes()[0].getCodeType().containsAny(DecodeType.EAN_13));
        }
    }
}
