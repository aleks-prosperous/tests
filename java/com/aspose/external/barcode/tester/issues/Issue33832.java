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
 * Tests Issue33832 tests.
 * </p>
 */
@Test(description = "Tests for Issue33832.")
public class Issue33832
{
    /**
     * <p>
     * Path to generatedFolder with files for testing Issue33829.
     * </p>
     */
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33832");

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
     * Tests recognition of image from Issue33832
     * </p>
     */
    @Test
    public void testIssue33832()
    {
        String fileName = Global.pathCombine(folder, "00000029_00000009_8.tif");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX, DecodeType.CODE_128);
        Assert.assertEquals(reader.readBarCodes().length, 2);
        Assert.assertEquals("AZ000000393744", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals(DecodeType.CODE_128, reader.getFoundBarCodes()[0].getCodeType());
        Assert.assertEquals("AZ000000393744", reader.getFoundBarCodes()[1].getCodeText());
        Assert.assertEquals(DecodeType.DATA_MATRIX, reader.getFoundBarCodes()[1].getCodeType());
    }

    /**
     * <p>
     * Tests recognition of image from Issue33832 (only Code128).
     * </p>
     */
    @Test
    public void testIssue33832Code128()
    {
        String fileName = Global.pathCombine(folder, "00000029_00000009_8.tif");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("AZ000000393744", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals(DecodeType.CODE_128, reader.getFoundBarCodes()[0].getCodeType());
    }

    /**
     * <p>
     * Tests recognition of image from Issue33832 (only DataMatrix).
     * </p>
     */
    @Test
    public void testIssue33832DataMatrix()
    {
        String fileName = Global.pathCombine(folder, "00000029_00000009_8.tif");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("AZ000000393744", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals(DecodeType.DATA_MATRIX, reader.getFoundBarCodes()[0].getCodeType());
    }
}

