package com.aspose.external.barcode.tester.recognition;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RecognitionDataMatrixNewAlgorithmTestSingleImages
{

    private String _folder;

        @BeforeMethod
    public void SetupTestFixture()
    {
        this._folder = Global.getTestDataFolder("Builder\\DataMatrix");
        com.aspose.barcode.LicenseAssistant.setupLicense();
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_Simple_Auto_10x10x3_jpg_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Simple_Auto_10x10x3.jpg"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("abc", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_Simple_Auto_12x12x5_jpg_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Simple_Auto_12x12x5.jpg"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("abcde", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_Simple_Auto_14x14x8_jpg_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Simple_Auto_14x14x8.jpg"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("abcdefgh", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_Simple_Auto_16x16x12_jpg_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Simple_Auto_16x16x12.jpg"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("abcdefghijkl", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_Simple_Auto_18x18x18_jpg_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Simple_Auto_18x18x18.jpg"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("abcdefghijklmnopqr", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_Simple_Auto_20x20x22_jpg_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Simple_Auto_20x20x22.jpg"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("abcdefghijklmnopqrstuv", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_Simple_Auto_22x22x30_jpg_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Simple_Auto_22x22x30.jpg"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("abcdefghijklmnopqrstuvwxyzabcd", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_Simple_Auto_24x24x36_jpg_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Simple_Auto_24x24x36.jpg"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("abcdefghijklmnopqrstuvwxyzabcdefghij", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_Simple_Auto_26x26x44_jpg_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Simple_Auto_26x26x44.jpg"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqr", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_Simple_Auto_32x32x62_jpg_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Simple_Auto_32x32x62.jpg"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghij", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_Simple_Auto_36x36x86_jpg_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Simple_Auto_36x36x86.jpg"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabc" +
                    "defgh", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_Simple_Auto_40x40x114_jpg_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Simple_Auto_40x40x114.jpg"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabc" +
                    "defghijklmnopqrstuvwxyzabcdefghij", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_Simple_Auto_44x44x144_jpg_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Simple_Auto_44x44x144.jpg"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabc" +
                    "defghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmn", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_Simple_Auto_48x48x174_jpg_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Simple_Auto_48x48x174.jpg"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabc" +
                    "defghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcde" +
                    "fghijklmnopqr", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_Simple_Auto_52x52x204_jpg_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Simple_Auto_52x52x204.jpg"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabc" +
                    "defghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcde" +
                    "fghijklmnopqrstuvwxyzabcdefghijklmnopqrstuv", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_Simple_Auto_64x64x280_jpg_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Simple_Auto_64x64x280.jpg"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrst", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_Simple_Auto_72x72x368_jpg_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Simple_Auto_72x72x368.jpg"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcd", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_Simple_Auto_80x80x456_jpg_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Simple_Auto_80x80x456.jpg"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmn", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_Simple_Auto_88x88x576_jpg_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Simple_Auto_88x88x576.jpg"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcd", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_Simple_Auto_96x96x696_jpg_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Simple_Auto_96x96x696.jpg"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrst", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_Simple_Auto_104x104x816_jpg_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Simple_Auto_104x104x816.jpg"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghij", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_Simple_Auto_120x120x1050_jpg_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Simple_Auto_120x120x1050.jpg"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghij", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_Simple_Auto_132x132x1304_jpg_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Simple_Auto_132x132x1304.jpg"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcd", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_Simple_Auto_144x144x1558_jpg_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Simple_Auto_144x144x1558.jpg"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabc" +
                    "defghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcde" +
                    "fghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefg" +
                    "hijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghi" +
                    "jklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijk" +
                    "lmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklm" +
                    "nopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmno" +
                    "pqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopq" +
                    "rstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrs" +
                    "tuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstu" +
                    "vwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvw" +
                    "xyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxy" +
                    "zabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyza" +
                    "bcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabc" +
                    "defghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcde" +
                    "fghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefg" +
                    "hijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghi" +
                    "jklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijk" +
                    "lmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklm" +
                    "nopqrstuvwxyzabcdefghijklmnopqrstuvwx", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_Simple_Auto_10x10x6_jpg_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Simple_Auto_10x10x6.jpg"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123456", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_Simple_Auto_12x12x10_jpg_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Simple_Auto_12x12x10.jpg"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1234567890", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_Simple_Rect_Auto_16x36x10_jpg_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Simple_Rect_Auto_16x36x10.jpg"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1234567890", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_Simple_Auto_144x144x3116_Numeric_jpg_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Simple_Auto_144x144x3116_Numeric.jpg"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("012345678901234567890123456789012345678901234567890123456789012345678901234567890" +
                    "12345678901234567890123456789012345678901234567890123456789012345678901234567890" +
                    "12345678901234567890123456789012345678901234567890123456789012345678901234567890" +
                    "12345678901234567890123456789012345678901234567890123456789012345678901234567890" +
                    "12345678901234567890123456789012345678901234567890123456789012345678901234567890" +
                    "12345678901234567890123456789012345678901234567890123456789012345678901234567890" +
                    "12345678901234567890123456789012345678901234567890123456789012345678901234567890" +
                    "12345678901234567890123456789012345678901234567890123456789012345678901234567890" +
                    "12345678901234567890123456789012345678901234567890123456789012345678901234567890" +
                    "12345678901234567890123456789012345678901234567890123456789012345678901234567890" +
                    "12345678901234567890123456789012345678901234567890123456789012345678901234567890" +
                    "12345678901234567890123456789012345678901234567890123456789012345678901234567890" +
                    "12345678901234567890123456789012345678901234567890123456789012345678901234567890" +
                    "12345678901234567890123456789012345678901234567890123456789012345678901234567890" +
                    "12345678901234567890123456789012345678901234567890123456789012345678901234567890" +
                    "12345678901234567890123456789012345678901234567890123456789012345678901234567890" +
                    "12345678901234567890123456789012345678901234567890123456789012345678901234567890" +
                    "12345678901234567890123456789012345678901234567890123456789012345678901234567890" +
                    "12345678901234567890123456789012345678901234567890123456789012345678901234567890" +
                    "12345678901234567890123456789012345678901234567890123456789012345678901234567890" +
                    "12345678901234567890123456789012345678901234567890123456789012345678901234567890" +
                    "12345678901234567890123456789012345678901234567890123456789012345678901234567890" +
                    "12345678901234567890123456789012345678901234567890123456789012345678901234567890" +
                    "12345678901234567890123456789012345678901234567890123456789012345678901234567890" +
                    "12345678901234567890123456789012345678901234567890123456789012345678901234567890" +
                    "12345678901234567890123456789012345678901234567890123456789012345678901234567890" +
                    "12345678901234567890123456789012345678901234567890123456789012345678901234567890" +
                    "12345678901234567890123456789012345678901234567890123456789012345678901234567890" +
                    "12345678901234567890123456789012345678901234567890123456789012345678901234567890" +
                    "12345678901234567890123456789012345678901234567890123456789012345678901234567890" +
                    "12345678901234567890123456789012345678901234567890123456789012345678901234567890" +
                    "12345678901234567890123456789012345678901234567890123456789012345678901234567890" +
                    "12345678901234567890123456789012345678901234567890123456789012345678901234567890" +
                    "12345678901234567890123456789012345678901234567890123456789012345678901234567890" +
                    "12345678901234567890123456789012345678901234567890123456789012345678901234567890" +
                    "12345678901234567890123456789012345678901234567890123456789012345678901234567890" +
                    "12345678901234567890123456789012345678901234567890123456789012345678901234567890" +
                    "12345678901234567890123456789012345678901234567890123456789012345678901234567890" +
                    "123456789012345678901234567890123456789012345678901234567890123456789012345", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_Simple_Rect_Auto_16x36x64_Numeric_jpg_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Simple_Rect_Auto_16x36x64_Numeric.jpg"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("0123456789012345678901234567890123456789012345678901234567890123", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
