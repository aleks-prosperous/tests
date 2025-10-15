package com.aspose.external.barcode.tester.releases.v17_12;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;

public class Issue36689
{
    /**
     * Path to folder with files for testing Issue36689.
     */
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue36689");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testCode128AllImageMaxQuality()
    {
        String file = folder + "NX_019.jpg";
        BarCodeReader reader = new BarCodeReader(file, DecodeType.CODE_128);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("FMPAT0000014371586101106", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testCode128AllImage()
    {
        String file = folder + "NX_019.jpg";
        BarCodeReader reader = new BarCodeReader(file, DecodeType.CODE_128);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("FMPAT0000014371586101106", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testCode128_EditedImage()
    {
        String file = folder + "NX_019_edited.jpg";
        BarCodeReader reader = new BarCodeReader(file, DecodeType.CODE_128);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("FMPAT0000014371586101106", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testAllSupportedTypesAllImage()
    {
        String file = folder + "NX_019.jpg";
        BarCodeReader reader = new BarCodeReader(file);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("FMPAT0000014371586101106", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testcut()
    {
        String file = folder + "NX_019_cut.jpg";
        BarCodeReader reader = new BarCodeReader(file, DecodeType.CODE_128);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("FMPAT0000014371586101106", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testcut2()
    {
        String file = folder + "NX_019_cut2.jpg";
        BarCodeReader reader = new BarCodeReader(file, DecodeType.CODE_128);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("FMPAT0000014371586101106", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testCode128Cut()
    {
        String file = folder + "NX_019_Code128_cut.jpg";
        BarCodeReader reader = new BarCodeReader(file, DecodeType.CODE_128);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("FMPAT0000014371586101106", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testCode128CutRot()
    {
        String file = folder + "NX_019_Code128_cut_rot.jpg";
        BarCodeReader reader = new BarCodeReader(file, DecodeType.CODE_128);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("FMPAT0000014371586101106", reader.getFoundBarCodes()[0].getCodeText());
    }
}
