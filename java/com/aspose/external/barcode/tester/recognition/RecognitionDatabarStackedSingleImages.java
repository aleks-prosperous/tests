package com.aspose.external.barcode.tester.recognition;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.ChecksumValidation;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RecognitionDatabarStackedSingleImages
{
    private String _folder;

        @BeforeMethod
    public void SetupTestFixture()
    {
        this._folder = Global.getTestDataFolder("Recognition\\DatabarStacked");
        com.aspose.barcode.LicenseAssistant.setupLicense();
    }

        @Test
        //[Category("DatabarStacked")]
    public void test_Stacked_011234567890123_png_DatabarStacked()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Stacked\\(01)1234567890123.png"), DecodeType.DATABAR_STACKED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)12345678901231", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DatabarStacked")]
    public void test_Stacked_0192109876543213_png_DatabarStacked()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Stacked\\(01)92109876543213.png"), DecodeType.DATABAR_STACKED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)92109876543213", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DatabarExpandedStacked")]
    public void test_ExpandedStacked_10123_png_DatabarExpandedStacked()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Expanded Stacked\\(10)123.png"), DecodeType.DATABAR_EXPANDED_STACKED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(10)123", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DatabarExpandedStacked")]
    public void test_ExpandedStacked_0198898765432106_png_DatabarExpandedStacked()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Expanded Stacked\\(01)98898765432106.png"), DecodeType.DATABAR_EXPANDED_STACKED);
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.ON);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)98898765432106", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DatabarExpandedStacked")]
    public void test_ExpandedStacked_0198898765432106320201234515991231_png_DatabarExpandedStacked()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Expanded Stacked\\(01)98898765432106(3202)012345(15)991231.png"), DecodeType.DATABAR_EXPANDED_STACKED);
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.ON);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)98898765432106(3202)012345(15)991231", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DatabarExpandedStacked")]
    public void test_ExpandedStacked_019876543210987910119586718332_scout_row_png_DatabarExpandedStacked()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Expanded Stacked\\(01)98765432109879(10)119586718332_scout_row.png"), DecodeType.DATABAR_EXPANDED_STACKED);
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.ON);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)98765432109879(10)119586718332", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DatabarExpandedStacked")]
    public void test_ExpandedStacked_019876543210987910119586718332_scout_png_DatabarExpandedStacked()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Expanded Stacked\\(01)98765432109879(10)119586718332_scout.png"), DecodeType.DATABAR_EXPANDED_STACKED);
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.ON);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)98765432109879(10)119586718332", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DatabarExpandedStacked")]
    public void test_ExpandedStacked_0198898765432106320201234515991231_scout_row_png_DatabarExpandedStacked()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Expanded Stacked\\(01)98898765432106(3202)012345(15)991231_scout_row.png"), DecodeType.DATABAR_EXPANDED_STACKED);
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.ON);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)98898765432106(3202)012345(15)991231", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DatabarExpandedStacked")]
    public void test_ExpandedStacked_0198898765432106320201234515991231_scout_mod2_png_DatabarExpandedStacked()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Expanded Stacked\\(01)98898765432106(3202)012345(15)991231_scout_mod2.png"), DecodeType.DATABAR_EXPANDED_STACKED);
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.ON);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)98898765432106(3202)012345(15)991231", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DatabarExpandedStacked")]
    public void test_ExpandedStacked_0198898765432106320201234515991231_scout_row_png_DatabarExpandedStacked2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Expanded Stacked\\(01)98898765432106(3202)012345(15)991231_scout_row.png"), DecodeType.DATABAR_EXPANDED_STACKED);
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.ON);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)98898765432106(3202)012345(15)991231", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DatabarExpandedStacked")]
    public void test_ExpandedStacked_01084812345000161108091910XYZ_scout_mod8_png_DatabarExpandedStacked()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Expanded Stacked\\(01)08481234500016(11)080919(10)XYZ_scout_mod8.png"), DecodeType.DATABAR_EXPANDED_STACKED);
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.ON);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)08481234500016(11)080919(10)XYZ", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DatabarExpandedStacked")]
    public void test_ExpandedStacked_0198898765432106320201234510ABCXYZ_scout_png_DatabarExpandedStacked()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Expanded Stacked\\(01)98898765432106(3202)012345(10)ABCXYZ_scout.png"), DecodeType.DATABAR_EXPANDED_STACKED);
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.ON);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)98898765432106(3202)012345(10)ABCXYZ53", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DatabarExpandedStacked")]
    public void test_ExpandedStacked_811010014141012345290110100_scout_row_png_DatabarExpandedStacked()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Expanded Stacked\\(8110)10014141012345290110100_scout_row.png"), DecodeType.DATABAR_EXPANDED_STACKED);
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.ON);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(8110)10014141012345290110100", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DatabarExpandedStacked")]
    public void test_ExpandedStacked_01900123456789083922795_scout_row_png_DatabarExpandedStacked()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Expanded Stacked\\(01)90012345678908(3922)795_scout_row.png"), DecodeType.DATABAR_EXPANDED_STACKED);
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.ON);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)90012345678908(3922)795", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DatabarExpandedStacked")]
    public void test_ExpandedStacked_zxing_12_png_DatabarExpandedStacked()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Expanded Stacked\\zxing\\12.png"), DecodeType.DATABAR_EXPANDED_STACKED);
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.ON);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)90012345678908(3922)795", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DatabarExpandedStacked")]
    public void test_ExpandedStacked_101098_comma_1234_scout_row_png_DatabarExpandedStacked()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Expanded Stacked\\(10)1098_comma_1234_scout_row.png"), DecodeType.DATABAR_EXPANDED_STACKED);
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.ON);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(10)1098,1234", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DatabarExpandedStacked")]
    public void test_ExpandedStacked_zxing_29_png_DatabarExpandedStacked()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Expanded Stacked\\zxing\\29.png"), DecodeType.DATABAR_EXPANDED_STACKED);
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.ON);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(10)1098,1234", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DatabarExpandedStacked")]
    public void test_ExpandedStacked_zxing_1_png_DatabarExpandedStacked()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Expanded Stacked\\zxing\\1.png"), DecodeType.DATABAR_EXPANDED_STACKED);
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.ON);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)90012345678908(3103)012233(15)991231", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DatabarExpandedStacked")]
    public void test_ExpandedStacked_zxing_2_png_DatabarExpandedStacked()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Expanded Stacked\\zxing\\2.png"), DecodeType.DATABAR_EXPANDED_STACKED);
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.ON);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)91234567980129(3103)012233(15)991231", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DatabarExpandedStacked")]
    public void test_ExpandedStacked_zxing_3_png_DatabarExpandedStacked()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Expanded Stacked\\zxing\\3.png"), DecodeType.DATABAR_EXPANDED_STACKED);
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.ON);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)91234567980129(3102)012233(15)991231", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DatabarExpandedStacked")]
    public void test_ExpandedStacked_zxing_4_png_DatabarExpandedStacked()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Expanded Stacked\\zxing\\4.png"), DecodeType.DATABAR_EXPANDED_STACKED);
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.ON);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)91234567980129(3102)012233(15)000101", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DatabarExpandedStacked")]
    public void test_ExpandedStacked_zxing_58_png_DatabarExpandedStacked()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Expanded Stacked\\zxing\\58.png"), DecodeType.DATABAR_EXPANDED_STACKED);
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.ON);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(10)1;:/ABCDEFGHIJKLM", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DatabarExpandedStacked")]
    public void test_ExpandedStacked_zxing_17_png_DatabarExpandedStacked()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Expanded Stacked\\zxing\\17.png"), DecodeType.DATABAR_EXPANDED_STACKED);
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.ON);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)90012345678908(3932)04066USD778899", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DatabarExpandedStacked")]
    public void test_ExpandedStacked_zxing_19_png_DatabarExpandedStacked()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Expanded Stacked\\zxing\\19.png"), DecodeType.DATABAR_EXPANDED_STACKED);
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.ON);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)12345678901231(10)UNIVERSITY-OF-DEUSTO", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
