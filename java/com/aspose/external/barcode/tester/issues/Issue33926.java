package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>
 * Tests Issue 33893 tests.
 * </p>
 */
@Test(description = "Tests for Issue33926.")
public class Issue33926
{
    /**
     * <p>
     * Path to generatedFolder with files for testing Issue33926.
     * </p>
     */
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33926");

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
    /// Unit test of rotated image.
    /// </summary>
        @Test
    public void testRotated()
    {
        String fileName = Global.pathCombine(folder, "erik2-p9_rotated.jpg");
        List<BaseDecodeType> readTypes = new ArrayList<BaseDecodeType>();
        List<String> codetexts = new ArrayList<String>();
        BarCodeReader reader = new BarCodeReader(fileName);
        {
            reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
            for(BarCodeResult result : reader.readBarCodes())
            {
                readTypes.add(result.getCodeType());
                codetexts.add(result.getCodeText());
            }

            Assert.assertTrue(codetexts.contains("(00)02140536545656"));
            Assert.assertTrue(readTypes.contains(DecodeType.GS_1_CODE_128));
            Assert.assertTrue(codetexts.contains("(00)02140536545656"));
            Assert.assertTrue(readTypes.contains(DecodeType.GS_1_CODE_128));
            Assert.assertTrue(codetexts.contains("2363100000060"));
            Assert.assertTrue(readTypes.contains(DecodeType.CODE_128));
            Assert.assertTrue(codetexts.contains("3100000060"));
            Assert.assertTrue(readTypes.contains(DecodeType.CODE_128));
            Assert.assertTrue(codetexts.contains("364441"));
            Assert.assertTrue(readTypes.contains(DecodeType.QR));
            Assert.assertTrue(codetexts.contains("2363100000060"));
            Assert.assertTrue(readTypes.contains(DecodeType.CODE_128));
            Assert.assertEquals(6, codetexts.size());
        }
    }

    /// <summary>
    /// Tests original image.
    /// </summary>
        @Test
    public void test()
    {
        String fileName = Global.pathCombine(folder, "erik2-p9.jpg");

        List<BaseDecodeType> readTypes = new ArrayList<BaseDecodeType>();
        List<String> codetexts = new ArrayList<String>();
        BarCodeReader reader = new BarCodeReader(fileName);
        {
            reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
            for(BarCodeResult result : reader.readBarCodes())
            {
                readTypes.add(result.getCodeType());
                codetexts.add(result.getCodeText());
            }

            Assert.assertTrue(codetexts.contains("(00)02140536545656"));
            Assert.assertTrue(readTypes.contains(DecodeType.GS_1_CODE_128));
            Assert.assertTrue(codetexts.contains("(00)02140536545656"));
            Assert.assertTrue(readTypes.contains(DecodeType.GS_1_CODE_128));
            Assert.assertTrue(codetexts.contains("2363100000060"));
            Assert.assertTrue(readTypes.contains(DecodeType.CODE_128));
            Assert.assertTrue(codetexts.contains("3100000060"));
            Assert.assertTrue(readTypes.contains(DecodeType.CODE_128));
            Assert.assertTrue(codetexts.contains("364441"));
            Assert.assertTrue(readTypes.contains(DecodeType.QR));
            Assert.assertTrue(codetexts.contains("2363100000060"));
            Assert.assertTrue(readTypes.contains(DecodeType.CODE_128));
            Assert.assertEquals(6, codetexts.size());
        }
    }

    /// <summary>
    /// Tests rotated image with concrete symbologies.
    /// </summary>
        @Test
    public void testRotatedWithSymbologies()
    {
        String fileName = Global.pathCombine(folder, "erik2-p9_rotated.jpg");

        List<BaseDecodeType> readTypes = new ArrayList<BaseDecodeType>();
        List<String> codetexts = new ArrayList<String>();
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128 , DecodeType.QR);
        {
            reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
            for(BarCodeResult result : reader.readBarCodes())
            {
                readTypes.add(result.getCodeType());
                codetexts.add(result.getCodeText());
            }
            Assert.assertTrue(codetexts.contains("2363100000060"));
            Assert.assertTrue(readTypes.contains(DecodeType.CODE_128));
            Assert.assertTrue(codetexts.contains("364441"));
            Assert.assertTrue(readTypes.contains(DecodeType.QR));
            Assert.assertTrue(codetexts.contains("3100000060"));
            Assert.assertTrue(readTypes.contains(DecodeType.CODE_128));
            Assert.assertTrue(codetexts.contains("2363100000060"));
            Assert.assertTrue(readTypes.contains(DecodeType.CODE_128));
            Assert.assertTrue(codetexts.contains("<FNC1>0002140536545656"));
            Assert.assertTrue(readTypes.contains(DecodeType.CODE_128));
            Assert.assertTrue(codetexts.contains("<FNC1>0002140536545656"));
            Assert.assertTrue(readTypes.contains(DecodeType.CODE_128));
            Assert.assertEquals(6, codetexts.size());
        }
    }

    /// <summary>
    /// Tests original image with concrete symbologies.
    /// </summary>
        @Test
    public void testSymbologies()
    {
        String fileName = Global.pathCombine(folder, "erik2-p9.jpg");
        List<BaseDecodeType> readTypes = new ArrayList<BaseDecodeType>();
        List<String> codetexts = new ArrayList<String>();
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128, DecodeType.QR);
        {
            reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
            for(BarCodeResult result : reader.readBarCodes())
            {
                readTypes.add(result.getCodeType());
                codetexts.add(result.getCodeText());
            }
            Assert.assertTrue(codetexts.contains("2363100000060"));
            Assert.assertTrue(readTypes.contains(DecodeType.CODE_128));
            Assert.assertTrue(codetexts.contains("364441"));
            Assert.assertTrue(readTypes.contains(DecodeType.QR));
            Assert.assertTrue(codetexts.contains("3100000060"));
            Assert.assertTrue(readTypes.contains(DecodeType.CODE_128));
            Assert.assertTrue(codetexts.contains("2363100000060"));
            Assert.assertTrue(readTypes.contains(DecodeType.CODE_128));
            Assert.assertTrue(codetexts.contains("<FNC1>0002140536545656"));
            Assert.assertTrue(readTypes.contains(DecodeType.CODE_128));
            Assert.assertTrue(codetexts.contains("<FNC1>0002140536545656"));
            Assert.assertTrue(readTypes.contains(DecodeType.CODE_128));
            Assert.assertEquals(6, codetexts.size());
        }
    }

    /// <summary>
    /// Tests cutted only QR crom original image.
    /// </summary>
        @Test
    public void testOnlyQr()
    {
        String fileName = Global.pathCombine(folder, "only_qr.jpg");
        BarCodeReader reader = new BarCodeReader(fileName);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("364441", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.QR, reader.getFoundBarCodes()[0].getCodeType());
        }
    }

    /// <summary>
    /// Tests cutted only QR crom rotated image.
    /// </summary>
        @Test
    public void testOnlyQrRotatedManualy()
    {
        String fileName = Global.pathCombine(folder, "only_qr_rotated.jpg");
        BarCodeReader reader = new BarCodeReader(fileName);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("364441", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.QR, reader.getFoundBarCodes()[0].getCodeType());
        }
    }
}

