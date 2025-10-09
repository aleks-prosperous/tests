package com.aspose.external.barcode.tester.recognition;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RecognitionISBNSingle
{

    private String _folder;

        @BeforeMethod
    public void SetupTestFixture()
    {
        this._folder = Global.getTestDataFolder("Recognition\\ISBN");
        com.aspose.barcode.LicenseAssistant.setupLicense();
    }

        @Test
        //[Category("ISBN")]
    public void test_barcode_bookland_048663926_ex1_png_ISBN()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "barcode_bookland_048663926_ex1.png"), DecodeType.ISBN);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("9780486639260", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_isbn_3_gif_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "isbn_3.gif"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("9783161484100", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertTrue(reader.getFoundBarCodes()[0].getCodeType().containsAny(DecodeType.ISBN, DecodeType.EAN_13));
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_978156592479_png_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "978-1-56592-479.png"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 2);
            Assert.assertEquals("9781565924796", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertTrue(reader.getFoundBarCodes()[0].getCodeType().containsAny(DecodeType.ISBN, DecodeType.EAN_13));
            Assert.assertEquals("54495", reader.getFoundBarCodes()[1].getCodeText());
            Assert.assertTrue(reader.getFoundBarCodes()[1].getCodeType().containsAny(DecodeType.SUPPLEMENT));
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_ISBN17x31_jpg_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ISBN 17x31.jpg"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("9781234567897", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertTrue(reader.getFoundBarCodes()[0].getCodeType().containsAny(DecodeType.ISBN, DecodeType.EAN_13));
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_978316148410_png_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "978-3-16-148410.png"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("9783161484100", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertTrue(reader.getFoundBarCodes()[0].getCodeType().containsAny(DecodeType.ISBN, DecodeType.EAN_13));
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_SelectBarcodeISBNBarcode_jpg_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Select-Barcode-ISBN-Barcode.jpg"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("9780111112229", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertTrue(reader.getFoundBarCodes()[0].getCodeType().containsAny(DecodeType.ISBN, DecodeType.EAN_13));
        }
    }

        @Test
        //[Category("ISMN")]
    public void test_979817525766_png_ISMN()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "979-81-7525-766.png"), DecodeType.ISMN);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("9798175257664", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertTrue(reader.getFoundBarCodes()[0].getCodeType().containsAny(DecodeType.ISMN, DecodeType.EAN_13));
        }
    }

        @Test
        //[Category("ISMN")]
    public void test_9793161484109_png_ISMN()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "9793161484109.png"), DecodeType.ISMN);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("9793161484109", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertTrue(reader.getFoundBarCodes()[0].getCodeType().containsAny(DecodeType.ISMN, DecodeType.EAN_13));
        }
    }
}
