package com.aspose.external.barcode.tester.releases.v25_1;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.QualitySettings;
import com.aspose.barcode.licensing.LicenseType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Issue39093
{
    /// <summary>
    /// Path to folder with files for testing Issue39093.
    /// </summary>
    private static final String Folder = Global.getTestDataFolder("Issues/Issue39093");

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
    public void test_Code128_FalsePositive()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "barcode_and_background_rasterized_alt.png.trimmed.png"), DecodeType.CODE_128);
        {
            reader.setQualitySettings(QualitySettings.getHighQuality());
            Assert.assertEquals(reader.readBarCodes().length, 0, "False is ok");
        }
    }
}
