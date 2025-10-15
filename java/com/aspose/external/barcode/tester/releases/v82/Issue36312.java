package com.aspose.external.barcode.tester.releases.v82;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Issue36312
{
    final String folder = Global.getTestDataFolder("Issues/Issue36312");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void test_Issue36312_00000013F_tif_DutchKIX()
    {
         BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "00000013F.tif"), DecodeType.DUTCH_KIX);
        //no fakes now
        Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
    }
}
