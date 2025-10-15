package com.aspose.external.barcode.tester.releases.v25_2;

import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BaseDecodeType;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.BaseEncodeType;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Issue39189
{
    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test_Code128_ASCII()
    {
        generateAndCheckShort("123ABCDFVC", StandardCharsets.US_ASCII, EncodeTypes.CODE_128, "123ABCDFVC");
        generateAndCheckFull("123ABCDFVC", StandardCharsets.US_ASCII, false, EncodeTypes.CODE_128, "123ABCDFVC");
        generateAndCheckFull("123ABCDFVC", StandardCharsets.US_ASCII, true, EncodeTypes.CODE_128, "123ABCDFVC");

        generateAndRecognizeShort("123ABCDFVC", StandardCharsets.US_ASCII, EncodeTypes.CODE_128, DecodeType.CODE_128, "123ABCDFVC");
        generateAndRecognizeFull("123ABCDFVC", StandardCharsets.US_ASCII, false, EncodeTypes.CODE_128, DecodeType.CODE_128, "123ABCDFVC");
        generateAndRecognizeFull("123ABCDFVC", StandardCharsets.US_ASCII, true, EncodeTypes.CODE_128, DecodeType.CODE_128, "123ABCDFVC");
    }

    @Test
    public void test_Code128_iso_8859_1()
    {
        //https://learn.microsoft.com/ru-ru/dotnet/fundamentals/runtime-libraries/system-text-encoding
        generateAndCheckShort("123ABCDFVC", StandardCharsets.ISO_8859_1, EncodeTypes.CODE_128, "123ABCDFVC");
        generateAndCheckFull("123ABCDFVC", StandardCharsets.ISO_8859_1, false, EncodeTypes.CODE_128, "123ABCDFVC");
        generateAndCheckFull("123ABCDFVC", StandardCharsets.ISO_8859_1, true, EncodeTypes.CODE_128, "123ABCDFVC");

        generateAndRecognizeShort("123ABCDFVC", StandardCharsets.ISO_8859_1, EncodeTypes.CODE_128, DecodeType.CODE_128, "123ABCDFVC");
        generateAndRecognizeFull("123ABCDFVC", StandardCharsets.ISO_8859_1, false, EncodeTypes.CODE_128, DecodeType.CODE_128, "123ABCDFVC");
        generateAndRecognizeFull("123ABCDFVC", StandardCharsets.ISO_8859_1, true, EncodeTypes.CODE_128, DecodeType.CODE_128, "123ABCDFVC");
    }

    @Test
    public void test_Code128_UTF8()
    {
        generateAndCheckShort("123ABCDFVC", StandardCharsets.UTF_8, EncodeTypes.CODE_128, "ï»¿123ABCDFVC");
        generateAndCheckFull("123ABCDFVC", StandardCharsets.UTF_8, false, EncodeTypes.CODE_128, "123ABCDFVC");
        generateAndCheckFull("123ABCDFVC", StandardCharsets.UTF_8, true, EncodeTypes.CODE_128, "ï»¿123ABCDFVC");

        generateAndCheckFull("123ABCDFVC", StandardCharsets.UTF_8, false, EncodeTypes.CODE_128, "123ABCDFVC");
        generateAndCheckFull("123ABCDFVC", StandardCharsets.UTF_8, true, EncodeTypes.CODE_128, "ï»¿123ABCDFVC");
        generateAndCheckFull("123ABCDFVC", StandardCharsets.UTF_8, false, EncodeTypes.CODE_128, "123ABCDFVC");
        generateAndCheckFull("123ABCDFVC", StandardCharsets.UTF_8, true, EncodeTypes.CODE_128, "ï»¿123ABCDFVC");

        generateAndRecognizeShort("123ABCDFVC", StandardCharsets.UTF_8, EncodeTypes.CODE_128, DecodeType.CODE_128, "ï»¿123ABCDFVC");
        generateAndRecognizeFull("123ABCDFVC", StandardCharsets.UTF_8, false, EncodeTypes.CODE_128, DecodeType.CODE_128, "123ABCDFVC");
        generateAndRecognizeFull("123ABCDFVC", StandardCharsets.UTF_8, true, EncodeTypes.CODE_128, DecodeType.CODE_128, "ï»¿123ABCDFVC");
    }

    @Test
    public void test_QR_ASCII()
    {
        generateAndCheckShort("123ABCDFVC", StandardCharsets.US_ASCII, EncodeTypes.QR, "123ABCDFVC");
        generateAndCheckFull("123ABCDFVC", StandardCharsets.US_ASCII, false, EncodeTypes.QR, "123ABCDFVC");
        generateAndCheckFull("123ABCDFVC", StandardCharsets.US_ASCII, true, EncodeTypes.QR, "123ABCDFVC");

        generateAndRecognizeShort("123ABCDFVC", StandardCharsets.US_ASCII, EncodeTypes.QR, DecodeType.QR, "123ABCDFVC");
        generateAndRecognizeFull("123ABCDFVC", StandardCharsets.US_ASCII, false, EncodeTypes.QR, DecodeType.QR, "123ABCDFVC");
        generateAndRecognizeFull("123ABCDFVC", StandardCharsets.US_ASCII, true, EncodeTypes.QR, DecodeType.QR, "123ABCDFVC");
    }

    @Test
    public void test_QR_UTF8()
    {
        generateAndCheckShort("123ABCDFVC", StandardCharsets.UTF_8, EncodeTypes.QR, "ï»¿123ABCDFVC");
        generateAndCheckFull("123ABCDFVC", StandardCharsets.UTF_8, false, EncodeTypes.QR, "123ABCDFVC");
        generateAndCheckFull("123ABCDFVC", StandardCharsets.UTF_8, true, EncodeTypes.QR, "ï»¿123ABCDFVC");

        generateAndRecognizeShort("123ABCDFVC", StandardCharsets.UTF_8, EncodeTypes.QR, DecodeType.QR, "123ABCDFVC");
        generateAndRecognizeFull("123ABCDFVC", StandardCharsets.UTF_8, false, EncodeTypes.QR, DecodeType.QR, "123ABCDFVC");
        generateAndRecognizeFull("123ABCDFVC", StandardCharsets.UTF_8, true, EncodeTypes.QR, DecodeType.QR, "123ABCDFVC");

        generateAndRecognizeShort("слово", StandardCharsets.UTF_8, EncodeTypes.QR, DecodeType.QR, "слово");
        generateAndRecognizeFull("слово", StandardCharsets.UTF_8, false, EncodeTypes.QR, DecodeType.QR, "слово");
        generateAndRecognizeFull("слово", StandardCharsets.UTF_8, true, EncodeTypes.QR, DecodeType.QR, "слово");
    }

    private void generateAndCheckShort(String codeText, Charset encoding, BaseEncodeType encType, String recResult)
    {
        BarcodeGenerator gen = new BarcodeGenerator(encType);
        {
            gen.setCodeText(codeText, encoding);
            Assert.assertEquals(recResult, gen.getCodeText());
        }
    }

    private void generateAndCheckFull(String codeText, Charset encoding, boolean insertBOM, BaseEncodeType encType, String recResult)
    {
        BarcodeGenerator gen = new BarcodeGenerator(encType);
        {
            gen.setCodeText(codeText, encoding, insertBOM);
            Assert.assertEquals(recResult, gen.getCodeText());
        }
    }

    private void generateAndRecognizeShort(String codeText, Charset encoding, BaseEncodeType encType, BaseDecodeType decType, String recResult)
    {
        BarcodeGenerator gen = new BarcodeGenerator(encType);
        {
            gen.setCodeText(codeText, encoding);
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), decType);
            {
                Assert.assertEquals(1, reader.readBarCodes().length);
                Assert.assertEquals(recResult, reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }

    private void generateAndRecognizeFull(String codeText, Charset encoding, boolean insertBOM, BaseEncodeType encType, BaseDecodeType decType, String recResult)
    {
        BarcodeGenerator gen = new BarcodeGenerator(encType);
        {
            gen.setCodeText(codeText, encoding, insertBOM);
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), decType);
            {
                Assert.assertEquals(1, reader.readBarCodes().length);
                Assert.assertEquals(recResult, reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }
}
