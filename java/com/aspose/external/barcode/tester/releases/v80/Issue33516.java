//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33516.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="04.04.2013 17:57:12">
//     Copyright (c) 2001-2011 Aspose Pty Ltd. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------------------------------------------

package com.aspose.external.barcode.tester.releases.v80;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.generation.BaseEncodeType;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;


@Test(description = "Tests for Issue33516.")
public class Issue33516
{
    final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33516");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    static boolean is1D(BaseEncodeType symbology)
    {
        boolean isDatabar = symbology == EncodeTypes.DATABAR_TRUNCATED ||
                symbology == EncodeTypes.DATABAR_OMNI_DIRECTIONAL ||
                symbology == EncodeTypes.DATABAR_LIMITED ||
                symbology == EncodeTypes.DATABAR_EXPANDED;

        boolean isPostal = symbology == EncodeTypes.AUSTRALIA_POST ||
                symbology == EncodeTypes.PLANET ||
                symbology == EncodeTypes.POSTNET ||
                symbology == EncodeTypes.RM_4_SCC ||
                symbology == EncodeTypes.ONE_CODE ||
                symbology == EncodeTypes.SINGAPORE_POST;

        boolean is2D = symbology == EncodeTypes.AZTEC ||
                symbology == EncodeTypes.PDF_417 ||
                symbology == EncodeTypes.MACRO_PDF_417 ||
                symbology == EncodeTypes.QR ||
                symbology == EncodeTypes.DATA_MATRIX;

        return !isDatabar && !isPostal && !is2D;
    }

    static BaseDecodeType convertSymbology(BaseEncodeType symbology)
    {
        SingleDecodeType output;
        output = DecodeType.parse(symbology.getTypeName());
        return output;
    }

    class SymbologyReadTypePair
    {
        public final BaseEncodeType SymbologyItem;
        public final BaseDecodeType BarCodeReadTypeItem;

            public SymbologyReadTypePair(BaseEncodeType symbology, BaseDecodeType barCodeReadType)
        {
            SymbologyItem = symbology;
            BarCodeReadTypeItem = barCodeReadType;
        }
    }

        @Test
    public void WCodabar()
    {
        String fileName = Global.pathCombine(folder, "codabar.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.CODABAR, reader.getFoundBarCodes()[0].getCodeType());
        }
    }

        @Test
    public void WCode11()
    {
        String fileName = Global.pathCombine(folder, "code11.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.CODE_11, reader.getFoundBarCodes()[0].getCodeType());
        }
    }

        @Test
    public void WCode39Standard()
    {
        String fileName = Global.pathCombine(folder, "code39standard.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1A45ZE2", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.CODE_39, reader.getFoundBarCodes()[0].getCodeType());
        }
    }

        @Test
    public void WCode39Extended()
    {
        String fileName = Global.pathCombine(folder, "code39extended.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1e 45 RTG 78d QA --+% ZZ 4t+4", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.CODE_39_FULL_ASCII, reader.getFoundBarCodes()[0].getCodeType());
        }
    }

        @Test
    public void WIATA2of5()
    {
        String fileName = Global.pathCombine(folder, "iata2of5.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123457", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.IATA_2_OF_5, reader.getFoundBarCodes()[0].getCodeType());
        }
    }

        @Test
    public void WInterleaved2of5()
    {
        String fileName = Global.pathCombine(folder, "interleaved2of5.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("0123456789", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.INTERLEAVED_2_OF_5, reader.getFoundBarCodes()[0].getCodeType());
        }
    }

        @Test
    public void WITF6()
    {
        String fileName = Global.pathCombine(folder, "itf6.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123450", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.INTERLEAVED_2_OF_5, reader.getFoundBarCodes()[0].getCodeType());
        }
    }

        @Test
    public void WITF14()
    {
        String fileName = Global.pathCombine(folder, "itf14.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345000000007", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.ITF_14, reader.getFoundBarCodes()[0].getCodeType());
        }
    }

        @Test
    public void WMatrix2of5()
    {
        String fileName = Global.pathCombine(folder, "matrix2of5.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.MATRIX_2_OF_5, reader.getFoundBarCodes()[0].getCodeType());
        }
    }

        @Test
    public void WMSI()
    {
        String fileName = Global.pathCombine(folder, "msi.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.OFF);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.MSI, reader.getFoundBarCodes()[0].getCodeType());
        }
    }

        @Test
    public void WStandard2of5()
    {
        String fileName = Global.pathCombine(folder, "standard2of5.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.STANDARD_2_OF_5, reader.getFoundBarCodes()[0].getCodeType());
        }
    }

        @Test
    public void NCode128()
    {
        String fileName = Global.pathCombine(folder, "code128.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345-Zorro", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.CODE_128, reader.getFoundBarCodes()[0].getCodeType());
        }
    }

        @Test
    public void NGS1Code128()
    {
        String fileName = Global.pathCombine(folder, "gs1code128.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(12)34", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.GS_1_CODE_128, reader.getFoundBarCodes()[0].getCodeType());
        }
    }

        @Test
    public void NEAN14()
    {
        String fileName = Global.pathCombine(folder, "ean14.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)12579340000001", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertTrue(reader.getFoundBarCodes()[0].getCodeType().containsAny(DecodeType.SCC_14, DecodeType.EAN_14));
        }
    }

        @Test
    public void NSCC14()
    {
        String fileName = Global.pathCombine(folder, "scc14.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)12522279340007", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertTrue(reader.getFoundBarCodes()[0].getCodeType().containsAny(DecodeType.SCC_14, DecodeType.EAN_14));
        }
    }

        @Test
    public void NSSCC18()
    {
        String fileName = Global.pathCombine(folder, "sscc18.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(00)125222793400000007", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.SSCC_18, reader.getFoundBarCodes()[0].getCodeType());
        }
    }

        @Test
    public void NUPCE()
    {
        String fileName = Global.pathCombine(folder, "upce.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("01234505", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.UPCE, reader.getFoundBarCodes()[0].getCodeType());
        }
    }

        @Test
    public void NCode93Standard()
    {
        String fileName = Global.pathCombine(folder, "code93standard.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345AZALK490", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.CODE_93, reader.getFoundBarCodes()[0].getCodeType());
        }
    }

        @Test
    public void NCode93Extended()
    {
        String fileName = Global.pathCombine(folder, "code93extended.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1e2Rt z{`}+15 /3WeR- [^]", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.CODE_93, reader.getFoundBarCodes()[0].getCodeType());
        }
    }

        @Test
    public void MEAN8()
    {
        String fileName = Global.pathCombine(folder, "ean8.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("04328742", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.EAN_8, reader.getFoundBarCodes()[0].getCodeType());
        }
    }

        @Test
    public void MEAN13()
    {
        String fileName = Global.pathCombine(folder, "ean13.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("583475489377", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.UPCA, reader.getFoundBarCodes()[0].getCodeType());
        }
    }

        @Test
    public void MISBN()
    {
        String fileName = Global.pathCombine(folder, "booklandean.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ISBN); // EAN13 also found
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("9781234567897", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.ISBN, reader.getFoundBarCodes()[0].getCodeType());
        }
    }

        @Test
    public void MUPCA()
    {
        String fileName = Global.pathCombine(folder, "upca.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.UPCA); // EAN13 also found
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123456789005", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.UPCA, reader.getFoundBarCodes()[0].getCodeType());
        }
    }
}

