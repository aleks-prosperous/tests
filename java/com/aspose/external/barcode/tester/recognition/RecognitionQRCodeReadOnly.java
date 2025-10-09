package com.aspose.external.barcode.tester.recognition;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RecognitionQRCodeReadOnly
{

    private String _folder;

        @BeforeMethod
    public void SetupTestFixture()
    {
        this._folder = Global.getTestDataFolder("Recognition\\QRCode");
        com.aspose.barcode.LicenseAssistant.setupLicense();
    }

        @Test
        //[Category("QR")]
    public void test_qr_error11_a_png_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "qr_error11_a.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
        //[Category("QR")]
    public void test_qr_error12_a_png_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "qr_error12_a.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
        //[Category("QR")]
    public void test_qr_error13_a_png_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "qr_error13_a.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
        //[Category("QR")]
    public void test_qr_error14_a_png_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "qr_error14_a.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
        //[Category("QR")]
    public void test_qr_error15_a_png_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "qr_error15_a.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
        //[Category("QR")]
    public void test_qr_error16_a_png_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "qr_error16_a.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
        //[Category("QR")]
    public void test_qr_error_ab_png_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "qr_error_ab.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
        //[Category("QR")]
    public void test_qr_error2_ab_png_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "qr_error2_ab.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
        //[Category("QR")]
    public void test_qr_error_b_png_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "qr_error_b.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
        //[Category("QR")]
    public void test_qr_error_abcdefghijklmnopqrstuvwxyz_png_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "qr_error_abcdefghijklmnopqrstuvwxyz.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }
}
