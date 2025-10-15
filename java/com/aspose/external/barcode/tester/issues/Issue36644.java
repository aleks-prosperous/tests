package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.QualitySettings;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

public class Issue36644
{
    /// <summary>
    /// Path to folder with files for testing Issue36973.
    /// </summary>
    private String folder = Global.getTestDataFolder("Issues\\Issue36644");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
        @BeforeMethod
    public void SetUp()
    {
        LicenseAssistant.setupLicense();
    }

    /// <summary>
    /// Tests recogntion AllSupportedTypes.
    /// </summary>
        @Test
    public void test_DotCode_AllSupportedTypes()
    {
        String fileName = Global.pathCombine(folder, "DotCode.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("This is DotCode", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    /// <summary>
    /// Tests recogntion with symbology.
    /// </summary>
        @Test
    public void test_DotCode_DotCode()
    {
        String fileName = Global.pathCombine(folder, "DotCode.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DOT_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("This is DotCode", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
