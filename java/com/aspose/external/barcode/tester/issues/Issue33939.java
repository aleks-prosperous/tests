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
 * Tests Issue33939 tests.
 * </p>
 */
@Test(description = "Tests for Issue33939.")
public class Issue33939
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
     * Tests qr2 image.
     * </p>
     */
    @Test
    public void test_qr2()
    {
        String fileName = Global.pathCombine(folder, "qr2.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("00467|899679|ACUSE DE RECIBO", reader.getFoundBarCodes()[0].getCodeText());
    }

    /**
     * <p>
     * Tests qr3 image.
     * </p>
     */
    @Test
    public void test_qr3()
    {
        String fileName = Global.pathCombine(folder, "qr3.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("00612|900014|ACUSE DE RECIBO", reader.getFoundBarCodes()[0].getCodeText());
    }

    /**
     * <p>
     * Tests erik2-p9.jpg image.
     * </p>
     */
    @Test
    public void test_erik2()
    {
        String fileName = Global.pathCombine(folder, "erik2-p9.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("364441", reader.getFoundBarCodes()[0].getCodeText());
    }

    /**
     * <p>
     * Tests hennessy-qr-code-scans image.
     * </p>
     */
    @Test
    public void test_hennessy()
    {
        String fileName = Global.pathCombine(folder, "hennessy-qr-code-scans.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("http://www.hennessy.com/kaws", reader.getFoundBarCodes()[0].getCodeText());
    }

    /// <summary>
    /// Tests images2 image.
    /// </summary>
        @Test
    public void test_images2()
    {
        String fileName = Global.pathCombine(folder, "images2.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("http://lvmonogram.jp/store", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    /**
     * <p>
     * Tests zxing_scanned image.
     * </p>
     */
    @Test
    public void test_zxing_scanned()
    {
        String fileName = Global.pathCombine(folder, "zxing_scanned.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("market://search?q=pname:com.google.zxing.client.android", reader.getFoundBarCodes()[0].getCodeText());
    }
}

