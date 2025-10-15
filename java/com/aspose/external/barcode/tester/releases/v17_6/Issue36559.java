package com.aspose.external.barcode.tester.releases.v17_6;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.MultyDecodeType;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;

public class Issue36559
{
    /**
     * Path to folder with files for testing Issue36559
     */
    private String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue36559");

    /**
     * Prepares to run these tests
     */
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test_GenerateEAN13AndRecognizeUPCA()
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.EAN_13, "688984209538");
        BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.UPCA);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("6889842095382", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.EAN_13, reader.getFoundBarCodes()[0].getCodeType());
        }
    }

        @Test
        //[Category("EAN13")]
        //[Category("AllSupportedTypes")]
    public void test_RecognizeAllSupportedTypes()
    {
        String fileName = Global.pathCombine(folder, "ean13.png");
        BarCodeReader reader = new BarCodeReader(fileName);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("6889842095382", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.EAN_13, reader.getFoundBarCodes()[0].getCodeType());
        }
    }

        @Test
        //[Category("UPCA")]
    public void test_RecognizeUPCA()
    {
        String fileName = Global.pathCombine(folder, "ean13.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.UPCA);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("6889842095382", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals(DecodeType.EAN_13, reader.getFoundBarCodes()[0].getCodeType());
    }

        @Test
        //[Category("UPCA")]
    public void test_RecognizeCorrectUPCA()
    {
        String fileName = Global.pathCombine(folder, "upca.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.UPCA);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("088984209534", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.UPCA, reader.getFoundBarCodes()[0].getCodeType());
        }
    }

        @Test
        //[Category("EAN13")]
    public void test_RecognizeEAN13()
    {
        String fileName = Global.pathCombine(folder, "ean13.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.EAN_13);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("6889842095382", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.EAN_13, reader.getFoundBarCodes()[0].getCodeType());
        }
    }

        @Test
        //[Category("EAN13")]
    public void test_RecognizeUPCAasENA13()
    {
        String fileName = Global.pathCombine(folder, "upca.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.EAN_13);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("0088984209534", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.EAN_13, reader.getFoundBarCodes()[0].getCodeType());
        }
    }

        @Test
        //[Category("EAN13")]
        //[Category("UPCA")]
    public void test_RecognizeUPCAandENA13()
    {
        String fileName = Global.pathCombine(folder, "upca.png");
        BarCodeReader reader = new BarCodeReader(fileName, new MultyDecodeType(DecodeType.EAN_13, DecodeType.UPCA));
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("088984209534", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.UPCA, reader.getFoundBarCodes()[0].getCodeType());
        }
    }

        @Test
        //[Category("EAN13")]
        //[Category("UPCA")]
        //[Category("AllSupportedTypes")]
    public void test_RecognizeUPCApictureAllSupportedTypes()
    {
        String fileName = Global.pathCombine(folder, "upca.png");
        BarCodeReader reader = new BarCodeReader(fileName);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("088984209534", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.UPCA, reader.getFoundBarCodes()[0].getCodeType());
        }
    }
}
