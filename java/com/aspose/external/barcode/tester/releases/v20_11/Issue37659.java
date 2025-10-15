package com.aspose.external.barcode.tester.releases.v20_11;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import com.aspose.barcode.generation.Pdf417CompactionMode;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.awt.image.BufferedImage;
import java.io.File;

public class Issue37659
{
    /// <summary>
    /// Path to folder with files for testing Issue37659.
    /// </summary>
    private final static String Folder = Global.getTestDataFolder("Issues\\Issue37659");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void SetUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test_SavedImages()
    {
        String lTestStrTBLT = "1234567Aa" + (char)127 + "12345";
        String lTestStrNBLT = "12345678901234" + (char)127 + "12345";
        String lTestStrNBLN = "12345678901234" + (char)127 + "12345678901234";
        String lTestStrTBLN = "12345Aa" + (char)127 + "12345678901234";
        String lTestStrTBL = "1234567Aa" + (char)127;
        String lTestStrNBL = "12345678901234" + (char)127;
        String lTestApostrophe = "12345678'90";

        RecognizePDF417("TestStrTBLT.png", lTestStrTBLT);
        RecognizePDF417("TestStrNBLT.png", lTestStrNBLT);
        RecognizePDF417("TestStrNBLN.png", lTestStrNBLN);
        RecognizePDF417("TestStrTBLN.png", lTestStrTBLN);
        RecognizePDF417("TestStrTBL.png", lTestStrTBL);
        RecognizePDF417("TestStrNBL.png", lTestStrNBL);
        RecognizePDF417("Apostrophe1.png", lTestApostrophe);
    }


    @Test
    public void test_With127char()
    {
        String lTestStrTBLT = "1234567Aa" + (char)127 + "12345";
        String lTestStrNBLT = "12345678901234" + (char)127 + "12345";
        String lTestStrNBLN = "12345678901234" + (char)127 + "12345678901234";
        String lTestStrTBLN = "12345Aa" + (char)127 + "12345678901234";
        String lTestStrTBL = "1234567Aa" + (char)127;
        String lTestStrNBL = "12345678901234" + (char)127;
        GenerateAndRecognizeBinary(lTestStrTBLT);
        GenerateAndRecognizeBinary(lTestStrNBLT);
        GenerateAndRecognizeBinary(lTestStrNBLN);
        GenerateAndRecognizeBinary(lTestStrTBLN);
        GenerateAndRecognizeBinary(lTestStrTBL);
        GenerateAndRecognizeBinary(lTestStrNBL);
    }

    @Test
    public void test_WithApostrophe()
    {
        GenerateAndRecognize("12345678'90");
        GenerateAndRecognize("1'2asaKL3:\\45678'90");
    }

    @Test
    public void test_FullTextCompactionAlphabet()
    {
        String lTextModeStr = GenerateTextCompactionString();
        GenerateAndRecognize(lTextModeStr);
        GenerateAndRecognize(" !AAaa!!");
    }

    @Test
    public void test_BinaryCompactionAlphabet()
    {
        String lBinaryModeStr = GenerateBinaryCompactionString();
        GenerateAndRecognizeBinary(lBinaryModeStr);
    }

    @Test
    public void test_NumericCompation()
    {
        //Codewords = INT (number of digits / 3) +1
        GenerateAndRecognize("0123456789", Pdf417CompactionMode.NUMERIC);
        GenerateAndRecognize("0123456789");
        GenerateAndRecognize("012345678901", Pdf417CompactionMode.NUMERIC);
        GenerateAndRecognize("012345678901");
    }

    private void GenerateAndRecognizeBinary(String codetext)
    {
        GenerateAndRecognize(codetext, codetext, Pdf417CompactionMode.BINARY);
        GenerateAndRecognize(codetext, codetext, Pdf417CompactionMode.AUTO);
    }

    private void GenerateAndRecognize(String codetext)
    {
        GenerateAndRecognize(codetext, codetext, Pdf417CompactionMode.TEXT);
        GenerateAndRecognize(codetext, codetext, Pdf417CompactionMode.BINARY);
        GenerateAndRecognize(codetext, codetext, Pdf417CompactionMode.AUTO);
    }

    private void GenerateAndRecognize(String codetext, Pdf417CompactionMode mode)
    {
        GenerateAndRecognize(codetext, codetext, mode);
    }

    private void GenerateAndRecognize(String codetext, String resultCodetext, Pdf417CompactionMode mode)
    {
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.PDF_417, codetext);
        {
            generator.getParameters().getBarcode().getPdf417().setPdf417CompactionMode(mode);
            BufferedImage bmp = generator.generateBarCodeImage();
            {
                BarCodeReader reader = new BarCodeReader(bmp, DecodeType.PDF_417);
                {
                    Assert.assertEquals(reader.readBarCodes().length, 1);
                    Assert.assertEquals(resultCodetext, reader.getFoundBarCodes()[0].getCodeText());
                }
            }
        }
    }

    private void RecognizePDF417(String fileName, String codetext)
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, fileName), DecodeType.PDF_417);
        {
            reader.readBarCodes();
            Assert.assertEquals(reader.getFoundBarCodes().length, 1);
            Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    private void GenerateAndSave(String filename, String codetext, Pdf417CompactionMode mode)
    {
        GenerateAndSave(Folder, filename, codetext, mode);
    }

    private void GenerateAndSave(String folder, String filename, String codetext, Pdf417CompactionMode mode)
    {
        try
        {
            String lFileName = Global.pathCombine(folder, filename + ".png");

            if (new File(lFileName).exists())
            {
//                File.SetAttributes(lFileName, FileAttributes.Normal);
//                File.Delete(lFileName);
                new File(lFileName).delete();
            }

            BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.PDF_417, codetext);
            {
                gen.getParameters().getBarcode().getPdf417().setPdf417CompactionMode(mode);
                gen.save(lFileName);
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    private static String GenerateBinaryCompactionString()
    {
        //5.4.3 Byte Compaction mode
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 256; ++i)
            sb.append((char)i);

        return sb.toString();
    }

    private static String GenerateTextCompactionString()
    {
        //5.4.2.1 Text Compaction sub - modes
        StringBuilder sb = new StringBuilder();
        for (int i = 32; i < 127; ++i)
            sb.append((char)i);

        //additional
        sb.append((char)9);
        sb.append((char)10);
        sb.append((char)13);

        return sb.toString();
    }
}
