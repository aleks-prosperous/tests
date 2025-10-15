package com.aspose.external.barcode.tester.releases.v76;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Issue34287
{
    final String folder = Global.getTestDataFolder("Issues");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
        //[Category("DataMatrix")]
    public void test_Issue34287_Laser2_png_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34287\\Laser2.png"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("D19-WQ9-F91046-0811", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DataMatrix")]
    public void test_Issue34287_Laser2_png_DataMatrix2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34287\\Laser2.png"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("D19-WQ9-F91046-0811", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
