package com.aspose.external.barcode.tester.recognition;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.ChecksumValidation;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RecognitionChecksumSingleImages
{

    private String _folder;

        @BeforeMethod
    public void SetupTestFixture()
    {
        this._folder = Global.getTestDataFolder("Recognition\\ChecksumTest");
        com.aspose.barcode.LicenseAssistant.setupLicense();
    }

        @Test
        //[Category("Codabar")]
    public void test_Codabar_01_png_Codabar()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Codabar_01.png"), DecodeType.CODABAR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123456789", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Codabar")]
    public void test_Codabar_02_png_Codabar()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Codabar_02.png"), DecodeType.CODABAR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123456", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Codabar")]
    public void test_Codabar_03_png_Codabar()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Codabar_03.png"), DecodeType.CODABAR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("580945", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Codabar")]
    public void test_Codabar_04_png_Codabar()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Codabar_04.png"), DecodeType.CODABAR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("654767879894234354364", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Codabar")]
    public void test_Codabar_05_png_Codabar()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Codabar_05.png"), DecodeType.CODABAR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code11")]
    public void test_Codabar_06_png_Code11()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Codabar_06.png"), DecodeType.CODE_11);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123456789", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code11")]
    public void test_Codabar_07_png_Code11()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Codabar_07.png"), DecodeType.CODE_11);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123-456", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code11")]
    public void test_Codabar_08_png_Code11()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Codabar_08.png"), DecodeType.CODE_11);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("-123456", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code11")]
    public void test_Codabar_09_png_Code11()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Codabar_09.png"), DecodeType.CODE_11);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123456-", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code11")]
    public void test_Codabar_010_png_Code11()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Codabar_010.png"), DecodeType.CODE_11);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123456-789-45", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code128")]
    public void test_Code128_01_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code128_01.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("X-Factor Live ;on; Tuesday 23th", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code128")]
    public void test_Code128_02_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code128_02.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("54987SD", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code128")]
    public void test_Code128_03_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code128_03.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123456%", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code128")]
    public void test_Code128_04_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code128_04.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Only for U-u-U-2-3-$-5", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code39Standard")]
    public void test_Code39Standard_01_png_Code39Standard()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code39Standard_01.png"), DecodeType.CODE_39);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123456789", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code39Standard")]
    public void test_Code39Standard_02_png_Code39Standard()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code39Standard_02.png"), DecodeType.CODE_39);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("54987SD", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code39Standard")]
    public void test_Code39Standard_03_png_Code39Standard()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code39Standard_03.png"), DecodeType.CODE_39);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("465AF45%", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code39Standard")]
    public void test_Code39Standard_04_png_Code39Standard()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code39Standard_04.png"), DecodeType.CODE_39);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("7687DDE3", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code39Extended")]
    public void test_Code39Extended_01_png_Code39Extended()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code39Extended_01.png"), DecodeType.CODE_39_FULL_ASCII);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123456789", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code39Standard")]
    public void test_Code39Extended_02_png_Code39Standard()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code39Extended_02.png"), DecodeType.CODE_39);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123456789", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code39Extended")]
    public void test_Code39Extended_03_png_Code39Extended()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code39Extended_03.png"), DecodeType.CODE_39_FULL_ASCII);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345WErt3", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code39Extended")]
    public void test_Code39Extended_04_png_Code39Extended()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code39Extended_04.png"), DecodeType.CODE_39_FULL_ASCII);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("76790Dty$", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code39Extended")]
    public void test_Code39Extended_05_png_Code39Extended()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code39Extended_05.png"), DecodeType.CODE_39_FULL_ASCII);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("oiutrRR45$er", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code93Standard")]
    public void test_Code93Standard_01_png_Code93Standard()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code93Standard_01.png"), DecodeType.CODE_93);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123456789", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code93Standard")]
    public void test_Code93Standard_02_png_Code93Standard()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code93Standard_02.png"), DecodeType.CODE_93);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("54987SD", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code93Standard")]
    public void test_Code93Standard_03_png_Code93Standard()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code93Standard_03.png"), DecodeType.CODE_93);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("465AF45%", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code93Standard")]
    public void test_Code93Standard_04_png_Code93Standard()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code93Standard_04.png"), DecodeType.CODE_93);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("7687DDE3", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code93Extended")]
    public void test_Code93Extended_01_png_Code93Extended()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code93Extended_01.png"), DecodeType.CODE_93);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123456789", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code93Standard")]
    public void test_Code93Extended_02_png_Code93Standard()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code93Extended_02.png"), DecodeType.CODE_93);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123456789", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code93Standard")]
    public void test_Code93Extended_03_png_Code93Standard()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code93Extended_03.png"), DecodeType.CODE_93);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123456789", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code93Extended")]
    public void test_Code93Extended_04_png_Code93Extended()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code93Extended_04.png"), DecodeType.CODE_93);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123456789", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code93Extended")]
    public void test_Code93Extended_05_png_Code93Extended()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code93Extended_05.png"), DecodeType.CODE_93);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345WErt3", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code93Extended")]
    public void test_Code93Extended_06_png_Code93Extended()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code93Extended_06.png"), DecodeType.CODE_93);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("76790Dty^", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code93Extended")]
    public void test_Code93Extended_07_png_Code93Extended()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Code93Extended_07.png"), DecodeType.CODE_93);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("oiutrRR45$er", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Standard2of5")]
    public void test_Standard2of5_01_png_Standard2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Standard2of5_01.png"), DecodeType.STANDARD_2_OF_5);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("23", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Standard2of5")]
    public void test_Standard2of5_02_png_Standard2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Standard2of5_02.png"), DecodeType.STANDARD_2_OF_5);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("5423", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Standard2of5")]
    public void test_Standard2of5_03_png_Standard2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Standard2of5_03.png"), DecodeType.STANDARD_2_OF_5);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123456", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Standard2of5")]
    public void test_Standard2of5_04_png_Standard2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Standard2of5_04.png"), DecodeType.STANDARD_2_OF_5);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("215767698732", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Interleaved2of5")]
    public void test_Interleaved2of5_01_png_Interleaved2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Interleaved2of5_01.png"), DecodeType.INTERLEAVED_2_OF_5);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("23", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Interleaved2of5")]
    public void test_Interleaved2of5_02_png_Interleaved2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Interleaved2of5_02.png"), DecodeType.INTERLEAVED_2_OF_5);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("001117", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Interleaved2of5")]
    public void test_Interleaved2of5_03_png_Interleaved2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Interleaved2of5_03.png"), DecodeType.INTERLEAVED_2_OF_5);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123456", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Interleaved2of5")]
    public void test_Interleaved2of5_04_png_Interleaved2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Interleaved2of5_04.png"), DecodeType.INTERLEAVED_2_OF_5);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("0958349873298732", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Matrix2of5")]
    public void test_Matrix2of5_01_png_Matrix2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Matrix2of5_01.png"), DecodeType.MATRIX_2_OF_5);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("23", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Matrix2of5")]
    public void test_Matrix2of5_02_png_Matrix2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Matrix2of5_02.png"), DecodeType.MATRIX_2_OF_5);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Matrix2of5")]
    public void test_Matrix2of5_03_png_Matrix2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Matrix2of5_03.png"), DecodeType.MATRIX_2_OF_5);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("5456", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Matrix2of5")]
    public void test_Matrix2of5_04_png_Matrix2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Matrix2of5_04.png"), DecodeType.MATRIX_2_OF_5);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("786796435234234324324454", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ItalianPost25")]
    public void test_ItalianPost25_01_png_ItalianPost25()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ItalianPost25_01.png"), DecodeType.ITALIAN_POST_25);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("23", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ItalianPost25")]
    public void test_ItalianPost25_02_png_ItalianPost25()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ItalianPost25_02.png"), DecodeType.ITALIAN_POST_25);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("05464652", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ItalianPost25")]
    public void test_ItalianPost25_03_png_ItalianPost25()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ItalianPost25_03.png"), DecodeType.ITALIAN_POST_25);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123456", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ItalianPost25")]
    public void test_ItalianPost25_04_png_ItalianPost25()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ItalianPost25_04.png"), DecodeType.ITALIAN_POST_25);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("022223", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("IATA2of5")]
    public void test_IATA2of5_01_png_IATA2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "IATA2of5_01.png"), DecodeType.IATA_2_OF_5);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123235", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("IATA2of5")]
    public void test_IATA2of5_02_png_IATA2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "IATA2of5_02.png"), DecodeType.IATA_2_OF_5);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("54232", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("IATA2of5")]
    public void test_IATA2of5_03_png_IATA2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "IATA2of5_03.png"), DecodeType.IATA_2_OF_5);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1234565", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("IATA2of5")]
    public void test_IATA2of5_04_png_IATA2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "IATA2of5_04.png"), DecodeType.IATA_2_OF_5);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("2157334347887323", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ITF14")]
    public void test_ITF14_01_png_ITF14()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ITF14_01.png"), DecodeType.ITF_14);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12300000000006", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ITF14")]
    public void test_ITF14_02_png_ITF14()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ITF14_02.png"), DecodeType.ITF_14);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("54646520000000", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ITF14")]
    public void test_ITF14_03_png_ITF14()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ITF14_03.png"), DecodeType.ITF_14);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345600000001", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ITF14")]
    public void test_ITF14_04_png_ITF14()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ITF14_04.png"), DecodeType.ITF_14);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("21573343478872", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ITF6")]
    public void test_ITF6_01_png_ITF6()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ITF6_01.png"), DecodeType.ITF_6);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123000", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ITF6")]
    public void test_ITF6_02_png_ITF6()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ITF6_02.png"), DecodeType.ITF_6);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("546465", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ITF6")]
    public void test_ITF6_03_png_ITF6()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ITF6_03.png"), DecodeType.ITF_6);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123456", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ITF6")]
    public void test_ITF6_04_png_ITF6()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ITF6_04.png"), DecodeType.ITF_6);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("222230", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DeutschePostIdentcode")]
    public void test_DeutschePostIdentcode_01_png_DeutschePostIdentcode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "DeutschePostIdentcode_01.png"), DecodeType.DEUTSCHE_POST_IDENTCODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123000000006", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DeutschePostIdentcode")]
    public void test_DeutschePostIdentcode_02_png_DeutschePostIdentcode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "DeutschePostIdentcode_02.png"), DecodeType.DEUTSCHE_POST_IDENTCODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("546465200007", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DeutschePostIdentcode")]
    public void test_DeutschePostIdentcode_03_png_DeutschePostIdentcode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "DeutschePostIdentcode_03.png"), DecodeType.DEUTSCHE_POST_IDENTCODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123456789000", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DeutschePostIdentcode")]
    public void test_DeutschePostIdentcode_04_png_DeutschePostIdentcode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "DeutschePostIdentcode_04.png"), DecodeType.DEUTSCHE_POST_IDENTCODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123456789123", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DeutschePostLeitcode")]
    public void test_DeutschePostLeitcode_01_png_DeutschePostLeitcode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "DeutschePostLeitcode_01.png"), DecodeType.DEUTSCHE_POST_LEITCODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12300000000006", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DeutschePostLeitcode")]
    public void test_DeutschePostLeitcode_02_png_DeutschePostLeitcode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "DeutschePostLeitcode_02.png"), DecodeType.DEUTSCHE_POST_LEITCODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("54646520000007", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DeutschePostLeitcode")]
    public void test_DeutschePostLeitcode_03_png_DeutschePostLeitcode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "DeutschePostLeitcode_03.png"), DecodeType.DEUTSCHE_POST_LEITCODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345678900000", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DeutschePostLeitcode")]
    public void test_DeutschePostLeitcode_04_png_DeutschePostLeitcode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "DeutschePostLeitcode_04.png"), DecodeType.DEUTSCHE_POST_LEITCODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345678912340", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("GS1Code128")]
    public void test_GS1Code128_01_png_GS1Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "GS1Code128_01.png"), DecodeType.GS_1_CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1234567", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("GS1Code128")]
    public void test_GS1Code128_02_png_GS1Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "GS1Code128_02.png"), DecodeType.GS_1_CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123456789", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("GS1Code128")]
    public void test_GS1Code128_03_png_GS1Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "GS1Code128_03.png"), DecodeType.GS_1_CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345678912345678", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("GS1Code128")]
    public void test_GS1Code128_04_png_GS1Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "GS1Code128_04.png"), DecodeType.GS_1_CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("EAN8")]
    public void test_EAN8_01_png_EAN8()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "EAN8_01.png"), DecodeType.EAN_8);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12300006", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("EAN8")]
    public void test_EAN8_02_png_EAN8()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "EAN8_02.png"), DecodeType.EAN_8);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345670", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("EAN8")]
    public void test_EAN8_03_png_EAN8()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "EAN8_03.png"), DecodeType.EAN_8);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("45321306", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("EAN8")]
    public void test_EAN8_04_png_EAN8()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "EAN8_04.png"), DecodeType.EAN_8);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("10000007", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("EAN13")]
    public void test_EAN13_01_png_EAN13()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "EAN13_01.png"), DecodeType.EAN_13);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1234567000008", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("EAN13")]
    public void test_EAN13_02_png_EAN13()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "EAN13_02.png"), DecodeType.EAN_13);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1234567890005", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("EAN13")]
    public void test_EAN13_03_png_EAN13()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "EAN13_03.png"), DecodeType.EAN_13);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1234567891231", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("EAN13")]
    public void test_EAN13_04_png_EAN13()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "EAN13_04.png"), DecodeType.EAN_13);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1000000000009", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("EAN14")]
    public void test_EAN14_01_png_EAN14()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "EAN14_01.png"), DecodeType.EAN_14);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)12345670000000", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("EAN14")]
    public void test_EAN14_02_png_EAN14()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "EAN14_02.png"), DecodeType.EAN_14);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)12345678900005", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("EAN14")]
    public void test_EAN14_03_png_EAN14()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "EAN14_03.png"), DecodeType.EAN_14);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)12345678912343", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("EAN14")]
    public void test_EAN14_04_png_EAN14()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "EAN14_04.png"), DecodeType.EAN_14);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)10000000000007", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("SCC14")]
    public void test_SCC14_01_png_SCC14()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "SCC14_01.png"), DecodeType.SCC_14);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)12345670000000", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("SCC14")]
    public void test_SCC14_02_png_SCC14()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "SCC14_02.png"), DecodeType.SCC_14);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)12345678900005", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("SCC14")]
    public void test_SCC14_03_png_SCC14()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "SCC14_03.png"), DecodeType.SCC_14);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)12345678912343", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("SCC14")]
    public void test_SCC14_04_png_SCC14()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "SCC14_04.png"), DecodeType.SCC_14);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)10000000000007", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("SSCC18")]
    public void test_SSCC18_01_png_SSCC18()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "SSCC18_01.png"), DecodeType.SSCC_18);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(00)123456789000000005", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("SSCC18")]
    public void test_SSCC18_02_png_SSCC18()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "SSCC18_02.png"), DecodeType.SSCC_18);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(00)123450000000000007", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("SSCC18")]
    public void test_SSCC18_03_png_SSCC18()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "SSCC18_03.png"), DecodeType.SSCC_18);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(00)123456789123456789", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("SSCC18")]
    public void test_SSCC18_04_png_SSCC18()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "SSCC18_04.png"), DecodeType.SSCC_18);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(00)100000000000000007", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("UPCA")]
    public void test_UPCA_01_png_UPCA()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "UPCA_01.png"), DecodeType.UPCA);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123456789005", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("UPCA")]
    public void test_UPCA_02_png_UPCA()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "UPCA_02.png"), DecodeType.UPCA);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123450000007", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("UPCA")]
    public void test_UPCA_03_png_UPCA()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "UPCA_03.png"), DecodeType.UPCA);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123456789128", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("UPCA")]
    public void test_UPCA_04_png_UPCA()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "UPCA_04.png"), DecodeType.UPCA);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("100000000007", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("UPCE")]
    public void test_UPCE_01_png_UPCE()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "UPCE_01.png"), DecodeType.UPCE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("01234565", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("UPCE")]
    public void test_UPCE_02_png_UPCE()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "UPCE_02.png"), DecodeType.UPCE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("01234505", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("UPCE")]
    public void test_UPCE_03_png_UPCE()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "UPCE_03.png"), DecodeType.UPCE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("01234565", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("UPCE")]
    public void test_UPCE_04_png_UPCE()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "UPCE_04.png"), DecodeType.UPCE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("01000009", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ISBN")]
    public void test_ISBN_01_png_ISBN()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ISBN_01.png"), DecodeType.ISBN);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("9782121212340", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ISBN")]
    public void test_ISBN_02_png_ISBN()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ISBN_02.png"), DecodeType.ISBN);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("9781234500009", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ISBN")]
    public void test_ISBN_03_png_ISBN()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ISBN_03.png"), DecodeType.ISBN);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("9781234567897", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ISBN")]
    public void test_ISBN_04_png_ISBN()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ISBN_04.png"), DecodeType.ISBN);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("9781000000009", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("MSI")]
    public void test_MSI_01_png_MSI()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "MSI_01.png"), DecodeType.MSI);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("21212123456", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("MSI")]
    public void test_MSI_02_png_MSI()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "MSI_02.png"), DecodeType.MSI);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("MSI")]
    public void test_MSI_03_png_MSI()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "MSI_03.png"), DecodeType.MSI);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345678912345678", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("PZN")]
    public void test_PZN_01_png_PZN()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "PZN_01.png"), DecodeType.PZN);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("-2124522", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("PZN")]
    public void test_PZN_02_png_PZN()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "PZN_02.png"), DecodeType.PZN);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("-1234504", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("PZN")]
    public void test_PZN_03_png_PZN()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "PZN_03.png"), DecodeType.PZN);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("-1234562", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("PZN")]
    public void test_PZN_04_png_PZN()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "PZN_04.png"), DecodeType.PZN);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("-1000002", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("VIN")]
    public void test_VIN_01_png_VIN()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "VIN_01.png"), DecodeType.VIN);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("21245212145600000", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("VIN")]
    public void test_VIN_02_png_VIN()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "VIN_02.png"), DecodeType.VIN);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345000300000000", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("VIN")]
    public void test_VIN_03_png_VIN()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "VIN_03.png"), DecodeType.VIN);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345678712345678", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("VIN")]
    public void test_VIN_04_png_VIN()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "VIN_04.png"), DecodeType.VIN);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("10000000800000000", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Postnet")]
    public void test_Postnet2_01_png_Postnet()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Postnet2_01.png"), DecodeType.POSTNET);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("56789", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("5", reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum());
        }
    }

        @Test
        //[Category("Planet")]
    public void test_Planet_01_png_Planet()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Planet_01.png"), DecodeType.PLANET);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("5", reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum());
        }
    }

        @Test
        //[Category("RM4SCC")]
    public void test_RM4SCC_01_png_RM4SCC()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "RM4SCC_01.png"), DecodeType.RM_4_SCC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1234567890", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("6", reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum());
        }
    }

        @Test
        //[Category("AustraliaPost")]
    public void test_AustraliaPost_01_png_AustraliaPost()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "AustraliaPost_01.png"), DecodeType.AUSTRALIA_POST);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1112345678", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(" 26 44 19 15", reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum());
        }
    }

        @Test
        //[Category("OneCode")]
    public void test_OneCode_01_png_OneCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "OneCode_01.png"), DecodeType.ONE_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("44999000000123456789941078350", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("1481", reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum());
        }
    }

        @Test
        //[Category("Code93Extended")]
    public void test_ChecksumException_01_png_Code93Extended()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ChecksumException_01.png"), DecodeType.CODE_93);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("505 My Road Drive", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_ChecksumException_02_png_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ChecksumException_02.png"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("505 My Road Drive", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code93Extended_Code93Standard")]
    public void test_ChecksumException_03_png_Code93Extended_Code93Standard()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ChecksumException_03.png"), DecodeType.scanSets(DecodeType.CODE_93, DecodeType.CODE_93));
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("505 My Road Drive", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code93Standard")]
    public void test_ChecksumException_04_png_Code93Standard()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ChecksumException_04.png"), DecodeType.CODE_93);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("505 ALL", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code93Extended")]
    public void test_ChecksumException_05_png_Code93Extended()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ChecksumException_05.png"), DecodeType.CODE_93);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("505 ALL", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code93Extended_Code93Standard")]
    public void test_ChecksumException_06_png_Code93Extended_Code93Standard()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ChecksumException_06.png"), DecodeType.scanSets(DecodeType.CODE_93, DecodeType.CODE_93));
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("505 ALL", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_ChecksumException_07_png_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ChecksumException_07.png"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("505 ALL", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Codabar")]
    public void test_ChecksumPresence_Codabar_0_png_Codabar()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ChecksumPresence_Codabar_0.png"), DecodeType.CODABAR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code11")]
    public void test_ChecksumPresence_Code11_1_png_Code11()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ChecksumPresence_Code11_1.png"), DecodeType.CODE_11);
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.ON);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("2", reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum());
        }
    }

        @Test
        //[Category("Code39Standard")]
    public void test_ChecksumPresence_Code39Standard_2_png_Code39Standard()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ChecksumPresence_Code39Standard_2.png"), DecodeType.CODE_39);
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.ON);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345F", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("F", reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum());
        }
    }

        @Test
        //[Category("Code39Extended")]
    public void test_ChecksumPresence_Code39Extended_3_png_Code39Extended()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ChecksumPresence_Code39Extended_3.png"), DecodeType.CODE_39_FULL_ASCII);
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.ON);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345F", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("F", reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum());
        }
    }

        @Test
        //[Category("Code93Standard")]
    public void test_ChecksumPresence_Code93Standard_4_png_Code93Standard()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ChecksumPresence_Code93Standard_4.png"), DecodeType.CODE_93);
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.ON);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("Z ", reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum());
        }
    }

        @Test
        //[Category("Code93Extended")]
    public void test_ChecksumPresence_Code93Extended_5_png_Code93Extended()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ChecksumPresence_Code93Extended_5.png"), DecodeType.CODE_93);
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.ON);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("Z ", reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum());
        }
    }

        @Test
        //[Category("Code128")]
    public void test_ChecksumPresence_Code128_6_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ChecksumPresence_Code128_6.png"), DecodeType.CODE_128);
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.ON);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("6", reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum());
        }
    }

        @Test
        //[Category("GS1Code128")]
    public void test_ChecksumPresence_GS1Code128_7_png_GS1Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ChecksumPresence_GS1Code128_7.png"), DecodeType.GS_1_CODE_128);
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.ON);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("6", reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum());
        }
    }

        @Test
        //[Category("EAN8")]
    public void test_ChecksumPresence_EAN8_8_png_EAN8()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ChecksumPresence_EAN8_8.png"), DecodeType.EAN_8);
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.ON);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345007", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("7", reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum());
        }
    }

        @Test
        //[Category("EAN13")]
    public void test_ChecksumPresence_EAN13_9_png_EAN13()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ChecksumPresence_EAN13_9.png"), DecodeType.EAN_13);
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.ON);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1234500000003", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("3", reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum());
        }
    }

        @Test
        //[Category("EAN14")]
    public void test_ChecksumPresence_EAN14_10_png_EAN14()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ChecksumPresence_EAN14_10.png"), DecodeType.EAN_14);
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.ON);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)12345000000007", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("L", reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum());
        }
    }

        @Test
        //[Category("SCC14")]
    public void test_ChecksumPresence_SCC14_11_png_SCC14()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ChecksumPresence_SCC14_11.png"), DecodeType.SCC_14);
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.ON);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)12345000000007", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("L", reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum());
        }
    }

        @Test
        //[Category("SSCC18")]
    public void test_ChecksumPresence_SSCC18_12_png_SSCC18()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ChecksumPresence_SSCC18_12.png"), DecodeType.SSCC_18);
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.ON);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(00)123450000000000007", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("7", reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum());
        }
    }

        @Test
        //[Category("UPCA")]
    public void test_ChecksumPresence_UPCA_13_png_UPCA()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ChecksumPresence_UPCA_13.png"), DecodeType.UPCA);
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.ON);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123450000007", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("7", reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum());
        }
    }

        @Test
        //[Category("UPCE")]
    public void test_ChecksumPresence_UPCE_14_png_UPCE()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ChecksumPresence_UPCE_14.png"), DecodeType.UPCE);
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.ON);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("01234505", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("5", reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum());
        }
    }

        @Test
        //[Category("ISBN")]
    public void test_ChecksumPresence_ISBN_15_png_ISBN()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ChecksumPresence_ISBN_15.png"), DecodeType.ISBN);
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.ON);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("9781234500009", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("9", reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum());
        }
    }

        @Test
        //[Category("Standard2of5")]
    public void test_ChecksumPresence_Standard2of5_16_png_Standard2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ChecksumPresence_Standard2of5_16.png"), DecodeType.STANDARD_2_OF_5);
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.ON);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123457", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("7", reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum());
        }
    }

        @Test
        //[Category("Interleaved2of5")]
    public void test_ChecksumPresence_Interleaved2of5_17_png_Interleaved2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ChecksumPresence_Interleaved2of5_17.png"), DecodeType.INTERLEAVED_2_OF_5);
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.ON);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123457", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("7", reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum());
        }
    }

        @Test
        //[Category("Matrix2of5")]
    public void test_ChecksumPresence_Matrix2of5_18_png_Matrix2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ChecksumPresence_Matrix2of5_18.png"), DecodeType.MATRIX_2_OF_5);
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.ON);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123457", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("7", reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum());
        }
    }

        @Test
        //[Category("ItalianPost25")]
    public void test_ChecksumPresence_ItalianPost25_19_png_ItalianPost25()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ChecksumPresence_ItalianPost25_19.png"), DecodeType.ITALIAN_POST_25);
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.ON);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123457", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("7", reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum());
        }
    }

        @Test
        //[Category("IATA2of5")]
    public void test_ChecksumPresence_IATA2of5_20_png_IATA2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ChecksumPresence_IATA2of5_20.png"), DecodeType.IATA_2_OF_5);
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.ON);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123457", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("7", reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum());
        }
    }

        @Test
        //[Category("ITF14")]
    public void test_ChecksumPresence_ITF14_21_png_ITF14()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ChecksumPresence_ITF14_21.png"), DecodeType.ITF_14);
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.ON);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345000000007", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("7", reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum());
        }
    }

        @Test
        //[Category("MSI")]
    public void test_ChecksumPresence_MSI_22_png_MSI()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ChecksumPresence_MSI_22.png"), DecodeType.MSI);
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.ON);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123455", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("5", reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum());
        }
    }

        @Test
        //[Category("VIN")]
    public void test_ChecksumPresence_VIN_23_png_VIN()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ChecksumPresence_VIN_23.png"), DecodeType.VIN);
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.ON);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345000300000000", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("3", reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum());
        }
    }

        @Test
        //[Category("DeutschePostIdentcode")]
    public void test_ChecksumPresence_DeutschePostIdentcode_24_png_DeutschePostIdentcode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ChecksumPresence_DeutschePostIdentcode_24.png"), DecodeType.DEUTSCHE_POST_IDENTCODE);
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.ON);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123450000000", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("0", reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum());
        }
    }

        @Test
        //[Category("DeutschePostLeitcode")]
    public void test_ChecksumPresence_DeutschePostLeitcode_25_png_DeutschePostLeitcode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ChecksumPresence_DeutschePostLeitcode_25.png"), DecodeType.DEUTSCHE_POST_LEITCODE);
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.ON);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345000000000", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("0", reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum());
        }
    }

        @Test
        //[Category("Pharmacode")]
    public void test_ChecksumPresence_Pharmacode_26_png_Pharmacode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ChecksumPresence_Pharmacode_26.png"), DecodeType.PHARMACODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DatabarOmniDirectional")]
    public void test_ChecksumPresence_DatabarOmniDirectional_27_png_DatabarOmniDirectional()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ChecksumPresence_DatabarOmniDirectional_27.png"), DecodeType.DATABAR_OMNI_DIRECTIONAL);
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.ON);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)12345000000007", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("7", reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum());
        }
    }

        @Test
        //[Category("DatabarTruncated")]
    public void test_ChecksumPresence_DatabarTruncated_28_png_DatabarTruncated()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ChecksumPresence_DatabarTruncated_28.png"), DecodeType.DATABAR_TRUNCATED);
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.ON);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)12345000000007", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("7", reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum());
        }
    }

        @Test
        //[Category("DatabarLimited")]
    public void test_ChecksumPresence_DatabarLimited_29_png_DatabarLimited()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ChecksumPresence_DatabarLimited_29.png"), DecodeType.DATABAR_LIMITED);
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.ON);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)12345000000007", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("7", reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum());
        }
    }

        @Test
        //[Category("DatabarExpanded")]
    public void test_ChecksumPresence_DatabarExpanded_30_png_DatabarExpanded()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ChecksumPresence_DatabarExpanded_30.png"), DecodeType.DATABAR_EXPANDED);
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.ON);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(98765)<FNC1>12345", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("SwissPostParcel")]
    public void test_ChecksumPresence_SwissPostParcel_31_png_SwissPostParcel()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "ChecksumPresence_SwissPostParcel_31.png"), DecodeType.SWISS_POST_PARCEL);
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.ON);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("981234500000000000", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("", reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum());
        }
    }
}
