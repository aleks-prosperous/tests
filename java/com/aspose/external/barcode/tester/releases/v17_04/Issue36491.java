package com.aspose.external.barcode.tester.releases.v17_04;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.BaseEncodeType;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Test
public class Issue36491
{
    final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue36491");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }


    @Test
    public void gS1Code128GenerateDifferentCodeTexts()
    {
        List<String> gen = new ArrayList<String>();
        List<String> exp = new ArrayList<String>();

        gen.add("(255)123456789012355555");
        exp.add("(255)123456789012855555");

        gen.add("(402)12345678901234567");
        exp.add("(402)12345678901234560");

        gen.add("(8003)12345123451234");
        exp.add("(8003)12345123451236");

        gen.add("(410)1234567890123");
        exp.add("(410)1234567890128");

        gen.add("(410)1234567890128");
        exp.add("(410)1234567890128");

        gen.add("(00)123456789012345678");
        exp.add("(00)123456789012345675");

        gen.add("(01)12345678901234");
        exp.add("(01)12345678901231");

        gen.add("(02)56789012345678");
        exp.add("(02)56789012345673");

        gen.add("(01)98765432104324");
        exp.add("(01)98765432104324");

        gen.add("(253)1234567890123ABC");
        exp.add("(253)1234567890128ABC");

        gen.add("(8018)112233445566778899");
        exp.add("(8018)112233445566778899");

        gen.add("(8003)12345123451234");
        exp.add("(8003)12345123451236");

        gen.add("(8003)12345123451234ABCDEFABCDEFABCD");
        exp.add("(8003)12345123451236ABCDEFABCDEFABCD");

        gen.add("(00)123456789012345678(01)12345678901234(02)56789012345678(01)98765432104324(253)1234567890123ABC");
        exp.add("(00)123456789012345675(01)12345678901231(02)56789012345673(01)98765432104324(253)1234567890128ABC");

        for (int i = 0; i < gen.size(); i++)
        {
            generateAndRecognize(gen.get(i), exp.get(i));
        }
    }

    @Test
    public void generateAndRecognizeExample()
    {
        String codeText = "(00)123451234512345123";
        String expected = "(00)123451234512345120";

        generateAndRecognize(codeText, expected);
    }

    @Test
    public void generateAndRecognizeExample2()
    {
        String codeText = "(01)12345678901234";
        String expected = "(01)12345678901231";

        generateAndRecognize(codeText, expected);
    }

    @Test
    public void generateDifferentTypes()
    {
        String codeText = "(413)1357913579135";
        String expected = "(413)1357913579130";

        generateAndRecognize(codeText, expected, EncodeTypes.GS_1_CODE_128);
        generateAndRecognize(codeText, expected, EncodeTypes.GS_1_DATA_MATRIX);
        generateAndRecognize(codeText, expected, EncodeTypes.GS_1_CODABLOCK_F);
        generateAndRecognize(codeText, expected, EncodeTypes.GS_1_QR);
    }

    @Test
    public void generateDifferentTypes2()
    {
        String codeText = "(01)98765432104324";
        String expected = "(01)98765432104324";

        generateAndRecognize(codeText, expected, EncodeTypes.GS_1_CODE_128);
        generateAndRecognize(codeText, expected, EncodeTypes.GS_1_DATA_MATRIX);
        generateAndRecognize(codeText, expected, EncodeTypes.GS_1_CODABLOCK_F);
        generateAndRecognize(codeText, expected, EncodeTypes.GS_1_QR);
    }

    @Test
    public void readWithIncorrectChecksum()
    {
        final String fileName = "255_incorrect_checkdigit.png";
        String path = Global.pathCombine(folder, fileName);
        final BarCodeReader reader = new BarCodeReader(path);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("(255)123456789012355555", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void readWithCorrectChecksum()
    {
        final String fileName = "410_correct_checkdigit.png";
        String path = Global.pathCombine(folder, fileName);
        final BarCodeReader reader = new BarCodeReader(path);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("(410)1234567890128", reader.getFoundBarCodes()[0].getCodeText());
    }

    private void generateAndRecognize(String codetext, String expectedCodeText)
    {
        generateAndRecognize(codetext, expectedCodeText, EncodeTypes.GS_1_CODE_128);
    }

    private void generateAndRecognize(String codetext, String expectedCodeText, BaseEncodeType encodeType)
    {
        BufferedImage bitmap;
        BarcodeGenerator gen = new BarcodeGenerator(encodeType, codetext);
        bitmap = gen.generateBarCodeImage();

        final BarCodeReader reader = new BarCodeReader(bitmap);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(expectedCodeText, reader.getFoundBarCodes()[0].getCodeText());
    }
}

