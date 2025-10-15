package com.aspose.external.barcode.tester.releases.v18_10;


import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.QualitySettings;
import com.sun.media.jai.codec.ImageCodec;
import com.sun.media.jai.codec.ImageDecoder;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

public class BARCODEJAVA552
{
    final String fullPath = Global.getTestDataFolder("Issues/BARCODEJAVA552");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test(enabled = false) //TODO BARCODEJAVA-851
    public void test_Acct_and_Doc_Type_Barcodes_Working_tiff() throws IOException
    {
        System.out.println("\n Test_Acct_and_Doc_Type_Barcodes_Working_tiff()");
        String fileName = fullPath + "Acct_and_Doc_Type_Barcodes_Working.tiff";
        Iterator readers = javax.imageio.ImageIO.getImageReadersBySuffix("tiff");
        if (readers.hasNext())
        {
            File fi = new File(fileName);
            ImageInputStream iis = javax.imageio.ImageIO.createImageInputStream(fi);
//            TIFFDecodeParam param = null;
            ImageDecoder dec = ImageCodec.createImageDecoder("tiff", fi, null);
            // Get the page count of the TIFF image
            int pageCount = dec.getNumPages();
            ImageReader _imageReader = (ImageReader) (readers.next());
            if (_imageReader != null)
            {
                _imageReader.setInput(iis, true);
                //Feed each page to the BarCodeReader
                for (int i = 0; i < pageCount; i++)
                {
                    BufferedImage _bufferedImage = _imageReader.read(i);

                    BarCodeReader reader = new BarCodeReader(_bufferedImage);
                    reader.setQualitySettings(QualitySettings.getHighQuality());
                    int count = 0;
                    for(BarCodeResult result : reader.readBarCodes())
                    {
                        String codeText = result.getCodeType().toString();
                        String codeType = result.getCodeType().getTypeName();
                        System.out.println("Symbology Type: " + codeText);
                        System.out.println("CodeText: " + codeType);
                        Assert.assertEquals(codeType, "Matrix2of5");
                        if(count == 0)
                        {
                            Assert.assertEquals(codeText, "11");
                        }
                        else if(count == 1)
                        {
                            Assert.assertEquals(codeText, "41544");
                        }
                        count++;
                    }
                }

            }
        }
    }

    @Test(enabled = false) //TODO BARCODEJAVA-851
    public void test_Acct_and_Doc_Type_Barcodes_NotWorking_tiff() throws IOException
    {
        System.out.println("\n Test_Acct_and_Doc_Type_Barcodes_NotWorking_tiff()");

        String fileName = fullPath + "Acct_and_ Doc_Type_Barcodes_NotWorking.tiff";
        Iterator readers = javax.imageio.ImageIO.getImageReadersBySuffix("tiff");
        if (readers.hasNext())
        {
            File fi = new File(fileName);
            ImageInputStream iis = javax.imageio.ImageIO.createImageInputStream(fi);
//            TIFFDecodeParam param = null;
            ImageDecoder dec = ImageCodec.createImageDecoder("tiff", fi, null);
            // Get the page count of the TIFF image
            int pageCount = dec.getNumPages();
            ImageReader _imageReader = (ImageReader) (readers.next());
            if (_imageReader != null)
            {
                _imageReader.setInput(iis, true);
                //Feed each page to the BarCodeReader
                for (int i = 0; i < pageCount; i++)
                {
                    BufferedImage _bufferedImage = _imageReader.read(i);

                    BarCodeReader reader = new BarCodeReader(_bufferedImage);
                    int count = 0;
                    for(BarCodeResult result : reader.readBarCodes())
                    {
                        String codeText = result.getCodeType().getString();
                        String codeType = result.getCodeType().getTypeName();
                        System.out.println("Symbology Type: " + codeText);
                        System.out.println("CodeText: " + codeType);
                        Assert.assertEquals(codeType, "Matrix2of5");
                        if(count == 0)
                        {
                            Assert.assertEquals(codeText, "11");
                        }
                        else if(count == 1)
                        {
                            Assert.assertEquals(codeText, "41544");
                        }
                        count++;
                    }
                }

            }
        }
    }

    @Test(enabled = true) //posponed to 18.11
    public void test_MoneyMovement_Working_tiff() throws IOException
    {
        System.out.println("\n Test_MoneyMovement_Working_tiff()");
        String fileName = fullPath + "MoneyMovement_Working.tiff";
        Iterator readers = javax.imageio.ImageIO.getImageReadersBySuffix("tiff");
        if (readers.hasNext())
        {
            File fi = new File(fileName);
            ImageInputStream iis = javax.imageio.ImageIO.createImageInputStream(fi);
//            TIFFDecodeParam param = null;
            ImageDecoder dec = ImageCodec.createImageDecoder("tiff", fi, null);
            // Get the page count of the TIFF image
            int pageCount = dec.getNumPages();
            ImageReader _imageReader = (ImageReader) (readers.next());
            if (_imageReader != null)
            {
                _imageReader.setInput(iis, true);
                //Feed each page to the BarCodeReader
                for (int i = 0; i < pageCount; i++)
                {
                    BufferedImage _bufferedImage = _imageReader.read(i);

                    BarCodeReader reader = new BarCodeReader(_bufferedImage);
                    reader.setQualitySettings(QualitySettings.getNormalQuality());
                    for(BarCodeResult result : reader.readBarCodes())
                    {
                        System.out.println("Symbology Type: " + result.getCodeType());
                        System.out.println("CodeText: " + result.getCodeText());
                    }
                }

            }
        }
    }

    @Test(enabled = true) //posponed to 18.11
    public void test_MoneyMovement_NotWorking_tiff() throws IOException
    {
        System.out.println("\n Test_MoneyMovement_NotWorking_tiff()");
        String fileName = fullPath + "MoneyMovement_NotWorking.tiff";
        Iterator readers = javax.imageio.ImageIO.getImageReadersBySuffix("tiff");
        if (readers.hasNext())
        {
            File fi = new File(fileName);
            ImageInputStream iis = javax.imageio.ImageIO.createImageInputStream(fi);
            ImageDecoder dec = ImageCodec.createImageDecoder("tiff", fi, null);
            // Get the page count of the TIFF image
            int pageCount = dec.getNumPages();
            ImageReader _imageReader = (ImageReader) (readers.next());
            if (_imageReader != null)
            {
                _imageReader.setInput(iis, true);
                //Feed each page to the BarCodeReader
                for (int i = 0; i < pageCount; i++)
                {
                    BufferedImage _bufferedImage = _imageReader.read(i);

                    BarCodeReader reader = new BarCodeReader(_bufferedImage);
                    reader.setQualitySettings(QualitySettings.getNormalQuality());
                    for(BarCodeResult result : reader.readBarCodes())
                    {
                        System.out.println("Symbology Type: " + result.getCodeType());
                        System.out.println("CodeText: " + result.getCodeText());
                    }
                }
            }
        }
    }
}
