package com.aspose.external.barcode.tester.releases.v23_8;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarcodeQualityMode;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.DeconvolutionMode;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

public class Issue38591
{
    private static final String Folder = Global.getTestDataFolder("Issues\\Issue38591");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testDrilledOnMetal()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "drilled.png"), DecodeType.DATA_MATRIX);
        {
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
            reader.getQualitySettings().setDeconvolution(DeconvolutionMode.SLOW);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("[)>DDMFR KA435PNO 93876SER 876107", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void testDrilledOnMetal2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "drilled2.jpg"), DecodeType.DATA_MATRIX);
        {
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("[)>12SER 123456", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void testDrilledOnMetal3()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "drilled3.png"), DecodeType.DATA_MATRIX);
        {
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("[) DD CAG 3FMJ4 SER 19-5002", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void testPrinted()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "printed.png"), DecodeType.DATA_MATRIX);
        {
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("\rhttp://themediaguru.blogspot.com", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void testPrintedWithWideSpaces()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "printed_wide_spaces.png"), DecodeType.DATA_MATRIX);
        {
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("ABCabc", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void testGray()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "gray.jpg"), DecodeType.DATA_MATRIX);
        {
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("TupGun", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void testRotated()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "rotated.png"), DecodeType.DATA_MATRIX);
        {
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("\rhttp://themediaguru.blogspot.com", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void testRotated2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "rotated2.png"), DecodeType.DATA_MATRIX);
        {
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("\rhttp://themediaguru.blogspot.com", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test3dDistortion()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "3dDistortion.png"), DecodeType.DATA_MATRIX);
        {
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("\rhttp://themediaguru.blogspot.com", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}