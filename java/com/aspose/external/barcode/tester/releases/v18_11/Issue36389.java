package com.aspose.external.barcode.tester.releases.v18_11;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.MultyDecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

public class Issue36389
{
    /// <summary>
    /// Path to folder with files for testing Issue36389.
    /// </summary>
    private final static String folder = Global.getTestDataFolder("Issues\\Issue36389");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
        @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    /// <summary>
    /// Tests recogntion with symbology.
    /// </summary>
        @Test
    public void test_Distort_aabbccQRDistort()
    {
        String fileName = Global.pathCombine(folder, "Distort_aabbccQRDistort.png");
        BarCodeReader reader = new BarCodeReader(fileName, new MultyDecodeType(DecodeType.QR, DecodeType.GS_1_QR));
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("AaBbCc", reader.getFoundBarCodes()[0].getCodeText());
    }

    /// <summary>
    /// Tests recogntion with All Supported symbologies.
    /// </summary>
        @Test
    public void test_Distort_aabbccQRDistort_cut()
    {
        String fileName = Global.pathCombine(folder, "Distort_aabbccQRDistort.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("AaBbCc", reader.getFoundBarCodes()[0].getCodeText());
    }
}
