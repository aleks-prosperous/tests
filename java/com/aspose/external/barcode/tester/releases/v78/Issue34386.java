package com.aspose.external.barcode.tester.releases.v78;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Issue34386
{
    final String folder = Global.getTestDataFolder("Issues/Issue34386");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void test()
    {
        BarCodeReader reader = new BarCodeReader(folder + "/generated333_400.png", DecodeType.AZTEC);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("3333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333", reader.getFoundBarCodes()[0].getCodeText());
    }
}
