package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

public class Issue36219
{
    private final String folder = Global.getTestDataFolder("Issues");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

        @Test
        //[Category("Aztec")]
    public void test_Issue36219_aztecbarcode6_jpg_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36219\\aztec-barcode-6.jpg"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("4565345456545456", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Aztec")]
    public void test_Issue36219_aztecbarcode6X_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36219\\aztec-barcode-6X.png"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("4565345456545456", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Aztec")]
    public void test_Issue36219_aztecbarcode7_jpg_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36219\\aztec-barcode-7.jpg"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("4565345456545456", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Aztec")]
    public void test_Issue36219_aztecfont_jpg_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36219\\aztec-font.jpg"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("4565345456545456", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Aztec")]
    public void test_Issue36219_aztecslid2_jpg_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36219\\aztec-slid-2.jpg"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("4565345456", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
