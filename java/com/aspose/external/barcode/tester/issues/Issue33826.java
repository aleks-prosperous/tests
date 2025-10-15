package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


/**
 * <p>
 * Tests Issue33826 tests.
 * </p>
 */
@Test(description = "Tests for Issue33826.")
public class Issue33826
{
    /**
     * <p>
     * Path to generatedFolder with files for testing Issue33826.
     * </p>
     */
    String folder = Global.getIssuesTestImagePath(this.getClass().getSimpleName());

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

    /// <summary>
    /// Tests original image "00000008_00000002_10.tif" from Issue33826.
    /// </summary>
        @Test
    public void testOriginalImage()
    {
        String fileName = Global.pathCombine(folder, "00000008_00000002_10.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.SSCC_18);
        {
            Assert.assertEquals(reader.readBarCodes().length, 2);
            Assert.assertEquals("(00)359007731648000207", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("(00)359007731648000207", reader.getFoundBarCodes()[1].getCodeText());
        }
    }

    /// <summary>
    /// Tests cutted and manualy rotated image.
    /// </summary>
        @Test
    public void testCuttedAndRotated()
    {
        String fileName = Global.pathCombine(folder, "cutted_rotated.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.SSCC_18);
        {
            Assert.assertEquals(reader.readBarCodes().length, 2);
            Assert.assertEquals("(00)359007731648000207", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("(00)359007731648000207", reader.getFoundBarCodes()[1].getCodeText());
        }
    }
}

