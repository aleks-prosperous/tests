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
 * Tests Issue34074 tests. Incorrect type recognition of UPC and EAN barcodes
 * </p>
 */
@Test(description = "Tests for Issue34074.")
public class Issue34074
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue34074");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    /**
     * <p>
     * Tests recogntion with symbology AllSupportedTypes. `
     * </p>
     */
    @Test
    public void testAllSupportedTypes()
    {
        String fileName = "ean_upc.png";

        String path = Global.pathCombine(folder, fileName);
        final BarCodeReader reader = new BarCodeReader(path, DecodeType.ALL_SUPPORTED_TYPES);
        Assert.assertEquals(reader.readBarCodes().length, 2);
        Assert.assertEquals("012345678905", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals(DecodeType.UPCA, reader.getFoundBarCodes()[0].getCodeType());
        Assert.assertEquals("012345678905", reader.getFoundBarCodes()[1].getCodeText());
        Assert.assertEquals(DecodeType.UPCA, reader.getFoundBarCodes()[1].getCodeType());
    }
}

