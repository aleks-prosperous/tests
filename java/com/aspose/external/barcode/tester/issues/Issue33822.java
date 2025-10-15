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
 * Tests Issue 33822 tests.
 * </p>
 */
@Test(description = "Tests for Issue33822.")
public class Issue33822
{
    /**
     * <p>
     * ath to generatedFolder with files for testing issue 33822.
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

    /**
     * <p>
     * The main test for issue 33822.
     * </p>
     */
    @Test
    public void testOriginalImage()
    {
        String fileName = Global.pathCombine(folder, "image.1.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PDF_417);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("1851QD507", reader.getFoundBarCodes()[0].getCodeText());
    }

    /**
     * <p>
     * Tests cutted image "image.1.tif" from issue 33822.
     * </p>
     */
    @Test
    public void testCuttedImage()
    {
        String fileName = Global.pathCombine(folder, "cut.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PDF_417);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("1851QD507", reader.getFoundBarCodes()[0].getCodeText());
    }

    /**
     * <p>
     * Tests cutted and rotated image "image.1.tif" from issue 33822.
     * </p>
     */
    @Test
    public void testCuttedRotatedImage()
    {
        String fileName = Global.pathCombine(folder, "cut_rotated.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PDF_417);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("1851QD507", reader.getFoundBarCodes()[0].getCodeText());
    }
}

