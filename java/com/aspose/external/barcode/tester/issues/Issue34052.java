package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarcodeQualityMode;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * <p>
 * Tests Issue34052 tests. Code128 can't be recognized through other scanner devices
 * </p>
 */
@Test(description = "Tests for Issue34052.")
public class Issue34052
{
    /**
     * <p>
     * Path to generatedFolder with files for testing.
     * </p>
     */
    private static final String Folder = Global.getTestDataFolder("Issues/Issue34052");


    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }


    /// <summary>
    /// Tests recogntion with symbology AllSupportedTypes. `
    /// </summary>
    @Test
    public void testAllSupportedTypes()
    {
        String fileName = "img.jpg";

        String path = Global.pathCombine(Folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.ALL_SUPPORTED_TYPES);
        reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("3100281", reader.getFoundBarCodes()[0].getCodeText());
    }

    /// <summary>
    /// Tests recogntion with symbology Code128. `
    /// </summary>
    @Test
    public void testCode128()
    {
        String fileName = "img.jpg";
        String path = Global.pathCombine(Folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("3100281", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}

