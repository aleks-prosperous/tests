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
 * Tests Issue34112 tests.
 * </p>
 */
@Test(description = "Tests for Issue34112.")
public class Issue34112
{
    /**
     * <p>
     * Path to generatedFolder with files for testing.
     * </p>
     */
    private static final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue34112");

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
     * Test image got from the pdf file with BarcodeOptimization = true
     * and with Resolution 300.
     * </p>
     */
    @Test
    public void testImage()
    {
        String filename = "Scann_001_219592.png";
        String path = Global.pathCombine(folder, filename);

        final BarCodeReader reader = new BarCodeReader(path,
                DecodeType.CODE_39, DecodeType.CODE_39_FULL_ASCII);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        reader.getQualitySettings().setAllowIncorrectBarcodes(true);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("00100  MAN000507532090215000007742", reader.getFoundBarCodes()[0].getCodeText());
    }
}

