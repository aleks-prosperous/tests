package com.aspose.external.barcode.tester.releases.v21_6;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

public class Issue37783
{
    /// <summary>
    /// Path to folder with files for testing Issue37762.
    /// </summary>
    private final static String Folder = Global.getTestDataFolder("Issues\\Issue37783");

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
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "extracted_image.png"), DecodeType.QR);
        {
            Assert.assertEquals(1, reader.readBarCodes().length, "QR was not recognized");
            Assert.assertEquals(DecodeType.QR, reader.getFoundBarCodes()[0].getCodeType());
            Assert.assertEquals("Vendor<|>01-21042807-01S<|>Abstractor Search<|>2889<|>1634988", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_RecognizeQRCut()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "barcode_cut.png"), DecodeType.QR);
        {
            Assert.assertEquals(1, reader.readBarCodes().length, "QR was not recognized");
            Assert.assertEquals(DecodeType.QR, reader.getFoundBarCodes()[0].getCodeType());
            Assert.assertEquals("Vendor<|>01-21042807-01S<|>Abstractor Search<|>2889<|>1634988", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
