package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.QualitySettings;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


/**
 * <p>
 * Tests Issue33825 tests.
 * </p>
 */
@Test(description = "Tests for Issue33825.")
public class Issue33825
{
    /**
     * <p>
     * Path to generatedFolder with files for testing Issue33825.
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
    /// Tests of recognition of first barcode.
    /// </summary>
        @Test(enabled = false)
    public void testFirstBarCode()
    {
        String fileName = Global.pathCombine(folder, "firstBarCode.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.INTERLEAVED_2_OF_5);
        reader.setQualitySettings(QualitySettings.getHighQuality());
        Assert.assertEquals(1, reader.readBarCodes().length);
        Assert.assertEquals("0001015756463489", reader.getFoundBarCodes()[0].getCodeText());
        //Assert.AreNotEqual("0075015855466489", reader.getFoundBarCodes()[0].getCodeText());
    }

    /// <summary>
    /// Tests of recognition of second barcode.
    /// </summary>
        @Test
    public void testSecondBarCode()
    {
        String fileName = Global.pathCombine(folder, "secondBarCode.tif");
        BarCodeReader reader = new BarCodeReader(fileName);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1062255520", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.INTERLEAVED_2_OF_5, reader.getFoundBarCodes()[0].getCodeType());
        }
    }

    /// <summary>
    /// Tests of recognition of second barcode.
    /// </summary>
        @Test
    public void testSecondBarCodeWithSetSymbilogy()
    {
        String fileName = Global.pathCombine(folder, "secondBarCode.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.INTERLEAVED_2_OF_5);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1062255520", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.INTERLEAVED_2_OF_5, reader.getFoundBarCodes()[0].getCodeType());
        }
    }
}

