package com.aspose.external.barcode.tester.releases.v75;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Issue34310
{
    final String folder = Global.getTestDataFolder("Issues");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
        //[Category("GS1QR")]
    public void test_Issue34310_GS1QR_1_png_GS1QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34310\\GS1QR_1.png"), DecodeType.GS_1_QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)90013670000396(3200)150000(11)150819", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("GS1QR")]
    public void test_Issue34310_GS1QR_2_png_GS1QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34310\\GS1QR_2.png"), DecodeType.GS_1_QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)04912345123459(15)970331(30)128(10)ABC123", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("GS1QR")]
    public void test_Issue34310_GS1QR_3_png_GS1QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34310\\GS1QR_3.png"), DecodeType.GS_1_QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)01234567890128", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("GS1QR")]
    public void test_Issue34310_GS1QR_4_png_GS1QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34310\\GS1QR_4.png"), DecodeType.GS_1_QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)01234567890128(30)123(01)01234567890128", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("GS1QR")]
    public void test_Issue34310_GS1QR_5_png_GS1QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34310\\GS1QR_5.png"), DecodeType.GS_1_QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(8200)111%2", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("GS1QR")]
    public void test_Issue34310_GS1QR_6_png_GS1QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34310\\GS1QR_6.png"), DecodeType.GS_1_QR);
        {
            String actualText = "(01)01234567890128(01)01234567890128(01)01234567890128(01)01234567890128(01)01234" +
                    "567890128(01)01234567890128(01)01234567890128(01)01234567890128(01)0123456789012" +
                    "8(01)01234567890128(01)01234567890128(01)01234567890128(01)01234567890128";
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(actualText, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("GS1QR")]
    public void test_Issue34310_percent_png_GS1QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34310\\percent.png"), DecodeType.GS_1_QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(8200)1%2%%3%%%33", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("GS1QR")]
    public void test_Issue34310_variableLenghtAi_png_GS1QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34310\\variableLenghtAi.png"), DecodeType.GS_1_QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)01234567890128(30)128(10)ABC123", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
