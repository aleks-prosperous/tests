package com.aspose.external.barcode.tester.recognition;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.QualitySettings;
import com.aspose.barcode.barcoderecognition.XDimensionMode;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class QualityTestsSingleImages
{

    private String _folder;

        @BeforeMethod
    public void setupTestFixture()
    {
        this._folder = Global.getTestDataFolder("");
        com.aspose.barcode.LicenseAssistant.setupLicense();
    }

        @Test
        //[Category("Code128")]
    public void test_CompareVersions_Native_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "CompareVersions\\Native.png"), DecodeType.CODE_128);
        {
            reader.getBarcodeSettings().setStripFNC(true);
            Assert.assertEquals(reader.readBarCodes().length, 2);
            Assert.assertEquals("917618", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("1390799827", reader.getFoundBarCodes()[1].getCodeText());
        }
    }

        @Test
        //[Category("Code128")]
    public void test_CompareVersions_D00000001870_tif_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "CompareVersions\\D00000001870.tif"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("D00000001870", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code128")]
    public void test_CompareVersions_file1_tiff_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "CompareVersions\\file1.tiff"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("SC-DDT-8012000197", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("UPCA")]
    public void test_CompareVersions_upca_png_UPCA()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "CompareVersions\\upca.png"), DecodeType.UPCA);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123456789999", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code128")]
    public void test_CompareVersions_doc2_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "CompareVersions\\doc2.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("-A69751", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code128")]
    public void test_CompareVersions_outputcroped_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "CompareVersions\\output-croped.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("GGKND26rql", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code128")]
    public void test_CompareVersions_AM1000c_tif_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "CompareVersions\\AM1000c.tif"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 2);
            Assert.assertEquals("<FNC1>AM1000", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("<FNC1>AM1000", reader.getFoundBarCodes()[1].getCodeText());
        }
    }

        @Test
        //[Category("Code128")]
    public void test_CompareVersions_AM1000a_tif_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "CompareVersions\\AM1000a.tif"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 2);
            Assert.assertEquals("<FNC1>AM1000", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("<FNC1>AM1000", reader.getFoundBarCodes()[1].getCodeText());
        }
    }

        @Test
        //[Category("Code128")]
    public void test_CompareVersions_AM1000b_tif_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "CompareVersions\\AM1000b.tif"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 2);
            Assert.assertEquals("<FNC1>AM1000", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("<FNC1>AM1000", reader.getFoundBarCodes()[1].getCodeText());
        }
    }

        @Test
        //[Category("Code128")]
    public void test_CompareVersions_1_jpg_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "CompareVersions\\1.jpg"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("07606060103", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code128")]
    public void test_CompareVersions_document_IMG0_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "CompareVersions\\document_IMG0.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("<FNC1>D00000001868", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code128")]
    public void test_CompareVersions_document_IMG1_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "CompareVersions\\document_IMG1.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("<FNC1>D00000001867", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code128")]
    public void test_CompareVersions_document_IMG2_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "CompareVersions\\document_IMG2.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("<FNC1>D00000001863", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code128")]
    public void test_CompareVersions_document_IMG3_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "CompareVersions\\document_IMG3.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("<FNC1>D00000001864", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code128")]
    public void test_CompareVersions_document_IMG4_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "CompareVersions\\document_IMG4.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("<FNC1>D00000001866", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code128")]
    public void test_CompareVersions_document_IMG5_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "CompareVersions\\document_IMG5.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("<FNC1>D00000001865", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code128")]
    public void test_CompareVersions_66401_IMG0_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "CompareVersions\\66401_IMG0.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("66401", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code128")]
    public void test_CompareVersions_SCANBOLXAB1000108418012012_IMG0_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "CompareVersions\\SCANBOLXAB1000108418012012_IMG0.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("<FNC1>BOLXAB1000108418012012001U", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code128")]
    public void test_CompareVersions_FATTP00000000001_IMG1_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "CompareVersions\\FATTP00000000001_IMG1.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("FATTP00000000001", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code128")]
    public void test_CompareVersions_FATTP00000000005_IMG1_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "CompareVersions\\FATTP00000000005_IMG1.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("FATTP00000000005", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("EAN13")]
    public void test_CompareVersions_document1_IMG0_png_EAN13()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "CompareVersions\\document1_IMG0.png"), DecodeType.EAN_13);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1230000000352", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("2", reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum());
        }
    }

        @Test
        //[Category("EAN13")]
    public void test_CompareVersions_Untitled_2202201211073600_tif_EAN13()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "CompareVersions\\[Untitled]_2202201211073600.tif"), DecodeType.EAN_13);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("3000000000120", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("0", reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum());
        }
    }

        @Test
        //[Category("EAN13")]
    public void test_CompareVersions_Untitled_2202201211071100_tif_EAN13()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "CompareVersions\\[Untitled]_2202201211071100.tif"), DecodeType.EAN_13);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("3000000000144", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("4", reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum());
        }
    }

        @Test
        //[Category("Aztec")]
    public void test_QualityValidation_VerifyTests_Aztec_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\VerifyTests\\Aztec.png"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("108528960018123", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Codabar")]
    public void test_QualityValidation_VerifyTests_codabar_png_Codabar()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\VerifyTests\\codabar.png"), DecodeType.CODABAR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("0123456789$-:/.+", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code11")]
    public void test_QualityValidation_VerifyTests_code11_png_Code11()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\VerifyTests\\code11.png"), DecodeType.CODE_11);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("01234-56789", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code128")]
    public void test_QualityValidation_VerifyTests_code128A_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\VerifyTests\\code128A.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1234567890abc", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code128")]
    public void test_QualityValidation_VerifyTests_code128B_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\VerifyTests\\code128B.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Eg34560", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code128")]
    public void test_QualityValidation_VerifyTests_code128C_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\VerifyTests\\code128C.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12321456789", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code39Extended")]
    public void test_QualityValidation_VerifyTests_code39Extended_png_Code39Extended()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\VerifyTests\\code39Extended.png"), DecodeType.CODE_39_FULL_ASCII);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("a21212", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code39Extended")]
    public void test_QualityValidation_VerifyTests_code39ExtendedSe_png_Code39Extended()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\VerifyTests\\code39ExtendedSe.png"), DecodeType.CODE_39_FULL_ASCII);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("A21212", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code39Standard")]
    public void test_QualityValidation_VerifyTests_code39Standarde_png_Code39Standard()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\VerifyTests\\code39Standarde.png"), DecodeType.CODE_39);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("122223", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code93Extended")]
    public void test_QualityValidation_VerifyTests_code93Extended_png_Code93Extended()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\VerifyTests\\code93Extended.png"), DecodeType.CODE_93);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("4AHB8oe3", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code93Standard")]
    public void test_QualityValidation_VerifyTests_code93Standard_png_Code93Standard()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\VerifyTests\\code93Standard.png"), DecodeType.CODE_93);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("6655", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DeutschePostIdentcode")]
    public void test_QualityValidation_VerifyTests_DeutschePost_png_DeutschePostIdentcode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\VerifyTests\\DeutschePost.png"), DecodeType.DEUTSCHE_POST_IDENTCODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("763109430312", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DeutschePostLeitcode")]
    public void test_QualityValidation_VerifyTests_DeutschePostLeitcode_png_DeutschePostLeitcode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\VerifyTests\\DeutschePostLeitcode.png"), DecodeType.DEUTSCHE_POST_LEITCODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345678901236", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("EAN13")]
    public void test_QualityValidation_VerifyTests_EAN13_png_EAN13()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\VerifyTests\\EAN13.png"), DecodeType.EAN_13);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("6901234567892", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("EAN14")]
    public void test_QualityValidation_VerifyTests_EAN14_png_EAN14()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\VerifyTests\\EAN14.png"), DecodeType.EAN_14);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)12345678901231", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("EAN8")]
    public void test_QualityValidation_VerifyTests_EAN8_png_EAN8()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\VerifyTests\\EAN8.png"), DecodeType.EAN_8);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("69012341", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("GS1Code128")]
    public void test_QualityValidation_VerifyTests_GS1Code128_png_GS1Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\VerifyTests\\GS1Code128.png"), DecodeType.GS_1_CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(30)12345", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Interleaved2of5")]
    public void test_QualityValidation_VerifyTests_I25_twobits_png_Interleaved2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\VerifyTests\\I25_twobits.png"), DecodeType.INTERLEAVED_2_OF_5);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("IATA2of5")]
    public void test_QualityValidation_VerifyTests_IATA2of5_png_IATA2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\VerifyTests\\IATA2of5.png"), DecodeType.IATA_2_OF_5);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("01234567895", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Interleaved2of5")]
    public void test_QualityValidation_VerifyTests_Interleaved2of5_png_Interleaved2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\VerifyTests\\Interleaved2of5.png"), DecodeType.INTERLEAVED_2_OF_5);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("06", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Interleaved2of5")]
    public void test_QualityValidation_VerifyTests_Interleaved2of5b_png_Interleaved2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\VerifyTests\\Interleaved2of5b.png"), DecodeType.INTERLEAVED_2_OF_5);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("0123456789", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ISBN")]
    public void test_QualityValidation_VerifyTests_bookland_png_ISBN()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\VerifyTests\\bookland.png"), DecodeType.ISBN);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("9789682612404", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ItalianPost25")]
    public void test_QualityValidation_VerifyTests_itp25_png_ItalianPost25()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\VerifyTests\\itp25.png"), DecodeType.ITALIAN_POST_25);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("012652325871", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ITF14")]
    public void test_QualityValidation_VerifyTests_ITF14_png_ITF14()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\VerifyTests\\ITF14.png"), DecodeType.ITF_14);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("01234567890005", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ITF14")]
    public void test_QualityValidation_VerifyTests_ITF14Pad_png_ITF14()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\VerifyTests\\ITF14Pad.png"), DecodeType.ITF_14);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("01234567890005", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ITF6")]
    public void test_QualityValidation_VerifyTests_itf6_png_ITF6()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\VerifyTests\\itf6.png"), DecodeType.ITF_6);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("042170", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("MacroPdf417")]
    public void test_QualityValidation_VerifyTests_MacroPdf417_png_MacroPdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\VerifyTests\\MacroPdf417.png"), DecodeType.MACRO_PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("108528960018123", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Matrix2of5")]
    public void test_QualityValidation_VerifyTests_matrix2of5_png_Matrix2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\VerifyTests\\matrix2of5.png"), DecodeType.MATRIX_2_OF_5);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("0123456789", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("MSI")]
    public void test_QualityValidation_VerifyTests_MSI_png_MSI()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\VerifyTests\\MSI.png"), DecodeType.MSI);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("0123456789", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("OneCode")]
    public void test_QualityValidation_VerifyTests_onecode_png_OneCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\VerifyTests\\onecode.png"), DecodeType.ONE_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("01234567094987654321", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("OPC")]
    public void test_QualityValidation_VerifyTests_opc1_png_OPC()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\VerifyTests\\opc1.png"), DecodeType.OPC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("0207117219", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Pdf417")]
    public void test_QualityValidation_VerifyTests_pdf417Digits_png_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\VerifyTests\\pdf417Digits.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("0123456789", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Pdf417")]
    public void test_QualityValidation_VerifyTests_pdf417LowerLetter_png_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\VerifyTests\\pdf417LowerLetter.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("abcdefghijklmnopqrstuvwxyz", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Pdf417")]
    public void test_QualityValidation_VerifyTests_pdf417UpperLetter_png_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\VerifyTests\\pdf417UpperLetter.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("ABCDEFGHIJKLMNOPQRSTUVWXYZ", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Planet")]
    public void test_QualityValidation_VerifyTests_planet_png_Planet()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\VerifyTests\\planet.png"), DecodeType.PLANET);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("55555123456", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Postnet")]
    public void test_QualityValidation_VerifyTests_postnet_png_Postnet()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\VerifyTests\\postnet.png"), DecodeType.POSTNET);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("555551237", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Postnet")]
    public void test_QualityValidation_VerifyTests_postnet1_png_Postnet()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\VerifyTests\\postnet1.png"), DecodeType.POSTNET);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("55555", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("PZN")]
    public void test_QualityValidation_VerifyTests_PZN_png_PZN()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\VerifyTests\\PZN.png"), DecodeType.PZN);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("-4908802", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_QualityValidation_VerifyTests_QR1_png_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\VerifyTests\\QR1.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("9682fdsafdsareqwrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr432254325444444444444444444444444444444444444444444444444444444612409682fdsafdsareqwrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr432254325444444444444444444444444444444444444444444444444444444612409682fdsafdsareqwrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr432254325444444444444444444444444444444444444444444444444444444612409682fdsafdsareqwrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr43225432544444444444444444444444444444444444444444444444444444461240", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_QualityValidation_VerifyTests_QR1ascii_png_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\VerifyTests\\QR1ascii.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(" !#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~ !#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~ !#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~ !#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("RM4SCC")]
    public void test_QualityValidation_VerifyTests_rm4scc1_png_RM4SCC()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\VerifyTests\\rm4scc1.png"), DecodeType.RM_4_SCC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("SN34RD1A", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("K", reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum());
        }
    }

        @Test
        //[Category("SCC14")]
    public void test_QualityValidation_VerifyTests_SCC14_png_SCC14()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\VerifyTests\\SCC14.png"), DecodeType.SCC_14);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)01234567891231", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("SSCC18")]
    public void test_QualityValidation_VerifyTests_SSCC18_png_SSCC18()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\VerifyTests\\SSCC18.png"), DecodeType.SSCC_18);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(00)108528960018123006", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Standard2of5")]
    public void test_QualityValidation_VerifyTests_Standard2of5_png_Standard2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\VerifyTests\\Standard2of5.png"), DecodeType.STANDARD_2_OF_5);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("0123456789", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("UPCA")]
    public void test_QualityValidation_VerifyTests_UPCA_png_UPCA()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\VerifyTests\\UPCA.png"), DecodeType.UPCA);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("075678164125", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("UPCE")]
    public void test_QualityValidation_VerifyTests_UPCE_png_UPCE()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\VerifyTests\\UPCE.png"), DecodeType.UPCE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("00123495", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("VIN")]
    public void test_QualityValidation_VerifyTests_VIN_png_VIN()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\VerifyTests\\VIN.png"), DecodeType.VIN);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1M8GDM9AXKP042788", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Pdf417")]
    public void test_QualityValidation_VerifyTests_shortpdf2_bmp_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\VerifyTests\\shortpdf2.bmp"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("64245906424590", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Pdf417")]
    public void test_QualityValidation_VerifyTests_pdf417_901_png_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\VerifyTests\\pdf417_901.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("01234567094987654321", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Pdf417")]
    public void test_QualityValidation_VerifyTests_pdf417Top2Down_png_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\VerifyTests\\pdf417Top2Down.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("01234567094987654321", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_QualityValidation_VerifyTests_qr1p_png_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\VerifyTests\\qr1p.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_QualityValidation_VerifyTests_QR45_png_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\VerifyTests\\QR45.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("01234567094987654321", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_QualityValidation_VerifyTests_QRTest_png_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\VerifyTests\\QRTest.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("01234567094aaaaaaaaaaaaaaaaaaaaaaaaa987654321", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("UPCA")]
    public void test_QualityValidation_VerifyTests_supplement2_png_UPCA()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\VerifyTests\\supplement2.png"), DecodeType.UPCA);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("968261240002", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code11")]
    public void test_QualityValidation_VerifyTests_code11_edgescan_png_Code11()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\VerifyTests\\code11_edgescan.png"), DecodeType.CODE_11);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1234567890", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("EAN13")]
    public void test_QualityValidation_VerifyTests_ean13_edgescan_png_EAN13()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\VerifyTests\\ean13_edgescan.png"), DecodeType.EAN_13);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("6901234567892", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("EAN8")]
    public void test_QualityValidation_VerifyTests_ean8_edgescan_png_EAN8()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\VerifyTests\\ean8_edgescan.png"), DecodeType.EAN_8);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("01234565", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Interleaved2of5")]
    public void test_QualityValidation_VerifyTests_itl25_edgescan_png_Interleaved2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\VerifyTests\\itl25_edgescan.png"), DecodeType.INTERLEAVED_2_OF_5);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("0123456789", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ITF14")]
    public void test_QualityValidation_VerifyTests_itf14_edgescan_png_ITF14()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\VerifyTests\\itf14_edgescan.png"), DecodeType.ITF_14);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("01234567890005", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("MSI")]
    public void test_QualityValidation_VerifyTests_msi_edgescan_png_MSI()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\VerifyTests\\msi_edgescan.png"), DecodeType.MSI);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("0123456789", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("UPCA")]
    public void test_QualityValidation_VerifyTests_upca_edgescan_png_UPCA()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\VerifyTests\\upca_edgescan.png"), DecodeType.UPCA);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("001234567895", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code128")]
    public void test_QualityValidation_VerifyTests_code128_edgescan_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\VerifyTests\\code128_edgescan.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("0123456789", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("UPCE")]
    public void test_QualityValidation_VerifyTests_upce_edgescan_png_UPCE()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\VerifyTests\\upce_edgescan.png"), DecodeType.UPCE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("00123457", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("RM4SCC")]
    public void test_QualityValidation_VerifyTests_RM4SCC_png_RM4SCC()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\VerifyTests\\RM4SCC.png"), DecodeType.RM_4_SCC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("0123456789", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("6", reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum());
        }
    }

        @Test
        //[Category("Code39Extended_Code39Standard")]
    public void test_QualityValidation_document_code39_jpg_Code39Extended_Code39Standard()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\document_code39.jpg"), DecodeType.scanSets(DecodeType.CODE_39_FULL_ASCII, DecodeType.CODE_39));
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("What about your 10,000 promises ?", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code128")]
    public void test_QualityValidation_document_code128_jpg_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\document_code128.jpg"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("What about your 10,000 promises ?", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_QualityValidation_document_qr_jpg_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\document_qr.jpg"), DecodeType.QR);
        {
            reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("What about your 10,000 promises ?", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Pdf417")]
    public void test_QualityValidation_document_pdf417_jpg_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\document_pdf417.jpg"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("What about your 10,000 promises ?", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DataMatrix")]
    public void test_QualityValidation_document_datamatrix_jpg_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\document_datamatrix.jpg"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("What about your 10,000 promises ?", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code39Extended_Code39Standard")]
    public void test_QualityValidation_Code39_images1_jpg_Code39Extended_Code39Standard()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\Code39\\images1.jpg"), DecodeType.scanSets(DecodeType.CODE_39_FULL_ASCII, DecodeType.CODE_39));
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("CODE39", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code39Extended_Code39Standard")]
    public void test_QualityValidation_Code39_images2_jpg_Code39Extended_Code39Standard()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\Code39\\images2.jpg"), DecodeType.scanSets(DecodeType.CODE_39_FULL_ASCII, DecodeType.CODE_39));
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123456L", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code39Extended_Code39Standard")]
    public void test_QualityValidation_Code39_images5_jpg_Code39Extended_Code39Standard()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\Code39\\images5.jpg"), DecodeType.scanSets(DecodeType.CODE_39_FULL_ASCII, DecodeType.CODE_39));
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("N08047", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code39Extended_Code39Standard")]
    public void test_QualityValidation_Code39_images8_jpg_Code39Extended_Code39Standard()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\Code39\\images8.jpg"), DecodeType.scanSets(DecodeType.CODE_39_FULL_ASCII, DecodeType.CODE_39));
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1234567890", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code39Extended_Code39Standard")]
    public void test_QualityValidation_Code39_images10_jpg_Code39Extended_Code39Standard()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\Code39\\images10.jpg"), DecodeType.scanSets(DecodeType.CODE_39_FULL_ASCII, DecodeType.CODE_39));
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Code 39L", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code128")]
    public void test_QualityValidation_Code128_images1_jpg_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\Code128\\images1.jpg"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123456", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code128")]
    public void test_QualityValidation_Code128_images3_jpg_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\Code128\\images3.jpg"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("<FNC1>ABCDE89650", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code128")]
    public void test_QualityValidation_Code128_images5_jpg_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\Code128\\images5.jpg"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("<FNC1>107700096376", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code128")]
    public void test_QualityValidation_Code128_images7_jpg_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\Code128\\images7.jpg"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("AMLABELS12345", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code128")]
    public void test_QualityValidation_Code128_images8_jpg_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\Code128\\images8.jpg"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123456789012", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code128")]
    public void test_QualityValidation_Code128_images9_jpg_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\Code128\\images9.jpg"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("-A69751", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code128")]
    public void test_QualityValidation_Code128_images10_jpg_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\Code128\\images10.jpg"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("568200419711", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("EAN13")]
    public void test_QualityValidation_EAN13_images1_jpg_EAN13()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\EAN13\\images1.jpg"), DecodeType.EAN_13);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("3800065711135", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("EAN13")]
    public void test_QualityValidation_EAN13_images2_jpg_EAN13()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\EAN13\\images2.jpg"), DecodeType.EAN_13);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("9789069744063", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("EAN13")]
    public void test_QualityValidation_EAN13_images4_jpg_EAN13()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\EAN13\\images4.jpg"), DecodeType.EAN_13);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("4048466028592", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("EAN13")]
    public void test_QualityValidation_EAN13_images5_jpg_EAN13()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\EAN13\\images5.jpg"), DecodeType.EAN_13);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("9310779300005", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("EAN13")]
    public void test_QualityValidation_EAN13_images9_jpg_EAN13()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\EAN13\\images9.jpg"), DecodeType.EAN_13);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("9780596510374", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("EAN13")]
    public void test_QualityValidation_EAN13_images10_jpg_EAN13()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\EAN13\\images10.jpg"), DecodeType.EAN_13);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("8888425350403", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_QualityValidation_QR_images1_jpg_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\QR\\images1.jpg"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("IT\'S BACK ON DVD SEPTEMBER 10th", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_QualityValidation_QR_images2_jpg_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\QR\\images2.jpg"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("http://lvmonogram.jp/store", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_QualityValidation_QR_images4_jpg_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\QR\\images4.jpg"), DecodeType.QR);
        {
            reader.setQualitySettings(QualitySettings.getHighQuality());
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("http://wap.pepsi.co.uk/r5", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_QualityValidation_QR_images5_jpg_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\QR\\images5.jpg"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("http://www.computerbild.ru/", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_QualityValidation_QR_images6_jpg_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\QR\\images6.jpg"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("http://www.primario.com.es/qr", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_QualityValidation_QR_images7_jpg_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\QR\\images7.jpg"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("http://techfortesco.blogspot.com/2010/04/square-barcode-showing-on-screens-at.html", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_QualityValidation_QR_images8_jpg_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\QR\\images8.jpg"), DecodeType.QR);
        {
            reader.setQualitySettings(QualitySettings.getHighQuality());
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("BEGIN:VCARD\nN:Homer Simpson\nTEL:5551234\nEMAIL:hsimpson@snpp.com\nADR:742 Evergreen" +
                    " Terrace Springfield, USA\nEND:VCARD", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_QualityValidation_QR_images9_jpg_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\QR\\images9.jpg"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("http://www.daqri.com/Dvw6SUJA0EDG/", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DataMatrix")]
    public void test_QualityValidation_DataMatrix_images1_jpg_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\DataMatrix\\images1.jpg"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("+H227W3202/$$0610UE2GHDN04", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DataMatrix")]
    public void test_QualityValidation_DataMatrix_images2_jpg_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\DataMatrix\\images2.jpg"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("HTTP://R.BEETAGG.COM/?44YBP1", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DataMatrix")]
    public void test_QualityValidation_DataMatrix_images3_jpg_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\DataMatrix\\images3.jpg"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("COMME TOI, J\'AI ETE INFECTEE PAR LA MALADIE.", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DataMatrix")]
    public void test_QualityValidation_DataMatrix_images4_jpg_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\DataMatrix\\images4.jpg"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("http://scn.by/9t9ab0htw8glry", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DataMatrix")]
    public void test_QualityValidation_DataMatrix_images6_jpg_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\DataMatrix\\images6.jpg"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("CHRISTIAN", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DataMatrix")]
    public void test_QualityValidation_DataMatrix_images9_jpg_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\DataMatrix\\images9.jpg"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("98925619", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DataMatrix")]
    public void test_QualityValidation_DataMatrix_images10_jpg_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\DataMatrix\\images10.jpg"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("10101023356", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DataMatrix")]
    public void test_QualityValidation_DataMatrix_images7_jpg_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\DataMatrix\\images7.jpg"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("<FNC1>01000123456789051710123110ABC123", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AustraliaPost")]
    public void test_QualityValidation_australia1_png_AustraliaPost()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\australia1.png"), DecodeType.AUSTRALIA_POST);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1196184209", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AustraliaPost")]
    public void test_QualityValidation_australia2_png_AustraliaPost()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\australia2.png"), DecodeType.AUSTRALIA_POST);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("59961842093333333333333333", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AustraliaPost")]
    public void test_QualityValidation_australia13_png_AustraliaPost()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QualityValidation\\australia13.png"), DecodeType.AUSTRALIA_POST);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("62961842093333333333333333333333333333333", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
