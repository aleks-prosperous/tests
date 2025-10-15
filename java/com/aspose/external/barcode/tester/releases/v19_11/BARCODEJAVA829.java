package com.aspose.external.barcode.tester.releases.v19_11;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class BARCODEJAVA829
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "BARCODEJAVA829");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test(enabled = false) //TODO awaiting feedback
    public void test() throws IOException
    {
//        String imagePath = folder +  "DOC00000008_1.tif";
//        String imagePath = folder +  "doc20120105155223.png";
        String imagePath = folder +  "doc20120105155223_cutted.png";
//        ImageInputStream is = ImageIO.createImageInputStream(new File(imagePath));
//        javax.imageio.ImageReader reader = iterator.next();
//        reader.setInput(is);
//        int numberOfPages = reader.getNumImages(true);
//        BarCodeReader reader = new BarCodeReader(imagePath);
//        for (int i = 0; i < numberOfPages; i++)
//        {
        try
        {
            File file = new File(imagePath);
            if(!file.exists())
            {
                return;
            }
            BufferedImage buffered = ImageIO.read(file);
            BarCodeReader reader = new BarCodeReader(buffered, DecodeType.CODE_128); // ClassCastException thrown here
            for (BarCodeResult result : reader.readBarCodes())
            {
                System.out.println("BarCode CodeText: " + result.getCodeText());
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
