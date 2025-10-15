package com.aspose.external.barcode.tester.issues;


import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;

public class Issue33994
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33994");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }


        @BeforeMethod
    public void SetupTestFixture()
    {
        LicenseAssistant.setupLicense();
    }

        @Test
        
    public void test_Issue33994_Ecc000ascii_png_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Ecc000-ascii.png"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("ASCII encode first 128 chars.", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Issue33994_Ecc000base11_png_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Ecc000-base11.png"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("01234 56789", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Issue33994_Ecc000base27_png_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Ecc000-base27.png"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("ONLY ALPHA", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Issue33994_Ecc000base37_png_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Ecc000-base37.png"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("BASE 37 ONLY ALPHA AND DIGITS", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Issue33994_Ecc000base41_png_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Ecc000-base41.png"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("BASE-41 ONLY ALPHA, DIGITS AND PUNCTUATION.", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Issue33994_Ecc000binary_png_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Ecc000-binary.png"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Binary encodeëî", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Issue33994_Ecc050ascii_png_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Ecc050-ascii.png"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("ASCII encode first 128 chars.", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Issue33994_Ecc050base11_png_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Ecc050-base11.png"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("01234 56789", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Issue33994_Ecc050base27_png_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Ecc050-base27.png"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("ONLY ALPHA", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Issue33994_Ecc050base37_png_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Ecc050-base37.png"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("BASE 37 ONLY ALPHA AND DIGITS", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Issue33994_Ecc050base41_png_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Ecc050-base41.png"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("BASE-41 ONLY ALPHA, DIGITS AND PUNCTUATION.", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Issue33994_Ecc050binary_png_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Ecc050-binary.png"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Binary encodeëî", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Issue33994_Ecc080ascii_png_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Ecc080-ascii.png"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("ASCII encode first 128 chars.", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Issue33994_Ecc080base11_png_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Ecc080-base11.png"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("01234 56789", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Issue33994_Ecc080base27_png_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Ecc080-base27.png"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("ONLY ALPHA", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Issue33994_Ecc080base37_png_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Ecc080-base37.png"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("BASE 37 ONLY ALPHA AND DIGITS", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Issue33994_Ecc080base41_png_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Ecc080-base41.png"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("BASE-41 ONLY ALPHA, DIGITS AND PUNCTUATION.", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Issue33994_Ecc080binary_png_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Ecc080-binary.png"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Binary encodeëî", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Issue33994_Ecc100ascii_png_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Ecc100-ascii.png"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("ASCII encode first 128 chars.", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Issue33994_Ecc100base11_png_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Ecc100-base11.png"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("01234 56789", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Issue33994_Ecc100base27_png_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Ecc100-base27.png"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("ONLY ALPHA", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Issue33994_Ecc100base37_png_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Ecc100-base37.png"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("BASE 37 ONLY ALPHA AND DIGITS", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Issue33994_Ecc100base41_png_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Ecc100-base41.png"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("BASE-41 ONLY ALPHA, DIGITS AND PUNCTUATION.", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Issue33994_Ecc100binary_png_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Ecc100-binary.png"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Binary encodeëî", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Issue33994_Ecc140ascii_png_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Ecc140-ascii.png"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("ASCII encode first 128 chars.", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Issue33994_Ecc140base11_png_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Ecc140-base11.png"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("01234 56789", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Issue33994_Ecc140base27_png_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Ecc140-base27.png"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("ONLY ALPHA", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Issue33994_Ecc140base37_png_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Ecc140-base37.png"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("BASE 37 ONLY ALPHA AND DIGITS", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Issue33994_Ecc140base41_png_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Ecc140-base41.png"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("BASE-41 ONLY ALPHA, DIGITS AND PUNCTUATION.", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Issue33994_Ecc140binary_png_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Ecc140-binary.png"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Binary encodeëî", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
