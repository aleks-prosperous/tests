package com.aspose.external.barcode.tester.releases.v74;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


/**
 * <p>
 * Tests Issue33829 tests.
 * </p>
 */
@Test(description = "Tests for Issue33829.")
public class Issue33829
{
    /**
     * <p>
     * Path to folder with files for testing Issue33829.
     * </p>
     */
    private final String folder = Global.getIssuesTestImagePath("Issue33829");

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
    /// Tests recognition of image from Issue33829
    /// </summary>
        @Test
    public void testIssue33829()
    {
        String fileName = Global.pathCombine(folder, "00000018_00000005_4.tif");
        BarCodeReader reader = new BarCodeReader(fileName);
        {
            Assert.assertEquals(reader.readBarCodes().length, 2);
            Assert.assertEquals("AZ000000393740", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.CODE_128, reader.getFoundBarCodes()[0].getCodeType());
            Assert.assertEquals("AZ000000393740", reader.getFoundBarCodes()[1].getCodeText());
            Assert.assertEquals(DecodeType.DATA_MATRIX, reader.getFoundBarCodes()[1].getCodeType());
        }
    }
}

