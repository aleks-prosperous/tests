package com.aspose.external.barcode.tester.releases.v25_1;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.QualitySettings;
import com.aspose.barcode.licensing.LicenseType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Issue39163
{

    private String _folder;

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense(LicenseType.Total);
        this._folder = Global.getTestDataFolder("Issues/Issue39163");
    }

    @Test
        // [Category("Code16K")]
    public void test_FromCloud1()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-code16k-2AFDF1B3C0BB7CF862303BFCCA4C9498.jpeg"), DecodeType.CODE_16_K);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("W3AR3ALLD00M3DF0R61V3U5F0RW3HAV351NN3D", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
        // [Category("Code16K")]
    public void test_FromCloud2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-code16k-4DF0131FF840B1CFEF8CC2EAE8E3E398.png"), DecodeType.CODE_16_K);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("po com queijo", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
        // [Category("Code16K")]
    public void test_FromCloud3()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-code16k-6CC38B4C40373D6B62022BB166E1F82E.png"), DecodeType.CODE_16_K);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("JSFTWH7YB5Y3RIFG", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
        // [Category("Code16K")]
    public void test_FromCloud4()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-code16k-80BDC7E382CB5891F651BF0903CD7D4C.png"), DecodeType.CODE_16_K);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1234567890abcdefghijklmnopqrstuvwxyz", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
        // [Category("Code16K")]
    public void test_FromCloud5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-code16k-87DD2904F89C732A1C34CF5BEC60FF39.jpeg"), DecodeType.CODE_16_K);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("5523.12 71.91 -1320.00", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
        // [Category("Code16K")]
    public void test_FromCloud6()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-code16k-604DAB921B47313C19A7AE78FD815E42.png"), DecodeType.CODE_16_K);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("W3AR3ALLD00M3DF0R61V3U5F0RW3HAV351NN3D", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
        // [Category("Code16K")]
    public void test_FromCloud7()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-code16k-15506C147EFCEB261D778B919EBF51C8.jpeg"), DecodeType.CODE_16_K);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("W3AR3ALLD00M3DF0R61V3U5F0RW3HAV351NN3D", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
        // [Category("Code16K")]
    public void test_FromCloud8()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-code16k-A3AF2C7989162AFCF6606BA4C7BB3A21.png"), DecodeType.CODE_16_K);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("W3AR3ALLD00M3DF0R61V3U5F0RW3HAV351NN3D", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
        // [Category("Code16K")]
    public void test_FromCloud9()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-code16k-C465D2190A6A2155A83922940F76C030.png"), DecodeType.CODE_16_K);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("W3AR3ALLD00M3DF0R61V3U5F0RW3HAV351NN3D", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
        // [Category("Code16K")]
    public void test_FromCloud10()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-code16k-C06280854CFBB6A3C75008B757ECC3E9.png"), DecodeType.CODE_16_K);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Life @ Earth", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
    @Test
        // [Category("Code16K")]
    public void test_FromCloud11()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-code16k-CA8F27FFEDF95AB054D276E4AFD3B6D5.png"), DecodeType.CODE_16_K);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("p. diddy abriu meu cu niggerr", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
        // [Category("Code16K")]
    public void test_FromCloud12()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-code16k-CB6EFF3CBE266FCCA7BAF19A8AD0A9E4.png"), DecodeType.CODE_16_K);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("p. diddy abriu meu cu niggerr", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
        // [Category("Code16K")]
    public void test_FromCloud13()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-code16k-DF0DBB06B8791F5335F388673DFE7A3C.png"), DecodeType.CODE_16_K);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1234567890abcdefghijklmnopqrstuvwxyz", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
        // [Category("Code16K")]
    public void test_FromCloud14()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-code16k-E77B29E8F84AF91FF0C7BF174DFB8CAB.png"), DecodeType.CODE_16_K);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("consa macaco", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
        // [Category("Code16K")]
    public void test_FromCloud15()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-code16k-EB72F7136DFB7F958C66AE9AB9B3EB3A.png"), DecodeType.CODE_16_K);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("5523.12 \r\n71.91 \r\n-1320.00", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
        // [Category("Code16K")]
    public void test_FromCloud16()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-code16k-F9161902C0283A09A303A20DBB8A89E4.png"), DecodeType.CODE_16_K);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("if you made it this far, you were wasting your time.", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
        // [Category("Code16K")]
    public void test_FromCloud17()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "2-code16k-4FBBE4A6CBCDD245B09D8CEB80EB9450.png"), DecodeType.CODE_16_K);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 2);
            Assert.assertEquals("<FNC2>GP Sucks, Never wanna see that stupid crap ever again in my life. Made me de", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("pressed and I am no longer optimistic.", reader.getFoundBarCodes()[1].getCodeText());
        }
    }
}
