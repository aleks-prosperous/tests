package com.aspose.external.barcode.tester.generation.gs1compositebar;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.CodeLocation;
import com.aspose.barcode.generation.EncodeTypes;
import com.aspose.barcode.generation.TwoDComponentType;
import com.aspose.external.barcode.tester.releases.v21_6.StringTestUtils;
import helpers.FrameworkTestUtils;
import helpers.IOTestUtils;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GS1CompositeBarTestsExtended
{
    private static final String Folder = Global.getTestDataFolder("Generation\\GS1CompositeBarExtended");
    private static final String LogFilename = "GenerateRecognizeTest.txt";

    @BeforeMethod
    public void setUp()
    {
        com.aspose.barcode.LicenseAssistant.setupLicense(com.aspose.barcode.licensing.LicenseType.Total);
    }

    @Test
    public void test_Main_EncodeDecode_Mode0_Numeric_Test() throws IOException
    {
        generateAndrecognize2D("(240)0123456789", true, TwoDComponentType.CC_A);
        recognize2D("(240)0123456789", "(240)0123456789_cc_a.png");

        generateAndrecognize2D("(240)012345678", true, TwoDComponentType.CC_A);
        recognize2D("(240)012345678", "(240)012345678_cc_a.png");

        generateAndrecognize2D("(240)aa23456785678", true, TwoDComponentType.CC_A);
        recognize2D("(240)aa23456785678", "(240)aa23456785678_cc_a.png");

        generateAndrecognize2D("(240)aAA45678567", true, TwoDComponentType.CC_A);
        recognize2D("(240)aAA45678567", "(240)aAA45678567_cc_a.png");

        generateAndrecognize2D("10", false, TwoDComponentType.CC_A);
        recognize2D("10", "10_cc_a.png");

        generateAndrecognize2D("0", false, TwoDComponentType.CC_A);
        recognize2D("0", "0_cc_a.png");
    }

    @Test
    public void test_Main_EncodeDecode_Mode0_Alphanumeric_Test() throws IOException
    {
        generateAndrecognize2D("A0A1A2A3A4A5A6A7A8A9ABCDEFGHIJKLMNOPQRSTUVWXYZ*,-./", false, TwoDComponentType.CC_B);
        recognize2D("A0A1A2A3A4A5A6A7A8A9ABCDEFGHIJKLMNOPQRSTUVWXYZ*,-./", "A0A1A2A3A4A5A6A7A8A9ABCDEFGHIJKLMNOPQRSTUVWXYZ_,-___cc_b.png");

        generateAndrecognize2D("A501234A50123", false, TwoDComponentType.CC_A);
        recognize2D("A501234A50123", "A501234A50123_cc_a.png");

        generateAndrecognize2D("B", false, TwoDComponentType.CC_A);
        recognize2D("B", "B_cc_a.png");

        generateAndrecognize2D("(90)0K12(10)0123", true, TwoDComponentType.CC_A);
        recognize2D("(90)0K12(10)0123", "(90)0K12(10)0123_cc_a.png");
    }

    @Test
    public void test_Main_EncodeDecode_Mode0_ISO646_Test() throws IOException
    {
        generateAndrecognize2D("a0a1a2a3a4a5a6a7a8a9!ABC!DEF!GHI!JK!LM!NOP!QRS!TUV!WX!YZabcdefghijklmnopqrstuvwxyz!\"%&\'()*+,-/:;<=>?_ ", false, TwoDComponentType.CC_C);
        recognize2D("a0a1a2a3a4a5a6a7a8a9!ABC!DEF!GHI!JK!LM!NOP!QRS!TUV!WX!YZabcdefghijklmnopqrstuvwxyz!\"%&\'()*+,-/:;<=>?_ ", "a0a1a2a3a4a5a6a7a8a9!ABC!DEF!GHI!JK!LM!NOP!QRS!TUV!WX!YZabcdefghijklmnopqrstuvwxyz!_%&_()_+,-__;_=___ _cc_c.png");

        generateAndrecognize2D("50-12345678!12345678", false, TwoDComponentType.CC_B);
        recognize2D("50-12345678!12345678", "50-12345678!12345678_cc_b.png");

        generateAndrecognize2D("50!-12345678-12345678", false, TwoDComponentType.CC_B);
        recognize2D("50!-12345678-12345678", "50!-12345678-12345678_cc_b.png");

        generateAndrecognize2D("5!-12345678-1234567", false, TwoDComponentType.CC_B);
        recognize2D("5!-12345678-1234567", "5!-12345678-1234567_cc_b.png");

        generateAndrecognize2D("!5012ABCDEF!A50123456", false, TwoDComponentType.CC_B);
        recognize2D("!5012ABCDEF!A50123456", "!5012ABCDEF!A50123456_cc_b.png");

        generateAndrecognize2D("a", false, TwoDComponentType.CC_A);
        recognize2D("a", "a_cc_a.png");
    }

    @Test
    public void test_Main_EncodeDecode_Mode10() throws IOException
    {
        generateAndrecognize2D("(17)991231(10)ABCD0123", true, TwoDComponentType.CC_A);
        recognize2D("(17)991231(10)ABCD0123", "(17)991231(10)ABCD0123_cc_a.png");

        generateAndrecognize2D("(11)991231(10)ABCD0123", true, TwoDComponentType.CC_A);
        recognize2D("(11)991231(10)ABCD0123", "(11)991231(10)ABCD0123_cc_a.png");

        generateAndrecognize2D("(10)ABCD0123", true, TwoDComponentType.CC_A);
        recognize2D("(10)ABCD0123", "(10)ABCD0123_cc_a.png");

        generateAndrecognize2D("(17)000101", true, TwoDComponentType.CC_A);
        recognize2D("(17)000101", "(17)000101_cc_a.png");

        generateAndrecognize2D("(11)000101", true, TwoDComponentType.CC_A);
        recognize2D("(11)000101", "(11)000101_cc_a.png");

        generateAndrecognize2D("(17)991231(10)ABCD0123(240)0123456789", true, TwoDComponentType.CC_A);
        recognize2D("(17)991231(10)ABCD0123(240)0123456789", "(17)991231(10)ABCD0123(240)0123456789_cc_a.png");

        generateAndrecognize2D("(10)ABCD0123(240)0123456789", true, TwoDComponentType.CC_A);
        recognize2D("(10)ABCD0123(240)0123456789", "(10)ABCD0123(240)0123456789_cc_a.png");

        generateAndrecognize2D("(17)991231(240)0123456789", true, TwoDComponentType.CC_A);
        recognize2D("(17)991231(240)0123456789", "(17)991231(240)0123456789_cc_a.png");
    }

    @Test
    public void test_Main_EncodeDecode_Mode11() throws IOException
    {
        generateAndrecognize2D("(90)K12(10)0123", true, TwoDComponentType.CC_A);
        recognize2D("(90)K12(10)0123", "(90)K12(10)0123_cc_a.png");

        generateAndrecognize2D("(90)A12(10)0123", true, TwoDComponentType.CC_A);
        recognize2D("(90)A12(10)0123", "(90)A12(10)0123_cc_a.png");

        generateAndrecognize2D("(90)9K12(10)0123", true, TwoDComponentType.CC_A);
        recognize2D("(90)9K12(10)0123", "(90)9K12(10)0123_cc_a.png");

        generateAndrecognize2D("(90)9A12(10)0123", true, TwoDComponentType.CC_A);
        recognize2D("(90)9A12(10)0123", "(90)9A12(10)0123_cc_a.png");

        generateAndrecognize2D("(90)99K12(10)0123", true, TwoDComponentType.CC_A);
        recognize2D("(90)99K12(10)0123", "(90)99K12(10)0123_cc_a.png");

        generateAndrecognize2D("(90)99A12(10)0123", true, TwoDComponentType.CC_A);
        recognize2D("(90)99A12(10)0123", "(90)99A12(10)0123_cc_a.png");

        generateAndrecognize2D("(90)999K12(10)0123", true, TwoDComponentType.CC_A);
        recognize2D("(90)999K12(10)0123", "(90)999K12(10)0123_cc_a.png");

        generateAndrecognize2D("(90)999A12(10)0123", true, TwoDComponentType.CC_A);
        recognize2D("(90)999A12(10)0123", "(90)999A12(10)0123_cc_a.png");

        generateAndrecognize2D("(90)9AABCDEFGHIJKLMN0123456789(10)0123", true, TwoDComponentType.CC_B);
        recognize2D("(90)9AABCDEFGHIJKLMN0123456789(10)0123", "(90)9AABCDEFGHIJKLMN0123456789(10)0123_cc_b.png");

        generateAndrecognize2D("(90)9AOPQRSTUVWXYZ0123456789(10)0123", true, TwoDComponentType.CC_B);
        recognize2D("(90)9AOPQRSTUVWXYZ0123456789(10)0123", "(90)9AOPQRSTUVWXYZ0123456789(10)0123_cc_b.png");

        generateAndrecognize2D("(90)9K(10)ABC", true, TwoDComponentType.CC_A);
        recognize2D("(90)9K(10)ABC", "(90)9K(10)ABC_cc_a.png");

        generateAndrecognize2D("(90)9K(10)/ABC", true, TwoDComponentType.CC_A);
        recognize2D("(90)9K(10)/ABC", "(90)9K(10)_ABC_cc_a.png");

        generateAndrecognize2D("(90)K1", true, TwoDComponentType.CC_A);
        recognize2D("(90)K1", "(90)K1_cc_a.png");

        generateAndrecognize2D("(90)9K12(8004)23AC(10)ABC", true, TwoDComponentType.CC_A);
        recognize2D("(90)9K12(8004)23AC(10)ABC", "(90)9K12(8004)23AC(10)ABC_cc_a.png");

        generateAndrecognize2D("(90)9K12(8004)23AC", true, TwoDComponentType.CC_A);
        recognize2D("(90)9K12(8004)23AC", "(90)9K12(8004)23AC_cc_a.png");

        generateAndrecognize2D("(90)9K12(21)23AC(10)ABC", true, TwoDComponentType.CC_A);
        recognize2D("(90)9K12(21)23AC(10)ABC", "(90)9K12(21)23AC(10)ABC_cc_a.png");

        generateAndrecognize2D("(90)9K12(21)23AC", true, TwoDComponentType.CC_A);
        recognize2D("(90)9K12(21)23AC", "(90)9K12(21)23AC_cc_a.png");
    }

    private void addLogSplitter(String message) throws IOException
    {
        StringTestUtils.writeStringToFile(Global.pathCombine(Folder, LogFilename), "\n" + message + "\n", true);
    }

//    private void generateToFile(String codetext2D, boolean isAllowOnlyGS1Encoding, TwoDComponentType twoDComponentType) throws IOException
//    {
//        String res = "";
//        String filename = getFixedFilename(codetext2D + "_" + twoDComponentType.toString().toLowerCase(), ".png");
//
//        //generate file
//        BarcodeGenerator gen = generateWith2DCodetext(codetext2D, isAllowOnlyGS1Encoding, twoDComponentType);
//        FrameworkTestUtils.storeBitmap(Global.pathCombine(Folder, filename), gen.generateBarCodeImage());
//        //generateAndrecognize2D
//        res += "generateAndrecognize2D(" + StringTestUtils.convertNormalStringToCSharpString(codetext2D) + ", " + isAllowOnlyGS1Encoding.ToString().ToLower() + ", TwoDComponentType." + twoDComponentType.ToString() + ");\n";
//        //recognize2D
//        res += "recognize2D(" + StringTestUtils.convertNormalStringToCSharpString(codetext2D) + ", \"" + filename + "\");\n\n";
//        StringTestUtils.writeStringToFile(Global.pathCombine(Folder, LogFilename), res, true);
//    }

    private void generateAndrecognize2D(String codetext2D, boolean isAllowOnlyGS1Encoding, TwoDComponentType twoDComponentType)
    {
        BarcodeGenerator gen = generateWith2DCodetext(codetext2D, isAllowOnlyGS1Encoding, twoDComponentType);
        BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.GS_1_COMPOSITE_BAR);
        recognize2D(reader, codetext2D);
    }

    private void recognize2D(String codetext2D, String filename) throws IOException
    {
        InputStream ms = IOTestUtils.loadToMemoryStreamExternal(Global.pathCombine(Folder, filename));
        BarCodeReader reader = new BarCodeReader(ms, DecodeType.GS_1_COMPOSITE_BAR);
        recognize2D(reader, codetext2D);
    }

    private static void recognize2D(BarCodeReader reader, String codetext2D)
    {
        Assert.assertEquals(1, reader.readBarCodes().length);
        Assert.assertEquals(DecodeType.GS_1_COMPOSITE_BAR, reader.getFoundBarCodes()[0].getCodeType());
        Assert.assertEquals(codetext2D, reader.getFoundBarCodes()[0].getExtended().getGS1CompositeBar().getTwoDCodeText());
    }

    private static BarcodeGenerator generateWith2DCodetext(String codetext2D, boolean isAllowOnlyGS1Encoding, TwoDComponentType twoDComponentType)
    {
        String fullCodetext = "(21)ABCDEABCDEABCDEABCDE|" + codetext2D;

        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.GS_1_COMPOSITE_BAR, fullCodetext);
        gen.getParameters().getBarcode().getGS1CompositeBar().setLinearComponentType(EncodeTypes.GS_1_CODE_128);
        gen.getParameters().getBarcode().getGS1CompositeBar().setTwoDComponentType(twoDComponentType);
        gen.getParameters().getBarcode().getGS1CompositeBar().setAllowOnlyGS1Encoding(isAllowOnlyGS1Encoding);
        gen.getParameters().getBarcode().getCodeTextParameters().setLocation(CodeLocation.NONE);

        return gen;
    }

//    private static String getFixedFilename(String codetext, String extention)
//    {
//        List<Character> invalid = new ArrayList<>();
//        invalid.addAll(Path.GetInvalidFileNameChars());
//        invalid.addAll(Arrays.asList('*', '?', '\'', '/', '\"', '.' ));
//        Character[] invalidChars = invalid.toArray(new Character[0]);
//        StringBuilder filename = new StringBuilder();
//
//        for (int i = 0; i < codetext.length(); ++i)
//            if (0 <= Array.IndexOf(invalidChars, codetext.charAt(i)))
//                filename.append('_');
//            else
//                filename.append(codetext.charAt(i));
//
//        filename.append(extention);
//        return filename.toString();
//    }
}
