package com.aspose.external.barcode.tester.releases.v78;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


@Test
public class Issue34363
{
    final String folder = Global.getTestDataFolder("Issues");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
        //[Category("Code32")]
    public void test_Issue34363_code32_1_png_Code32()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34363\\code32_1.png"), DecodeType.CODE_32);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123456788", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_Issue34363_code32_1_png_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34363\\code32_1.png"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123456788", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code32")]
    public void test_Issue34363_code32_2_png_Code32()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34363\\code32_2.png"), DecodeType.CODE_32);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("876543214", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code32")]
    public void test_Issue34363_code32_3_png_Code32()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34363\\code32_3.png"), DecodeType.CODE_32);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("111112227", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code32")]
    public void test_Issue34363_code32_4_png_Code32()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34363\\code32_4.png"), DecodeType.CODE_32);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123456788", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code32")]
    public void test_Issue34363_code32_5_png_Code32()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34363\\code32_5.png"), DecodeType.CODE_32);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("120254356", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
