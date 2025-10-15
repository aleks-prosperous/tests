package com.aspose.external.barcode.tester.releases.v23_6;

import com.aspose.barcode.auxiliary.Global;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

public class Issue36989
{
    static final String Folder = Global.getTestDataFolder("Issues\\Issue36989");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test1()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "0110_001_R1_2022-08-03_11-56-30-5560_cropped.jpg"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("[)>\u001e06\u001d12PGTL3\u001d9K12\u001d6JUN449113031000007248\u001d14D\u001d16D\u001dP8613013591\u001d2P10\u001d1T2200004739\u001dQ448\u001d3QEA\u001dK55179602\u001d4K001\u001d2S22200203\u001d15K\u001dV097201178\u001d13V449113031\u001d7Q167.70\u001d2K22200203\u001d23P\u001d30P\u001d12V\u001d1P\u001d33TN\u001e\u0004", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void testWideInverted()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "145829207-e3a9baf6-d04a-411b-87f7-628297243a02.png"), DecodeType.DATA_MATRIX);
        {
            reader.getQualitySettings().setInverseImage(InverseImageMode.ENABLED);
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("65359403095957", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void testWide1()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "20200819202632-BookletID-R3-FAIL.png"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("JGB 912101245300109153S941AA1A 0             0190010000915205", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void testWide2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "20200819202658-BookletID-R3-FAIL.png"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("JGB 912101245300109210S941AA1A 0             0190010000920983", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void testWide3()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "20200819202703-BookletID-R3-FAIL.png"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("JGB 912101245300106899S941AA1A 0             0190010000689824", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void testWide4()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "20200819202741-BookletID-R3-FAIL.png"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("JGB 912101245300106946S941AA1A 0             0190010000694592", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void testWide5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "20200819202745-BookletID-R3-FAIL.png"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("JGB 912101245300106937S941AA1A 0             0190010000693663", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void testWide6()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "20200819202758-BookletID-R3-FAIL.png"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("JGB 912101245300109226S941AA1A 0             0190010000922542", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void testWide7()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "20200819202802-BookletID-R3-FAIL.png"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("JGB 912101245300106898S941AA1A 0             0190010000689723", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void testWide8()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "20200819202822-BookletID-R3-FAIL.png"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("JGB 912101245300106860S941AA1A 0             0190010000685902", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void testWide9()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "20200819202840-BookletID-R3-FAIL.png"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("JGB 912101245300109332S941AA1A 0             0190010000933195", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void testWide10()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "20200819202900-BookletID-R3-FAIL.png"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("JGB 912101245300109211S941AA1A 0             0190010000921007", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void testWide11()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "20200819202904-BookletID-R3-FAIL.png"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("JGB 912101245300106862S941AA1A 0             0190010000686124", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void testWithSmallSpaces1()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "flipped Data matrix bar code_cr.png"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("5700060479", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void testWithSmallSpaces2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "barcode_issue.bmp"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("OB2665550209870101T01O 1317902110", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void testWithSmallSpaces3()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "barcode_issue_rotated.bmp"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("OB2665550209870101T01O 1317902110", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void testGenerated()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "generated 5700060479.png"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("5700060479", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void testPage1Tiff()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "Page1.tif"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("HMRM20597432", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void testPage2Tiff()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "Page2.tif"), DecodeType.DATA_MATRIX);
        {
            reader.getQualitySettings().setDeconvolution(DeconvolutionMode.SLOW);
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("HMRM20599347", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void testWithBrokenPattern()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "broken_pattern.jpg"), DecodeType.DATA_MATRIX);
        {
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("Y:2019", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
