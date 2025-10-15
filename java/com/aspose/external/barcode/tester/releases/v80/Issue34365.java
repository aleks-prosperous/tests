package com.aspose.external.barcode.tester.releases.v80;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Issue34365
{
    final String folder = Global.getTestDataFolder("Issues");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
        //[Category("DutchKIX")]
    public void test_Issue34365_dutchKix1_png_DutchKIX()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34365\\dutchKix1.png"), DecodeType.DUTCH_KIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("258369AA", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DutchKIX")]
    public void test_Issue34365_dutchKix2_png_DutchKIX()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34365\\dutchKix2.png"), DecodeType.DUTCH_KIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("347AS3ED", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DutchKIX")]
    public void test_Issue34365_dutchKix3_png_DutchKIX()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34365\\dutchKix3.png"), DecodeType.DUTCH_KIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123ABCDEF", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DutchKIX")]
    public void test_Issue34365_dutchKix4_png_DutchKIX()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34365\\dutchKix4.png"), DecodeType.DUTCH_KIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("TEST123", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
