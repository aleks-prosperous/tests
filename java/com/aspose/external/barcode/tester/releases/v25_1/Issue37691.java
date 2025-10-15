package com.aspose.external.barcode.tester.releases.v25_1;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.QualitySettings;
import com.aspose.barcode.licensing.LicenseType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Issue37691
{
    /// <summary>
    /// Path to folder with files for testing Issue37691.
    /// </summary>
    private String Folder = Global.getTestDataFolder("Issues/Issue37691");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense(LicenseType.Total);
    }

    @Test
        // [Category("GS1Code128")]
    public void test_GS1Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "image-croppedFrame - 0.80 MP.jpg"), DecodeType.GS_1_CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)08714729743071(17)230630(10)5844756", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
        // [Category("GS1Code128")]
    public void test_GS1Code128_HighResolution()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "image-source - 13.13 MP - Copy.jpg"), DecodeType.GS_1_CODE_128);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)08714729743071(17)230630(10)5844756", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
