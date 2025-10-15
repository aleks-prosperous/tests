package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * Issue34124 tests. Implement restructuring filters API
 * </p>
 */
@Test(description = "Tests for Issue34124.")
public class Issue34124
{
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
     * Path to generatedFolder with files for testing.
     * </p>
     */
    private static final String folder = Global.getTestDataFolder("Issues/Issue34124");

    /// <summary>
    /// Inorrect barcode and invert image manual hints
    /// </summary>
        @Test
    public void testManualHints()
    {
        String filename = "Sample.png";
        String path = Global.pathCombine(folder, filename);

        BarCodeReader reader = new BarCodeReader(path,
                        DecodeType.CODE_128 , DecodeType.CODE_39_FULL_ASCII , DecodeType.CODE_39);
        {
            reader.getQualitySettings().setInverseImage(InverseImageMode.ENABLED);
            reader.getQualitySettings().setAllowIncorrectBarcodes(true);

            List<String> recognizedTexts = new ArrayList<String>();
            for(BarCodeResult result : reader.readBarCodes())
            recognizedTexts.add(result.getCodeText());

            Assert.assertTrue(recognizedTexts.contains("Incorrect"));
            Assert.assertTrue(recognizedTexts.contains("InvertCode128"));
        }
    }

    /// <summary>
    /// Test manual hints default(None)
    /// </summary>
        @Test
    public void testManualHintsDefault()
    {
        String filename = "colorAztec.png";
        String path = Global.pathCombine(folder, filename);
        BarCodeReader reader = new BarCodeReader(path);
        reader.getQualitySettings().setComplexBackground(ComplexBackgroundMode.ENABLED);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("DARK IMAGE: Aztec - Color [DarkBlue] !!!", reader.getFoundBarCodes()[0].getCodeText());
    }

    /// <summary>
    /// Test manual hint invert image
    /// </summary>
        @Test
    public void testInvert()
    {
        String filename = "InvertCode128.png";
        String path = Global.pathCombine(folder, filename);

        BarCodeReader reader = new BarCodeReader(path);
        {
            reader.getQualitySettings().setInverseImage(InverseImageMode.ENABLED);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("InvertCode128", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    /// <summary>
    /// Test manual hint incorrect barcodes
    /// </summary>
        @Test
    public void testIncorrectBarcodes()
    {
        String filename = "Incorrect.png";
        String path = Global.pathCombine(folder, filename);

        BarCodeReader reader = new BarCodeReader(path);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());
            reader.getQualitySettings().setAllowIncorrectBarcodes(true);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Incorrect", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    /// <summary>
    /// Test manual hint complex background
    /// </summary>
        @Test
    public void testComplexBackground()
    {
        String filename = "colorAztec.png";
        String path = Global.pathCombine(folder, filename);

        BarCodeReader reader = new BarCodeReader(path);
        {
            reader.getQualitySettings().setComplexBackground(ComplexBackgroundMode.ENABLED);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("DARK IMAGE: Aztec - Color [DarkBlue] !!!", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    /// <summary>
    /// Test MaxPerformance mode
    /// </summary>
        @Test
    public void testMaxPerformance01()
    {
        String filename = "QRs.png";
        String path = Global.pathCombine(folder, filename);

        BarCodeReader reader = new BarCodeReader(path, DecodeType.QR);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());
            Assert.assertEquals(reader.readBarCodes().length, 2);
            Assert.assertEquals("QRCode", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("CorruptedQRCode", reader.getFoundBarCodes()[1].getCodeText());
        }
    }

    /// <summary>
    /// Test MaxQuality mode
    /// </summary>
        @Test
    public void testMaxQuality01()
    {
        String filename = "QRs.png";
        String path = Global.pathCombine(folder, filename);

        BarCodeReader reader = new BarCodeReader(path, DecodeType.QR);
        {
            reader.getQualitySettings().setInverseImage(InverseImageMode.ENABLED);
            reader.getQualitySettings().setDeconvolution(DeconvolutionMode.SLOW);
            List<String> recognizedTexts = new ArrayList<String>();
            for(BarCodeResult result : reader.readBarCodes())
            recognizedTexts.add(result.getCodeText());

            Assert.assertTrue(recognizedTexts.contains("InvertedQRCode"));
            Assert.assertTrue(recognizedTexts.contains("QRCode"));
            Assert.assertTrue(recognizedTexts.contains("CorruptedQRCode"));
            Assert.assertEquals(reader.readBarCodes().length, 3);
        }
    }

    /// <summary>
    /// Test MaxPerformance mode
    /// </summary>
        @Test
    public void testMaxPerformance02()
    {
        String filename = "differentBarcodes.png";
        String path = Global.pathCombine(folder, filename);

        List<BaseDecodeType> types = new ArrayList<BaseDecodeType>();
        List<String> values = new ArrayList<String>();
        BarCodeReader reader = new BarCodeReader(path);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());
            for(BarCodeResult result : reader.readBarCodes())
            {
                values.add(result.getCodeText());
                types.add(result.getCodeType());
            }
        }
        Assert.assertTrue(values.size() >= 1);
        Assert.assertTrue(values.contains("normal"));
    }

    /// <summary>
    /// Test MaxQuality mode
    /// </summary>
        @Test
    public void testMaxQuality02()
    {
        String filename = "differentBarcodes.png";
        String path = Global.pathCombine(folder, filename);

        List<BaseDecodeType> types = new ArrayList<BaseDecodeType>();
        List<String> values = new ArrayList<String>();
        BarCodeReader reader = new BarCodeReader(path);
        {
            reader.setQualitySettings(QualitySettings.getHighQuality());
            for(BarCodeResult result : reader.readBarCodes())
            {
                values.add(result.getCodeText());
                types.add(result.getCodeType());
            }
        }
        Assert.assertTrue(values.size() >= 2);
        Assert.assertTrue(values.contains("normal"));
        Assert.assertTrue(values.contains("corrupted"));
    }

    /// <summary>
    /// Test MaxBarCodes mode
    /// </summary>
        @Test
    public void testMaxBarcodes02()
    {

        String filename = "differentBarcodes.png";
        String path = Global.pathCombine(folder, filename);

        List<SingleDecodeType> types = new ArrayList<SingleDecodeType>();
        List<String> values = new ArrayList<String>();
        BarCodeReader reader = new BarCodeReader(path);
        {
            reader.getQualitySettings().setInverseImage(InverseImageMode.ENABLED);
            reader.getQualitySettings().setDeconvolution(DeconvolutionMode.SLOW);
            reader.getQualitySettings().setAllowIncorrectBarcodes(true);
            for(BarCodeResult result : reader.readBarCodes())
            {
                values.add(result.getCodeText());
                types.add(result.getCodeType());
            }
        }
        Assert.assertTrue(values.size() >= 3);
        Assert.assertTrue(values.contains("normal"));
        Assert.assertTrue(values.contains("corrupted"));
        Assert.assertTrue(values.contains("InvertedPDF417"));
    }
}

