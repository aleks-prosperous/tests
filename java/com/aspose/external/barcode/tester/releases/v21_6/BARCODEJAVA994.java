package com.aspose.external.barcode.tester.releases.v21_6;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class BARCODEJAVA994
{
    final String folder = Global.getTestDataFolder("Issues/BARCODEJAVA994");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testImagesDifference() throws IOException
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.CODABAR, "0123456789");
        gen.getParameters().getBarcode().getXDimension().setPixels(3);
        BufferedImage javaImage = gen.generateBarCodeImage();
        String fileNameJava = folder + "java_image.png";
        ImageIO.write(javaImage, "PNG", new File(fileNameJava));
    }
}
