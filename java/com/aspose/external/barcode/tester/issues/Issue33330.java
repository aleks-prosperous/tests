package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.image.BufferedImage;
import java.io.IOException;


@Test(description = "Tests for Issue33330.")
public class Issue33330
{
    private final String readFolder = Global.getTestDataFolder("Issues" + java.io.File.separator + "Issue33330");
    private final String writeFolder = Global.getGeneratedImagesFolder("Issues" + java.io.File.separator + "Issue33330");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void generateSamplePicture() throws IOException
    {
        final String text = "this is a data matrix barcode test. This should produced a barcode that works with any 2d scanner.";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATA_MATRIX, text);
        {
            gen.save(Global.getTempFolder("Aspose_Image_New.png"));
        }
    }

    @Test
    public void readSamplePicture()
    {
        final String text = "this is a data matrix barcode test. This should produced a barcode that works with any 2d scanner.";
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(readFolder, "Aspose_Image_New.png"), DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(text, reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void generateAndReadSamplePicture()
    {
        final String text = "this is a data matrix barcode test. This should produced a barcode that works with any 2d scanner.";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATA_MATRIX, text);

            BufferedImage bitmap = gen.generateBarCodeImage();

        BarCodeReader reader = new BarCodeReader(bitmap, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(text, reader.getFoundBarCodes()[0].getCodeText());
    }
}

