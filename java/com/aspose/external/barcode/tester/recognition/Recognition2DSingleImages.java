package com.aspose.external.barcode.tester.recognition;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.*;
import utils.CollectionAssert;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Recognition2DSingleImages
{

    private String _folder;

        @BeforeMethod
    public void setupTestFixture()
    {
        this._folder = Global.getTestDataFolder("Recognition\\2D\\");
        com.aspose.barcode.LicenseAssistant.setupLicense();
    }

        @Test
        //[Category("Aztec")]
    public void test_Aztec_aztec_jpg_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Aztec\\aztec.jpg"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Test code", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Aztec")]
    public void test_Aztec__azteccodew_jpg_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Aztec\\azteccodew.jpg"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("www.worldbarcodes.com", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Aztec")]
    public void test_Aztec__ABPP_jpg_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Aztec\\ABPP.jpg"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Barcodesoft", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Aztec")]
    public void test_Aztec__aztec_test_jpg_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Aztec\\aztec_test.jpg"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Aztec code test", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Aztec")]
    public void test_Aztec__image_thumb4_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Aztec\\image_thumb4.png"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("[01]12345678901234[3102]234567", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Aztec")]
    public void test_Aztec__1zw16ys_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Aztec\\1zw16ys.png"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("32797654", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Aztec")]
    public void test_Aztec__compactLayer1_3_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Aztec\\compactLayer1_3.png"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Code 2D!", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Aztec")]
    public void test_Aztec__regularLayer4_1_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Aztec\\regularLayer4_1.png"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Al-Jazeera decided Tuesday not to air a video that appears to show the attacks on soldiers and", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Aztec")]
    public void test_Aztec__regularLayer9_2_bigHole_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Aztec\\regularLayer9_2_bigHole.png"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("NDS had no immediate comment but News Corp said: \"News Corporation is proud to have worked with NDS, whose industry-leading technology has transformed TV viewing for millions of people across the world, and to have supported them in their aggressive fight against piracy and copyright infringement.\"", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Aztec")]
    public void test_Aztec__compactLayer2_1_1error_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Aztec\\compactLayer2_1_1error.png"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("IDAutomation.com, Inc.", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Aztec")]
    public void test_Aztec__compactLayer3_1_withErrors_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Aztec\\compactLayer3_1_withErrors.png"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("3rd layer message first picture!", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Aztec")]
    public void test_Aztec__regularLayer7_1_withErrors_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Aztec\\regularLayer7_1_withErrors.png"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Castro, who stepped down from power in 2006 due to illness, called the pope \"a ma" +
                    "n whose contact with children and humble members of society has, invariably, rai" +
                    "sed feelings of affection.\"", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Aztec")]
    public void test_Aztec__Aztec98x98_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Aztec\\Aztec98x98.png"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("PDQ Electric Corp, Electrical Contractor, Ryan Johnson, Industrial Electrician, A" +
                    "utomation, Power Distribution, Security, Serving NJ PA DE MD NY, (877) 737-4349 " +
                    "(877) PDQ-4-FIX, info@PDQIE.com info@PDQIndustrialElectric.com", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DataMatrix")]
    public void test_Datamatrix__images2_jpg_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Datamatrix\\images2.jpg"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("HTTP://R.BEETAGG.COM/?44YBP1", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DataMatrix")]
    public void test_Datamatrix__images10_jpg_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Datamatrix\\images10.jpg"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("10101023356", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DataMatrix")]
    public void test_Datamatrix__0129_jpg_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Datamatrix\\0129.jpg"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Studio7", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DataMatrix")]
    public void test_Datamatrix__akamaru_jpg_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Datamatrix\\akamaru.jpg"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("URL:http://akamarumonogatari.blogspot.com/", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DataMatrix")]
    public void test_Datamatrix__datamatrix_gif_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Datamatrix\\datamatrix.gif"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("UfoDesign", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DataMatrix")]
    public void test_Datamatrix__und_jpg_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Datamatrix\\und.jpg"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("CHRISTIAN", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DataMatrix")]
    public void test_Datamatrix__flyer2_code_png_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Datamatrix\\flyer2_code.png"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("http://neom.us/43681981-1", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DataMatrix")]
    public void test_Datamatrix__DataMatrixNETControl_1_png_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Datamatrix\\DataMatrix-NET-Control_1.png"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1234567DEMO", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DataMatrix")]
    public void test_Datamatrix__4588_jpg_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Datamatrix\\4588.jpg"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("http://scn.by/9t9ab0htw8glry", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DataMatrix")]
    public void test_Datamatrix__images9_jpg_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Datamatrix\\images9.jpg"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("98925619", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DataMatrix")]
    public void test_Datamatrix__colored_dm_overlay_jpg_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Datamatrix\\colored_dm_overlay.jpg"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("http://www.ventipix.mobi", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DataMatrix")]
    public void test_Datamatrix__datamatrix_activex_gif_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Datamatrix\\datamatrix_activex.gif"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1234567DEMO", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DataMatrix")]
    public void test_Datamatrix__c_jpg_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Datamatrix\\c.jpg"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("COMME TOI, J\'AI ETE INFECTEE PAR LA MALADIE.", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DataMatrix")]
    public void test_Datamatrix__DMANSIX12_png_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Datamatrix\\DMANSIX12.png"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("DEMO13579123GRU17", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DataMatrix")]
    public void test_Datamatrix__datamatrixgenerator_jpg_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Datamatrix\\datamatrix-generator.jpg"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123456789012", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DataMatrix")]
    public void test_Datamatrix__gene_png_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Datamatrix\\gene.png"), DecodeType.DATA_MATRIX);
        {
            reader.getQualitySettings().setInverseImage(InverseImageMode.ENABLED);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("bartoli.giacomo@email.it", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DataMatrix")]
    public void test_Datamatrix__tn_techlib_jpg_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Datamatrix\\tn_techlib.jpg"), DecodeType.DATA_MATRIX);
        {
            reader.getQualitySettings().setInverseImage(InverseImageMode.ENABLED);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("PHIL ANTON", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DataMatrix")]
    public void test_Datamatrix__images8_jpg_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Datamatrix\\images8.jpg"), DecodeType.DATA_MATRIX);
        {
            reader.getQualitySettings().setComplexBackground(ComplexBackgroundMode.ENABLED);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("http://www.aipsys.com", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DataMatrix")]
    public void test_Datamatrix__DataMatrixCode_jpg_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Datamatrix\\DataMatrixCode.jpg"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("IOSS GmbH,Fritz-Reichle-Ring 18,78315 Radolfzell", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DataMatrix")]
    public void test_Datamatrix__Intelwirelessdatamatrix_jpg_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Datamatrix\\Intelwireless-datamatrix.jpg"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("15C06E115AZC72983004", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("GS1DataMatrix")]
    public void test_GS1Datamatrix_aspose1_png_GS1DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "GS1Datamatrix\\aspose1.png"), DecodeType.GS_1_DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)08426950511601(17)131027(10)312044-016", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("GS1DataMatrix")]
    public void test_GS1Datamatrix_aspose2_png_GS1DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "GS1Datamatrix\\aspose2.png"), DecodeType.GS_1_DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(3142)123456(240)312044-0161", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("GS1DataMatrix")]
    public void test_GS1Datamatrix_aspose3_png_GS1DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "GS1Datamatrix\\aspose3.png"), DecodeType.GS_1_DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(7001)1234567890123(400)1234(3911)12345", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("GS1DataMatrix")]
    public void test_GS1Datamatrix_aspose4_png_GS1DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "GS1Datamatrix\\aspose4.png"), DecodeType.GS_1_DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(3103)456789(10)1", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("GS1DataMatrix")]
    public void test_GS1Datamatrix_aspose5_png_GS1DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "GS1Datamatrix\\aspose5.png"), DecodeType.GS_1_DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(253)12345678901234567(20)33(37)12345", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("GS1DataMatrix")]
    public void test_GS1Datamatrix_aspose6_png_GS1DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "GS1Datamatrix\\aspose6.png"), DecodeType.GS_1_DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(92)21345390233(15)112345", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("GS1DataMatrix")]
    public void test_GS1Datamatrix_barcode2Dlarge_jpg_GS1DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "GS1Datamatrix\\barcode-2D-large.jpg"), DecodeType.GS_1_DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(253)0886983000028(11)100310", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("GS1DataMatrix")]
    public void test_GS1Datamatrix_barcodes_gs1_datamatrix2_png_GS1DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "GS1Datamatrix\\barcodes_gs1_datamatrix2.png"), DecodeType.GS_1_DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)09312345017416", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("GS1DataMatrix")]
    public void test_GS1Datamatrix_data_matrix_gif_GS1DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "GS1Datamatrix\\data_matrix.gif"), DecodeType.GS_1_DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)07612345678900(17)100503(10)AC3453G3", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("GS1DataMatrix")]
    public void test_GS1Datamatrix_GS1DM_jpg_GS1DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "GS1Datamatrix\\GS1DM.jpg"), DecodeType.GS_1_DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)00314141999995(17)150100(10)987654321GFEDCBA2110000000234", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("GS1DataMatrix")]
    public void test_GS1Datamatrix_gs1datamatrixvsean128_png_GS1DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "GS1Datamatrix\\gs1-datamatrix-vs-ean-128.png"), DecodeType.GS_1_DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(10)20(3151)000155", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("GS1DataMatrix")]
    public void test_GS1Datamatrix_GS1_png_GS1DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "GS1Datamatrix\\GS1.png"), DecodeType.GS_1_DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)08426950511601(17)131027(10)312044-016", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("GS1DataMatrix")]
    public void test_GS1Datamatrix_gs1datam_bmp_GS1DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "GS1Datamatrix\\gs1datam.bmp"), DecodeType.GS_1_DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 2);
            Assert.assertEquals("(01)03453120000011(17)091125(10)ABCD1234(422)250", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("(01)03453120000011(17)091125(10)ABCD1234(422)250", reader.getFoundBarCodes()[1].getCodeText());
        }
    }

        @Test
        //[Category("GS1DataMatrix")]
    public void test_GS1Datamatrix_gs1datamatrix_gif_GS1DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "GS1Datamatrix\\gs1datamatrix.gif"), DecodeType.GS_1_DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(20)01(11)111228", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("GS1DataMatrix")]
    public void test_GS1Datamatrix_gs1datamatrix1_gif_GS1DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "GS1Datamatrix\\gs1datamatrix1.gif"), DecodeType.GS_1_DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)01234567890128(15)051231", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("GS1DataMatrix")]
    public void test_GS1Datamatrix_gs1datamatrix2_gif_GS1DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "GS1Datamatrix\\gs1datamatrix2.gif"), DecodeType.GS_1_DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(30)19(21)123456789012", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("GS1DataMatrix")]
    public void test_GS1Datamatrix_matrix_data_bar_01_png_GS1DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "GS1Datamatrix\\matrix_data_bar_01.png"), DecodeType.GS_1_DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)03800209290014(21)ABCDEFG123456789", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("GS1DataMatrix")]
    public void test_GS1Datamatrix_testImage_png_GS1DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "GS1Datamatrix\\testImage.png"), DecodeType.GS_1_DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)08426950511601(17)131027(10)312044-016", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void Test_MicroPDF417_MicroPdf417_png_MicroPdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "MicroPDF417\\MicroPdf417.png"), DecodeType.MICRO_PDF_417);
        {
            reader.getQualitySettings().setDeconvolution(DeconvolutionMode.SLOW);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1234567890 PDFTech", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void Test_MicroPDF417_SA315_MicroPDF417_jpg_MicroPdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "MicroPDF417\\SA315_MicroPDF417.jpg"), DecodeType.MICRO_PDF_417);
        {
            reader.getQualitySettings().setDeconvolution(DeconvolutionMode.SLOW);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("YourTextHere", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void Test_MicroPDF417_11_png_MicroPdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "MicroPDF417\\11.png"), DecodeType.MICRO_PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMN", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void Test_MicroPDF417_12_png_MicroPdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "MicroPDF417\\12.png"), DecodeType.MICRO_PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZAB", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void Test_MicroPDF417_rowheight_micropdf417_gif_MicroPdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "MicroPDF417\\rowheight_micropdf417.gif"), DecodeType.MICRO_PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("http://www.han-soft.com", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("MicroPdf417")]
    public void test_MicroPDF417_pdf417micro_001_gif_MicroPdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "MicroPDF417\\pdf417micro_001.gif"), DecodeType.MICRO_PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("9771210107001", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("MicroPdf417")]
    public void test_MicroPDF417_MicroPDF417_11_gif_MicroPdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "MicroPDF417\\MicroPDF417_11.gif"), DecodeType.MICRO_PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("LEADTOOLS - MicroPDF417", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("MicroPdf417")]
    public void test_MicroPDF417_micropdf417_gif_MicroPdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "MicroPDF417\\micropdf-417.gif"), DecodeType.MICRO_PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMN", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("MicroPdf417")]
    public void test_MicroPDF417_MicroPDF417Structure_gif_MicroPdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "MicroPDF417\\Micro PDF417 Structure.gif"), DecodeType.MICRO_PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGH\r\nIJKLMNOPQRSTUVWXYZABCD", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("MicroPdf417")]
    public void test_MicroPDF417_MicroPDFvsPDF_png_MicroPdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "MicroPDF417\\MicroPDFvsPDF.png"), DecodeType.MICRO_PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZABCD", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("MicroPdf417")]
    public void test_MicroPDF417_MicroPDFcols4_png_MicroPdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "MicroPDF417\\MicroPDFcols4.png"), DecodeType.MICRO_PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZABC" +
                    "DEFGHIJKLMNOPQRSTUVWXYZAB", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("MicroPdf417")]
    public void test_MicroPDF417_MicroPDF417Ex_png_MicroPdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "MicroPDF417\\Micro PDF417 Ex.png"), DecodeType.MICRO_PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("DEFGHIJKLMNABCDEFGHIJKLMNOPQRSTUVW\r\nIJKL", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("MicroPdf417")]
    public void test_MicroPDF417_sample_5260_jpg_MicroPdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "MicroPDF417\\sample_5260.jpg"), DecodeType.MICRO_PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("3997e250-ac9b-42d7-a6f4-77d6347286d9", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Pdf417")]
    public void test_PDF417_pdf417sample1_gif_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "PDF417\\pdf417-sample1.gif"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Morovia Corporation\r\n505 Consumers Road, #912\r\nToronto, ON M2J4V8\r\nTel: 877-MOROV" +
                    "IA\r\nWeb: www.morovia.com", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Pdf417")]
    public void test_PDF417_pdf_demo_png_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "PDF417\\pdf_demo.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Pdf417")]
    public void test_PDF417_iis_pdf417_activex_gif_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "PDF417\\iis_pdf417_activex.gif"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("111222DEMO", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Pdf417")]
    public void test_PDF417_9a_jpg_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "PDF417\\9a.jpg"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("The cache is located at north three six degrees zero six point zero two three wes" +
                    "t one one five degrees zero one point seven three three. Hint: guard rail.", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Pdf417")]
    public void test_PDF417_iis_pdf417_html2_gif_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "PDF417\\iis_pdf417_html2.gif"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("DEMO07494710278", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Pdf417")]
    public void test_PDF417_pdf417structuredetails_png_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "PDF417\\pdf417-structure-details.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("PDF417", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Pdf417")]
    public void test_PDF417_pdf417_rowcol_gif_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "PDF417\\pdf417_rowcol.gif"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("http://www.han-soft.com", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Pdf417")]
    public void test_PDF417_IDAutomation_png_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "PDF417\\IDAutomation.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Softpedia Image Generator Example\r\n", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Pdf417")]
    public void test_PDF417_smallpdfrows_jpg_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "PDF417\\smallpdfrows.jpg"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Michael O\'Haire", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Pdf417")]
    public void test_PDF417_aspose1_png_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "PDF417\\aspose1.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("00425453400169", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Pdf417")]
    public void test_PDF417_aspose2_png_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "PDF417\\aspose2.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("ABC 456", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Pdf417")]
    public void test_PDF417_aspose3_png_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "PDF417\\aspose3.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("ABC 456 abc", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Pdf417")]
    public void test_PDF417_aspose4_png_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "PDF417\\aspose4.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Note to someONE 34 &&*", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Pdf417")]
    public void test_PDF417_aspose5_png_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "PDF417\\aspose5.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Note to someONE 34 &&EEEEEE CCCCC WWWWW $$*", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Pdf417")]
    public void test_PDF417_aspose6_png_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "PDF417\\aspose6.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("ê\u0096", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Pdf417")]
    public void test_PDF417_9d38_png_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "PDF417\\9d38.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("kkm-tcs.ru", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Pdf417")]
    public void test_PDF417_pdf417_01_gif_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "PDF417\\pdf417_01.gif"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("AIM USA  PA", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Pdf417")]
    public void test_PDF417_ReaderPDF417_png_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "PDF417\\ReaderPDF417.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Barcode Software Solutions Team - We will be happy to help you in your project!", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Pdf417")]
    public void test_PDF417_barcodes_gif_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "PDF417\\barcodes.gif"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("TEC-IT Datenverarbeitung", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Pdf417")]
    public void test_PDF417_7ae9eee636_jpg_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "PDF417\\7ae9eee636.jpg"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("ABCDEF", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Pdf417")]
    public void test_PDF417_pdf417barcodegenerator1011_jpg_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "PDF417\\pdf417-barcode-generator-101-1.jpg"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Input texts (up to 200 characters) and click \"Encode\" to get the Pdf417 barcode. " +
                    "click \"Save\" to save the barcode image to your phone Gallery. click \"Clear\" to e" +
                    "rase the texts and the barcode.", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Pdf417")]
    public void test_PDF417_PDF417FedEx_jpg_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "PDF417\\PDF417-FedEx.jpg"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("[)>\u001e01\u001d0210011\u001d840\u001d26\u001d7910002710790201\u001dFDE\u001d131189974\u001d151\u001d \u001d1/1\u001d1LB\u001dN\u001d133 West 19th Street\u001dNew York\u001dNY\u001dPaul Sutton\u001e06\u001d10ZED003\u001d11ZDuomo Photography\u001d12Z2122431150\u001d13Z0000\u001c\u001d15Z3058641\u001d18Z197806818\u001cE3\u001d20Z0.00\u001c1\u001d28Z\u001dK \u001d26Z09c6\u001c\u001d\u001e\u0004", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Pdf417")]
    public void test_PDF417_PDF417_1_jpg_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "PDF417\\PDF417_1.jpg"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("BurstScan II - the optimal bar code scanner for PDF-417!", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Pdf417")]
    public void test_PDF417_imageedit_2_9343809295_png_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "PDF417\\imageedit_2_9343809295.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1234567DEMO", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Pdf417")]
    public void test_PDF417_withtrash_png_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "PDF417\\with trash.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1234567DEMO", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Pdf417")]
    public void test_PDF417_IMG_4371_JPG_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "PDF417\\IMG_4371.JPG"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Test code", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Pdf417")]
    public void test_PDF417_IMG_4372_JPG_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "PDF417\\IMG_4372.JPG"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Test code", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Pdf417")]
    public void test_PDF417_test_png_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "PDF417\\test.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("\"BT_SO\"|\"12971\"|\"GALAK\"|\"YURIY\"|\"61690\"|\"08/28/2011\"", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Pdf417")]
    public void test_PDF417_reduced_img_jpg_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "PDF417\\reduced_img.jpg"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("@\n\u001e\rANSI 636011040002DL00410463ZD05040003DLDAQ1686657                  \nDCSCHAKRABORTY                             \nDDEN\nDACSAURAV                                  \nDDFN\nDADNONE                                    \nDDGN\nDCAD     \nDCBB           \nDCDNONE \nDBD07062012\nDBB03161979\nDBA03052014\nDBC1\nDAU067 in\nDAYBRO\nDAG2414 SOCIETY DR                    \nDAICLAYMONT            \nDAJDE\nDAK197031761  \nDCF2012070668950991686657   \nDCGUSA\nDCUNONE \nDAW161\nDAHWHITNEY APTS                       \nDDAM\nDDB02082010\rZD\r", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Pdf417")]
    public void test_PDF417_FREEPDF417Recognizer_1_png_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "PDF417\\FREE-PDF417-Recognizer_1.png"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("ABCDEF", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Pdf417")]
    public void test_PDF417_PDF417_11_jpg_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "PDF417\\PDF417_11.jpg"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("MM0000753488 ", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Pdf417")]
    public void test_PDF417_pdf417cgiparams_gif_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "PDF417\\pdf417-cgi-params.gif"), DecodeType.PDF_417);
        {
            reader.getQualitySettings().setComplexBackground(ComplexBackgroundMode.ENABLED);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("HelloWorld", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_QR_images9_jpg_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QR\\images9.jpg"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("http://www.daqri.com/Dvw6SUJA0EDG/", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_QR_500qr_jpg_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QR\\500qr.jpg"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("http://plinks.me/t9fxdk", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_QR_QR_jpg_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QR\\QR.jpg"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Kibu", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_QR_qr_inside_jpg_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QR\\qr_inside.jpg"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("http://map.ck.ua/u/?sur=uplHz5595", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_QR_uTimetable_QR_png_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QR\\uTimetable_QR.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("market://search?q=pname:com.skkap.utimetable", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_QR_qr_in1_png_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QR\\qr_in1.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("http://my.opera.com/community/", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_QR_qr92_jpg_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QR\\qr92.jpg"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("http://theory.isthereason.com", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_QR_maninqrcode_jpg_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QR\\man-in-qr-code.jpg"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("http://flavors.me/mallox", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_QR_QR_codes_Trade_Shows_1_jpg_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QR\\QR_codes_Trade_Shows_(1).jpg"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("http://www.tappinn.com/c/1722", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_QR_QRbigzones_jpg_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QR\\QR-big-zones.jpg"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("http://www.computerbild.ru/", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_QR_cnn_qr_code_jpg_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QR\\cnn_qr_code.jpg"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("http://turner.mo2do.net/s/17585/Home", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_QR_630QRCode2_jpg_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QR\\630QR-Code2.jpg"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("http://plinks.me/iusxvh", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_QR_mtsqr2_jpg_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QR\\mts-qr2.jpg"), DecodeType.QR);
        {
            reader.setQualitySettings(QualitySettings.getHighQuality());
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("http://redcode.mts.ru/c/polyanka", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_QR_resta_jpg_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QR\\resta.jpg"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("http://www.primario.com.es/qr", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_QR_qrcode01_jpg_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QR\\qr-code-01.jpg"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("http://totalart.mobi/warhol", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_QR_qr_round_art_gif_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QR\\qr_round_art.gif"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("http://www.6ruk.ru", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_QR_qr_cube3_jpg_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QR\\qr_cube3.jpg"), DecodeType.QR);
        {
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
            List<String> actualTexts = new ArrayList<String>();
            for(BarCodeResult result : reader.readBarCodes())
                actualTexts.add(result.getCodeText());

            String[] expectedTexts = new String[3];
            expectedTexts[0] = "3";
            expectedTexts[1] = "2";
            expectedTexts[2] = "1";

            CollectionAssert.areEquivalent(expectedTexts, actualTexts, " File 'QR\\qr_cube3.jpg ': Expected and actual collections of code texts do not meet requirements.");
        }
    }

        @Test
        //[Category("QR")]
    public void test_QR_images1_jpg_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QR\\images1.jpg"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("IT\'S BACK ON DVD SEPTEMBER 10th", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_QR_images4_jpg_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QR\\images4.jpg"), DecodeType.QR);
        {
            reader.setQualitySettings(QualitySettings.getHighQuality());
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("http://wap.pepsi.co.uk/r5", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_QR_qrcode250x250_jpg_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QR\\qr-code-250x250.jpg"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("http://blog.webometrics.org.uk", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_QR_qrcodegrave1_jpg_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QR\\qr-code-grave-1.jpg"), DecodeType.QR);
        {
            reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("http://d-qr.net/dqrcgi/r.aspx?r=8r13eci7 ", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_QR_resta_jpg_QR2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "QR\\resta.jpg"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("http://www.primario.com.es/qr", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("MicroQR")]
    public void test_MicroQR_testMicroQR_png_MicroQR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "MicroQR\\testMicroQR.png"), DecodeType.MICRO_QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Mobilio", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("MicroQR")]
    public void test_MicroQR_qr_microqr_png_MicroQR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "MicroQR\\qr_microqr.png"), DecodeType.MICRO_QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("01234567", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("MicroQR")]
    public void test_MicroQR_qrcodesinbusiness20728_jpg_MicroQR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "MicroQR\\qr-codes-in-business-20-728.jpg"), DecodeType.MICRO_QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("17520034110099031000011229", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Aztec")]
    public void test_Aztec__302_jpg_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Aztec\\302.jpg"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("NEOM", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test(enabled = false)
        //[Category("Aztec")]
    public void test_Aztec__288uw55_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Aztec\\288uw55.png"), DecodeType.AZTEC);
        reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);
        reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("MJOUSSEN", reader.getFoundBarCodes()[0].getCodeText());
    }
}
