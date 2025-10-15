package com.aspose.external.barcode.tester.releases.v23_1;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;

public class Issue38476
{
    /// <summary>
    /// Path to folder with files for testing Issue38476.
    /// </summary>
    private final static String Folder = Global.getTestDataFolder("Issues\\Issue38476");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test_RecognizeISBN()
    {
        RecognizeISBN("9781556154843", "9781556154843.png");
        RecognizeISBN("9780863815805", "0863815804.png");
        RecognizeISBN("9791556154842", "9791556154842.png");
    }

    @Test
    public void test_GenerateAndRecognizeISBN()
    {
        GenerateAndRecognizeISBN("9781556154843");
        GenerateAndRecognizeISBN("0863815804", "9780863815805");
        GenerateAndRecognizeISBN("9791556154842");
    }

    @Test
    public void test_RecognizeISBNFromInternet()
    {
        RecognizeISBN("9798203564580", "ISBN979_from_Internet_1.png");
        RecognizeISBN("9791234567896", "ISBN979_from_Internet_2.png");
        RecognizeISBN("9780863815805", "ISBN979_from_Internet_3.png");
    }

    private void GenerateAndRecognizeISBN(String codetext)
    {
        GenerateAndRecognizeISBN(codetext, codetext);
    }

    private void GenerateAndRecognizeISBN(String codetextWrite, String codetextRead)
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.ISBN, codetextWrite);
        BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.ISBN);
        {
            reader.readBarCodes();
            Assert.assertEquals(reader.getFoundBarCodes().length, 1);
            Assert.assertEquals(DecodeType.ISBN, reader.getFoundBarCodes()[0].getCodeType());
            Assert.assertEquals(codetextRead, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    private void RecognizeISBN(String codetext, String fileName)
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, fileName), DecodeType.ISBN);
        {
            reader.readBarCodes();
            Assert.assertEquals(reader.getFoundBarCodes().length, 1);
            Assert.assertEquals(DecodeType.ISBN, reader.getFoundBarCodes()[0].getCodeType());
            Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    private void GenerateISBN(String codetext, String filename)
    {
        GenerateISBN(codetext, Folder, filename);
    }

    private void GenerateISBN(String codetext, String folder, String filename)
    {
        try
        {
            String fileName = Global.pathCombine(folder, filename);
            File file = new File(fileName);
            if (file.exists())
            {
                file.delete();
            }

            BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.ISBN, codetext);
            {
                gen.getParameters().getBarcode().getXDimension().setPixels(3);
                gen.save(fileName);
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
