package com.aspose.external.barcode.tester.releases.v25_8;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BaseDecodeType;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.QualitySettings;
import com.aspose.barcode.licensing.LicenseType;
import com.aspose.external.ProcessorSettingsDefaultState;
import helpers.IOTestUtils;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Issue39351
{
    final String Folder = Global.getTestDataFolder("Issues/Issue39351");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense(LicenseType.Total);
    }

    @Test
    public void test_FromUser() throws IOException {
        testSpeedDifference(DecodeType.INTERLEAVED_2_OF_5, "010101000000", "4.png");
        testSpeedDifference(DecodeType.INTERLEAVED_2_OF_5, "010101000000", "5.png");
        testSpeedDifference(DecodeType.INTERLEAVED_2_OF_5, "010102000000", "7.png");
    }

    @Test
    public void testRecognizeGenerated() throws IOException {
        //fast
        testSpeedDifference(DecodeType.CODE_11, "12345678901234567890", "Code11.png");
        testSpeedDifference(DecodeType.IATA_2_OF_5, "42345626", "IATA2of5.png");
        testSpeedDifference(DecodeType.EAN_13, "9790260000438", "EAN13.png");
        testSpeedDifference(DecodeType.EAN_8, "12345670", "EAN8.png");
        testSpeedDifference(DecodeType.INTERLEAVED_2_OF_5, "04234562", "Interleaved2of5.png");
        testSpeedDifference(DecodeType.STANDARD_2_OF_5, "010101000000", "Standard2of5.png");
        testSpeedDifference(DecodeType.UPCA, "123456789012", "UPCA.png");
        testSpeedDifference(DecodeType.DATA_LOGIC_2_OF_5, "010101000000", "DataLogic2of5.png");
        testSpeedDifference(DecodeType.DATABAR_OMNI_DIRECTIONAL, "(01)24012345678905", "DatabarOmniDirectional.png");
        testSpeedDifference(DecodeType.DATABAR_EXPANDED, "(01)01082503101704(10)123456789", "DatabarExpanded.png");

        //slow FastBHQDetector
        testSpeedDifference(DecodeType.CODE_128, "12345678901234567890", "Code128.png");
        testSpeedDifference(DecodeType.CODE_93, "12345678901234567890", "Code93.png", 3.0);
        testSpeedDifference(DecodeType.MATRIX_2_OF_5, "12345678901234567890", "Matrix2of5.png", 3.0);
        testSpeedDifference(DecodeType.UPCE, "05555550", "UPCE.png", 3.0);
        testSpeedDifference(DecodeType.DATABAR_LIMITED, "(01)15012345678907", "DatabarLimited.png");
        testSpeedDifference(DecodeType.CODE_39, "010101000000", "Code39.png");
        testSpeedDifference(DecodeType.MSI, "010101000000", "MSI.png");


        //FastBHQDetector works incorrectly on symbologies
        //testSpeedDifference(DecodeType.Codabar, "010101000000", "Codabar.png");
        //testSpeedDifference(DecodeType.PatchCode, "Patch I", "PatchCode.png");
        //testSpeedDifference(DecodeType.Pharmacode, "123543", "Pharmacode.png");
    }

    private void generateAndSave(SymbologyEncodeType encodeType, String codetext, String image) throws IOException
    {
        BarcodeGenerator gen = new BarcodeGenerator(encodeType, codetext);
        {
            gen.getParameters().getBarcode().getCodeTextParameters().setLocation(CodeLocation.NONE);
            gen.getParameters().getBarcode().getBarHeight().setPixels(150);
            gen.getParameters().getBarcode().getXDimension().setPixels(2);

            ByteArrayOutputStream ms = new ByteArrayOutputStream();
            gen.save(ms, BarCodeImageFormat.PNG);
            IOTestUtils.saveMemoryStreamToFile(Global.pathCombine(Folder, image), new ByteArrayInputStream(ms.toByteArray()));
        }
    }

    private void testSpeedDifference(BaseDecodeType decodeType, String codetext, String image) throws IOException {
        testSpeedDifference(decodeType, codetext, image, 4.0, 3, true);
    }
    private void testSpeedDifference(BaseDecodeType decodeType, String codetext, String image, double minSpeedDiff) throws IOException {
        testSpeedDifference(decodeType, codetext, image, minSpeedDiff, 3, true);
    }

    private void testSpeedDifference(BaseDecodeType decodeType, String codetext, String image, double minSpeedDiff, int iterations, boolean isColdRun) throws IOException {
        ProcessorSettingsDefaultState.resetProcessorSettingsToDefault();
        try
        {
            BarCodeReader.getProcessorSettings().setUseAllCores(false);
            BarCodeReader.getProcessorSettings().setUseOnlyThisCoresCount(2);
            BarCodeReader.getProcessorSettings().setMaxAdditionalAllowedThreads(2);

            //load file to memory
            String path = Global.pathCombine(Folder, image);
            ByteArrayInputStream original = IOTestUtils.loadToMemoryStreamExternal(path);
            //cold run
            if (isColdRun)
            {
                BarCodeReader reader = new BarCodeReader(original, decodeType);
                {
                    reader.setQualitySettings(QualitySettings.getHighPerformance());
                    Assert.assertEquals(1, reader.readBarCodes().length);
                }
                original.reset();
                reader = new BarCodeReader((original), decodeType);
                Assert.assertEquals(1, reader.readBarCodes().length);
            }
            //test the speed
            double speedDiff = 0;
            if (iterations < 1) iterations = 1;
            for (int i = 0; i < iterations; ++i)
            {
                //FastBHQDetector
                long swHP = System.currentTimeMillis();
                original.reset();
                BarCodeReader reader = new BarCodeReader(original, decodeType);
                {
                    reader.setQualitySettings(QualitySettings.getHighPerformance());
                    Assert.assertEquals(1, reader.readBarCodes().length);
                    Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
                }
                swHP = System.currentTimeMillis() - swHP;

                //normal recognition
                long swNQ = System.currentTimeMillis();
                original.reset();
                reader = new BarCodeReader(original, decodeType);
                {
                    Assert.assertEquals(1, reader.readBarCodes().length);
                    Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
                }
                swNQ = System.currentTimeMillis() - swNQ;

                speedDiff += (double)swNQ / (double)swHP;
            }

            speedDiff = speedDiff / iterations;

            String msg = "image:" + image + " has HighPerformance speed difference:" + String.format("%.2f", speedDiff);

            //Console.WriteLine(msg);
            if (speedDiff < minSpeedDiff)
                Assert.fail(msg);
        }
        finally
        {
            ProcessorSettingsDefaultState.resetProcessorSettingsToDefault();
        }
    }
}