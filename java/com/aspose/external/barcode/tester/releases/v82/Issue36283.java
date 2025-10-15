package com.aspose.external.barcode.tester.releases.v82;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Issue36283
{
    final String folder = Global.getTestDataFolder("Issues");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void test()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36283\\2bea0d7c-2a1b-445a-90cf-15b61b53f7a1.bmp"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("AK46135U11098U118VC12080D", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
