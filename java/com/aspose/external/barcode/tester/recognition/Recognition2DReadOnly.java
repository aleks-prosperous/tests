package com.aspose.external.barcode.tester.recognition;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Recognition2DReadOnly
{

    private String _folder;

        @BeforeMethod
    public void SetupTestFixture()
    {
        this._folder = Global.getTestDataFolder("Recognition\\2D\\");
        com.aspose.barcode.LicenseAssistant.setupLicense();
    }

        @Test
        //[Category("Aztec")]
    public void test_Aztec_image001_gif_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Aztec\\image001.gif"), DecodeType.AZTEC);
        reader.getQualitySettings().setDeconvolution(DeconvolutionMode.SLOW);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("Mary had a Little Lamb, with Fleece as White as Snow, and Everywhere that Mary went, the Lamb was Sure to Go!", reader.getFoundBarCodes()[0].getCodeText());
    }

        @Test
        //[Category("Aztec")]
    public void test_Aztec_reader_jpg_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Aztec\\reader.jpg"), DecodeType.AZTEC);
        reader.setQualitySettings(QualitySettings.getHighQuality());
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("Test code", reader.getFoundBarCodes()[0].getCodeText());
    }

        @Test
        //[Category("Aztec")]
    public void test_Aztec_288uw55_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Aztec\\288uw55.png"), DecodeType.AZTEC);
        reader.setQualitySettings(QualitySettings.getHighQuality());
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("MJOUSSEN", reader.getFoundBarCodes()[0].getCodeText());
    }

        @Test
        //[Category("Aztec")]
    public void test_Aztec_azteccode_jpg_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Aztec\\aztec-code.jpg"), DecodeType.AZTEC);
        reader.setQualitySettings(QualitySettings.getHighQuality());

        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("0235169882", reader.getFoundBarCodes()[0].getCodeText());
        //Assert.AreEqual("0235169882", reader.FoundBarCodes[1].CodeText);
    }

        @Test
        //[Category("Aztec")]
    public void test_Aztec_thumb1348b_gif_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Aztec\\thumb-1348b.gif"), DecodeType.AZTEC);
        reader.getQualitySettings().setComplexBackground(ComplexBackgroundMode.ENABLED);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("1234567890", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void Test_MicroPDF417_microp3_gif_MicroPdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "MicroPDF417\\microp3.gif"), DecodeType.MICRO_PDF_417);
        {
            //the MicroPdf417 cannot be recognized with noone engine and has too low quality
            //the fake recognition was fixed
            Assert.assertEquals(reader.readBarCodes().length, 0);
        }
    }

        @Test
        //[Category("MicroPdf417")]
    public void test_MicroPDF417_SA315_MicroPDF417_jpg_MicroPdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "MicroPDF417\\SA315_MicroPDF417.jpg"), DecodeType.MICRO_PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
        //[Category("MicroPdf417")]
    public void test_MicroPDF417_micro_pdf417_2D_barcode_label_jpg_MicroPdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "MicroPDF417\\micro_pdf417_2D_barcode_label.jpg"), DecodeType.MICRO_PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
        //[Category("QR")]
    public void test_QR_qrTatto_jpg_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QR\\qrTatto.jpg"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }
}
