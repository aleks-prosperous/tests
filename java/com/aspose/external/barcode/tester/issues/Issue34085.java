package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;

/**
 * <p>
 * Tests Issue34085 tests. Can't recognize Code128 code from the TIF image
 * </p>
 */
@Test(description = "Tests for Issue34085.")
public class Issue34085
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue34085");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    /**
     * <p>
     * Test with Code 39 Standard symbology
     * </p>
     */
    @Test
    public void testWithCode39()
    {
        final String fileName = "b.tif";
        String path = Global.pathCombine(folder, fileName);
        final BarCodeReader reader = new BarCodeReader(path, DecodeType.CODE_39);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("203976", reader.getFoundBarCodes()[0].getCodeText());
    }
}

