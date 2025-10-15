package com.aspose.external.barcode.tester.releases.v21_7;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

public class Issue37808
{
    /// <summary>
    /// Path to folder with files for testing Issue37808.
    /// </summary>
    private final static String Folder = Global.getTestDataFolder("Issues/Issue37808");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test_RecognizeQRFull()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "qr_failed.png"), DecodeType.QR);
        {
            Assert.assertEquals(1, reader.readBarCodes().length, "QR was not recognized");
            Assert.assertEquals(DecodeType.QR, reader.getFoundBarCodes()[0].getCodeType());
            Assert.assertEquals("Vendor<|>01-21043358-03T<|>Abstractor Search<|>2889<|>1635851", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
    @Test
    public void test_RecognizeQRCut()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "qr_failed_cut.png"), DecodeType.QR);
        {
            Assert.assertEquals(1, reader.readBarCodes().length, "QR was not recognized");
            Assert.assertEquals(DecodeType.QR, reader.getFoundBarCodes()[0].getCodeType());
            Assert.assertEquals("Vendor<|>01-21043358-03T<|>Abstractor Search<|>2889<|>1635851", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
