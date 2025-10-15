package com.aspose.external.barcode.tester.releases.v24_2;

import com.aspose.barcode.auxiliary.Global;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

public class Issue38807
{
    private final String Folder = Global.getTestDataFolder("Issues\\Issue38807");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testOnCard()
    {
        String  filename = Global.pathCombine(Folder, "220518_visual02_-05.jpg");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.RECT_MICRO_QR);
        reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);
        reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("123Abc", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void testOnCard2()
    {
        String  filename = Global.pathCombine(Folder, "220518_visual02-04.jpg");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.RECT_MICRO_QR);
        reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);
        reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("123Abc", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void testOnScreen()
    {
        String  filename = Global.pathCombine(Folder, "a0331562_12015748.jpg");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.RECT_MICRO_QR);
        reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("123Abc", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void testMultipleCodes()
    {
        String  filename = Global.pathCombine(Folder, "graph.jpg");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.RECT_MICRO_QR);
        {
            reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);
            Assert.assertEquals(12, reader.readBarCodes().length);
            Assert.assertEquals("123456789012", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012", reader.getFoundBarCodes()[1].getCodeText());
            Assert.assertEquals("12345678901234567890123456", reader.getFoundBarCodes()[2].getCodeText());
            Assert.assertEquals("123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567", reader.getFoundBarCodes()[3].getCodeText());
            Assert.assertEquals("12345678901234", reader.getFoundBarCodes()[4].getCodeText());
            Assert.assertEquals("123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678", reader.getFoundBarCodes()[5].getCodeText());
            Assert.assertEquals("12345678901234567890123456", reader.getFoundBarCodes()[6].getCodeText());
            Assert.assertEquals("12345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901", reader.getFoundBarCodes()[7].getCodeText());
            Assert.assertEquals("1234567890123456789012345678901234567890123456789012345678901234567890123456", reader.getFoundBarCodes()[8].getCodeText());
            Assert.assertEquals("1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901", reader.getFoundBarCodes()[9].getCodeText());
            Assert.assertEquals("123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890", reader.getFoundBarCodes()[10].getCodeText());
            Assert.assertEquals("1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901", reader.getFoundBarCodes()[11].getCodeText());
        }
    }

    @Test
    public void testOnProcessor()
    {
        String  filename = Global.pathCombine(Folder, "sub1-4.png");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.RECT_MICRO_QR);
        reader.setQualitySettings(QualitySettings.getHighQuality());
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("123Abc", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void testOnBox()
    {
        String  filename = Global.pathCombine(Folder, "rmqr-code_800_56.png");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.RECT_MICRO_QR);
        {
            reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);
            Assert.assertEquals(2, reader.readBarCodes().length);
            Assert.assertEquals("QR-TGR-0001", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("QR-TGR-0001", reader.getFoundBarCodes()[1].getCodeText());
        }
    }

    @Test
    public void testAds()
    {
        String  filename = Global.pathCombine(Folder, "Sign-XPAND-rMQR.png");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.RECT_MICRO_QR);
        {
            reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);
            Assert.assertEquals(5, reader.readBarCodes().length);
            Assert.assertEquals("123Abc", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("123Abc", reader.getFoundBarCodes()[1].getCodeText());
            Assert.assertEquals("123Abc", reader.getFoundBarCodes()[2].getCodeText());
            Assert.assertEquals("123Abc", reader.getFoundBarCodes()[3].getCodeText());
            Assert.assertEquals("123Abc", reader.getFoundBarCodes()[4].getCodeText());
        }
    }

    @Test
    public void testOnBatteryCut()
    {
        String  filename = Global.pathCombine(Folder, "MicroQR_FV50CE.jpg");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.MICRO_QR);
        reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);
        reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("FV50CE", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void testOnPhone()
    {
        String  filename = Global.pathCombine(Folder, "micro-qr-code_800_76.png");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.MICRO_QR);
        {
            Assert.assertEquals(2, reader.readBarCodes().length);
            Assert.assertEquals("QR-tgr-1234", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("QR-tgr-1234", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void testOnPhone2()
    {
        String  filename = Global.pathCombine(Folder, "csm_micro_qr_code_01da770cc3.png");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.MICRO_QR);
        {
            reader.getQualitySettings().setInverseImage(InverseImageMode.ENABLED);
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("0670573", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void testOnBoard()
    {
        String  filename = Global.pathCombine(Folder, "micro-qr-code-1000x1000.jpg");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.MICRO_QR);
        reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("17520034110099031000011229", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void testLogo()
    {
        String  filename = Global.pathCombine(Folder, "rMQR-code-logo.png");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.RECT_MICRO_QR);
        {
            reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);
            Assert.assertEquals(3, reader.readBarCodes().length);
            Assert.assertEquals("https://stone-program.com/", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("https://stone-program.com/", reader.getFoundBarCodes()[1].getCodeText());
            Assert.assertEquals("https://stone-program.com/", reader.getFoundBarCodes()[2].getCodeText());
        }
    }
}
