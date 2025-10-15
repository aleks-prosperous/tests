package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


/**
 * <p>
 * Tests Issue34109 tests. Can't recognize Ean13 code from the JPG image
 * </p>
 */
@Test(description = "Tests for Issue34109.")
public class Issue34109
{
    /**
     * <p>
     * Path to generatedFolder with files for testing.
     * </p>
     */
    private static final String folder = Global.getTestDataFolder("Issues/Issue34109");

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
     * Test with LineCodesResoration filter
     * </p>
     */
    @Test
    public void testEAN13()
    {
        String filename = "IMG_3297B.JPG";
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(folder, filename), DecodeType.EAN_13);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("9502930970084", reader.getFoundBarCodes()[0].getCodeText());
    }
}

