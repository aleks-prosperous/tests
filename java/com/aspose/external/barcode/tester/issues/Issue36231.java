package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

public class Issue36231
{
    private final String folder = Global.getTestDataFolder("Issues");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_Issue36231_9876543210_2Errors_png_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36231\\9876543210_2Errors.png"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("9876543210", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertTrue(reader.getFoundBarCodes()[0].getCodeType().containsAny(DecodeType.AZTEC));
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_Issue36231_Aztec3d_AaBbCc_1Error_png_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36231\\Aztec3d_AaBbCc_1Error.png"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("AaBbCc", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertTrue(reader.getFoundBarCodes()[0].getCodeType().containsAny(DecodeType.AZTEC));
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_Issue36231_compact_987digits_2Errors_png_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36231\\compact_987digits_2Errors.png"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("98765432109876543210", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertTrue(reader.getFoundBarCodes()[0].getCodeType().containsAny(DecodeType.AZTEC));
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_Issue36231_compact_alphabet_2Errors_png_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36231\\compact_alphabet_2Errors.png"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertTrue(reader.getFoundBarCodes()[0].getCodeType().containsAny(DecodeType.AZTEC));
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_Issue36231_compact_alphabet2_2Errors_png_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36231\\compact_alphabet2_2Errors.png"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertTrue(reader.getFoundBarCodes()[0].getCodeType().containsAny(DecodeType.AZTEC));
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_Issue36231_longalphabet_1Error_png_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36231\\longalphabet_1Error.png"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZABC" +
                    "DEFGHIJKLMNOPQRSTUV", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertTrue(reader.getFoundBarCodes()[0].getCodeType().containsAny(DecodeType.AZTEC));
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_Issue36231_longalphabet_2Errors_png_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36231\\longalphabet_2Errors.png"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZABC" +
                    "DEFGHIJKLMNOPQRSTUV", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertTrue(reader.getFoundBarCodes()[0].getCodeType().containsAny(DecodeType.AZTEC));
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_Issue36231_longalphabet_3Errors_png_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36231\\longalphabet_3Errors.png"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZABC" +
                    "DEFGHIJKLMNOPQRSTUV", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertTrue(reader.getFoundBarCodes()[0].getCodeType().containsAny(DecodeType.AZTEC));
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_Issue36231_longalphabet2_1Error_png_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36231\\longalphabet2_1Error.png"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZABC" +
                    "DEFGHIJKLMNOPQRSTUV", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertTrue(reader.getFoundBarCodes()[0].getCodeType().containsAny(DecodeType.AZTEC));
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_Issue36231_longalphabet2_3Errors_png_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36231\\longalphabet2_3Errors.png"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZABC" +
                    "DEFGHIJKLMNOPQRSTUV", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertTrue(reader.getFoundBarCodes()[0].getCodeType().containsAny(DecodeType.AZTEC));
        }
    }
}
