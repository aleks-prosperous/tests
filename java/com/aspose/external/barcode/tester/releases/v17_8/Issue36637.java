package com.aspose.external.barcode.tester.releases.v17_8;

import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.QualitySettings;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

public class Issue36637
{
    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
        @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

        @Test
        ////[Category("Code93Standard")]
    public void test_GenerateAndRead_Code93Standard()
    {
            final String codetext = "01234ABCDE";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.CODE_93, codetext);
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage());
            reader.setQualitySettings(QualitySettings.getHighPerformance());
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.CODE_93, reader.getFoundBarCodes()[0].getCodeType());
        }
    }

        @Test
        ////[Category("Code93Extended")]
        ////[Category("Code93Standard")]
    public void test_GenerateAndRead_Code93Extended1()
    {
            final String codetext = "01234ABCDE";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.CODE_93, codetext);
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage());
            reader.setQualitySettings(QualitySettings.getHighPerformance());
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.CODE_93, reader.getFoundBarCodes()[0].getCodeType());
        }
    }

        @Test
        ////[Category("Code93Extended")]
    public void test_GenerateAndRead_Code93Extended2()
    {
            final String codetext = "01234ABCDE";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.CODE_93, codetext);
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.CODE_93);
            reader.setQualitySettings(QualitySettings.getHighPerformance());
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.CODE_93, reader.getFoundBarCodes()[0].getCodeType());
        }
    }

        @Test
        ////[Category("Code93Standard")]
        ////[Category("Code93Extended")]
    public void test_GenerateAndRead_Code93Standard2()
    {
            final String codetext = "01234ABCDE";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.CODE_93, codetext);
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.CODE_93);
            reader.setQualitySettings(QualitySettings.getHighPerformance());
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.CODE_93, reader.getFoundBarCodes()[0].getCodeType());
        }
    }
}
