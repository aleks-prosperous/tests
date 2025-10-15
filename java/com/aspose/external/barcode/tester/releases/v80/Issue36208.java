package com.aspose.external.barcode.tester.releases.v80;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Issue36208
{
    final String folder = Global.getTestDataFolder("Issues");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void testBarcodeBuilderRecognizer()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36208\\invasion_quiet_zone.png"), DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("424D4E4F5631354252430084D6481B209E7DFE24B633BDA1BCB8E499DAD988087585A91B1311DBD8C" +
                "C82", reader.getFoundBarCodes()[0].getCodeText());
    }
}
