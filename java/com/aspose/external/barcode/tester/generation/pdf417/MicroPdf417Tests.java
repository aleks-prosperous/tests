package com.aspose.external.barcode.tester.generation.pdf417;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.auxiliary.StringExtensions;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.*;
import helpers.IOTestUtils;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.InputStream;

public class MicroPdf417Tests
{
    private final static String Folder = Global.getTestDataFolder("Generation\\MicroPdf417Tests");
    private final static String LogFilename = "GenerateRecognizeTest.txt";

    @BeforeMethod
    public void SetUp()
    {
        com.aspose.barcode.LicenseAssistant.setupLicense();
    }

//    //[Test]
//    //used to generate test results
//    public void TestDemo()
//    {
//        AddLogSplitter("Mode_Linked_912_Test");
//        GenerateToFileGS1MicroPdf417("(17)991231(10)ABCD", true);
//        GenerateToFileGS1MicroPdf417("(15)991231(10)ABCD", true);
//        GenerateToFileGS1MicroPdf417("(13)991231(21)ABCD", true);
//        GenerateToFileGS1MicroPdf417("(11)991231(21)ABCD", true);
//        GenerateToFileGS1MicroPdf417("(13)991231", true);
//        GenerateToFileGS1MicroPdf417("(11)991231", true);
//        GenerateToFileGS1MicroPdf417("(11)991231(21)ABCD(240)123456789012345", true);
//        GenerateToFileGS1MicroPdf417("(11)991231(21)12345(240)ABCD123456789012345", true);
//
//        AddLogSplitter("Mode_Linked_914_915_Test");
//        GenerateToFileGS1MicroPdf417("(10)ABCD12345", true);
//        GenerateToFileGS1MicroPdf417("(21)ABCD12345", true);
//        GenerateToFileGS1MicroPdf417("(10)ABCD12345(240)123456789012345", true);
//        GenerateToFileGS1MicroPdf417("(21)ABCD12345(240)ABCD123456789012345", true);
//        GenerateToFileGS1MicroPdf417("(10)12345(240)123456789012345", true);
//        GenerateToFileGS1MicroPdf417("(10)12345678901234567(240)123456789012345", true);
//
//        AddLogSplitter("Mode_Linked_906_907_Test");
//        GenerateToFileGS1MicroPdf417("(240)123456789012345(240)ABCD123456789012345", true);
//        GenerateToFileGS1MicroPdf417("(240)ABCD123456789012345(240)123456789012345", true);
//
//        AddLogSplitter("Mode_903_905_Test");
//        GenerateToFileGS1MicroPdf417("(01)12345678901231", false);
//        GenerateToFileGS1MicroPdf417("(01)12345678901231(240)ABCD123456789012345", false);
//        GenerateToFileGS1MicroPdf417("(01)12345678901231(240)123456789012345", false);
//        GenerateToFileGS1MicroPdf417("(241)123456789012345(241)ABCD123456789012345", false);
//        GenerateToFileGS1MicroPdf417("(241)ABCD123456789012345(241)123456789012345", false);
//
//        AddLogSplitter("Mode_908_911_Test");
//        GenerateToFileMicroPdf417("a\u001d1222322323", true, MacroCharacter.NONE);
//        GenerateToFileMicroPdf417("B\u001d1222322323", true, MacroCharacter.NONE);
//        GenerateToFileMicroPdf417("00\u001d1222322323", true, MacroCharacter.NONE);
//        GenerateToFileMicroPdf417("99\u001d1222322323", true, MacroCharacter.NONE);
//        GenerateToFileMicroPdf417("123456789012345678", true, MacroCharacter.NONE);
//        GenerateToFileMicroPdf417("ABCDE123456789012345678", true, MacroCharacter.NONE);
//        GenerateToFileMicroPdf417("123456789012345678ABCDE", true, MacroCharacter.NONE);
//
//        AddLogSplitter("Mode_916_917_Test");
//        GenerateToFileMicroPdf417("123456789012345678", false, MacroCharacter.MACRO_05);
//        GenerateToFileMicroPdf417("ABCDE123456789012345678", false, MacroCharacter.MACRO_05);
//        GenerateToFileMicroPdf417("123456789012345678ABCDE", false, MacroCharacter.MACRO_05);
//        GenerateToFileMicroPdf417("123456789012345678", false, MacroCharacter.MACRO_06);
//        GenerateToFileMicroPdf417("ABCDE123456789012345678", false, MacroCharacter.MACRO_06);
//        GenerateToFileMicroPdf417("123456789012345678ABCDE", false, MacroCharacter.MACRO_06);
//
//        AddLogSplitter("Mode_918_921_Test");
//        GenerateToFileMicroPdf417Flags("ABCDE123456789012345678", EncodeTypes.MICRO_PDF_417, true, false);
//        GenerateToFileMicroPdf417Flags("ABCDE123456789012345678", EncodeTypes.MICRO_PDF_417, false, true);
//        GenerateToFileMicroPdf417Flags("ABCDE123456789012345678", EncodeTypes.PDF_417, true, false);
//        GenerateToFileMicroPdf417Flags("ABCDE123456789012345678", EncodeTypes.PDF_417, false, true);
//    }

    @Test
    public void mode_Linked_912_Test() throws IOException
    {
        generateAndrecognizeGS1MicroPdf417("(17)991231(10)ABCD", true);
        recognizeGS1MicroPdf417("(17)991231(10)ABCD", true, "(17)991231(10)ABCD_ean128linked.png");

        generateAndrecognizeGS1MicroPdf417("(15)991231(10)ABCD", true);
        recognizeGS1MicroPdf417("(15)991231(10)ABCD", true, "(15)991231(10)ABCD_ean128linked.png");

        generateAndrecognizeGS1MicroPdf417("(13)991231(21)ABCD", true);
        recognizeGS1MicroPdf417("(13)991231(21)ABCD", true, "(13)991231(21)ABCD_ean128linked.png");

        generateAndrecognizeGS1MicroPdf417("(11)991231(21)ABCD", true);
        recognizeGS1MicroPdf417("(11)991231(21)ABCD", true, "(11)991231(21)ABCD_ean128linked.png");

        generateAndrecognizeGS1MicroPdf417("(13)991231", true);
        recognizeGS1MicroPdf417("(13)991231", true, "(13)991231_ean128linked.png");

        generateAndrecognizeGS1MicroPdf417("(11)991231", true);
        recognizeGS1MicroPdf417("(11)991231", true, "(11)991231_ean128linked.png");

        generateAndrecognizeGS1MicroPdf417("(11)991231(21)ABCD(240)123456789012345", true);
        recognizeGS1MicroPdf417("(11)991231(21)ABCD(240)123456789012345", true, "(11)991231(21)ABCD(240)123456789012345_ean128linked.png");

        generateAndrecognizeGS1MicroPdf417("(11)991231(21)12345(240)ABCD123456789012345", true);
        recognizeGS1MicroPdf417("(11)991231(21)12345(240)ABCD123456789012345", true, "(11)991231(21)12345(240)ABCD123456789012345_ean128linked.png");
    }

    @Test
    public void mode_Linked_914_915_Test() throws IOException
    {
        generateAndrecognizeGS1MicroPdf417("(10)ABCD12345", true);
        recognizeGS1MicroPdf417("(10)ABCD12345", true, "(10)ABCD12345_ean128linked.png");

        generateAndrecognizeGS1MicroPdf417("(21)ABCD12345", true);
        recognizeGS1MicroPdf417("(21)ABCD12345", true, "(21)ABCD12345_ean128linked.png");

        generateAndrecognizeGS1MicroPdf417("(10)ABCD12345(240)123456789012345", true);
        recognizeGS1MicroPdf417("(10)ABCD12345(240)123456789012345", true, "(10)ABCD12345(240)123456789012345_ean128linked.png");

        generateAndrecognizeGS1MicroPdf417("(21)ABCD12345(240)ABCD123456789012345", true);
        recognizeGS1MicroPdf417("(21)ABCD12345(240)ABCD123456789012345", true, "(21)ABCD12345(240)ABCD123456789012345_ean128linked.png");

        generateAndrecognizeGS1MicroPdf417("(10)12345(240)123456789012345", true);
        recognizeGS1MicroPdf417("(10)12345(240)123456789012345", true, "(10)12345(240)123456789012345_ean128linked.png");

        generateAndrecognizeGS1MicroPdf417("(10)12345678901234567(240)123456789012345", true);
        recognizeGS1MicroPdf417("(10)12345678901234567(240)123456789012345", true, "(10)12345678901234567(240)123456789012345_ean128linked.png");
    }

    @Test
    public void mode_Linked_906_907_Test() throws IOException
    {
        generateAndrecognizeGS1MicroPdf417("(240)123456789012345(240)ABCD123456789012345", true);
        recognizeGS1MicroPdf417("(240)123456789012345(240)ABCD123456789012345", true, "(240)123456789012345(240)ABCD123456789012345_ean128linked.png");

        generateAndrecognizeGS1MicroPdf417("(240)ABCD123456789012345(240)123456789012345", true);
        recognizeGS1MicroPdf417("(240)ABCD123456789012345(240)123456789012345", true, "(240)ABCD123456789012345(240)123456789012345_ean128linked.png");
    }

    @Test
    public void mode_903_905_Test() throws IOException
    {
        generateAndrecognizeGS1MicroPdf417("(01)12345678901231", false);
        recognizeGS1MicroPdf417("(01)12345678901231", false, "(01)12345678901231_ean128.png");

        generateAndrecognizeGS1MicroPdf417("(01)12345678901231(240)ABCD123456789012345", false);
        recognizeGS1MicroPdf417("(01)12345678901231(240)ABCD123456789012345", false, "(01)12345678901231(240)ABCD123456789012345_ean128.png");

        generateAndrecognizeGS1MicroPdf417("(01)12345678901231(240)123456789012345", false);
        recognizeGS1MicroPdf417("(01)12345678901231(240)123456789012345", false, "(01)12345678901231(240)123456789012345_ean128.png");

        generateAndrecognizeGS1MicroPdf417("(241)123456789012345(241)ABCD123456789012345", false);
        recognizeGS1MicroPdf417("(241)123456789012345(241)ABCD123456789012345", false, "(241)123456789012345(241)ABCD123456789012345_ean128.png");

        generateAndrecognizeGS1MicroPdf417("(241)ABCD123456789012345(241)123456789012345", false);
        recognizeGS1MicroPdf417("(241)ABCD123456789012345(241)123456789012345", false, "(241)ABCD123456789012345(241)123456789012345_ean128.png");
    }

    @Test
    public void mode_908_911_Test() throws IOException
    {
        generateAndRecognizeMicroPdf417("a\u001d1222322323", true, MacroCharacter.NONE);
        recognizeMicroPdf417("a\u001d1222322323", true, "a_1222322323_Code128_None.png");

        generateAndRecognizeMicroPdf417("B\u001d1222322323", true, MacroCharacter.NONE);
        recognizeMicroPdf417("B\u001d1222322323", true, "B_1222322323_Code128_None.png");

        generateAndRecognizeMicroPdf417("00\u001d1222322323", true, MacroCharacter.NONE);
        recognizeMicroPdf417("00\u001d1222322323", true, "00_1222322323_Code128_None.png");

        generateAndRecognizeMicroPdf417("99\u001d1222322323", true, MacroCharacter.NONE);
        recognizeMicroPdf417("99\u001d1222322323", true, "99_1222322323_Code128_None.png");

        generateAndRecognizeMicroPdf417("123456789012345678", true, MacroCharacter.NONE);
        recognizeMicroPdf417("123456789012345678", true, "123456789012345678_Code128_None.png");

        generateAndRecognizeMicroPdf417("ABCDE123456789012345678", true, MacroCharacter.NONE);
        recognizeMicroPdf417("ABCDE123456789012345678", true, "ABCDE123456789012345678_Code128_None.png");

        generateAndRecognizeMicroPdf417("123456789012345678ABCDE", true, MacroCharacter.NONE);
        recognizeMicroPdf417("123456789012345678ABCDE", true, "123456789012345678ABCDE_Code128_None.png");
    }

    @Test
    public void mode_916_917_Test() throws IOException
    {
        generateAndRecognizeMicroPdf417("123456789012345678", false, MacroCharacter.MACRO_05);
        recognizeMicroPdf417("[)>\u001e05\u001d123456789012345678\u001e\u0004", false, "123456789012345678_notCode128_Macro05.png");

        generateAndRecognizeMicroPdf417("ABCDE123456789012345678", false, MacroCharacter.MACRO_05);
        recognizeMicroPdf417("[)>\u001e05\u001dABCDE123456789012345678\u001e\u0004", false, "ABCDE123456789012345678_notCode128_Macro05.png");

        generateAndRecognizeMicroPdf417("123456789012345678ABCDE", false, MacroCharacter.MACRO_05);
        recognizeMicroPdf417("[)>\u001e05\u001d123456789012345678ABCDE\u001e\u0004", false, "123456789012345678ABCDE_notCode128_Macro05.png");

        generateAndRecognizeMicroPdf417("123456789012345678", false, MacroCharacter.MACRO_06);
        recognizeMicroPdf417("[)>\u001e06\u001d123456789012345678\u001e\u0004", false, "123456789012345678_notCode128_Macro06.png");

        generateAndRecognizeMicroPdf417("ABCDE123456789012345678", false, MacroCharacter.MACRO_06);
        recognizeMicroPdf417("[)>\u001e06\u001dABCDE123456789012345678\u001e\u0004", false, "ABCDE123456789012345678_notCode128_Macro06.png");

        generateAndRecognizeMicroPdf417("123456789012345678ABCDE", false, MacroCharacter.MACRO_06);
        recognizeMicroPdf417("[)>\u001e06\u001d123456789012345678ABCDE\u001e\u0004", false, "123456789012345678ABCDE_notCode128_Macro06.png");
    }

    @Test
    public void mode_918_921_Test() throws IOException
    {
        generateAndrecognizeMicroPdf417Flags("ABCDE123456789012345678", EncodeTypes.MICRO_PDF_417, true, false);
        recognizeMicroPdf417Flags("ABCDE123456789012345678", true, false, "ABCDE123456789012345678_MicroPdf417_linked_notRI.png");

        generateAndrecognizeMicroPdf417Flags("ABCDE123456789012345678", EncodeTypes.MICRO_PDF_417, false, true);
        recognizeMicroPdf417Flags("ABCDE123456789012345678", false, true, "ABCDE123456789012345678_MicroPdf417_notlinked_RI.png");

        generateAndrecognizeMicroPdf417Flags("ABCDE123456789012345678", EncodeTypes.PDF_417, true, false);
        recognizeMicroPdf417Flags("ABCDE123456789012345678", true, false, "ABCDE123456789012345678_Pdf417_linked_notRI.png");

        generateAndrecognizeMicroPdf417Flags("ABCDE123456789012345678", EncodeTypes.PDF_417, false, true);
        recognizeMicroPdf417Flags("ABCDE123456789012345678", false, true, "ABCDE123456789012345678_Pdf417_notlinked_RI.png");
    }


//    private void AddLogSplitter(String message)
//    {
//        StringTestUtils.WriteStringToFile(Global.PathCombine(Folder, LogFilename), "\n" + message + "\n", true);
//    }
//
//    private void GenerateToFileMicroPdf417Flags(String codetext, SymbologyEncodeType encode, boolean isLinked, boolean isReaderInitialization)
//    {
//        String res = String.Empty;
//        String postfix = "_" + encode.ToString();
//        if (isLinked)
//            postfix += "_linked";
//        else
//            postfix += "_notlinked";
//        if (isReaderInitialization)
//            postfix += "_RI";
//        else
//            postfix += "_notRI";
//        String filename = IOTestUtils.GetFixedFilename(codetext + postfix, ".png");
//        //generate file
//        BarcodeGenerator gen = generateMicroPdf417Flags(codetext, encode, isLinked, isReaderInitialization);
//        FrameworkTestUtils.StoreBitmap(Global.PathCombine(Folder, filename), gen.generateBarCodeImage());
//        //generateAndrecognizeMicroPdf417Flags
//        res += "generateAndrecognizeMicroPdf417Flags(" + StringTestUtils.ConvertNormalStringToCSharpString(codetext) + ", EncodeTypes."+ encode .ToString() +
//                ", " + isLinked.ToString().ToLower() + ", " + isReaderInitialization.ToString().ToLower() + ");\n";
//        //recognizeMicroPdf417Flags
//        res += "recognizeMicroPdf417Flags(" + StringTestUtils.ConvertNormalStringToCSharpString(codetext) + ", " + isLinked.ToString().ToLower()
//                + ", " + isReaderInitialization.ToString().ToLower() + ", \"" + filename + "\");\n\n";
//        StringTestUtils.WriteStringToFile(Global.PathCombine(Folder, LogFilename), res, true);
//    }

    private void generateAndrecognizeMicroPdf417Flags(String codetext, SymbologyEncodeType encode, boolean isLinked, boolean isReaderInitialization)
    {
        BarcodeGenerator gen = generateMicroPdf417Flags(codetext, encode, isLinked, isReaderInitialization);
        BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.MICRO_PDF_417, DecodeType.PDF_417, DecodeType.MACRO_PDF_417);
        recognizeMicroPdf417Flags(reader, codetext, isLinked, isReaderInitialization);
    }

    private void recognizeMicroPdf417Flags(String codetext, boolean isLinked, boolean isReaderInitialization, String filename) throws IOException
    {
        InputStream ms = IOTestUtils.loadToMemoryStreamExternal(Global.pathCombine(Folder, filename));
        BarCodeReader reader = new BarCodeReader(ms, DecodeType.MICRO_PDF_417, DecodeType.PDF_417, DecodeType.MACRO_PDF_417);
        recognizeMicroPdf417Flags(reader, codetext, isLinked, isReaderInitialization);
    }

    private static void recognizeMicroPdf417Flags(BarCodeReader reader, String codetext, boolean isLinked, boolean isReaderInitialization)
    {
        Assert.assertEquals(1, reader.readBarCodes().length);
        Assert.assertTrue(reader.getFoundBarCodes()[0].getCodeType().containsAny(DecodeType.MICRO_PDF_417, DecodeType.PDF_417, DecodeType.MACRO_PDF_417));
        Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals(isLinked, reader.getFoundBarCodes()[0].getExtended().getPdf417().isLinked());
        Assert.assertEquals(isReaderInitialization, reader.getFoundBarCodes()[0].getExtended().getPdf417().isReaderInitialization());
    }

    private static BarcodeGenerator generateMicroPdf417Flags(String codetext, SymbologyEncodeType encode, boolean isLinked, boolean isReaderInitialization)
    {
        BarcodeGenerator gen = new BarcodeGenerator(encode, codetext);
        gen.getParameters().getBarcode().getPdf417().setLinked(isLinked);
        gen.getParameters().getBarcode().getPdf417().setReaderInitialization(isReaderInitialization);
        gen.getParameters().getBarcode().getCodeTextParameters().setLocation(CodeLocation.NONE);
        return gen;
    }

//    private void GenerateToFileMicroPdf417(String codetext, boolean isCode128Emulation, MacroCharacter macroCharacter)
//    {
//        String res = String.Empty;
//        String postfix = "_notCode128";
//        if (isCode128Emulation)
//            postfix = "_Code128";
//        postfix += "_" + macroCharacter.ToString();
//        String filename = IOTestUtils.GetFixedFilename(codetext + postfix, ".png");
//        //generate file
//        using (BarcodeGenerator gen = generateMicroPdf417(codetext, isCode128Emulation, macroCharacter))
//        FrameworkTestUtils.StoreBitmap(Global.PathCombine(Folder, filename), gen.generateBarCodeImage());
//        //generateAndRecognizeMicroPdf417
//        res += "generateAndRecognizeMicroPdf417(" + StringTestUtils.ConvertNormalStringToCSharpString(codetext) + ", " + isCode128Emulation.ToString().ToLower() +
//                ", MacroCharacter." + macroCharacter.ToString() + ");\n";
//        //RecognizeMicroPdf417
//        res += "RecognizeMicroPdf417(" + StringTestUtils.ConvertNormalStringToCSharpString( codetextWithMacroCharacter(codetext, macroCharacter)) + ", " + isCode128Emulation.ToString().ToLower() + ", \"" + filename + "\");\n\n";
//        StringTestUtils.WriteStringToFile(Global.PathCombine(Folder, LogFilename), res, true);
//    }

    private void generateAndRecognizeMicroPdf417(String codetext, boolean isCode128Emulation, MacroCharacter macroCharacter)
    {
        BarcodeGenerator gen = generateMicroPdf417(codetext, isCode128Emulation, macroCharacter);
        BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.MICRO_PDF_417);
        recognizeMicroPdf417(reader,  codetextWithMacroCharacter(codetext, macroCharacter), isCode128Emulation);
    }

    private static String  codetextWithMacroCharacter(String codetext, MacroCharacter macroCharacter)
    {
        String result = StringExtensions.Empty;
        String Macro05Header = "[)>\u001E05\u001D";
        String Macro06Header = "[)>\u001E06\u001D";
        String MacroTrailer = "\u001E\u0004";

        if (MacroCharacter.MACRO_05 == macroCharacter)
            result += Macro05Header;
        if (MacroCharacter.MACRO_06 == macroCharacter)
            result += Macro06Header;

        result += codetext;

        if (MacroCharacter.NONE != macroCharacter)
            result += MacroTrailer;
        return result;
    }

    private void recognizeMicroPdf417(String codetext, boolean isCode128Emulation, String filename) throws IOException
    {
        InputStream ms = IOTestUtils.loadToMemoryStreamExternal(Global.pathCombine(Folder, filename));
        BarCodeReader reader = new BarCodeReader(ms, DecodeType.MICRO_PDF_417);
        recognizeMicroPdf417(reader, codetext, isCode128Emulation);
    }

    private static void recognizeMicroPdf417(BarCodeReader reader, String codetext, boolean isCode128Emulation)
    {
        Assert.assertEquals(1, reader.readBarCodes().length);
        Assert.assertEquals(DecodeType.MICRO_PDF_417, reader.getFoundBarCodes()[0].getCodeType());
        Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals(isCode128Emulation, reader.getFoundBarCodes()[0].getExtended().getPdf417().isCode128Emulation());
    }

    private static BarcodeGenerator generateMicroPdf417(String codetext, boolean isCode128Emulation, MacroCharacter macroCharacter)
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.MICRO_PDF_417, codetext);
        gen.getParameters().getBarcode().getPdf417().setCode128Emulation(isCode128Emulation);
        gen.getParameters().getBarcode().getPdf417().setMacroCharacters(macroCharacter);
        gen.getParameters().getBarcode().getCodeTextParameters().setLocation(CodeLocation.NONE);
        return gen;
    }

//    private void GenerateToFileGS1MicroPdf417(String codetext, boolean isLinked)
//    {
//        String res = String.Empty;
//        String postfix = "_ean128";
//        if (isLinked)
//            postfix = "_ean128linked";
//        String filename = IOTestUtils.GetFixedFilename(codetext + postfix, ".png");
//
//        //generate file
//        using (BarcodeGenerator gen = GenerateGS1MicroPdf417(codetext, isLinked))
//        FrameworkTestUtils.StoreBitmap(Global.PathCombine(Folder, filename), gen.generateBarCodeImage());
//        //generateAndrecognizeGS1MicroPdf417
//        res += "generateAndrecognizeGS1MicroPdf417(" + StringTestUtils.ConvertNormalStringToCSharpString(codetext) + ", " + isLinked.ToString().ToLower() + ");\n";
//        //recognizeGS1MicroPdf417
//        res += "recognizeGS1MicroPdf417(" + StringTestUtils.ConvertNormalStringToCSharpString(codetext) +", " + isLinked.ToString().ToLower() + ", \"" + filename + "\");\n\n";
//        StringTestUtils.WriteStringToFile(Global.PathCombine(Folder, LogFilename), res, true);
//    }

    private void generateAndrecognizeGS1MicroPdf417(String codetext, boolean isLinked)
    {
        BarcodeGenerator gen = GenerateGS1MicroPdf417(codetext, isLinked);
        BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.GS_1_MICRO_PDF_417);
        Assert.assertEquals(1, reader.readBarCodes().length);
        Assert.assertEquals(DecodeType.GS_1_MICRO_PDF_417, reader.getFoundBarCodes()[0].getCodeType());
        Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals(isLinked, reader.getFoundBarCodes()[0].getExtended().getPdf417().isLinked());
    }

    private void recognizeGS1MicroPdf417(String codetext, boolean isLinked, String filename) throws IOException
    {
        InputStream ms = IOTestUtils.loadToMemoryStreamExternal(Global.pathCombine(Folder, filename));
        BarCodeReader reader = new BarCodeReader(ms, DecodeType.GS_1_MICRO_PDF_417);
        Assert.assertEquals(1, reader.readBarCodes().length);
        Assert.assertEquals(DecodeType.GS_1_MICRO_PDF_417, reader.getFoundBarCodes()[0].getCodeType());
        Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals(isLinked, reader.getFoundBarCodes()[0].getExtended().getPdf417().isLinked());
    }

    private static void recognizeGS1MicroPdf417(BarCodeReader reader, String codetext, boolean isLinked)
    {
        Assert.assertEquals(1, reader.readBarCodes().length);
        Assert.assertEquals(DecodeType.GS_1_MICRO_PDF_417, reader.getFoundBarCodes()[0].getCodeType());
        Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals(isLinked, reader.getFoundBarCodes()[0].getExtended().getPdf417().isLinked());
    }

    private static BarcodeGenerator GenerateGS1MicroPdf417(String codetext, boolean isLinked)
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.GS_1_MICRO_PDF_417, codetext);
        gen.getParameters().getBarcode().getPdf417().setLinked(isLinked);
        gen.getParameters().getBarcode().getCodeTextParameters().setLocation(CodeLocation.NONE);
        return gen;
    }
}
