package com.aspose.external.barcode.tester.releases.v21_2;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.QualitySettings;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

public class Issue37730
{
    /// <summary>
    /// Path to folder with files for testing issue 37730.
    /// </summary>
    private final static String Folder = Global.getTestDataFolder("Issues\\Issue37730");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void SetUp()
    {
        LicenseAssistant.setupLicense();
    }

    /// <summary>
    /// Tests recognition of image from Issue37730
    /// </summary>
    @Test
    public void test_Code128_from_UPLOAD_224551_B()
    {
        String fileName = Global.pathCombine(Folder, "UPLOAD_224551-B0.png");
        BarCodeReader reader = new BarCodeReader(fileName);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("75100-3-A2020_ECOBONUS-000373895", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.CODE_128, reader.getFoundBarCodes()[0].getCodeType());
        }
    }

    /// <summary>
    /// Tests recognition of image from Issue37730
    /// </summary>
    @Test
    public void test_Code128_from_UPLOAD_224551_D()
    {
        String fileName = Global.pathCombine(Folder, "UPLOAD_224551-D0.png");
        BarCodeReader reader = new BarCodeReader(fileName);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("43700-2-A2020_ECOBONUS-000365427", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.CODE_128, reader.getFoundBarCodes()[0].getCodeType());
        }
    }
}
