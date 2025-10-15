package com.aspose.external.barcode.tester.releases.v76;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class
Issue34332
{

    final String folder = Global.getTestDataFolder("Issues");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
        //[Category("Code128")]
    public void test_Issue34332_Barcode128_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34332\\Barcode128.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("CC10DAF", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_Issue34332_Barcode128_png_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34332\\Barcode128.png"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("CC10DAF", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.CODE_128, reader.getFoundBarCodes()[0].getCodeType());
        }
    }
}
