package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * Tests Issue33824 tests.
 * </p>
 */
@Test(description = "Tests for Issue33824.")
public class Issue33824
{
    /**
     * <p>
     * Path to generatedFolder with files for testing issue 33823.
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
     * Tests recognition of image from Issue33824
     * </p>
     */
    @Test
    public void testIssue33824()
    {
        String fileName = Global.pathCombine(folder, "00000002_00000002_10.tif");
        final BarCodeReader reader = new BarCodeReader(fileName);
        Assert.assertEquals(reader.readBarCodes().length, 2);
        Assert.assertEquals("AZ000000393738", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals(DecodeType.CODE_128, reader.getFoundBarCodes()[0].getCodeType());
        Assert.assertEquals("AZ000000393738", reader.getFoundBarCodes()[1].getCodeText());
        Assert.assertEquals(DecodeType.DATA_MATRIX, reader.getFoundBarCodes()[1].getCodeType());
    }

    /**
     * <p>
     * Tests recogntion only first barcode (Code128) from cutted image
     * </p>
     */
    @Test
    public void testCuttedFirstBarcode()
    {
        String fileName = Global.pathCombine(folder, "cutted_first.tif");
        final BarCodeReader reader = new BarCodeReader(fileName);
        reader.setQualitySettings(QualitySettings.getHighQuality());
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("AZ000000393738", reader.getFoundBarCodes()[0].getCodeText());
    }

    /**
     * <p>
     * Tests recogntion only first barcode (Code128) from cutted and rotated image
     * </p>
     */
    @Test
    public void testCuttedRotatedFirstBarcode()
    {
        String fileName = folder + "cutted_first_rotated.png";
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        List<String> recognizedTexts = new ArrayList<>();
        for(BarCodeResult result : reader.readBarCodes())
        recognizedTexts.add(result.getCodeText());

        Assert.assertEquals(1, recognizedTexts.size(), "must be 1, need fix");
        Assert.assertTrue(recognizedTexts.contains("AZ000000393738"));
    }

    /**
     * <p>
     * Tests recogntion only second barcode (DataMatrix) from cutted image
     * </p>
     */
    @Test
    public void testCuttedSecondBarcode()
    {
        String fileName = Global.pathCombine(folder, "cutted_second.tif");
        final BarCodeReader reader = new BarCodeReader(fileName);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("AZ000000393738", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals(DecodeType.DATA_MATRIX, reader.getFoundBarCodes()[0].getCodeType());
    }

    @Test
    public void testCuttedRotatedSecondBarcode()
    {
        String fileName = Global.pathCombine(folder, "cutted_second_rotated.png");
        final BarCodeReader reader = new BarCodeReader(fileName);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("AZ000000393738", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals(DecodeType.DATA_MATRIX, reader.getFoundBarCodes()[0].getCodeType());
    }

}

