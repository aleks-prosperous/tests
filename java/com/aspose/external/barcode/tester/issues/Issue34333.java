package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

public class Issue34333
{
    private final String folder = Global.getTestDataFolder("Issues");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

        @Test
        //[Category("MaxiCode")]
    public void test_Issue34333_maxicode_codesetC_png_MaxiCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34333\\maxicode_codesetC.png"), DecodeType.MAXI_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("ÀÁÂÙÚÜ¾", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("MaxiCode")]
    public void test_Issue34333_maxicode_codesetD_png_MaxiCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34333\\maxicode_codesetD.png"), DecodeType.MAXI_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("àáú¡¨", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("MaxiCode")]
    public void test_Issue34333_maxicode_codesetE_png_MaxiCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34333\\maxicode_codesetE.png"), DecodeType.MAXI_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("\0¶", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("MaxiCode")]
    public void test_Issue34333_maxicode_mode2_png_MaxiCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34333\\maxicode_mode2.png"), DecodeType.MAXI_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("[)>01961523828028400011Z00004951UPSN06X61015912345671/1Y634ALPHA DRIVEPITTSBURGHPAD", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("MaxiCode")]
    public void test_Issue34333_maxicode_mode3_1_png_MaxiCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34333\\maxicode_mode3_1.png"), DecodeType.MAXI_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("[)>0196ABC1238400011Z00004951UPSN06X610D", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("MaxiCode")]
    public void test_Issue34333_maxicode_mode3_2_png_MaxiCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34333\\maxicode_mode3_2.png"), DecodeType.MAXI_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("   CBA8400011Z00004951UPSN06X610D", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("MaxiCode")]
    public void test_Issue34333_maxicode_mode4_1_png_MaxiCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34333\\maxicode_mode4_1.png"), DecodeType.MAXI_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("MaxiCode (19 chars)", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("MaxiCode")]
    public void test_Issue34333_maxicode_mode4_2_png_MaxiCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34333\\maxicode_mode4_2.png"), DecodeType.MAXI_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123456789", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("MaxiCode")]
    public void test_Issue34333_maxicode_mode5_png_MaxiCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34333\\maxicode_mode5.png"), DecodeType.MAXI_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("ABC0123_Maxicode_mode5", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("MaxiCode")]
    public void test_Issue34333_maxicode_mode6_2_png_MaxiCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34333\\maxicode_mode6_2.png"), DecodeType.MAXI_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("abcXYZ", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("MaxiCode")]
    public void test_Issue34333_maxicode_mode6_3_png_MaxiCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34333\\maxicode_mode6_3.png"), DecodeType.MAXI_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
