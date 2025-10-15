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
 * Tests for BARCODENET-34043 - Incorrect recognition of Code128 code from the jpg image
 * </p>
 */
@Test(description = "Tests for Issue34043.")
public class Issue34043
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue34043");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    /// <summary>
    /// Original(not orientated) picture
    /// </summary>
        @Test
    public void testOriginal()
    {
        String fileName = Global.pathCombine(folder, "code128.jpg");

        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("00100  ROM000077215201114007021151", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    /// <summary>
    /// only barcode
    /// </summary>
        @Test
    public void testCutted()
    {
        String fileName = Global.pathCombine(folder, "cutted.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("00100  ROM000077215201114007021151", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}






