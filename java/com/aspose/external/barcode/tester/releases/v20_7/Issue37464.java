package com.aspose.external.barcode.tester.releases.v20_7;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

public class Issue37464
{
    /// <summary>
    /// Path to folder with files for testing Issue37464.
    /// </summary>
    private String Folder = Global.getTestDataFolder("issues\\Issue37464");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test_that_no_fakes_are_found()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "asposenet_648_src1.png"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            BarCodeResult[] barcodes = reader.readBarCodes();
            Assert.assertEquals(0, barcodes.length);
        }
    }
}
