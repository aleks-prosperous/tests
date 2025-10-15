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
 * Tests Issue34084 tests. Incorrect recognition of Code128 code from the tif image
 * </p>
 */
@Test(description = "Tests for Issue34084.")
public class Issue34084
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue34084");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    /**
     * <p>
     * Test with LineCodesRestoration hint
     * </p>
     */
    @Test
    public void testWithRestoration()
    {
        final String fileName = "a.tif";
        String path = Global.pathCombine(folder, fileName);
        final BarCodeReader reader = new BarCodeReader(path, DecodeType.CODE_128);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("3202487", reader.getFoundBarCodes()[0].getCodeText());
    }
}

