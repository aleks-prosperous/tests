package com.aspose.external.barcode.tester.releases.v22_8;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * This issue related to BARCODENET-38250 Broken data in PDF417 using Aspose.BarCode for .NET that is added to
 * release notes
 */
public class Issue38262
{
    private static final String Folder = Global.getTestDataFolder("Issues\\Issue38262");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    /// <summary>
    /// Tests Pdf417 generates correct barcode with code 913.
    /// </summary>
    @Test
    public void test_Pdf417_with_code_913() throws IOException
    {
        List<String> codeTexts = new ArrayList<>();

        codeTexts.add("abcda\u008dabcda");
        codeTexts.add("abcda\u008dABCDA");
        codeTexts.add("abcdA\u008dabcda");
        codeTexts.add("abcdA\u008dABCDA");
        codeTexts.add("abcd1\u008dABCDA");
        codeTexts.add("abcd1\u008d11111");
        codeTexts.add("abcd1\u008d}}}}}");
        codeTexts.add("abcd}\u008dabcda");
        codeTexts.add("abcd}\u008dABCDA");
        codeTexts.add("ABCDa\u008dabcda");
        codeTexts.add("ABCDa\u008dABCDA");
        codeTexts.add("ABCD1\u008dABCDA");
        codeTexts.add("ABCD1\u008d11111");
        codeTexts.add("ABCD1\u008d}}}}}");
        codeTexts.add("1111a\u008dabcda");
        codeTexts.add("1111a\u008dABCDA");
        codeTexts.add("11111\u008dABCDA");
        codeTexts.add("11111\u008d11111");
        codeTexts.add("11111\u008d}}}}}");
        codeTexts.add("1111}\u008dABCDA");
        codeTexts.add("1111}\u008d11111");
        codeTexts.add("1111}\u008d}}}}}");
        codeTexts.add("}}}}a\u008dabcda");
        codeTexts.add("}}}}a\u008dABCDA");
        codeTexts.add("}}}}1\u008dABCDA");
        codeTexts.add("}}}}1\u008d11111");
        codeTexts.add("}}}}1\u008d}}}}}");
        for(String codetext : codeTexts)
        {
            BarcodeGenerator b = new BarcodeGenerator(EncodeTypes.PDF_417);
            b.getParameters().getBarcode().getPdf417().setPdf417CompactionMode(Pdf417CompactionMode.AUTO);
            b.getParameters().getBarcode().getPdf417().setPdf417ErrorLevel(Pdf417ErrorLevel.LEVEL_2);
            b.getParameters().getBarcode().getPdf417().setColumns(4);
            b.getParameters().getBarcode().getPdf417().setRows(12);
            b.getParameters().getBarcode().getXDimension().setPixels(3);
            b.getParameters().getBarcode().getPdf417().setAspectRatio(1.33F);
            b.setCodeText(codetext);

            ByteArrayOutputStream barcodeStream = new ByteArrayOutputStream();
            b.save(barcodeStream, BarCodeImageFormat.PNG);
            BarCodeReader reader = new BarCodeReader(new ByteArrayInputStream(barcodeStream.toByteArray()), DecodeType.PDF_417);
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }

    @Test(enabled = false) // TODO UTF-7 is not supported in Java
    public void test_Pdf417_with_code_913_user_data() throws IOException
    {
        GenerateAndRecognizeServiceCode(readFile(Global.pathCombine(Folder, "testData.zip"), Charset.forName("UTF-7")));
        GenerateAndRecognizeServiceCode(readFile(Global.pathCombine(Folder, "testDataOkay.zip"), Charset.forName("UTF-7")));
    }

    @Test
    public void test_Pdf417_with_code_913_user_data_java_adapted() throws IOException
    {
        GenerateAndRecognizeServiceCode(readFile(Global.pathCombine(Folder, "txab1"), StandardCharsets.UTF_8));
        GenerateAndRecognizeServiceCode(readFile(Global.pathCombine(Folder, "txab2"), StandardCharsets.UTF_8));
    }

    private static String readFile(String path, Charset encoding)
            throws IOException
    {
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded, encoding);
    }

    private void GenerateAndRecognizeServiceCode(String code)
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.PDF_417, code);
        {
            gen.getParameters().getBarcode().getPdf417().setPdf417CompactionMode(Pdf417CompactionMode.AUTO);
            gen.getParameters().getBarcode().getPdf417().setPdf417ECIEncoding(ECIEncodings.NONE);
            gen.setCodeText(code);
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.PDF_417);
            {
                Assert.assertEquals(1, reader.readBarCodes().length);
                Assert.assertEquals(code, reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }
}
