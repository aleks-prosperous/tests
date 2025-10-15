package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

public class Issue34388_SingleImage
{

    private String _folder = Global.getTestDataFolder("Issues");


    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

        @Test
        
    public void test_Issue34388_Aztec_012345678901234567890123456789_Rotated_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue34388\\Aztec_012345678901234567890123456789_Rotated.png"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("012345678901234567890123456789", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Issue34388_Aztec_AAAAAA_Rotated_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue34388\\Aztec_AAAAAA_Rotated.png"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Issue34388_Aztec_AaBbCc_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue34388\\Aztec_AaBbCc.png"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("AaBbCc", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Issue34388_Aztec_AaBbCc_Rotated_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue34388\\Aztec_AaBbCc_Rotated.png"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("AaBbCc", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Issue34388_Aztec_ABCDEF_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue34388\\Aztec_ABCDEF.png"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("ABCDEF", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Issue34388_Aztec_ABCDEF_Rotated_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue34388\\Aztec_ABCDEF_Rotated.png"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("ABCDEF", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
