package com.aspose.external.barcode.tester.releases.v18_11;

import com.aspose.barcode.auxiliary.Global;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

public class Issue37010
{
    /// <summary>
    /// Path to folder with files for testing Issue37010.
    /// </summary>
    private final static String folder = Global.getTestDataFolder
            ("Issues\\Issue37010");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    /// <summary>
    /// Tests recogntion with symbology.
    /// </summary>
        @Test
    public void test_12()
    {
        String fileName = Global.pathCombine(folder, "12.JPG");
        BarCodeReader reader = new BarCodeReader(fileName, new MultyDecodeType(DecodeType.CODE_39, DecodeType.CODE_39_FULL_ASCII));
        reader.setQualitySettings(QualitySettings.getHighQuality());

        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("EAA000000G5FP", reader.getFoundBarCodes()[0].getCodeText());
    }

    /// <summary>
    /// Tests recogntion with symbology.
    /// </summary>
        @Test
    public void test_12_cut1()
    {
        String fileName = Global.pathCombine(folder, "12_cut1.png");
        BarCodeReader reader = new BarCodeReader(fileName, new MultyDecodeType(DecodeType.ALL_SUPPORTED_TYPES));

        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("EAA000000G5FP", reader.getFoundBarCodes()[0].getCodeText());
    }

    /// <summary>
    /// Tests recogntion with symbology.
    /// </summary>
        @Test(enabled = false)
    public void test_31()
    {
        String fileName = Global.pathCombine(folder, "31.JPG");
        BarCodeReader reader = new BarCodeReader(fileName, new MultyDecodeType(DecodeType.CODE_39, DecodeType.CODE_39_FULL_ASCII));
        reader.setQualitySettings(QualitySettings.getHighQuality());

        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("EAK0000019620", reader.getFoundBarCodes()[0].getCodeText());
    }

    /// <summary>
    /// Tests recogntion with symbology.
    /// </summary>
    @Test(enabled = false)
    public void test_31_cut1()
    {
        String fileName = Global.pathCombine(folder, "31_cut1.png");
        BarCodeReader reader = new BarCodeReader(fileName, new MultyDecodeType(DecodeType.ALL_SUPPORTED_TYPES));
        reader.setQualitySettings(QualitySettings.getHighQuality());

        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("EAK0000019620", reader.getFoundBarCodes()[0].getCodeText());
    }

    /// <summary>
    /// Tests recogntion with symbology.
    /// </summary>
        @Test
    public void test_33()
    {
        String fileName = Global.pathCombine(folder, "33.JPG");
        BarCodeReader reader = new BarCodeReader(fileName, new MultyDecodeType(DecodeType.CODE_39, DecodeType.CODE_39_FULL_ASCII));
        reader.getQualitySettings().setDeconvolution(DeconvolutionMode.SLOW);
        reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
        reader.getQualitySettings().setXDimension( XDimensionMode.SMALL);

        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("EAK0000006440", reader.getFoundBarCodes()[0].getCodeText());
    }

    /// <summary>
    /// Tests recogntion with symbology.
    /// </summary>
        @Test
    public void test_33_cut1()
    {
        String fileName = Global.pathCombine(folder, "33_cut1.png");
        BarCodeReader reader = new BarCodeReader(fileName, new MultyDecodeType(DecodeType.ALL_SUPPORTED_TYPES));
        reader.getQualitySettings().setDeconvolution(DeconvolutionMode.SLOW);
        reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
        reader.getQualitySettings().setXDimension( XDimensionMode.SMALL);

        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("EAK0000006440", reader.getFoundBarCodes()[0].getCodeText());
    }

    /// <summary>
    /// Tests recogntion with symbology.
    /// </summary>
        @Test
    public void test_37_cut_edited()
    {
        String fileName = Global.pathCombine(folder, "37_cut_edited.png");
        BarCodeReader reader = new BarCodeReader(fileName, new MultyDecodeType(DecodeType.CODE_39));
        reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
        reader.getQualitySettings().setXDimension( XDimensionMode.SMALL);

        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("EA00410001260", reader.getFoundBarCodes()[0].getCodeText());
    }
}
