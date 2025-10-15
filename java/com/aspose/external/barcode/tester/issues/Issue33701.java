package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.QualitySettings;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;

/**
 * <p>
 * Tests Issue33701 tests. Investigate zebra restoration algorithms
 * </p>
 */
@Test(description = "Tests for Issue33701.")
public class Issue33701
{

    /**
     * <p>
     * Path to generatedFolder with files for testing issue 33823.
     * </p>
     */
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33701");

    /**
     * <p>
     * Prepares to run these tests.
     * </p>
     */
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    /**
     * <p>
     * Tests recognition of "bad" image cutted.tif
     * </p>
     */
    @Test
    public void testSmallAngel()
    {
        String fileName = Global.pathCombine(folder, "cutted.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        {
            reader.setQualitySettings(QualitySettings.getHighQuality());
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("AZ000000393738", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    /// <summary>
    /// Tests recognition of "bad" image cutted.tif
    /// </summary>
        @Test
    public void testLongWidth()
    {
        String fileName = Global.pathCombine(folder, "scan_corrupted.png");
        BarCodeReader reader = new BarCodeReader(fileName);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("<FNC1>BOLXAB1000108418012012001U", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}

