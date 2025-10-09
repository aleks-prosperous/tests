package com.aspose.external.barcode.tester.recognition;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RecognitionDataMatrixReadOnly
{

    private String _folder;

        @BeforeMethod
    public void SetupTestFixture()
    {
        this._folder = Global.getTestDataFolder("Recognition\\DataMatrix");
        com.aspose.barcode.LicenseAssistant.setupLicense();
    }

        @Test
        //[Category("DataMatrix")]
    public void test_qrcode_png_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "qrcode.png"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
        //[Category("DataMatrix")]
    public void test_AsposeLogo_png_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "AsposeLogo.png"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
        //[Category("DataMatrix")]
    public void test_color_000099_abc_bmp_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "color_000099_abc.bmp"), DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("abc", reader.getFoundBarCodes()[0].getCodeText());
    }

        @Test
        //[Category("DataMatrix")]
    public void test_Errors_abc_error3_png_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Errors\\abc_error3.png"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }
}
