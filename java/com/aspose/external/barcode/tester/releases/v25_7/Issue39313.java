package com.aspose.external.barcode.tester.releases.v25_7;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import com.aspose.barcode.licensing.LicenseType;
import helpers.FrameworkTestUtils;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.InputStream;

public class Issue39313
{
    final String Folder = Global.getTestDataFolder("Issues/Issue39313");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense(LicenseType.Total);
    }

    @Test
    public void test_Recognize() throws IOException {
        recognizeGS1DataMatrix("(00)057139094001446641(241)2023120238(91)Naturalia Bau Board 1000x610x20 P2(243)035402", "user01.png");
        recognizeGS1DataMatrix("(00)057139091004349375(241)24140053(91)SkamoDoor Board 225 P2(243)035402", "user02.png");
        recognizeGS1DataMatrix("(00)057139091004359992(241)1020140006(91)V 250x250x100(243)015101", "user03.png");
        recognizeGS1DataMatrix("(00)057139091004360004(241)3023040061(91)Spartherm Bodenstein Recht(243)031072", "user04.png");
    }

    @Test
    public void test_GenerateAndRecognize()
    {
        generateAndGS1DataMatrix("(00)057139094001446641(241)2023120238(91)Naturalia Bau Board 1000x610x20 P2(243)035402");
        generateAndGS1DataMatrix("(00)057139091004349375(241)24140053(91)SkamoDoor Board 225 P2(243)035402");
        generateAndGS1DataMatrix("(00)057139091004359992(241)1020140006(91)V 250x250x100(243)015101");
        generateAndGS1DataMatrix("(00)057139091004360004(241)3023040061(91)Spartherm Bodenstein Recht(243)031072");
    }

    private void generateAndGS1DataMatrix(String codetext)
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.GS_1_DATA_MATRIX, codetext);
        {
            gen.getParameters().getBarcode().getXDimension().setPixels(4);
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.GS_1_DATA_MATRIX);
            {
                Assert.assertEquals(1, reader.readBarCodes().length);
                Assert.assertEquals("GS1DataMatrix", reader.getFoundBarCodes()[0].getCodeTypeName());
                Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }

    private void recognizeGS1DataMatrix(String codetext, String file) throws IOException {
        String filename = Global.pathCombine(Folder, file);
        InputStream ms = helpers.IOTestUtils.loadToMemoryStreamExternal(filename);
        BarCodeReader reader = new BarCodeReader(ms, DecodeType.GS_1_DATA_MATRIX);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("GS1DataMatrix", reader.getFoundBarCodes()[0].getCodeTypeName());
            Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    private void generateGS1DataMatrix(String codetext, String file) throws IOException {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.GS_1_DATA_MATRIX, codetext);
        {
            gen.getParameters().getBarcode().getXDimension().setPixels(4);
            FrameworkTestUtils.generateAndSave(gen, Folder, file);
        }
    }
}
