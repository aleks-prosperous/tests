package com.aspose.external.barcode.tester.recognition;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RecognitionCode39StandardSingleImages
{

    private String _folder;

        @BeforeMethod
    public void SetupTestFixture()
    {
        this._folder = Global.getTestDataFolder("Recognition\\Code39Standard");
        com.aspose.barcode.LicenseAssistant.setupLicense();
    }

        @Test
        //[Category("Code39Standard")]
    public void test_00_png_Code39Standard()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "00.png"), DecodeType.CODE_39);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("00", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code39Standard")]
    public void test_11_png_Code39Standard()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "11.png"), DecodeType.CODE_39);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("11", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code39Standard")]
    public void test_22_png_Code39Standard()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "22.png"), DecodeType.CODE_39);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("22", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code39Standard")]
    public void test_33_png_Code39Standard()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "33.png"), DecodeType.CODE_39);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("33", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code39Standard")]
    public void test_44_png_Code39Standard()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "44.png"), DecodeType.CODE_39);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("44", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code39Standard")]
    public void test_55_png_Code39Standard()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "55.png"), DecodeType.CODE_39);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("55", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code39Standard")]
    public void test_01234567892_png_Code39Standard()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "01234567892.png"), DecodeType.CODE_39);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("01234567892", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code39Standard")]
    public void test_ABCDEFGHIJKLMNOPQRSTUVWXYZQ_png_Code39Standard()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ABCDEFGHIJKLMNOPQRSTUVWXYZQ.png"), DecodeType.CODE_39);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("ABCDEFGHIJKLMNOPQRSTUVWXYZQ", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code39Standard")]
    public void test_SpecSymbols_png_Code39Standard()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "SpecSymbols.png"), DecodeType.CODE_39);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("-.$/+% F", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code39Standard")]
    public void test__png_Code39Standard()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "--.png"), DecodeType.CODE_39);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("--", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code39Standard")]
    public void test_dot_png_Code39Standard()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "dot.png"), DecodeType.CODE_39);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("..", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code39Standard")]
    public void test_dollar_png_Code39Standard()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "dollar.png"), DecodeType.CODE_39);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("$$", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code39Standard")]
    public void test_AllSymbols_png_Code39Standard()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "AllSymbols.png"), DecodeType.CODE_39);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ-.$/+% 0", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
