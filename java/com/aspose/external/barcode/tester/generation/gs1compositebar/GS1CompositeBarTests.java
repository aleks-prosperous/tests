package com.aspose.external.barcode.tester.generation.gs1compositebar;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.*;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import com.aspose.barcode.generation.SymbologyEncodeType;
import com.aspose.barcode.generation.TwoDComponentType;
import helpers.FrameworkTestUtils;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.TestExternalHelper;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GS1CompositeBarTests
{
    private static final String Folder = Global.getTestDataFolder("Generation\\GS1CompositeBar");

    @BeforeMethod
    public void test_setUp()
    {
        com.aspose.barcode.LicenseAssistant.setupLicense(com.aspose.barcode.licensing.LicenseType.Total);
    }

    @Test
    public void test_GS1CompositeBar_ImageFromSpec1_Test() throws IOException
    {
        //DataBar Limited 0113112345678906; cca 1701061510A123456
        GS1CompositeBarGenerator gen = new GS1CompositeBarGenerator(EncodeTypes.DATABAR_LIMITED, TwoDComponentType.CC_A, "(01)13112345678906|(17)010615(10)A123456");
        generateAndRecognize(gen, "(01)13112345678906|(17)010615(10)A123456", DecodeType.DATABAR_LIMITED, "(01)13112345678906", DecodeType.MICRO_PDF_417, "(17)010615(10)A123456");
        generateAndCompare(gen, "ImageFromSpec1.png");
    }

    @Test
    public void test_GS1CompositeBar_ImageFromSpec2_Test() throws IOException
    {
        //GS1-128 0193812345678901; ccc 10ABCD1234564103898765432108
        GS1CompositeBarGenerator gen = new GS1CompositeBarGenerator(EncodeTypes.GS_1_CODE_128, TwoDComponentType.CC_C, "(01)93812345678901|(10)ABCD123456(410)3898765432108");
        generateAndRecognize(gen, "(01)93812345678901|(10)ABCD123456(410)3898765432108", DecodeType.GS_1_CODE_128, "(01)93812345678901", DecodeType.PDF_417, "(10)ABCD123456(410)3898765432108");
        generateAndCompare(gen, "ImageFromSpec2.png");
    }

    @Test
    public void test_GS1CompositeBar_ImageFromSpec3_Test() throws IOException
    {
        //UPC-E 012000001239; cca 15021231
        GS1CompositeBarGenerator gen = new GS1CompositeBarGenerator(EncodeTypes.UPCE, TwoDComponentType.CC_A, "01212309|(15)021231");
        generateAndRecognize(gen, "01212309|(15)021231", DecodeType.UPCE, "01212309", DecodeType.MICRO_PDF_417, "(15)021231");
        generateAndCompare(gen, "ImageFromSpec3.png");
    }

    @Test
    public void test_GS1CompositeBar_ImageFromSpec4_Test() throws IOException
    {
        //EAN-8 12345670; cca 21A12345678
        GS1CompositeBarGenerator gen = new GS1CompositeBarGenerator(EncodeTypes.EAN_8, TwoDComponentType.CC_A, "12345670|(21)A12345678");
        generateAndRecognize(gen, "12345670|(21)A12345678", DecodeType.EAN_8, "12345670", DecodeType.MICRO_PDF_417, "(21)A12345678");
        generateAndCompare(gen, "ImageFromSpec4.png");
    }

    @Test
    public void test_GS1CompositeBar_ImageFromSpec5_Test() throws IOException
    {
        //EAN-13 3312345678903; cca 991234-abcd
        GS1CompositeBarGenerator gen = new GS1CompositeBarGenerator(EncodeTypes.EAN_13, TwoDComponentType.CC_A, "3312345678903|(99)1234-abcd");
        generateAndRecognize(gen, "3312345678903|(99)1234-abcd", DecodeType.EAN_13, "3312345678903", DecodeType.MICRO_PDF_417, "(99)1234-abcd");
        generateAndCompare(gen, "ImageFromSpec5.png");
    }

    @Test
    public void test_GS1CompositeBar_ImageFromSpec6_Test() throws IOException
    {
        //DataBar Stacked 0103412345678900; cca 17010200
        GS1CompositeBarGenerator gen = new GS1CompositeBarGenerator(EncodeTypes.DATABAR_STACKED, TwoDComponentType.CC_A, "(01)03412345678900|(17)010200");
        generateAndRecognize(gen, "(01)03412345678900|(17)010200", DecodeType.DATABAR_STACKED_OMNI_DIRECTIONAL, "(01)03412345678900", DecodeType.MICRO_PDF_417, "(17)010200");
        generateAndCompare(gen, "ImageFromSpec6.png");
    }

    @Test
    public void test_GS1CompositeBar_ImageFromSpec7_Test() throws IOException
    {
        //DataBar Limited 0103512345678907; ccb 21abcdefghijklmnopqrstuv
        GS1CompositeBarGenerator gen = new GS1CompositeBarGenerator(EncodeTypes.DATABAR_LIMITED, TwoDComponentType.CC_B, "(01)03512345678907|21abcdefghijklmnopqrstuv", false);
        generateAndRecognize(gen, "(01)03512345678907|21abcdefghijklmnopqrstuv", DecodeType.DATABAR_LIMITED, "(01)03512345678907", DecodeType.MICRO_PDF_417, "21abcdefghijklmnopqrstuv");
        generateAndCompare(gen, "ImageFromSpec7.png");
    }

    @Test
    public void test_GS1CompositeBar_ImageFromSpec8_Test() throws IOException
    {
        //DataBar Omnidirectional 0103612345678904; cca 11990102
        GS1CompositeBarGenerator gen = new GS1CompositeBarGenerator(EncodeTypes.DATABAR_OMNI_DIRECTIONAL, TwoDComponentType.CC_A, "(01)03612345678904|(11)990102");
        generateAndRecognize(gen, "(01)03612345678904|(11)990102", DecodeType.DATABAR_OMNI_DIRECTIONAL, "(01)03612345678904", DecodeType.MICRO_PDF_417, "(11)990102");
        generateAndCompare(gen, "ImageFromSpec8.png");
    }

    @Test
    public void test_GS1CompositeBar_ImageFromSpec9_Test() throws IOException
    {
        //DataBar Expanded 01937123456789043103001234; cca 911A2B3C4D5E
        GS1CompositeBarGenerator gen = new GS1CompositeBarGenerator(EncodeTypes.DATABAR_EXPANDED, TwoDComponentType.CC_A, "(01)93712345678904(3103)001234|(91)1A2B3C4D5E");
        generateAndRecognize(gen, "(01)93712345678904(3103)001234|(91)1A2B3C4D5E", DecodeType.DATABAR_EXPANDED, "(01)93712345678904(3103)001234", DecodeType.MICRO_PDF_417, "(91)1A2B3C4D5E");
        generateAndCompare(gen, "ImageFromSpec9.png");
    }

    @Test
    public void test_GS1CompositeBar_ImageFromSpec10_Test() throws IOException
    {
        //DataBar Expanded Stacked 010001234567890510ABCDEF; cca 2112345678
        GS1CompositeBarGenerator gen = new GS1CompositeBarGenerator(EncodeTypes.DATABAR_EXPANDED_STACKED, TwoDComponentType.CC_A, "(01)00012345678905(10)ABCDEF|(21)12345678");
        generateAndRecognize(gen, "(01)00012345678905(10)ABCDEF|(21)12345678", DecodeType.DATABAR_EXPANDED_STACKED, "(01)00012345678905(10)ABCDEF", DecodeType.MICRO_PDF_417, "(21)12345678");
        generateAndCompare(gen, "ImageFromSpec10.png");
    }

    @Test
    public void test_GS1CompositeBar_ImageFromSpec11_Test() throws IOException
    {
        //GS1-128 0103212345678906; cca 21A1B2C3D4E5F6G7H8
        GS1CompositeBarGenerator gen = new GS1CompositeBarGenerator(EncodeTypes.GS_1_CODE_128, TwoDComponentType.CC_A, "(01)03212345678906|(21)A1B2C3D4E5F6G7H8");
        generateAndRecognize(gen, "(01)03212345678906|(21)A1B2C3D4E5F6G7H8", DecodeType.GS_1_CODE_128, "(01)03212345678906", DecodeType.MICRO_PDF_417, "(21)A1B2C3D4E5F6G7H8");
        generateAndCompare(gen, "ImageFromSpec11.png");
    }

    @Test
    public void test_GS1CompositeBar_ImageFromSpec12_Test() throws IOException
    {
        //GS1-128 00030123456789012340; ccc 02130123456789093724<FNC1>101234567ABCDEFG
        GS1CompositeBarGenerator gen = new GS1CompositeBarGenerator(EncodeTypes.GS_1_CODE_128, TwoDComponentType.CC_C, "(00)030123456789012340|(02)13012345678909(37)24(10)1234567ABCDEFG");
        generateAndRecognize(gen, "(00)030123456789012340|(02)13012345678909(37)24(10)1234567ABCDEFG", DecodeType.GS_1_CODE_128, "(00)030123456789012340", DecodeType.PDF_417, "(02)13012345678909(37)24(10)1234567ABCDEFG");
        generateAndCompare(gen, "ImageFromSpec12.png");
    }

    @Test
    public void test_GS1CompositeBar_LinearComponentType_Test()
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.GS_1_COMPOSITE_BAR, "(01)03212345678906/(21)A1B2C3D4E5F6G7H8");
        gen.getParameters().getBarcode().getGS1CompositeBar().setLinearComponentType(EncodeTypes.GS_1_CODE_128);
        Assert.assertEquals(EncodeTypes.GS_1_CODE_128, gen.getParameters().getBarcode().getGS1CompositeBar().getLinearComponentType());
    }

    @Test
    public void test_GS1CompositeBar_TwoDComponentType_Test()
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.GS_1_COMPOSITE_BAR, "(01)03212345678906/(21)A1B2C3D4E5F6G7H8");
        gen.getParameters().getBarcode().getGS1CompositeBar().setTwoDComponentType(TwoDComponentType.CC_A);
        Assert.assertEquals(TwoDComponentType.CC_A, gen.getParameters().getBarcode().getGS1CompositeBar().getTwoDComponentType());
    }

    @Test
    public void test_GS1CompositeBar_IsAllowOnlyGS1Encoding_Test()
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.GS_1_COMPOSITE_BAR, "(01)03212345678906/(21)A1B2C3D4E5F6G7H8");
        gen.getParameters().getBarcode().getGS1CompositeBar().setAllowOnlyGS1Encoding(true);
        Assert.assertEquals(true, gen.getParameters().getBarcode().getGS1CompositeBar().isAllowOnlyGS1Encoding());
        gen.getParameters().getBarcode().getGS1CompositeBar().setAllowOnlyGS1Encoding(false);
        Assert.assertEquals(false, gen.getParameters().getBarcode().getGS1CompositeBar().isAllowOnlyGS1Encoding());
    }

    @Test
    public void test_GS1CompositeBar_DatabarOmniDirectional2DCompositeComponent_Test()
    {
        BarcodeGenerator gen = new GS1CompositeBarGenerator(EncodeTypes.DATABAR_OMNI_DIRECTIONAL, TwoDComponentType.CC_A, "(01)03412345678900|(17)010200").getBarcodeGenerator();
        testDataBar2DCompositeComponent(gen, DecodeType.DATABAR_OMNI_DIRECTIONAL, "(01)03412345678900");
    }

    @Test
    public void test_GS1CompositeBar_DatabarStackedOmniDirectional2DCompositeComponent_Test()
    {
        BarcodeGenerator gen = new GS1CompositeBarGenerator(EncodeTypes.DATABAR_STACKED_OMNI_DIRECTIONAL, TwoDComponentType.CC_A, "(01)03412345678900|(17)010200").getBarcodeGenerator();
        testDataBar2DCompositeComponent(gen, DecodeType.DATABAR_STACKED_OMNI_DIRECTIONAL, "(01)03412345678900");
    }

    @Test
    public void test_GS1CompositeBar_DATABAR_LIMITED2DCompositeComponent_Test()
    {
        BarcodeGenerator gen = new GS1CompositeBarGenerator(EncodeTypes.DATABAR_LIMITED, TwoDComponentType.CC_A, "(01)13112345678906|(17)010615").getBarcodeGenerator();
        testDataBar2DCompositeComponent(gen, DecodeType.DATABAR_LIMITED, "(01)13112345678906");
    }

    @Test
    public void test_GS1CompositeBar_DATABAR_EXPANDED2DCompositeComponent_Test()
    {
        BarcodeGenerator gen = new GS1CompositeBarGenerator(EncodeTypes.DATABAR_EXPANDED, TwoDComponentType.CC_A, "(01)93712345678904(3103)001234|(91)1A2B3C4D5E").getBarcodeGenerator();
        testDataBar2DCompositeComponent(gen, DecodeType.DATABAR_EXPANDED, "(01)93712345678904(3103)001234");
    }

    @Test
    public void test_GS1CompositeBar_DATABAR_EXPANDED_STACKED2DCompositeComponent_Test()
    {
        BarcodeGenerator gen = new GS1CompositeBarGenerator(EncodeTypes.DATABAR_EXPANDED_STACKED, TwoDComponentType.CC_A, "(01)93712345678904(3103)001234|(91)1A2B3C4D5E").getBarcodeGenerator();
        testDataBar2DCompositeComponent(gen, DecodeType.DATABAR_EXPANDED_STACKED, "(01)93712345678904(3103)001234");
    }

    @Test
    public void test_GS1CompositeBar_GS_1_CODE_128Composite2D_CC_A_CodeSetA_Test()
    {
        BarcodeGenerator generator = new GS1CompositeBarGenerator(EncodeTypes.GS_1_CODE_128, TwoDComponentType.CC_A, "(10)12345678|(10)ABCD123456").getBarcodeGenerator();
        testGS_1_CODE_128LastLinkageFlag(generator, "(10)12345678", Code128SubType.CODE_SET_A);
    }

    @Test
    public void test_GS1CompositeBar_GS_1_CODE_128Composite2D_CC_A_CodeSetC_Test()
    {
        BarcodeGenerator generator = new GS1CompositeBarGenerator(EncodeTypes.GS_1_CODE_128, TwoDComponentType.CC_A, "(10)ABCD|(10)ABCD123456").getBarcodeGenerator();
        testGS_1_CODE_128LastLinkageFlag(generator, "(10)ABCD", Code128SubType.CODE_SET_C);
    }

    @Test
    public void test_GS1CompositeBar_GS_1_CODE_128Composite2D_CC_C_CodeSetB_Test()
    {
        BarcodeGenerator generator = new GS1CompositeBarGenerator(EncodeTypes.GS_1_CODE_128, TwoDComponentType.CC_C, "(10)12345678|(10)ABCD123456").getBarcodeGenerator();
        testGS_1_CODE_128LastLinkageFlag(generator, "(10)12345678", Code128SubType.CODE_SET_B);
    }

    @Test
    public void test_GS1CompositeBar_GS_1_CODE_128Composite2D_CC_C_CodeSetA_Test()
    {
        BarcodeGenerator generator = new GS1CompositeBarGenerator(EncodeTypes.GS_1_CODE_128, TwoDComponentType.CC_C, "(10)ABCD|(10)ABCD123456").getBarcodeGenerator();
        testGS_1_CODE_128LastLinkageFlag(generator, "(10)ABCD", Code128SubType.CODE_SET_A);
    }

    protected void testGS_1_CODE_128LastLinkageFlag(BarcodeGenerator generator, String codeText, int code128SubType)
    {
        BarCodeReader reader = new BarCodeReader(generator.generateBarCodeImage(), DecodeType.GS_1_CODE_128);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals(DecodeType.GS_1_CODE_128, reader.getFoundBarCodes()[0].getCodeType());
            Assert.assertEquals(codeText, reader.getFoundBarCodes()[0].getCodeText());
            Code128DataPortion lastPortion = reader.getFoundBarCodes()[0].getExtended().getCode128().getCode128DataPortions()[reader.getFoundBarCodes()[0].getExtended().getCode128().getCode128DataPortions().length - 1];
            Assert.assertEquals(code128SubType, lastPortion.getCode128SubType());
            Assert.assertEquals("", lastPortion.getData());
        }
    }

    protected void testDataBar2DCompositeComponent(BarcodeGenerator generator, SingleDecodeType decodeType, String codeText)
    {
        BarCodeReader reader = new BarCodeReader(generator.generateBarCodeImage(), decodeType);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals(decodeType, reader.getFoundBarCodes()[0].getCodeType());
            Assert.assertEquals(codeText, reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(true, reader.getFoundBarCodes()[0].getExtended().getDataBar().is2DCompositeComponent());
        }
    }

    protected void generateAndSave(IgetBarcodeGenerator gen, String filename) throws IOException
    {
        generateAndSave(gen, Folder, filename);
    }

    protected void generateAndCompare(IgetBarcodeGenerator gen,  String filename) throws IOException
    {
        generateAndCompare(gen, Folder, filename);
    }

    protected static void generateAndSave(IgetBarcodeGenerator gen, String folder, String filename) throws IOException
    {
        BarcodeGenerator generator = gen.getBarcodeGenerator();
        generateAndSave(generator, folder, filename);
    }

    protected static void generateAndSave(BarcodeGenerator generator, String folder, String filename) throws IOException
    {
        FrameworkTestUtils.storeBitmap(Global.pathCombine(folder, filename), generator.generateBarCodeImage());
    }

    protected static void generateAndCompare(IgetBarcodeGenerator gen, String folder, String filename) throws IOException
    {
        BarcodeGenerator generator = gen.getBarcodeGenerator();
        generateAndCompare(generator, folder, filename);
    }

    protected static void generateAndCompare(BarcodeGenerator generator, String folder, String filename) throws IOException
    {
        FrameworkTestUtils.compareBitmaps(Global.pathCombine(folder, filename), generator.generateBarCodeImage());
    }

    protected static void generateAndRecognize(IgetBarcodeGenerator gen, String mainCodeText, SingleDecodeType oneDType, String oneDCodeText, SingleDecodeType twoDType, String twoDCodeText)
    {
        BarcodeGenerator generator = gen.getBarcodeGenerator();
        generateAndRecognizeBarcodeGenerator(generator, mainCodeText, oneDType, oneDCodeText, twoDType, twoDCodeText);
    }

    protected static void generateAndRecognizeBarcodeGenerator(BarcodeGenerator generator, String mainCodeText, SingleDecodeType oneDType, String oneDCodeText, SingleDecodeType twoDType, String twoDCodeText)
    {
        BarCodeReader reader = new BarCodeReader(generator.generateBarCodeImage(), DecodeType.GS_1_COMPOSITE_BAR);
        recognize(reader, mainCodeText, oneDType, oneDCodeText, twoDType, twoDCodeText);
    }

//    protected static void recognize(String folder, String filename, String mainCodeText, SingleDecodeType oneDType, String oneDCodeText, SingleDecodeType twoDType, String twoDCodeText)
//    {
//        MemoryStream ms = IOTestUtils.loadToMemoryStreamExternal(Global.PathCombine(folder, filename));
//        using (BarCodeReader reader = new BarCodeReader(ms, DecodeType.GS1CompositeBar))
//        recognize(reader, mainCodeText, oneDType, oneDCodeText, twoDType, twoDCodeText);
//    }

    protected static void recognize(BarCodeReader reader, String mainCodeText, SingleDecodeType oneDType, String oneDCodeText, SingleDecodeType twoDType, String twoDCodeText)
    {
        Assert.assertEquals(1, reader.readBarCodes().length);
        Assert.assertEquals(DecodeType.GS_1_COMPOSITE_BAR, reader.getFoundBarCodes()[0].getCodeType());
        Assert.assertEquals(mainCodeText, reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals(oneDType, reader.getFoundBarCodes()[0].getExtended().getGS1CompositeBar().getOneDType());
        Assert.assertEquals(oneDCodeText, reader.getFoundBarCodes()[0].getExtended().getGS1CompositeBar().getOneDCodeText());
        Assert.assertEquals(twoDType, reader.getFoundBarCodes()[0].getExtended().getGS1CompositeBar().getTwoDType());
        Assert.assertEquals(twoDCodeText, reader.getFoundBarCodes()[0].getExtended().getGS1CompositeBar().getTwoDCodeText());
    }

    protected interface IgetBarcodeGenerator
    {
        BarcodeGenerator getBarcodeGenerator();
    }

    protected class GS1CompositeBarGenerator implements IgetBarcodeGenerator
    {
        protected SymbologyEncodeType _oneDType;
        protected TwoDComponentType _twoDType;
        protected String _codetext;
        protected boolean _isAllowOnlyGS1Encoding;
                public GS1CompositeBarGenerator(SymbologyEncodeType oneDType, TwoDComponentType twoDType, String codetext)
        {
            this(oneDType, twoDType, codetext, true);
        }

                public GS1CompositeBarGenerator(SymbologyEncodeType oneDType, TwoDComponentType twoDType, String codetext, boolean isAllowOnlyGS1Encoding)
        {
            _oneDType = oneDType;
            _twoDType = twoDType;
            _codetext = codetext;
            _isAllowOnlyGS1Encoding = isAllowOnlyGS1Encoding;
        }

        public BarcodeGenerator getBarcodeGenerator()
        {
            BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.GS_1_COMPOSITE_BAR, _codetext);
            gen.getParameters().getBarcode().getGS1CompositeBar().setLinearComponentType(_oneDType);
            gen.getParameters().getBarcode().getGS1CompositeBar().setTwoDComponentType(_twoDType);
            gen.getParameters().getBarcode().getGS1CompositeBar().setAllowOnlyGS1Encoding(_isAllowOnlyGS1Encoding);

            setBarcodeGeneratorParameters(gen);
            return gen;
        }
        protected void setBarcodeGeneratorParameters(BarcodeGenerator generator)
        { }
    }
}
