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
 * Tests Issue33924 tests.
 * </p>
 */
@Test(description = "Tests for Issue33924.")
public class Issue33924
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
    /// <summary>
    /// Tests qr2 image.
    /// </summary>
        @Test
    public void test_qr2()
    {
        String fileName = Global.pathCombine(folder, "qr2.tif");
        BarCodeReader reader = new BarCodeReader(fileName);
        {
            Assert.assertEquals(reader.readBarCodes().length, 2);
            Assert.assertEquals("00467|899679|ACUSE DE RECIBO", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.QR, reader.getFoundBarCodes()[0].getCodeType());
            Assert.assertEquals("899679", reader.getFoundBarCodes()[1].getCodeText());
            Assert.assertEquals(DecodeType.CODE_39, reader.getFoundBarCodes()[1].getCodeType());
        }
    }

    /// <summary>
    /// Tests qr2 image with symbologies.
    /// </summary>
        @Test
    public void test_qr2_WithSymbologies()
    {
        String fileName = Global.pathCombine(folder, "qr2.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39, DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 2);
            Assert.assertEquals("00467|899679|ACUSE DE RECIBO", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.QR, reader.getFoundBarCodes()[0].getCodeType());
            Assert.assertEquals("899679", reader.getFoundBarCodes()[1].getCodeText());
            Assert.assertEquals(DecodeType.CODE_39, reader.getFoundBarCodes()[1].getCodeType());
        }
    }

    /// <summary>
    /// Tests qr3 imag.
    /// </summary>
        @Test
    public void test_qr3()
    {
        String fileName = Global.pathCombine(folder, "qr3.tif");
        BarCodeReader reader = new BarCodeReader(fileName);
        {
            Assert.assertEquals(reader.readBarCodes().length, 2);
            Assert.assertEquals("00612|900014|ACUSE DE RECIBO", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.QR, reader.getFoundBarCodes()[0].getCodeType());
            Assert.assertEquals("900014", reader.getFoundBarCodes()[1].getCodeText());
            Assert.assertEquals(DecodeType.CODE_39, reader.getFoundBarCodes()[1].getCodeType());
        }
    }

    /// <summary>
    /// Tests qr3 image with symbologies.
    /// </summary>
        @Test
    public void test_qr3_WithSymbologies()
    {
        String fileName = Global.pathCombine(folder, "qr3.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39, DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 2);
            Assert.assertEquals("00612|900014|ACUSE DE RECIBO", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.QR, reader.getFoundBarCodes()[0].getCodeType());
            Assert.assertEquals("900014", reader.getFoundBarCodes()[1].getCodeText());
            Assert.assertEquals(DecodeType.CODE_39, reader.getFoundBarCodes()[1].getCodeType());
        }
    }

    /// <summary>
    /// Tests qr2 cut image.
    /// </summary>
        @Test
    public void test_qr2_cutQR()
    {
        String fileName = Global.pathCombine(folder, "qr2_cutQR.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("00467|899679|ACUSE DE RECIBO", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.QR, reader.getFoundBarCodes()[0].getCodeType());
        }
    }
}

