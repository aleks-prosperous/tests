package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;


/**
 * <p>
 * Tests Issue 33828 tests.
 * </p>
 */
@Test(description = "Tests for Issue33828.")
public class Issue33828
{
    /**
     * <p>
     * Path to generatedFolder with files for testing Issue33828.
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
        LicenseAssistant.setupLicense();
    }

    /**
     * <p>
     * Tests original image.
     * </p>
     */
    @Test
    public void testOriginalImage()
    {
        String fileName = Global.pathCombine(folder, "00000016_00000004_3.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX, DecodeType.CODE_128);
        Assert.assertEquals(reader.readBarCodes().length, 2);
        Assert.assertEquals("AZ000000393739", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals("AZ000000393739", reader.getFoundBarCodes()[1].getCodeText());
    }

    /**
     * <p>
     * Tests original image only with DataMatrix symbioligy.
     * </p>
     */
    @Test
    public void testOriginalImageOnlyDataMatrix()
    {
        String fileName = Global.pathCombine(folder, "00000016_00000004_3.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("AZ000000393739", reader.getFoundBarCodes()[0].getCodeText());
    }
}

