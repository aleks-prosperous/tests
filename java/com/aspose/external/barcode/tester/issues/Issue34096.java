package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


/**
 * <p>
 * Tests Issue34096 tests. Optimize the speed of recognition from the multipage tiff file format
 * </p>
 */
@Test(description = "Tests for Issue34096.")
public class Issue34096
{
    /**
     * <p>
     * Path to generatedFolder with files for testing.
     * </p>
     */
    private static final String folder = Global.getTestDataFolder("Issues/Issue34096");

    /**
     * <p>
     * Prepares to run these tests.
     * </p>
     */
    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    /**
     * <p>
     * Test picture with big and small barcodes
     * </p>
     */
    @Test
    public void testBigSmallCodes()
    {
        String path = Global.pathCombine(folder, "big_small_resaved.png");
        BarCodeReader reader = new BarCodeReader(path, DecodeType.CODE_128);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
        reader.readBarCodes();

        Assert.assertEquals(reader.readBarCodes().length, 5);
        Assert.assertEquals("EASYAPANEXO", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals("EASYAPANEXO", reader.getFoundBarCodes()[1].getCodeText());
        Assert.assertEquals("ABC-abc-1234", reader.getFoundBarCodes()[2].getCodeText());
        Assert.assertEquals("EASYAPANEXO", reader.getFoundBarCodes()[3].getCodeText());
        Assert.assertEquals("EASYAPANEXO", reader.getFoundBarCodes()[4].getCodeText());
    }
}


