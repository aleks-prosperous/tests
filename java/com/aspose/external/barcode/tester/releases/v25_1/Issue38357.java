package com.aspose.external.barcode.tester.releases.v25_1;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.licensing.LicenseType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Issue38357
{
    /// <summary>
    /// Path to folder with files for testing Issue38357.
    /// </summary>
    private static final String Folder = Global.getTestDataFolder("Issues/Issue38357");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense(LicenseType.Total);
    }

    @Test
        // [Category("Code128")]
    public void test_Code128_FromCustomer()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "DJI_0083tag_image.jpg"), DecodeType.SSCC_18);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(00)340084000371473396", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
