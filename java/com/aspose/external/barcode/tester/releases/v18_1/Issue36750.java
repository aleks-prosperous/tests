package com.aspose.external.barcode.tester.releases.v18_1;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.generation.BarCodeImageFormat;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;
import java.io.IOException;
import java.util.Random;


@Test
public class Issue36750
{
    private String generatedFolder = Global.getGeneratedImagesFolder("Issue36750");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testConsistentGenerationPngDataMatrix() throws IOException
    {
        String filePath = generatedFolder + File.separator + generateRandomFileName("png");

        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATA_MATRIX, "ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        gen.save(filePath, BarCodeImageFormat.PNG);
        Assert.assertTrue(new File(filePath).exists());
        long firstBytesLength = new File(filePath).length();
        gen = new BarcodeGenerator(EncodeTypes.DATA_MATRIX, "ABC");
        gen.save(filePath, BarCodeImageFormat.PNG);
        Assert.assertTrue(new File(filePath).exists());
        long secondBytesLength = new File(filePath).length();

            Assert.assertTrue(firstBytesLength > secondBytesLength, "File size from the first pass must be greater than second.");
    }

    @Test
    public void testConsistentGenerationPng() throws IOException
    {
        testHelper(BarCodeImageFormat.PNG, "png");
    }

    @Test
    public void testConsistentGenerationBmp() throws IOException
    {
        testHelper(BarCodeImageFormat.BMP, "bmp");
    }

    @Test
    public void testConsistentGenerationEmf() throws IOException
    {
        testHelper(BarCodeImageFormat.EMF, "emf");
    }

    @Test
    public void testConsistentGenerationGif() throws IOException
    {
        testHelper(BarCodeImageFormat.GIF, "gif");
    }

    @Test
    public void testConsistentGenerationJpeg() throws IOException
    {
        testHelper(BarCodeImageFormat.JPEG, "jpeg");
    }

    @Test
    public void testConsistentGenerationTiff() throws IOException
    {
        testHelper(BarCodeImageFormat.TIFF, "tiff");
    }

    @Test
    public void testConsistentGenerationTiffInCmyk() throws IOException
    {
        testHelper(BarCodeImageFormat.TIFF_IN_CMYK, "tiff");
    }

    private void testHelper(BarCodeImageFormat imageFormat, String fileExtension) throws IOException
    {
        String filePath = generatedFolder + File.separator + generateRandomFileName(fileExtension);

        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.CODE_128, "ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        gen.save(filePath, imageFormat);
        Assert.assertTrue(new File(filePath).exists());
        long firstBytesLength = new File(filePath).length();
        gen = new BarcodeGenerator(EncodeTypes.CODE_128, "ABC");
        gen.save(filePath, imageFormat);
        Assert.assertTrue(new File(filePath).exists());
        long secondBytesLength = new File(filePath).length();

        Assert.assertTrue(firstBytesLength > secondBytesLength, "File size from the first pass must be greater than second.");
    }

    private String generateRandomFileName(String fileExt)
    {
        Random rnd = new Random(System.currentTimeMillis());
        return "outfile_Issue36750_" + rnd.nextInt() + ".xxx" + fileExt;
    }
}

