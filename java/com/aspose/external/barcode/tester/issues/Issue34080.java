package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.DeconvolutionMode;
import com.aspose.barcode.barcoderecognition.XDimensionMode;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;


/**
 * <p>
 * Tests Issue34080 tests. Can't recognize DataMatrix code from the TIF file
 * </p>
 */
@Test(description = "Tests for Issue34080.")
public class Issue34080
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue34080");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }


    /**
     * <p>
     * Tests original picture
     * </p>
     */
    @Test
    public void testWwwTifDataMatrix()
    {
        final String fileName = "www.TIF";
        String path = Global.pathCombine(folder, fileName);
        final BarCodeReader reader = new BarCodeReader(path, DecodeType.DATA_MATRIX);
        reader.getQualitySettings().setDeconvolution(DeconvolutionMode.SLOW);
        reader.getQualitySettings().setXDimension(XDimensionMode.USE_MINIMAL_X_DIMENSION);
        reader.getQualitySettings().setMinimalXDimension(5);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("7\u00008\u00003\u00009\u00001\u00007\u00004\u00009\u00001\u00000\u00004\u00007\u00000\u00008\u0000", reader.getFoundBarCodes()[0].getCodeText());
    }

    /**
     * <p>
     * Tests cutted datamatrix
     * </p>
     */
    @Test
    public void testCuttedDataMatrix()
    {
        final String fileName = "www_cutted.png";
        String path = Global.pathCombine(folder, fileName);
        final BarCodeReader reader = new BarCodeReader(path, DecodeType.DATA_MATRIX);
        reader.getQualitySettings().setDeconvolution(DeconvolutionMode.SLOW);
        reader.getQualitySettings().setXDimension(XDimensionMode.USE_MINIMAL_X_DIMENSION);
        reader.getQualitySettings().setMinimalXDimension(5);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("7\u00008\u00003\u00009\u00001\u00007\u00004\u00009\u00001\u00000\u00004\u00007\u00000\u00008\u0000", reader.getFoundBarCodes()[0].getCodeText());
    }
}

