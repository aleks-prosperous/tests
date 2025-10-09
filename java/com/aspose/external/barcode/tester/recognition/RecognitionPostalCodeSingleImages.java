package com.aspose.external.barcode.tester.recognition;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.ChecksumValidation;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RecognitionPostalCodeSingleImages
{

    private String _folder;

        @BeforeMethod
    public void SetupTestFixture()
    {
        this._folder = Global.getTestDataFolder("Recognition\\PostalCodes");
        com.aspose.barcode.LicenseAssistant.setupLicense();
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_AustraliaPost_1_png_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "AustraliaPost_1.png"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1111223344", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_AustraliaPost_2_png_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "AustraliaPost_2.png"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1132393084", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_OneCode_1_png_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "OneCode_1.png"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("11223344000000123456789012345", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_OneCode_2_png_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "OneCode_2.png"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("01234567094987654321", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_Postnet_1_png_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Postnet_1.png"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.ON);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("5", reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum());
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_RM4SCC_1_png_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "RM4SCC_1.png"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.ON);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("258369AA", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("0", reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum());
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_RM4SCC_2_png_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "RM4SCC_2.png"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.ON);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("347AS3ED", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("Z", reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum());
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_Postnet_2_png_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Postnet_2.png"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.ON);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("3473", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("3", reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum());
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_Planet_1_png_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Planet_1.png"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.ON);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("7782443", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("5", reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum());
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_Planet_2_png_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Planet_2.png"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.ON);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("98765", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("5", reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum());
        }
    }
}
