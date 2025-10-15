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
 * Issue33984 tests.
 * </p>
 */
@Test(description = "Tests for Issue33984.")
public class Issue33984
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33984");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    /**
     * <p>
     * Tests recogntion with EncodeTypes.
     * </p>
     */
    @Test
    public void testRecognitionQR()
    {
        String fileName = Global.pathCombine(folder, "00016ab2.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("Alfredo|Sanchez|195 Shady Dale Rd|Eatonton|GA|31024-6324|56|7064851279|RP7239", reader.getFoundBarCodes()[0].getCodeText());
    }
}

