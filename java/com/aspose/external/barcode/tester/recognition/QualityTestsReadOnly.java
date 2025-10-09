package com.aspose.external.barcode.tester.recognition;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class QualityTestsReadOnly
{

    private String _folder;

        @BeforeMethod
    public void SetupTestFixture()
    {
        this._folder = Global.getTestDataFolder("");
        com.aspose.barcode.LicenseAssistant.setupLicense();
    }

        @Test
        //[Category("Code39Extended_Code39Standard")]
    public void test_QualityValidation_Code39_images3_jpg_Code39Extended_Code39Standard()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\Code39\\images3.jpg"), DecodeType.scanSets(DecodeType.CODE_39_FULL_ASCII, DecodeType.CODE_39));
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
        //[Category("Code39Extended_Code39Standard")]
    public void test_QualityValidation_Code39_images4_jpg_Code39Extended_Code39Standard()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\Code39\\images4.jpg"), DecodeType.scanSets(DecodeType.CODE_39_FULL_ASCII, DecodeType.CODE_39));
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
        //[Category("Code39Extended_Code39Standard")]
    public void test_QualityValidation_Code39_images6_jpg_Code39Extended_Code39Standard()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\Code39\\images6.jpg"), DecodeType.scanSets(DecodeType.CODE_39_FULL_ASCII, DecodeType.CODE_39));
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
        //[Category("Code39Extended_Code39Standard")]
    public void test_QualityValidation_Code39_images7_jpg_Code39Extended_Code39Standard()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\Code39\\images7.jpg"), DecodeType.scanSets(DecodeType.CODE_39_FULL_ASCII, DecodeType.CODE_39));
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
        //[Category("Code39Extended_Code39Standard")]
    public void test_QualityValidation_Code39_images9_jpg_Code39Extended_Code39Standard()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\Code39\\images9.jpg"), DecodeType.scanSets(DecodeType.CODE_39_FULL_ASCII, DecodeType.CODE_39));
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
        //[Category("Code128")]
    public void test_QualityValidation_Code128_images2_jpg_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\Code128\\images2.jpg"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
        //[Category("Code128")]
    public void test_QualityValidation_Code128_images4_jpg_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\Code128\\images4.jpg"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
        //[Category("Code128")]
    public void test_QualityValidation_Code128_images6_jpg_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\Code128\\images6.jpg"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
        //[Category("EAN13")]
    public void test_QualityValidation_EAN13_images3_jpg_EAN13()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\EAN13\\images3.jpg"), DecodeType.EAN_13);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
        //[Category("EAN13")]
    public void test_QualityValidation_EAN13_images7_jpg_EAN13()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\EAN13\\images7.jpg"), DecodeType.EAN_13);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
        //[Category("EAN13")]
    public void test_QualityValidation_EAN13_images8_jpg_EAN13()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\EAN13\\images8.jpg"), DecodeType.EAN_13);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
        //[Category("QR")]
    public void test_QualityValidation_QR_images3_jpg_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\QR\\images3.jpg"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
        //[Category("QR")]
    public void test_QualityValidation_QR_images10_jpg_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\QR\\images10.jpg"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
        //[Category("DataMatrix")]
    public void test_QualityValidation_DataMatrix_images8_jpg_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\DataMatrix\\images8.jpg"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("http://www.aipsys.com", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
