package com.aspose.external.barcode.tester.releases.v22_12;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BaseDecodeType;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.external.barcode.tester.releases.v21_6.StringTestUtils;
import helpers.GenerationValidator;
import helpers.parsers.BarcodePictureParserSimple;
import helpers.parsers.BarcodePictureSelectorWithoutText;
import helpers.parsers.IBarcodeParser;
import helpers.parsers.IBarcodeSelector;
import helpers.validators.BarcodeSizeValidator;
import helpers.validators.RecognitionValidator;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Issue38391
{
    /// <summary>
    /// Path to folder with files for testing Issue38391.
    /// </summary>
    private static final String Folder = Global.getTestDataFolder("Issues\\Issue38391");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test_GenerationAndValidation()
    {
        GenerateAndValidate(EncodeTypes.DOT_CODE, DecodeType.DOT_CODE, "Sample codetext", -1, -1, -1, -1, DotCodeEncodeMode.AUTO, ECIEncodings.ISO_8859_1, 419, 284);
        GenerateAndValidate(EncodeTypes.DOT_CODE, DecodeType.DOT_CODE, "20412222", 11, -1, 1, 8, DotCodeEncodeMode.AUTO, ECIEncodings.ISO_8859_1, 359, 164);
        GenerateAndValidate(EncodeTypes.DOT_CODE, DecodeType.DOT_CODE, "犬Right狗", -1, 11, 1, 35, DotCodeEncodeMode.AUTO, ECIEncodings.UTF8, 164, 929);
        GenerateAndValidate(EncodeTypes.DOT_CODE, DecodeType.DOT_CODE, "[)>05CodetextWithMacros05", -1, 6, 35, 35, DotCodeEncodeMode.AUTO, ECIEncodings.ISO_8859_1, 89, 2474);
        GenerateAndValidate(EncodeTypes.DOT_CODE, DecodeType.DOT_CODE, "<FNC1>\\000022Will\\000003<FNC1>\\000026犬Right狗", 43, 46, -1, -1, DotCodeEncodeMode.EXTENDED_CODETEXT, ECIEncodings.ISO_8859_1, 689, 644);
        GenerateAndValidate(EncodeTypes.DOT_CODE, DecodeType.DOT_CODE, "1700992210", 20, 21, 2, 2, DotCodeEncodeMode.AUTO, ECIEncodings.ISO_8859_1, 314, 299);
        GenerateAndValidate(EncodeTypes.DOT_CODE, DecodeType.DOT_CODE, " 0»î", -1, -1, 1, 1, DotCodeEncodeMode.BYTES, ECIEncodings.ISO_8859_1, 329, 224);
        GenerateAndValidate(EncodeTypes.GS_1_DOT_CODE, DecodeType.GS_1_DOT_CODE, "(01)01082503101704", -1, -1, -1, -1, DotCodeEncodeMode.AUTO, ECIEncodings.ISO_8859_1, 314, 209);
        GenerateAndValidate(EncodeTypes.GS_1_DOT_CODE, DecodeType.GS_1_DOT_CODE, "(01)01082503101704(10)1234567890123", 27, -1, -1, -1, DotCodeEncodeMode.AUTO, ECIEncodings.ISO_8859_1, 299, 404);
        GenerateAndValidate(EncodeTypes.GS_1_DOT_CODE, DecodeType.GS_1_DOT_CODE, "(01)01082503101704(10)1234567890123456789(10)123456789012345678(10)1234567890", -1, 16, -1, -1, DotCodeEncodeMode.AUTO, ECIEncodings.ISO_8859_1, 239, 1034);
    }

    @Test
    public void test_Recognition()
    {
        Recognize("Sample.png", DecodeType.DOT_CODE, "Sample codetext");
        Recognize("Format_identifier.png", DecodeType.DOT_CODE, "20412222");
        Recognize("ECI.png", DecodeType.DOT_CODE, "犬Right狗");
        Recognize("Macros.png", DecodeType.DOT_CODE, "[)>05CodetextWithMacros05");
        Recognize("Extended.png", DecodeType.DOT_CODE, "Will<FNC1>犬Right狗");
        Recognize("Seventeen_ten.png", DecodeType.DOT_CODE, "1700992210");
        Recognize("Bytes.png", DecodeType.DOT_CODE, " 0»î");
        Recognize("GS1_1.png", DecodeType.GS_1_DOT_CODE, "(01)01082503101704");
        Recognize("GS1_2.png", DecodeType.GS_1_DOT_CODE, "(01)01082503101704(10)1234567890123");
        Recognize("GS1_3.png", DecodeType.GS_1_DOT_CODE, "(01)01082503101704(10)1234567890123456789(10)123456789012345678(10)1234567890");
    }

    private void Recognize(String fileName, BaseDecodeType decodeType, String codetext)
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, fileName), decodeType);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    private void ValidationRowToFile(String folder, String filename, BaseEncodeType encodeType, BaseDecodeType decodeType, String codetext, int rows, int columns, int barcodeId, int barcodesCount, DotCodeEncodeMode encodeMode, int eciEncoding) throws IOException {
        String dataString = "";
        BarcodeGenerator gen = InitBarcodeGenerator(encodeType, codetext, rows, columns, barcodeId, barcodesCount, encodeMode, eciEncoding);
        {
            IBarcodeSelector selector;
            selector = new BarcodePictureSelectorWithoutText(gen.generateBarCodeImage());
            BarcodePictureParserSimple parser = new BarcodePictureParserSimple(selector);
            parser.parse();

            dataString += "GenerateAndValidate(";
            dataString += "EncodeTypes." + encodeType.toString() + ", ";
            dataString += "DecodeType." + decodeType.toString() + ", ";
            if (encodeMode == DotCodeEncodeMode.EXTENDED_CODETEXT )
                dataString += "@";
            dataString += "\"" + codetext + "\", ";
            dataString += rows + ", ";
            dataString += columns + ", ";
            dataString += barcodeId + ", ";
            dataString += barcodesCount + ", ";
            dataString += "DotCodeEncodeMode." + encodeMode.toString() + ", ";
            dataString += "ECIEncodings." + eciEncoding + ", ";
            dataString += parser.getBarcodeWidth() + ", ";
            dataString += parser.getBarcodeHeight() + ");\n";
        }
        StringTestUtils.writeStringToFile(Global.pathCombine(folder, filename), dataString, true);
    }

    private void RecognitionRowToFile(String folder, String filename, String imageFilename, BaseDecodeType decodeType, DotCodeEncodeMode encodeMode, String codetext) throws IOException {
        String dataString = "";
        dataString += "Recognize(";
        dataString += "\"" + imageFilename + ".png\", ";
        dataString += "DecodeType." + decodeType.toString() + ", ";
        dataString += "\"" + GetExpectedCodetext(codetext, encodeMode) + "\");\n";
        StringTestUtils.writeStringToFile(Global.pathCombine(folder, filename), dataString, true);
    }

    private void GenerateAndValidate(BaseEncodeType encodeType, BaseDecodeType decodeType, String codetext, int rows, int columns, int barcodeId, int barcodesCount, DotCodeEncodeMode encodeMode, int eciEncoding, int width, int height)
    {
        BarcodeGenerator gen = InitBarcodeGenerator(encodeType, codetext, rows, columns, barcodeId, barcodesCount, encodeMode, eciEncoding);
        {
            IBarcodeSelector selector;
            selector = new BarcodePictureSelectorWithoutText(gen.generateBarCodeImage());
            IBarcodeParser parser = new BarcodePictureParserSimple(selector);
            GenerationValidator validator = new GenerationValidator(parser);
            validator.addValidator(new BarcodeSizeValidator(width, height));

            String expectedCodetext = GetExpectedCodetext(codetext, encodeMode);
            validator.addValidator(new RecognitionValidator(expectedCodetext, null, decodeType));
            Assert.assertTrue(validator.validate());
        }
    }

    private String GetExpectedCodetext(String codetext, DotCodeEncodeMode encodeMode)
    {
        String expectedCodetext = codetext;
        if (expectedCodetext.startsWith("<FNC1>")) expectedCodetext = expectedCodetext.substring(6);
        if (encodeMode == DotCodeEncodeMode.EXTENDED_CODETEXT)
        {
            Pattern p = Pattern.compile("\\\\\\d{6}", Pattern.CASE_INSENSITIVE);
            Matcher m = p.matcher(expectedCodetext);
            expectedCodetext = m.replaceAll("");
        }
        return expectedCodetext;
    }

    private void GenerateAndSave(String folder, String filename, BaseEncodeType encodeType, String codetext, int rows, int columns, int barcodeId, int barcodesCount, DotCodeEncodeMode encodeMode, int eciEncoding)
    {
        try
        {
            String lFileName = Global.pathCombine(folder, filename + ".png");
            File file = new File(lFileName);
            if (file.exists())
            {
//                File.setAttributes(lFileName, FileAttributes.Normal);
                file.delete();
            }

            BarcodeGenerator gen = InitBarcodeGenerator(encodeType, codetext, rows, columns, barcodeId, barcodesCount, encodeMode, eciEncoding);
            gen.save(lFileName, BarCodeImageFormat.PNG);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    private BarcodeGenerator InitBarcodeGenerator(BaseEncodeType encodeType, String codetext, int rows, int columns, int barcodeId, int barcodesCount, DotCodeEncodeMode encodeMode, int eciEncoding)
    {
        BarcodeGenerator gen = new BarcodeGenerator(encodeType, codetext);
        gen.getParameters().getBarcode().getDotCode().setRows(rows);
        gen.getParameters().getBarcode().getDotCode().setColumns(columns);
        gen.getParameters().getBarcode().getDotCode().setDotCodeStructuredAppendModeBarcodeId(barcodeId);
        gen.getParameters().getBarcode().getDotCode().setDotCodeStructuredAppendModeBarcodesCount(barcodesCount);
        gen.getParameters().getBarcode().getDotCode().setDotCodeEncodeMode(encodeMode);
        gen.getParameters().getBarcode().getDotCode().setECIEncoding(eciEncoding);
        return gen;
    }
}
