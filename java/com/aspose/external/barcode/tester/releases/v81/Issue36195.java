package com.aspose.external.barcode.tester.releases.v81;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Issue36195
{
    final String folder = Global.getTestDataFolder("Issues");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
        //[Category("Aztec")]
    public void test_Issue36195_badRs_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36195\\badRs.png"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("AaBbCc", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Aztec")]
    public void test_Issue36195_badRs_png_Aztec2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36195\\badRs.png"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("AaBbCc", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
