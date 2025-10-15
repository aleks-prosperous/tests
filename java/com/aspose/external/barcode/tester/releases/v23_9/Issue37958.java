package com.aspose.external.barcode.tester.releases.v23_9;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.SingleDecodeType;
import helpers.IOTestUtils;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.IOException;
import java.io.InputStream;

public class Issue37958
{
    private final static String IsoFolder = Global.getTestDataFolder("Issues\\Issue37958");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test_ISO24723_Figure01() throws IOException
    {
        recognizeGS1CompositeBar(IsoFolder, "ISO24723_Figure01.png", "(01)13112345678906|(17)010615(10)A123456", DecodeType.DATABAR_LIMITED, "(01)13112345678906", DecodeType.MICRO_PDF_417, "(17)010615(10)A123456");
    }

    @Test
    public void test_ISO24723_Figure02() throws IOException
    {
        recognizeGS1CompositeBar(IsoFolder, "ISO24723_Figure02.png", "(01)93812345678901|(10)ABCD123456(410)3898765432108", DecodeType.GS_1_CODE_128, "(01)93812345678901", DecodeType.PDF_417, "(10)ABCD123456(410)3898765432108");
    }

    @Test
    public void test_ISO24723_Figure03() throws IOException
    {
        recognizeGS1CompositeBar(IsoFolder, "ISO24723_Figure03.png", "01212309|(15)021231", DecodeType.UPCE, "01212309", DecodeType.MICRO_PDF_417, "(15)021231");
    }

    @Test
    public void test_ISO24723_Figure04() throws IOException
    {
        recognizeGS1CompositeBar(IsoFolder, "ISO24723_Figure04.png", "12345670|(21)A12345678", DecodeType.EAN_8, "12345670", DecodeType.MICRO_PDF_417, "(21)A12345678");
    }

    @Test
    public void test_ISO24723_Figure05() throws IOException
    {
        recognizeGS1CompositeBar(IsoFolder, "ISO24723_Figure05.png", "3312345678903|(99)1234-abcd", DecodeType.EAN_13, "3312345678903", DecodeType.MICRO_PDF_417, "(99)1234-abcd");
    }

    @Test
    public void test_ISO24723_Figure06() throws IOException
    {
        recognizeGS1CompositeBar(IsoFolder, "ISO24723_Figure06.png", "(01)03412345678900|(17)010200", DecodeType.DATABAR_STACKED_OMNI_DIRECTIONAL, "(01)03412345678900", DecodeType.MICRO_PDF_417, "(17)010200");
    }

    @Test
    public void test_ISO24723_Figure07() throws IOException
    {
        recognizeGS1CompositeBar(IsoFolder, "ISO24723_Figure07.png", "(01)03512345678907|21abcdefghijklmnopqrstuv", DecodeType.DATABAR_LIMITED, "(01)03512345678907", DecodeType.MICRO_PDF_417, "21abcdefghijklmnopqrstuv");
    }

    @Test
    public void test_ISO24723_Figure08() throws IOException
    {
        recognizeGS1CompositeBar(IsoFolder, "ISO24723_Figure08.png", "(01)03612345678904|(11)990102", DecodeType.DATABAR_OMNI_DIRECTIONAL, "(01)03612345678904", DecodeType.MICRO_PDF_417, "(11)990102");
    }

    @Test
    public void test_ISO24723_Figure09() throws IOException
    {
        recognizeGS1CompositeBar(IsoFolder, "ISO24723_Figure09.png", "(01)93712345678904(3103)001234|(91)1A2B3C4D5E", DecodeType.DATABAR_EXPANDED, "(01)93712345678904(3103)001234", DecodeType.MICRO_PDF_417, "(91)1A2B3C4D5E");
    }

    @Test
    public void test_ISO24723_Figure10() throws IOException
    {
        recognizeGS1CompositeBar(IsoFolder, "ISO24723_Figure10.png", "(01)00012345678905(10)ABCDEF|(21)12345678", DecodeType.DATABAR_EXPANDED_STACKED, "(01)00012345678905(10)ABCDEF", DecodeType.MICRO_PDF_417, "(21)12345678");
    }

    @Test
    public void test_ISO24723_Figure11() throws IOException
    {
        recognizeGS1CompositeBar(IsoFolder, "ISO24723_Figure11.png", "(01)03212345678906|(21)A1B2C3D4E5F6G7H8", DecodeType.GS_1_CODE_128, "(01)03212345678906", DecodeType.MICRO_PDF_417, "(21)A1B2C3D4E5F6G7H8");
    }

    @Test
    public void test_ISO24723_Figure12() throws IOException
    {
        recognizeGS1CompositeBar(IsoFolder, "ISO24723_Figure12.png", "(00)030123456789012340|(02)13012345678909(37)24(10)1234567ABCDEFG", DecodeType.GS_1_CODE_128, "(00)030123456789012340", DecodeType.PDF_417, "(02)13012345678909(37)24(10)1234567ABCDEFG");
    }

    @Test
    public void test_CCA_Figure01() throws IOException
    {
        recognizeGS1CompositeBarOnly2DComponent(IsoFolder, "CCA_Figure01.png", DecodeType.MICRO_PDF_417, "(17)010615(10)A123456");
    }

    @Test
    public void test_CCB_Figure07() throws IOException
    {
        recognizeGS1CompositeBarOnly2DComponent(IsoFolder, "CCB_Figure07.png", DecodeType.MICRO_PDF_417, "21abcdefghijklmnopqrstuv");
    }

    @Test
    public void test_CCC_Figure02() throws IOException
    {
        recognizeGS1CompositeBarOnly2DComponent(IsoFolder, "CCC_Figure02.png", DecodeType.PDF_417, "(10)ABCD123456(410)3898765432108");
    }

    private static void recognizeGS1CompositeBar(String folder, String filename, String mainCodeText, SingleDecodeType oneDType, String oneDCodeText, SingleDecodeType twoDType, String twoDCodeText) throws IOException
    {
        InputStream ms = IOTestUtils.loadToMemoryStreamExternal(Global.pathCombine(folder, filename));
        BarCodeReader reader = new BarCodeReader(ms, DecodeType.GS_1_COMPOSITE_BAR);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals(DecodeType.GS_1_COMPOSITE_BAR, reader.getFoundBarCodes()[0].getCodeType());
            Assert.assertEquals(mainCodeText, reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(oneDType, reader.getFoundBarCodes()[0].getExtended().getGS1CompositeBar().getOneDType());
            Assert.assertEquals(oneDCodeText, reader.getFoundBarCodes()[0].getExtended().getGS1CompositeBar().getOneDCodeText());
            Assert.assertEquals(twoDType, reader.getFoundBarCodes()[0].getExtended().getGS1CompositeBar().getTwoDType());
            Assert.assertEquals(twoDCodeText, reader.getFoundBarCodes()[0].getExtended().getGS1CompositeBar().getTwoDCodeText());
        }
    }

    private static void recognizeGS1CompositeBarOnly2DComponent(String folder, String filename, SingleDecodeType recognizedType, String recognizedCodetext) throws IOException
    {
        InputStream ms = IOTestUtils.loadToMemoryStreamExternal(Global.pathCombine(folder, filename));
        BarCodeReader reader = new BarCodeReader(ms, DecodeType.GS_1_COMPOSITE_BAR);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals(recognizedType, reader.getFoundBarCodes()[0].getCodeType());
            Assert.assertEquals(recognizedCodetext, reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(true, reader.getFoundBarCodes()[0].getExtended().getPdf417().isLinked());
        }
    }
}
