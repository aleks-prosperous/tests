package com.aspose.external.barcode.tester.barcodjava;

import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.BaseEncodeType;
import com.aspose.barcode.generation.EncodeTypes;
import com.aspose.barcode.auxiliary.Global;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BARCODJAVA33520
{
    String baseFolder = Global.getTestDataFolder("barcodjava_issues");
    String generatedPath = Global.getGeneratedImagesFolder("barcodjava_issues" + File.separator + "BARCODJAVA33520");

    @BeforeMethod
    public void setLicense() throws Exception
    {
        com.aspose.barcode.LicenseAssistant.setupLicense();
    }

    @Test
    public void testIssue() throws IOException
    {
        List<GenObject> genBarcodes = new ArrayList<GenObject>();
        genBarcodes.add(new GenObject("01234567094987654321", EncodeTypes.ONE_CODE, "large"));
        for (GenObject genBarcode : genBarcodes)
        {
            Assert.assertTrue(generateBarcode(genBarcode));
            Assert.assertTrue(verifyGeneratedBarcode(genBarcode));
        }
    }

    private boolean verifyGeneratedBarcode(GenObject genBarcode) throws IOException
    {
        BufferedImage expected = ImageIO.read(new File(baseFolder + "BARCODJAVA33520" + File.separator + "NET_" + genBarcode.getFileNamePrefix() + "_GetBar.png"));
        BufferedImage actual = ImageIO.read(new File(generatedPath + genBarcode.getFileNamePrefix() + "_GetBar.png"));
        int fakePixelsCounter = 0;
        if (expected.getWidth() == actual.getWidth() && expected.getHeight() == actual.getHeight())
        {
            for (int x = 0; x < expected.getWidth(); x++)
            {
                for (int y = 0; y < expected.getHeight(); y++)
                {
                    if (expected.getRGB(x, y) != actual.getRGB(x, y))
                    {
                        fakePixelsCounter++;
                    }
                }
            }
        } else
        {
            return false;
        }

        return fakePixelsCounter < 887;
    }

    private boolean generateBarcode(GenObject genBarcode) throws IOException
    {
        BufferedImage img;
        try
        {
            BarcodeGenerator builder = new BarcodeGenerator(genBarcode.getSymbology());
            builder.setCodeText(genBarcode.getCodeText()); //or "123" or "01234567094987654321"
            img = builder.generateBarCodeImage();//save this to a file
        } catch (Exception e)
        {
            return false;
        }
        // Saving the buffered image
        File outputfile = new File(generatedPath + genBarcode.getFileNamePrefix() + "_GetBar.png");
        ImageIO.write(img, "png", outputfile);
        return true;
    }

    private class GenObject
    {
        String codeText;
        BaseEncodeType symbology;
        String fileNamePrefix;

        public GenObject(String codeText, BaseEncodeType symbology, String fileNamePrefix)
        {
            this.codeText = codeText;
            this.symbology = symbology;
            this.fileNamePrefix = fileNamePrefix;
        }

        public String getCodeText()
        {
            return codeText;
        }

        public void setCodeText(String codeText)
        {
            this.codeText = codeText;
        }

        public BaseEncodeType getSymbology()
        {
            return symbology;
        }

        public void setSymbology(BaseEncodeType symbology)
        {
            this.symbology = symbology;
        }

        public String getFileNamePrefix()
        {
            return fileNamePrefix;
        }

        public void setFileNamePrefix(String fileNamePrefix)
        {
            this.fileNamePrefix = fileNamePrefix;
        }
    }
}
