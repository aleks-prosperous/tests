package com.aspose.external.barcode.tester.releases.v24_8;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarcodeQualityMode;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.DeconvolutionMode;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

public class Issue37127
{
    private final static String Folder = Global.getTestDataFolder("Issues/Issue37127");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test_DamagedTarget1()
    {
        String fileName = Global.pathCombine(Folder, "1.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("01,01,3200204130,09264957,34192.04,20210220,,5878,", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_DamagedTarget2()
    {
        String fileName = Global.pathCombine(Folder, "2.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        reader.getQualitySettings().setDeconvolution(DeconvolutionMode.SLOW);
        reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("01,01,3502204130,00381906,65800.00,20210305,,7152,", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_DamagedTarget5()
    {
        String fileName = Global.pathCombine(Folder, "5.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        reader.getQualitySettings().setDeconvolution(DeconvolutionMode.SLOW);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("01,01,3502204130,06658243,93267.92,20210312,,7130,", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_DamagedTarget7()
    {
        String fileName = Global.pathCombine(Folder, "7.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        reader.getQualitySettings().setDeconvolution(DeconvolutionMode.SLOW);
        reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("01,01,1100203130,22342727,64712.40,20210312,,542A,", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_DamagedTarget9()
    {
        String fileName = Global.pathCombine(Folder, "9.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        reader.getQualitySettings().setDeconvolution(DeconvolutionMode.SLOW);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("01,01,1100203130,22342744,34228.00,20210315,,9CED,", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_DamagedTarget11()
    {
        String fileName = Global.pathCombine(Folder, "11.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        reader.getQualitySettings().setDeconvolution(DeconvolutionMode.SLOW);
        reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("01,01,3100203130,50056051,11884.07,20210316,,6109,", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_DamagedTarget12()
    {
        String fileName = Global.pathCombine(Folder, "12.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("01,01,3100203130,07767445,942452.83,20210128,F74D,\0", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_DamagedTarget13()
    {
        String fileName = Global.pathCombine(Folder, "13.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            reader.getQualitySettings().setDeconvolution(DeconvolutionMode.SLOW);
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("01,01,3502204130,03781750,1080.00,20210317,,A956,", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_DamagedTarget14()
    {
        String fileName = Global.pathCombine(Folder, "14.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("01,01,3502204130,03781761,5450.00,20210317,,3C30,", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_DamagedTarget15()
    {
        String fileName = Global.pathCombine(Folder, "15.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        reader.getQualitySettings().setDeconvolution(DeconvolutionMode.SLOW);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("01,01,2100194160,02234312,11193.12,20210322,,9EE1,", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_DamagedTarget16()
    {
        String fileName = Global.pathCombine(Folder, "16.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        reader.getQualitySettings().setDeconvolution(DeconvolutionMode.SLOW);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("01,01,4400203130,32033889,66810.35,20210402,,103C,", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_DamagedTarget17()
    {
        String fileName = Global.pathCombine(Folder, "17.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        reader.getQualitySettings().setDeconvolution(DeconvolutionMode.SLOW);
        reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("01,01,1100203130,22342732,90459.25,20210315,,1F66,", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_DamagedTarget18()
    {
        String fileName = Global.pathCombine(Folder, "18.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("01,01,3100204130,06039254,5015.00,20210315,,D2,", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_DamagedTarget4()
    {
        String fileName = Global.pathCombine(Folder, "4.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            reader.getQualitySettings().setDeconvolution(DeconvolutionMode.SLOW);
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("01,01,3502202130,04884183,84905.66,20210203,,4DC1,", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_LowQuality()
    {
        String fileName = Global.pathCombine(Folder, "1_extr.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("AaBbCc", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_NoisedBigImage()
    {
        String fileName = Global.pathCombine(Folder, "DOC220518-20220518151429_2022-05-18_15-17-58-83_2.bmp");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("SPC\n0200\n1\nCH0531000014863101001\nK\nkehrer stebler ag\nSüdringstrasse 6\n4702 Oensingen\n\n\nCH\n\n\n\n\n\n\n\n29.10\nCHF\nK\nSecusuisse AG\nSihlhallenstrasse 19\n8004 Zürich\n\n\nCH\nQRR\n000000000000000000060242687\n\nEPD\n//S1/10/6024268/11/220517/31/220517/32/7.7:27/40/0:30", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_German_1_1()
    {
        String fileName = Global.pathCombine(Folder, "german1_1.bmp");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("Dein QR Code", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_German_1_11()
    {
        String fileName = Global.pathCombine(Folder, "german1_11.bmp");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("Dein QR Code", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_German_1_14()
    {
        String fileName = Global.pathCombine(Folder, "german1_14.bmp");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("Dein QR Code", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_German_1_19()
    {
        String fileName = Global.pathCombine(Folder, "german1_19.bmp");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("Dein QR Code", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_German_2_1()
    {
        String fileName = Global.pathCombine(Folder, "german2_1.bmp");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("Dein QR Code", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_German_2_12()
    {
        String fileName = Global.pathCombine(Folder, "german2_12.bmp");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("Dein QR Code", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_German_2_5()
    {
        String fileName = Global.pathCombine(Folder, "german2_5.bmp");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("Dein QR Code", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_German_2_6()
    {
        String fileName = Global.pathCombine(Folder, "german2_6.bmp");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("Dein QR Code", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_German_2_8()
    {
        String fileName = Global.pathCombine(Folder, "german2_8.bmp");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("Dein QR Code", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_Instagram()
    {
        String fileName = Global.pathCombine(Folder, "instagram.bmp");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("https://instagram.com/p/ChppotXv2UA/?utm_source=qr", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
