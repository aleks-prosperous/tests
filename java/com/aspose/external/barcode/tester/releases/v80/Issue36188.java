package com.aspose.external.barcode.tester.releases.v80;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarcodeQualityMode;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Issue36188
{
    final String folder = Global.getTestDataFolder("Issues");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
        //[Category("Aztec")]
    public void test_Issue36188_azteccodeinstein_jpg_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36188\\aztec-code-in-stein.jpg"), DecodeType.AZTEC);
        {
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("www.8qr.de/123aq", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
