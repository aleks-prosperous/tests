package com.aspose.external.barcode.tester.releases.v24_11;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.licensing.LicenseType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Issue39131
{
    final String Folder = Global.getTestDataFolder("Issues/Issue39131");
    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense(LicenseType.Total);
    }

    @Test
    public void test_LargeNoisedQR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "NonReadableQRCode_1.png"), DecodeType.QR);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("DOCUMENT_SEPARATOR", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
