package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.ChecksumValidation;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.QualitySettings;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


@Test(description = "Tests for Issue-33231.")
public class Issue33231
{
    final String folder = Global.getTestDataFolder("Issues/Issue33231");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void test1()
    {
        final String file = "aspose.png";
        String fullPath = Global.pathCombine(folder, file);
        BarCodeReader reader = new BarCodeReader(fullPath, DecodeType.IATA_2_OF_5);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("1", reader.getFoundBarCodes()[0].getExtended().getOneD().getValue());
    }

    @Test
    public void test1_withInvalideChecksum_WithException() // no exception exists now - just false
    {
        final String file = "aspose_invalidechecksum.png";
        String fullPath = Global.pathCombine(folder, file);
        BarCodeReader reader = new BarCodeReader(fullPath, DecodeType.IATA_2_OF_5);
        Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
    }

    @Test
    public void test1_withInvalideChecksum()
    {
        final String file = "aspose_invalidechecksum.png";
        String fullPath = Global.pathCombine(folder, file);
        BarCodeReader reader = new BarCodeReader(fullPath, DecodeType.IATA_2_OF_5);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.OFF);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("14", reader.getFoundBarCodes()[0].getExtended().getOneD().getValue());
    }

    @Test
    public void testIATA2of5_12345678905()
    {
        final String file = "IATA2of5.gif";
        String fullPath = Global.pathCombine(folder, file);
        BarCodeReader reader = new BarCodeReader(fullPath, DecodeType.IATA_2_OF_5);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("1234567890", reader.getFoundBarCodes()[0].getExtended().getOneD().getValue());
    }

    @Test
    public void testIATA2of5_3344556677()
    {
        final String file = "asposeIATA251.png";
        String fullPath = Global.pathCombine(folder, file);
        BarCodeReader reader = new BarCodeReader(fullPath, DecodeType.IATA_2_OF_5);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("3344556677", reader.getFoundBarCodes()[0].getExtended().getOneD().getValue());
    }

    @Test
    public void testIATA2of5_123456()
    {
        final String file = "asposeIATA252.png";
        String fullPath = Global.pathCombine(folder, file);
        BarCodeReader reader = new BarCodeReader(fullPath, DecodeType.IATA_2_OF_5);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("123456", reader.getFoundBarCodes()[0].getExtended().getOneD().getValue());
    }

    @Test
    public void test_12345()
    {
        final String file = "iata.bmp";
        String fullPath = Global.pathCombine(folder, file);
        BarCodeReader reader = new BarCodeReader(fullPath, DecodeType.IATA_2_OF_5);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.OFF);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("12345", reader.getFoundBarCodes()[0].getExtended().getOneD().getValue());
    }

    @Test
    public void test_0123456789()
    {
        final String file = "barcode.iata25.gif";
        String fullPath = Global.pathCombine(folder, file);
        BarCodeReader reader = new BarCodeReader(fullPath, DecodeType.IATA_2_OF_5);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.OFF);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("0123456789", reader.getFoundBarCodes()[0].getExtended().getOneD().getValue());
    }

    @Test
    public void test_1234()
    {
        final String file = "iata2of5.jpg";
        String fullPath = Global.pathCombine(folder, file);
        BarCodeReader reader = new BarCodeReader(fullPath, DecodeType.IATA_2_OF_5);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.OFF);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("1234", reader.getFoundBarCodes()[0].getExtended().getOneD().getValue());
    }
}

