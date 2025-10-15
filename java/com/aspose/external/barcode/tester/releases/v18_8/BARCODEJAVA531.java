package com.aspose.external.barcode.tester.releases.v18_8;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.generation.AutoSizeMode;
import com.aspose.barcode.generation.BarCodeImageFormat;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class BARCODEJAVA531
{
    private static final String folder = Global.getBarcodeJavaIssuesTestImagePath("BARCODEJAVA531");
    private String generatedImagesFolder = Global.getBarcodejavaIssuesGeneratedImagesFolder("BARCODEJAVA531");
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testDotCodeGenerationWithDifferentResolutions() throws IOException
    {
        String text = "(420)94901(92)02090107615900001236";
        String expectedFilePath = folder + File.separator + "expected_Gs1Code128_test.png";
        String actualFilePath = generatedImagesFolder + File.separator + "actual_Gs1Code128_test.png";

        BarcodeGenerator builder = new BarcodeGenerator(EncodeTypes.GS_1_CODE_128, text);
        builder.getParameters().setAutoSizeMode(AutoSizeMode.INTERPOLATION);

        builder.save(actualFilePath, BarCodeImageFormat.PNG);
        compareImages(actualFilePath, expectedFilePath);
    }

    private void compareImages(String actualPath, String expectedPath) throws IOException
    {
        BufferedImage actual = ImageIO.read(new File(actualPath));
        BufferedImage expected = ImageIO.read(new File(expectedPath));
        Assert.assertEquals(actual.getWidth(), expected.getWidth());
        Assert.assertEquals(actual.getHeight(), expected.getHeight());
        for(int i = 0; i < actual.getWidth(); i++)
            for(int j = 0; j < actual.getHeight(); j++)
                Assert.assertEquals(actual.getRGB(i,j), expected.getRGB(i,j));
    }
}
