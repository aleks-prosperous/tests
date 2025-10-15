package com.aspose.external.barcode.tester.releases.v16_11;

import com.aspose.barcode.auxiliary.Global;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Issue36240
{
    private final String _folder = Global.getTestDataFolder("Issues");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }


   @Test
    public void test_Issue36240_5640851241029_cmyk_jpg_UPCA()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue36240\\564085-12410-29_cmyk.jpg"), DecodeType.UPCA);
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.OFF);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("021200978159", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_Issue36240_aztec_in_cmyk_converted_jpg_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue36240\\aztec_in_cmyk_converted.jpg"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1234567890 in CMYK", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertTrue(reader.getFoundBarCodes()[0].getCodeType().containsAny(DecodeType.AZTEC));
        }
    }

    @Test
    public void test_Issue36240_aztec_in_cmyk_converted2_jpg_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue36240\\aztec_in_cmyk_converted2.jpg"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1234567890 in CMYK", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertTrue(reader.getFoundBarCodes()[0].getCodeType().containsAny(DecodeType.AZTEC));
        }
    }

    @Test
    public void test_Issue36240_datamatrix_in_cmyk_converted_tif_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue36240\\datamatrix_in_cmyk_converted.tif"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1234567890 in CMYK", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertTrue(reader.getFoundBarCodes()[0].getCodeType().containsAny(DecodeType.DATA_MATRIX));
        }
    }

    @Test
    public void test_Issue36240_generatedCmykCode39_tiff_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue36240\\generatedCmykCode39.tiff"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1234567890", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertTrue(reader.getFoundBarCodes()[0].getCodeType().containsAny(DecodeType.CODE_39));
        }
    }

    @Test
    public void test_Issue36240_generatedCmykQr_tiff_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue36240\\generatedCmykQr.tiff"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1234567890", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertTrue(reader.getFoundBarCodes()[0].getCodeType().containsAny(DecodeType.QR));
        }
    }

    @Test
    public void test_Issue36240_generatedCmykQrDpix200_tiff_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue36240\\generatedCmykQrDpix200.tiff"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1234567890", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertTrue(reader.getFoundBarCodes()[0].getCodeType().containsAny(DecodeType.QR));
        }
    }

    @Test
    public void test_Issue36240_images6_cmyk_tif_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue36240\\images6_cmyk.tif"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("CHRISTIAN", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertTrue(reader.getFoundBarCodes()[0].getCodeType().containsAny(DecodeType.DATA_MATRIX));
        }
    }

    @Test
    public void test_Issue36240_pdf417_cmyk_jpg_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue36240\\pdf417_cmyk.jpg"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("The IDII Software Newsletter provides insights and condensed news on supply chain software and delivered twice a month via e-mail.  It is free and designed for busy professionals that are involved in software for the warehouse, logistics, and the supply chain.  Go to www.idii.com/esn/index.htm to sign up.", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertTrue(reader.getFoundBarCodes()[0].getCodeType().containsAny(DecodeType.PDF_417));
        }
    }
}