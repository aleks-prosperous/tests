package com.aspose.external.barcode.tester.releases.v25_8;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.licensing.LicenseType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Issue39311
{
    final String _folder = Global.getTestDataFolder("Issues/Issue39311");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense(LicenseType.Total);
    }

    @Test
    public void test_LargeBinarizedCode39()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "code39_aom.png"),DecodeType.CODE_39);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("MOD", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
