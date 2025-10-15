package com.aspose.external.barcode.tester.releases.v21_7;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

public class Issue37812
{
    /// <summary>
    /// Path to folder with files for testing Issue37812.
    /// </summary>
    private final static String Folder = Global.getTestDataFolder("Issues/Issue37812");

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
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "Page1.png"), DecodeType.QR);
        BarCodeResult[] results = reader.readBarCodes();
        Assert.assertEquals(results.length, 1, "QR was not recognized");
        Assert.assertEquals(results[0].getCodeType(), DecodeType.QR);
        Assert.assertEquals(results[0].getCodeText(), "{\"SourceType\":\"Cliente\",\"SourceNo\":\"C00001\",\"SourceName\":\"Garzoni SA\",\"DocType\":\"Accordi Commerciali\",\"DocNumType\":\"Codice documento\",\"DocNum\":\"Condizioni commerciali allegato 1 - Bonus fedeltà\",\"Dept\":\"\",\"DocDate\":\"01.06.21\"}");
    }

    @Test
    public void test_RecognizeQRCut()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "qr_cut.png"), DecodeType.QR);
        BarCodeResult[] results = reader.readBarCodes();
        Assert.assertEquals(results.length, 1, "QR was not recognized");
        Assert.assertEquals(results[0].getCodeType(), DecodeType.QR);
        Assert.assertEquals(results[0].getCodeText(), "{\"SourceType\":\"Cliente\",\"SourceNo\":\"C00001\",\"SourceName\":\"Garzoni SA\",\"DocType\":\"Accordi Commerciali\",\"DocNumType\":\"Codice documento\",\"DocNum\":\"Condizioni commerciali allegato 1 - Bonus fedeltà\",\"Dept\":\"\",\"DocDate\":\"01.06.21\"}");
    }
}
