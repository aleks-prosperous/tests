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
 * Tests Issue33944 tests.
 * </p>
 */
@Test(description = "Tests for Issue33944.")
public class Issue33944
{
    /**
     * <p>
     * Path to generatedFolder with files for testing Issue33924.
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
     * Tests original image (from customer).
     * </p>
     */
    @Test
    public void test_001()
    {
        String fileName = Global.pathCombine(folder, "001.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PATCH_CODE);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("Patch T", reader.getFoundBarCodes()[0].getCodeText());
    }

    /**
     * <p>
     * Tests edited image with Patch III.
     * </p>
     */
    @Test
    public void test_001_PatchIII()
    {
        String fileName = Global.pathCombine(folder, "001_PatchIII.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PATCH_CODE);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("Patch III", reader.getFoundBarCodes()[0].getCodeText());
    }

    /**
     * <p>
     * Tests ideal Patch T image.
     * </p>
     */
    @Test
    public void test_PatchT()
    {
        String fileName = Global.pathCombine(folder, "PatchT.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PATCH_CODE);
        Assert.assertEquals(reader.readBarCodes().length, 4);
        Assert.assertEquals("Patch T", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals("Patch T", reader.getFoundBarCodes()[1].getCodeText());
        Assert.assertEquals("Patch T", reader.getFoundBarCodes()[2].getCodeText());
        Assert.assertEquals("Patch T", reader.getFoundBarCodes()[3].getCodeText());
    }

    /**
     * <p>
     * Tests ideal Patch III image.
     * </p>
     */
    @Test
    public void test_PatchIII()
    {
        String fileName = Global.pathCombine(folder, "PatchIII.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PATCH_CODE);
        Assert.assertEquals(reader.readBarCodes().length, 4);
        Assert.assertEquals("Patch III", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals("Patch III", reader.getFoundBarCodes()[1].getCodeText());
        Assert.assertEquals("Patch III", reader.getFoundBarCodes()[2].getCodeText());
        Assert.assertEquals("Patch III", reader.getFoundBarCodes()[3].getCodeText());
    }
}

