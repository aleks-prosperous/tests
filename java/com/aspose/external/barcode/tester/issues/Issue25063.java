package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.DeconvolutionMode;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * <p>
 * Issue25063 tests. Is it possible to generate a barcode like the attached image? - FilledBars.
 * </p>
 */
@Test(description = "Tests for Issue25063 (FilledBars).")
public class Issue25063
{
    private final String expectedDataFilesFolderPath = Global.getIssuesTestImagePath(File.separator + "Issue25063");
    private final String generatedDataFilesFolderPath = Global.getGeneratedImagesFolder("Issues" + File.separator + "Issue25063");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

        @Test
    public void testFilledBarsDefaultOptionValue()
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.CODE_128, "TEXT");
        {
            Assert.assertTrue(gen.getParameters().getBarcode().getFilledBars());
        }
    }

    /**
     * <p>
     * Tests generating and recognize barcode with empty bars.
     * </p>
     */
    @Test
    public void generateAndRecognizeCode128Text() throws IOException
    {
        String fileName = "barcode_filled.png";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.CODE_128, "TEXT");
        {
            gen.getParameters().getBarcode().setFilledBars(false);
            gen.save(generatedDataFilesFolderPath + fileName);
        }

        final BarCodeReader reader = new BarCodeReader(generatedDataFilesFolderPath + fileName, DecodeType.ALL_SUPPORTED_TYPES);

        reader.getQualitySettings().setDeconvolution(DeconvolutionMode.SLOW);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("TEXT", reader.getFoundBarCodes()[0].getCodeText());

    }

    /**
     * <p>
     * Tests recognition customer's image with manually filled bars.
     * </p>
     */
    @Test
    public void recognizeManuallyFilledCustomerImage()
    {
        String fileName = "barcode_filled.jpg";
        String path = Global.pathCombine(expectedDataFilesFolderPath, fileName);

        final BarCodeReader reader = new BarCodeReader(path, DecodeType.ALL_SUPPORTED_TYPES);

        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("TEXT", reader.getFoundBarCodes()[0].getCodeText());

    }

    /**
     * <p>
     * Tests recognition our image with manually filled bars.
     * </p>
     */
    @Test
    public void recognizeManuallyFilledOutImage()
    {
        String fileName = "code128Text_filled_man.png";
        String path = Global.pathCombine(expectedDataFilesFolderPath, fileName);


        final BarCodeReader reader = new BarCodeReader(path, DecodeType.ALL_SUPPORTED_TYPES);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("TEXT", reader.getFoundBarCodes()[0].getCodeText());
    }

    /**
     * <p>
     * Tests generation and recognition with filled bars.
     * </p>
     */
    @Test
    public void generateAndRecognizeFilledBarcode()
    {
        //generate with true option
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.CODE_128, "TEXT");
        {
            gen.getParameters().getBarcode().setFilledBars(true);
            BufferedImage barCode = gen.generateBarCodeImage();
            {
                BarCodeReader reader = new BarCodeReader(barCode, DecodeType.CODE_128);
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals("TEXT", reader.getFoundBarCodes()[0].getCodeText());
            }
        }

        //generate without option (true is default)
        gen = new BarcodeGenerator(EncodeTypes.CODE_128, "TEXT");
        {
            BufferedImage barCode = gen.generateBarCodeImage();
            {
                BarCodeReader reader = new BarCodeReader(barCode, DecodeType.CODE_128);
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals("TEXT", reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }

    /**
     * <p>
     * Tests generation and recognition (unsuccess - our tool can't recognize it) with empty bars.
     * </p>
     */
    @Test
    public void generateAndRecognizeEmptyBarcode()
    {
        //generate with true option
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.CODE_128, "TEXT");
            gen.getParameters().getBarcode().setFilledBars(false);
            BufferedImage barCode = gen.generateBarCodeImage();
        final BarCodeReader reader = new BarCodeReader(barCode, DecodeType.CODE_128);

        reader.getQualitySettings().setDeconvolution(DeconvolutionMode.SLOW);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("TEXT", reader.getFoundBarCodes()[0].getCodeText());

    }

    /**
     * <p>
     * Tests generation and recognition (success - FilledBars doesn't work with 2D barcodes) with empty bars.
     * </p>
     */
    @Test
    public void generateAndRecognize2DBarcode()
    {
        //generate with true option
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATA_MATRIX, "TEXT");
            gen.getParameters().getBarcode().setFilledBars(false);
            BufferedImage barCode = gen.generateBarCodeImage();
        final BarCodeReader reader = new BarCodeReader(barCode, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("TEXT", reader.getFoundBarCodes()[0].getCodeText());

    }
}

