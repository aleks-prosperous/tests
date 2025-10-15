package com.aspose.external.barcode.tester.releases.v23_5;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.generation.BarCodeImageFormat;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.Code128EncodeMode;
import com.aspose.barcode.generation.EncodeTypes;
import helpers.IOTestUtils;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Issue38578
{
    private static final String Folder = Global.getTestDataFolder("Issues\\Issue38578");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test_Code128EncodeMode_Auto() throws IOException {
        generateAndRecognizeCode128(Code128EncodeMode.AUTO, "ABCD344456759\t", "B", "ABCD", "C", "34445675", "A", "9\t");
        recognizeCode128("Code128EncodeMode_Auto.png", "B", "ABCD", "C", "34445675", "A", "9\t");
    }

    @Test
    public void test_Code128EncodeMode_CodeA() throws IOException {
        generateAndRecognizeCode128(Code128EncodeMode.CODE_A, "344456759", "A", "344456759");
        recognizeCode128("Code128EncodeMode_CodeA.png", "A", "344456759");

    }

    @Test
    public void test_Code128EncodeMode_CodeB() throws IOException {
        generateAndRecognizeCode128(Code128EncodeMode.CODE_B, "344456759", "B", "344456759");
        recognizeCode128("Code128EncodeMode_CodeB.png", "B", "344456759");
    }

    @Test
    public void test_Code128EncodeMode_CodeC() throws IOException {
        generateAndRecognizeCode128(Code128EncodeMode.CODE_C, "3444567597", "C", "3444567597");
        recognizeCode128("Code128EncodeMode_CodeC.png", "C", "3444567597");
    }

    @Test
    public void test_Code128EncodeMode_CodeAB() throws IOException {
        generateAndRecognizeCode128(Code128EncodeMode.CODE_AB, "344456759\tABCD", "B", "344456759", "A", "\tABCD");
        recognizeCode128("Code128EncodeMode_CodeAB.png", "B", "344456759", "A", "\tABCD");
    }

    @Test
    public void test_Code128EncodeMode_CodeAC() throws IOException {
        generateAndRecognizeCode128(Code128EncodeMode.CODE_AC, "ABCD344456759\t", "A", "ABCD", "C", "34445675", "A", "9\t");
        recognizeCode128("Code128EncodeMode_CodeAC.png", "A", "ABCD", "C", "34445675", "A", "9\t");
    }

    @Test
    public void test_Code128EncodeMode_CodeBC() throws IOException {
        generateAndRecognizeCode128(Code128EncodeMode.CODE_BC, "ABCD344456759", "B", "ABCD", "C", "34445675", "B", "9");
        recognizeCode128("Code128EncodeMode_CodeBC.png", "B", "ABCD", "C", "34445675", "B", "9");
    }

    private void recognizeCode128(String filename, String... dataPortions) throws IOException {
        InputStream ms = IOTestUtils.loadToMemoryStreamExternal(filenameToPath(filename));
        BarCodeReader reader = new BarCodeReader(ms, DecodeType.CODE_128);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            TestCode128InResult(reader.getFoundBarCodes()[0], dataPortions);
        }
    }

    private void generateAndRecognizeCode128(Code128EncodeMode encodeMode, String codetext, String... dataPortions)
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.CODE_128, codetext);
        {
            gen.getParameters().getBarcode().getXDimension().setPixels(2);
            gen.getParameters().getBarcode().getCode128().setCode128EncodeMode(encodeMode);

            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.CODE_128);
            reader.setQualitySettings(QualitySettings.getHighPerformance());
            {
                Assert.assertEquals(1, reader.readBarCodes().length);
                TestCode128InResult(reader.getFoundBarCodes()[0], dataPortions);
            }
        }
    }

    private void GenerateAndSaveCode128(Code128EncodeMode encodeMode, String codetext, String filename) throws IOException
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.CODE_128, codetext);
        {
            gen.getParameters().getBarcode().getXDimension().setPixels(2);
            gen.getParameters().getBarcode().getCode128().setCode128EncodeMode(encodeMode);

            ByteArrayOutputStream ms = new ByteArrayOutputStream();
            gen.save(ms, BarCodeImageFormat.PNG);
            IOTestUtils.saveMemoryStreamToFile(filenameToPath(filename), new ByteArrayInputStream(ms.toByteArray()));
        }
    }

    private String filenameToPath(String filename)
    {
        String path = Global.pathCombine(Folder, filename);
        //path = FrameworkTestUtils.AddFrameworkPostFixToFileName(path);
        return path;
    }

    //[A], [ABCD], [B], [abcd], [C], [123456]
    private void TestCode128InResult(BarCodeResult result, String... dataPortions)
    {
        int dataPortionsCount = dataPortions.length / 2;
        int[] code128Types = new int[dataPortionsCount];
        String[] code128Datas = new String[dataPortionsCount];
        for (int i = 0; i < dataPortionsCount; ++i)
        {
            String typeStr = dataPortions[i * 2].toLowerCase();
            switch (typeStr)
            {
                case "a":
                    code128Types[i] = Code128SubType.CODE_SET_A;
                    break;
                case "b":
                    code128Types[i] = Code128SubType.CODE_SET_B;
                    break;
                case "c":
                    code128Types[i] = Code128SubType.CODE_SET_C;
                    break;
                default:
                    Assert.fail("Unknown Code128 Sub Type:" + typeStr);
                    break;
            }
            code128Datas[i] = dataPortions[i * 2 + 1];
        }

        //test
        Assert.assertEquals(dataPortionsCount, result.getExtended().getCode128().getCode128DataPortions().length, "Code128 Data Portions is not equal");
        for (int i = 0; i < dataPortionsCount; ++i)
        {
            Assert.assertEquals(code128Types[i], result.getExtended().getCode128().getCode128DataPortions()[i].getCode128SubType());
            Assert.assertEquals(code128Datas[i], result.getExtended().getCode128().getCode128DataPortions()[i].getData());
        }
    }
}
