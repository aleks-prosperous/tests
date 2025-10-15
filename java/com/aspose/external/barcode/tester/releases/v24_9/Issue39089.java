package com.aspose.external.barcode.tester.releases.v24_9;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.licensing.LicenseType;
import helpers.IOTestUtils;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Issue39089
{
    final String Folder = Global.getTestDataFolder("Issues/Issue39089");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense(LicenseType.Total);
    }

    //[Test]
    //generates test results
    public void TestDemoQR() throws IOException {
        generateQR("12345", QRVersion.VERSION_03, QRErrorLevel.LEVEL_L, "Version03LevelL.png");
        generateQR("12345", QRVersion.VERSION_15, QRErrorLevel.LEVEL_L, "Version15LevelL.png");
        generateQR("12345", QRVersion.VERSION_40, QRErrorLevel.LEVEL_L, "Version40LevelL.png");
        generateQR("12345", QRVersion.VERSION_03, QRErrorLevel.LEVEL_M, "Version03LevelM.png");
        generateQR("12345", QRVersion.VERSION_15, QRErrorLevel.LEVEL_M, "Version15LevelM.png");
        generateQR("12345", QRVersion.VERSION_40, QRErrorLevel.LEVEL_M, "Version40LevelM.png");
        generateQR("12345", QRVersion.VERSION_03, QRErrorLevel.LEVEL_H, "Version03LevelH.png");
        generateQR("12345", QRVersion.VERSION_15, QRErrorLevel.LEVEL_H, "Version15LevelH.png");
        generateQR("12345", QRVersion.VERSION_40, QRErrorLevel.LEVEL_H, "Version40LevelH.png");
        generateQR("12345", QRVersion.VERSION_03, QRErrorLevel.LEVEL_Q, "Version03LevelQ.png");
        generateQR("12345", QRVersion.VERSION_15, QRErrorLevel.LEVEL_Q, "Version15LevelQ.png");
        generateQR("12345", QRVersion.VERSION_40, QRErrorLevel.LEVEL_Q, "Version40LevelQ.png");
    }

    @Test
    public void Test_Recognize_QR() throws IOException {
        recognizeQR("12345", QRVersion.VERSION_03, QRErrorLevel.LEVEL_L, "Version03LevelL.png");
        recognizeQR("12345", QRVersion.VERSION_15, QRErrorLevel.LEVEL_L, "Version15LevelL.png");
        recognizeQR("12345", QRVersion.VERSION_40, QRErrorLevel.LEVEL_L, "Version40LevelL.png");
        recognizeQR("12345", QRVersion.VERSION_03, QRErrorLevel.LEVEL_M, "Version03LevelM.png");
        recognizeQR("12345", QRVersion.VERSION_15, QRErrorLevel.LEVEL_M, "Version15LevelM.png");
        recognizeQR("12345", QRVersion.VERSION_40, QRErrorLevel.LEVEL_M, "Version40LevelM.png");
        recognizeQR("12345", QRVersion.VERSION_03, QRErrorLevel.LEVEL_H, "Version03LevelH.png");
        recognizeQR("12345", QRVersion.VERSION_15, QRErrorLevel.LEVEL_H, "Version15LevelH.png");
        recognizeQR("12345", QRVersion.VERSION_40, QRErrorLevel.LEVEL_H, "Version40LevelH.png");
        recognizeQR("12345", QRVersion.VERSION_03, QRErrorLevel.LEVEL_Q, "Version03LevelQ.png");
        recognizeQR("12345", QRVersion.VERSION_15, QRErrorLevel.LEVEL_Q, "Version15LevelQ.png");
        recognizeQR("12345", QRVersion.VERSION_40, QRErrorLevel.LEVEL_Q, "Version40LevelQ.png");
    }

    @Test
    public void Test_GenerateAndRecognize_QR()
    {
        generateAndRecognizeQR("12345", QRVersion.VERSION_03, QRErrorLevel.LEVEL_L);
        generateAndRecognizeQR("12345", QRVersion.VERSION_15, QRErrorLevel.LEVEL_L);
        generateAndRecognizeQR("12345", QRVersion.VERSION_40, QRErrorLevel.LEVEL_L);
        generateAndRecognizeQR("12345", QRVersion.VERSION_03, QRErrorLevel.LEVEL_M);
        generateAndRecognizeQR("12345", QRVersion.VERSION_15, QRErrorLevel.LEVEL_M);
        generateAndRecognizeQR("12345", QRVersion.VERSION_40, QRErrorLevel.LEVEL_M);
        generateAndRecognizeQR("12345", QRVersion.VERSION_03, QRErrorLevel.LEVEL_H);
        generateAndRecognizeQR("12345", QRVersion.VERSION_15, QRErrorLevel.LEVEL_H);
        generateAndRecognizeQR("12345", QRVersion.VERSION_40, QRErrorLevel.LEVEL_H);
        generateAndRecognizeQR("12345", QRVersion.VERSION_03, QRErrorLevel.LEVEL_Q);
        generateAndRecognizeQR("12345", QRVersion.VERSION_15, QRErrorLevel.LEVEL_Q);
        generateAndRecognizeQR("12345", QRVersion.VERSION_40, QRErrorLevel.LEVEL_Q);
    }

    private void generateAndRecognizeQR(String codetext, QRVersion qrVersion, QRErrorLevel errorLevel)
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.QR, codetext);
        {
            gen.getParameters().getBarcode().getQR().setQrVersion(qrVersion);
            gen.getParameters().getBarcode().getQR().setQrErrorLevel(errorLevel);
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.QR);
            {
                Assert.assertEquals(1, reader.readBarCodes().length);
                Assert.assertEquals("QR", reader.getFoundBarCodes()[0].getCodeTypeName());
                Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
                Assert.assertEquals(qrVersion, reader.getFoundBarCodes()[0].getExtended().getQR().getQRVersion());
                Assert.assertEquals(errorLevel, reader.getFoundBarCodes()[0].getExtended().getQR().getQRErrorLevel());
            }
        }
    }

    private void recognizeQR(String codetext, QRVersion qrVersion, QRErrorLevel errorLevel, String file) throws IOException {
        String filename = Global.pathCombine(Folder, file);
        InputStream ms = IOTestUtils.loadToMemoryStreamExternal(filename);
        BarCodeReader reader = new BarCodeReader(ms, DecodeType.QR);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("QR", reader.getFoundBarCodes()[0].getCodeTypeName());
            Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(qrVersion, reader.getFoundBarCodes()[0].getExtended().getQR().getQRVersion());
            Assert.assertEquals(errorLevel, reader.getFoundBarCodes()[0].getExtended().getQR().getQRErrorLevel());
        }
    }

    private void generateQR(String codetext, QRVersion qrVersion, QRErrorLevel errorLevel, String file) throws IOException {
        String filename = Global.pathCombine(Folder, file);
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.QR, codetext);
        {
            gen.getParameters().getBarcode().getQR().setQrVersion(qrVersion);
            gen.getParameters().getBarcode().getQR().setQrErrorLevel(errorLevel);
            ByteArrayOutputStream ms = new ByteArrayOutputStream();
            gen.save(ms, BarCodeImageFormat.PNG);
            IOTestUtils.saveMemoryStreamToFile(filename, new ByteArrayInputStream(ms.toByteArray()));
        }
    }

    @Test
    public void Test_Recognize_MicroQR() throws IOException {
        RecognizeMicroQR("12345", MicroQRVersion.M1, QRErrorLevel.LEVEL_L, "VersionM1LevelL.png");
        RecognizeMicroQR("12345", MicroQRVersion.M2, QRErrorLevel.LEVEL_L, "VersionM2LevelL.png");
        RecognizeMicroQR("12345", MicroQRVersion.M3, QRErrorLevel.LEVEL_L, "VersionM3LevelL.png");
        RecognizeMicroQR("12345", MicroQRVersion.M4, QRErrorLevel.LEVEL_L, "VersionM4LevelL.png");
        RecognizeMicroQR("12345", MicroQRVersion.M2, QRErrorLevel.LEVEL_L, "VersionM2LevelM.png");
        RecognizeMicroQR("12345", MicroQRVersion.M3, QRErrorLevel.LEVEL_L, "VersionM3LevelM.png");
        RecognizeMicroQR("12345", MicroQRVersion.M4, QRErrorLevel.LEVEL_L, "VersionM4LevelM.png");
        RecognizeMicroQR("12345", MicroQRVersion.M3, QRErrorLevel.LEVEL_L, "VersionM3LevelH.png");
        RecognizeMicroQR("12345", MicroQRVersion.M4, QRErrorLevel.LEVEL_L, "VersionM4LevelH.png");
        RecognizeMicroQR("12345", MicroQRVersion.M4, QRErrorLevel.LEVEL_L, "VersionM4LevelQ.png");
    }

    @Test
    public void Test_GenerateAndRecognize_MicroQR()
    {
        GenerateAndRecognizeMicroQR("12345", MicroQRVersion.M1, QRErrorLevel.LEVEL_L);
        GenerateAndRecognizeMicroQR("12345", MicroQRVersion.M2, QRErrorLevel.LEVEL_L);
        GenerateAndRecognizeMicroQR("12345", MicroQRVersion.M3, QRErrorLevel.LEVEL_L);
        GenerateAndRecognizeMicroQR("12345", MicroQRVersion.M4, QRErrorLevel.LEVEL_L);
        GenerateAndRecognizeMicroQR("12345", MicroQRVersion.M2, QRErrorLevel.LEVEL_L);
        GenerateAndRecognizeMicroQR("12345", MicroQRVersion.M3, QRErrorLevel.LEVEL_L);
        GenerateAndRecognizeMicroQR("12345", MicroQRVersion.M4, QRErrorLevel.LEVEL_L);
        GenerateAndRecognizeMicroQR("12345", MicroQRVersion.M3, QRErrorLevel.LEVEL_L);
        GenerateAndRecognizeMicroQR("12345", MicroQRVersion.M4, QRErrorLevel.LEVEL_L);
        GenerateAndRecognizeMicroQR("12345", MicroQRVersion.M4, QRErrorLevel.LEVEL_L);
    }

    private void GenerateAndRecognizeMicroQR(String codetext, MicroQRVersion microQrVersion, QRErrorLevel errorLevel)
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.MICRO_QR, codetext);
        {
            gen.getParameters().getBarcode().getQR().setMicroQRVersion(microQrVersion);
            gen.getParameters().getBarcode().getQR().setQrErrorLevel(errorLevel);
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.MICRO_QR);
            {
                Assert.assertEquals(1, reader.readBarCodes().length);
                Assert.assertEquals("MicroQR", reader.getFoundBarCodes()[0].getCodeTypeName());
                Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
                Assert.assertEquals(microQrVersion, reader.getFoundBarCodes()[0].getExtended().getQR().getMicroQRVersion());
                Assert.assertEquals(errorLevel, reader.getFoundBarCodes()[0].getExtended().getQR().getQRErrorLevel());
            }
        }
    }

    private void RecognizeMicroQR(String codetext, MicroQRVersion rectMicroQrVersion, QRErrorLevel errorLevel, String file) throws IOException {
        String filename = Global.pathCombine(Folder, file);
        InputStream ms = IOTestUtils.loadToMemoryStreamExternal(filename);
        BarCodeReader reader = new BarCodeReader(ms, DecodeType.MICRO_QR);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("MicroQR", reader.getFoundBarCodes()[0].getCodeTypeName());
            Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(rectMicroQrVersion, reader.getFoundBarCodes()[0].getExtended().getQR().getMicroQRVersion());
            Assert.assertEquals(errorLevel, reader.getFoundBarCodes()[0].getExtended().getQR().getQRErrorLevel());
        }
    }

    private void generateMicroQR(String codetext, MicroQRVersion microQrVersion, QRErrorLevel errorLevel, String file) throws IOException {
        String filename = Global.pathCombine(Folder, file);
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.MICRO_QR, codetext);
        {
            gen.getParameters().getBarcode().getQR().setMicroQRVersion(microQrVersion);
            gen.getParameters().getBarcode().getQR().setQrErrorLevel(errorLevel);
            ByteArrayOutputStream ms = new ByteArrayOutputStream();
            gen.save(ms, BarCodeImageFormat.PNG);
            IOTestUtils.saveMemoryStreamToFile(filename, new ByteArrayInputStream(ms.toByteArray()));
        }
    }

    //generates test results
    private void TestDemoRectMicrQR() throws IOException {
        GenerateRectMicroQR("12345", RectMicroQRVersion.R11x99, QRErrorLevel.LEVEL_M, "VersionR11x99LevelM.png");
        GenerateRectMicroQR("12345", RectMicroQRVersion.R7x43, QRErrorLevel.LEVEL_M, "VersionR7x43LevelM.png");
        GenerateRectMicroQR("12345", RectMicroQRVersion.R17x139, QRErrorLevel.LEVEL_M, "VersionR17x139LevelM.png");
        GenerateRectMicroQR("12345", RectMicroQRVersion.R11x99, QRErrorLevel.LEVEL_H, "VersionR11x99LevelH.png");
        GenerateRectMicroQR("12345", RectMicroQRVersion.R7x43, QRErrorLevel.LEVEL_H, "VersionR7x43LevelH.png");
        GenerateRectMicroQR("12345", RectMicroQRVersion.R17x139, QRErrorLevel.LEVEL_H, "VersionR17x139LevelH.png");
    }

    @Test
    public void Test_Recognize_RectMicroQR() throws IOException {
        RecognizeRectMicroQR("12345", RectMicroQRVersion.R11x99, QRErrorLevel.LEVEL_M, "VersionR11x99LevelM.png");
        RecognizeRectMicroQR("12345", RectMicroQRVersion.R7x43, QRErrorLevel.LEVEL_M, "VersionR7x43LevelM.png");
        RecognizeRectMicroQR("12345", RectMicroQRVersion.R17x139, QRErrorLevel.LEVEL_M, "VersionR17x139LevelM.png");
        RecognizeRectMicroQR("12345", RectMicroQRVersion.R11x99, QRErrorLevel.LEVEL_H, "VersionR11x99LevelH.png");
        RecognizeRectMicroQR("12345", RectMicroQRVersion.R7x43, QRErrorLevel.LEVEL_H, "VersionR7x43LevelH.png");
        RecognizeRectMicroQR("12345", RectMicroQRVersion.R17x139, QRErrorLevel.LEVEL_H, "VersionR17x139LevelH.png");
    }

    @Test
    public void Test_GenerateAndRecognize_RectMicroQR()
    {
        GenerateAndRecognizeRectMicroQR("12345", RectMicroQRVersion.R11x99, QRErrorLevel.LEVEL_M);
        GenerateAndRecognizeRectMicroQR("12345", RectMicroQRVersion.R7x43, QRErrorLevel.LEVEL_M);
        GenerateAndRecognizeRectMicroQR("12345", RectMicroQRVersion.R17x139, QRErrorLevel.LEVEL_M);
        GenerateAndRecognizeRectMicroQR("12345", RectMicroQRVersion.R11x99, QRErrorLevel.LEVEL_H);
        GenerateAndRecognizeRectMicroQR("12345", RectMicroQRVersion.R7x43, QRErrorLevel.LEVEL_H);
        GenerateAndRecognizeRectMicroQR("12345", RectMicroQRVersion.R17x139, QRErrorLevel.LEVEL_H);
    }

    private void GenerateAndRecognizeRectMicroQR(String codetext, RectMicroQRVersion rectMicroQrVersion, QRErrorLevel errorLevel)
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.RECT_MICRO_QR, codetext);
        {
            gen.getParameters().getBarcode().getQR().setRectMicroQrVersion(rectMicroQrVersion);
            gen.getParameters().getBarcode().getQR().setQrErrorLevel(errorLevel);
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.RECT_MICRO_QR);
            {
                Assert.assertEquals(1, reader.readBarCodes().length);
                Assert.assertEquals("RectMicroQR", reader.getFoundBarCodes()[0].getCodeTypeName());
                Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
                Assert.assertEquals(rectMicroQrVersion, reader.getFoundBarCodes()[0].getExtended().getQR().getRectMicroQRVersion());
                Assert.assertEquals(errorLevel, reader.getFoundBarCodes()[0].getExtended().getQR().getQRErrorLevel());
            }
        }
    }

    private void RecognizeRectMicroQR(String codetext, RectMicroQRVersion rectMicroQrVersion, QRErrorLevel errorLevel, String file) throws IOException {
        String filename = Global.pathCombine(Folder, file);
        InputStream ms = IOTestUtils.loadToMemoryStreamExternal(filename);
        BarCodeReader reader = new BarCodeReader(ms, DecodeType.RECT_MICRO_QR);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("RectMicroQR", reader.getFoundBarCodes()[0].getCodeTypeName());
            Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(rectMicroQrVersion, reader.getFoundBarCodes()[0].getExtended().getQR().getRectMicroQRVersion());
            Assert.assertEquals(errorLevel, reader.getFoundBarCodes()[0].getExtended().getQR().getQRErrorLevel());
        }
    }

    private void GenerateRectMicroQR(String codetext, RectMicroQRVersion rectMicroQrVersion, QRErrorLevel errorLevel, String file) throws IOException {
        String filename = Global.pathCombine(Folder, file);
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.RECT_MICRO_QR, codetext);
        {
            gen.getParameters().getBarcode().getQR().setRectMicroQrVersion(rectMicroQrVersion);
            gen.getParameters().getBarcode().getQR().setQrErrorLevel(errorLevel);
            ByteArrayOutputStream ms = new ByteArrayOutputStream();
            gen.save(ms, BarCodeImageFormat.PNG);
            IOTestUtils.saveMemoryStreamToFile(filename, new ByteArrayInputStream(ms.toByteArray()));
        }
    }
}
