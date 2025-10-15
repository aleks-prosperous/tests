package com.aspose.external.barcode.tester.releases.v25_1;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.QualitySettings;
import com.aspose.barcode.licensing.LicenseType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Issue38552
{
    /// <summary>
    /// Path to folder with files for testing Issue38552.
    /// </summary>
    private String Folder = Global.getTestDataFolder("Issues/Issue38552");

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
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "1.png"), DecodeType.GS_1_CODE_128);
        {
            reader.setQualitySettings(QualitySettings.getHighQuality());
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)07630971257467(17)270928(10)2218850", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
        // [Category("GS1Code128")]
    public void test_GS1Code128_HighResolution()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "2.png"), DecodeType.GS_1_CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)07630971257467(17)270928(10)2218850", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
