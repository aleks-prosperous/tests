package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.ChecksumValidation;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


/**
 * <p>
 * Tests Issue34104 tests. Incorrect recognition of Code128 code from the tif image
 * </p>
 */
@Test(description = "Tests for Issue34104.")
public class Issue34104
{
    /**
     * <p>
     * Path to generatedFolder with files for testing.
     * </p>
     */
    private static final String folder = Global.getTestDataFolder("Issues/Issue34104");

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
     * Test with barcode read type Code128 and with checksum validation
     * </p>
     */
    @Test
    public void testCode128WithChecksumValidation()
    {
        String filename = "3049355.TIF";
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(folder, filename), DecodeType.CODE_128);
        reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.ON);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("3049355", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals(19, reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum().charAt(0));
    }
}

