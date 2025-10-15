package com.aspose.external.barcode.tester.releases.v21_4;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

public class Issue37762
{
    /// <summary>
    /// Path to folder with files for testing Issue37762.
    /// </summary>
    private final static String Folder = Global.getTestDataFolder("Issues/Issue37762");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void SetUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test_MaxiCode_Image()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "maxicode_not_recognized.png"), DecodeType.MAXI_CODE);
        BarCodeResult[] res = reader.readBarCodes();

        Assert.assertEquals(1, res.length);
        Assert.assertEquals("ÜÝÞßàáâãäåæçèéêëìíîï", res[0].getCodeText());
    }
}
