package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;

//import com.aspose.barcode.barcoderecognition.RecognitionHints;

/**
 * <p>
 * Tests Issue33922 tests. Incorrect recognition of Code128 from the JPEG file
 * </p>
 */
@Test(description = "Tests for Issue33922.")
public class Issue33922
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33922");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    /**
     * <p>
     * Test Original image
     * </p>
     */
    @Test
    public void testOriginalCode128()
    {
        String fileName = "6a6d4ce3-784d-413a-aba2-a27f7a158dea.jpeg";
        String path = Global.pathCombine(folder, fileName);
        final BarCodeReader reader = new BarCodeReader(path, DecodeType.CODE_128);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("00100  MOP000123653020614008638941", reader.getFoundBarCodes()[0].getCodeText());
    }


    /**
     * <p>
     * Test cutted image
     * </p>
     */
    @Test
    public void testCuttedCode128()
    {
        String fileName = "cutted128.png";
        String path = Global.pathCombine(folder, fileName);
        final BarCodeReader reader = new BarCodeReader(path, DecodeType.CODE_128);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("00100  MOP000123653020614008638941", reader.getFoundBarCodes()[0].getCodeText());
    }
}

