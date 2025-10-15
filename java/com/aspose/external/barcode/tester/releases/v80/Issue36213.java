package com.aspose.external.barcode.tester.releases.v80;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Issue36213
{
    final String folder = Global.getTestDataFolder("Issues");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void test1()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36213\\300DPI2.bmp"), DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("PODD1", reader.getFoundBarCodes()[0].getCodeText());
    }
}
