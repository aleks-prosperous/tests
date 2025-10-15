package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


/**
 * <p>
 * Issue34122 tests. Can't recognize QR code from a JPG file
 * </p>
 */
@Test(description = "Tests for Issue34122.")
public class Issue34122
{
    /**
     * <p>
     * Path to generatedFolder with files for testing.
     * </p>
     */
    private static final String folder = Global.getTestDataFolder("Issues/Issue34122");

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
     * Main test
     * </p>
     */
    @Test
    public void testQR()
    {
        String filename = "Error.jpg";
        String path = Global.pathCombine(folder, filename);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("0GNS73BR100", reader.getFoundBarCodes()[0].getCodeText());
    }

    /**
     * <p>
     * Test cutted image
     * </p>
     */
    @Test
    public void testQRCutted()
    {
        String filename = "Ok.jpg";
        String path = Global.pathCombine(folder, filename);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("0GNS73BR100", reader.getFoundBarCodes()[0].getCodeText());
    }
}

