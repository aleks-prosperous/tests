package com.aspose.external.barcode.tester.barcodjava;

import com.aspose.barcode.generation.EncodeTypes;
import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.generation.BarcodeGenerator;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.aspose.barcode.LicenseAssistant;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class BARCODEJAVA994
{
    private static final String folder = Global.getBarcodeJavaIssuesTestImagePath("BARCODEJAVA994");
    @BeforeMethod
    public void SetUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testImagesDifference() throws IOException
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.CODABAR);
        gen.getParameters().getBarcode().getXDimension().setPixels(3);
        BufferedImage javaImage = gen.generateBarCodeImage();
        String fileNameNet = folder + "net_image.png";
        String fileNameJava = folder + "java_image.png";
        ImageIO.write(javaImage, "PNG", new File(fileNameJava));
        BufferedImage netImage = ImageIO.read(new File(fileNameNet));
//        TestHelper.compareBitmaps(netImage, javaImage); //TODO BARCODEJAVA-994
    }
}
