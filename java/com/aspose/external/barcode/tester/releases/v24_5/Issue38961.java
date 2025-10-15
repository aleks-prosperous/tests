package com.aspose.external.barcode.tester.releases.v24_5;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.ChecksumValidation;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.QualitySettings;
import com.aspose.barcode.licensing.LicenseType;
import helpers.GenerationValidator;
import helpers.IOTestUtils;
import helpers.parsers.BarcodePictureParserSimple;
import helpers.parsers.BarcodePictureSelectorWithoutText;
import helpers.parsers.IBarcodeParser;
import helpers.parsers.IBarcodeSelector;
import helpers.validators.BarcodeSizeValidator;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Issue38961
{
    private final String Folder = Global.getTestDataFolder("Issues/Issue38961");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense(LicenseType.Total);
    }
    
    @Test
    public void test_Recognize_Standard2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "standard2of5.png"), DecodeType.STANDARD_2_OF_5);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.ON);
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("4234562", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_GenerateAndRecognize_Standard2of5()
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.STANDARD_2_OF_5, "4234562");
        {
            gen.getParameters().getBarcode().getXDimension().setPixels(3);
            gen.getParameters().getBarcode().setWideNarrowRatio(4);
            gen.getParameters().getBarcode().setChecksumEnabled(EnableChecksum.NO);
            gen.getParameters().getBarcode().getCodeTextParameters().setLocation(CodeLocation.NONE);

            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.STANDARD_2_OF_5);
            reader.setQualitySettings(QualitySettings.getHighPerformance());
            {
                reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.ON);
                Assert.assertEquals(1, reader.readBarCodes().length);
                Assert.assertEquals("4234562", reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }

    @Test
    public void test_GenerateAndCheck_Standard2of5()
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.STANDARD_2_OF_5, "4234562");
        {
            gen.getParameters().getBarcode().getXDimension().setPixels(3);
            gen.getParameters().getBarcode().setWideNarrowRatio(4);
            gen.getParameters().getBarcode().setChecksumEnabled(EnableChecksum.NO);
            gen.getParameters().getBarcode().getCodeTextParameters().setLocation(CodeLocation.NONE);

            IBarcodeSelector selector = new BarcodePictureSelectorWithoutText(gen.generateBarCodeImage(), true);
            IBarcodeParser parser = new BarcodePictureParserSimple(selector);
            GenerationValidator validator = new GenerationValidator(parser);
            validator.addValidator(new BarcodeSizeValidator(405, 57, 1));
            Assert.assertTrue(validator.validate());
        }
    }

    @Test
    public void test_Recognize_IATA2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "iata2of5.png"), DecodeType.IATA_2_OF_5);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.ON);
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("4234562", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_GenerateAndRecognize_IATA2of5()
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.IATA_2_OF_5, "4234562");
        {
            gen.getParameters().getBarcode().getXDimension().setPixels(3);
            gen.getParameters().getBarcode().setWideNarrowRatio(4);
            gen.getParameters().getBarcode().setChecksumEnabled(EnableChecksum.NO);
            gen.getParameters().getBarcode().getCodeTextParameters().setLocation(CodeLocation.NONE);
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.IATA_2_OF_5);
            {
                reader.setQualitySettings(QualitySettings.getHighPerformance());
                reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.ON);
                Assert.assertEquals(1, reader.readBarCodes().length);
                Assert.assertEquals("4234562", reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }

    @Test
    public void test_GenerateAndCheck_IATA2of5()
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.IATA_2_OF_5, "4234562");
        {
            gen.getParameters().getBarcode().getXDimension().setPixels(3);
            gen.getParameters().getBarcode().setWideNarrowRatio(4);
            gen.getParameters().getBarcode().setChecksumEnabled(EnableChecksum.NO);
            gen.getParameters().getBarcode().getCodeTextParameters().setLocation(CodeLocation.NONE);

            IBarcodeSelector selector = new BarcodePictureSelectorWithoutText(gen.generateBarCodeImage(), true);
            IBarcodeParser parser = new BarcodePictureParserSimple(selector);
            GenerationValidator validator = new GenerationValidator(parser);
            validator.addValidator(new BarcodeSizeValidator(366, 57, 1));
            Assert.assertTrue(validator.validate());
        }
    }

    private void saveBarcodeGenerator(BarcodeGenerator gen, String filename) throws IOException
    {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        gen.save(baos, BarCodeImageFormat.PNG);
        IOTestUtils.saveMemoryStreamToFile(Global.pathCombine(Folder, filename), new ByteArrayInputStream(baos.toByteArray()));
    }
}
