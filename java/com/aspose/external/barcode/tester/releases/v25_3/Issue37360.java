package com.aspose.external.barcode.tester.releases.v25_3;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.QualitySettings;
import com.aspose.barcode.licensing.LicenseType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test
public class Issue37360
{
    final String _folder = Global.getTestDataFolder("Issues/Issue37360");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense(LicenseType.Total);
    }

    @Test
    public void test_FromCloud0()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-11AD9BD73A20695B18F505B7DF23209E.png"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(reader.getFoundBarCodes()[0].getCodeText(), "22");
        }
    }

    @Test
    public void test_FromCloud1()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-1362F7D1C248D0ADFEA43B883B0BF640.png"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(reader.getFoundBarCodes()[0].getCodeText(), "8379");
        }
    }

    @Test
    public void test_FromCloud2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-168BEC2807C34988988FD0E4CE494148.png"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(reader.getFoundBarCodes()[0].getCodeText(), "1825");
        }
    }

    @Test
    public void test_FromCloud3()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-2615077B88E54D82BFF7F2FC69EA17C6.png"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(reader.getFoundBarCodes()[0].getCodeText(), "8379");
        }
    }

    @Test
    public void test_FromCloud4()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-262DE209078EAE247282DD61719DE6C5.png"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(reader.getFoundBarCodes()[0].getCodeText(), "32518");
        }
    }

    @Test
    public void test_FromCloud5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-3136AEF18EFDA009F4F157502E3013B6.png"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(reader.getFoundBarCodes()[0].getCodeText(), "10583");
        }
    }

    @Test
    public void test_FromCloud6()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-3A5F14E9104BA6CEE75652E504CE97EF.png"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(reader.getFoundBarCodes()[0].getCodeText(), "1825");
        }
    }

    @Test
    public void test_FromCloud7()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-3CCCBC4844AF880FDD561E43723AF298.png"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("156", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud8()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-48D74D5BB57B56432B50874B5E5B6F42.png"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("151", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud9()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-49928822610FF1BA6740CFBD9B46CE66.png"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("97643", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud10()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-4E0C542845ACCD3A2D22344DEC75984C.png"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1825", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud11()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-747BC61D94D4B7B73C94D89B751590DF.png"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("153", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud12()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-85B8C2073300ECCDB47F6E836056DBF1.png"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1244", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud13()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-87ABFE1B9E31F497F3685FA12BE4F24C.png"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("8380", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud14()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-8D8BEB9EBFEDCD7F4B0A5F30EDA5EA0F.png"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("64", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud15()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-99D801B588DBD30C44AB0A270C46544A.png"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("406", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud16()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-9F0B2145D6B92362D8DC96A1FF844D60.png"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("3861", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud17()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-9FB9DFBC9B29D1A93A6727C80888CA30.png"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("8380", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud18()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-A4A176CA430F6455C9B6D43C69FB2CD2.png"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("10570", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud19()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-B243CBC18EAD7D0C9E02DC13F88E63C3.png"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("3414", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud20()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-B91AEAE1D64A519F2E4B74E536E1D614.png"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("21", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud21()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-C11852403AFDF17F2DDCEED24B48698F.png"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("2886", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud22()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-CA598A53AC44E9C20AE3C1E31CA6964B.png"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("131070", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud23()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-CB6D18E38422B1FC0BD638385BB887A9.png"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1825", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud24()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-D7BF0AA7882D38E89BBFC8169C8699B2.png"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("4112", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud25()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-D91AE9492BE3499AC46B48029B9E15EF.png"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("2886", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud26()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-DC1D4BFC54A2BA650F61DDB26FC8E955.png"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("4095", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud27()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-EF3F1BD0A2D1233476080FB4C6F6CCA7.png"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("121", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud28()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-F4E8D6CFA9817D928D6F4E39F13121B6.png"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("4095", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud29()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-FEA672805217F666B5675C18E442B9DE.png"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("98941", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud30()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q3-699A18000C0002E8037BF11CDBC84E31.png"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1156", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud31()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q3-C44B85F84EF7F6779209FD2928584DB1.png"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1156", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud32()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "0-pharmacode-q2-1F80D975244078749CAEA95C1CAAB81A.jpeg"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("103", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud33()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "0-pharmacode-q2-3CAA80966184DA40E31D4368365569D3.jpeg"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("875", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud34()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "0-pharmacode-q2-53E840817D052C281095325071F95A70.jpeg"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("16", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud35()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "0-pharmacode-q2-6E7D73160EDA7249D343D4C05785B302.jpeg"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("7621", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud36()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "0-pharmacode-q2-950DCFA9D538D3A809031C9AA221BC00.jpeg"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("86", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud37()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "0-pharmacode-q2-9E412D0D124E95822608A28835EC4768.jpeg"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("103", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud38()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "0-pharmacode-q2-B01496A98C355D560031F0D0A0045102.jpeg"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("121", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud39()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "0-pharmacode-q2-BFCA57E9D5B2A572100CA83C0AD2BDFA.jpeg"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("855", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud40()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "0-pharmacode-q3-19B2AD3166633FA875EF64730AE97DA8.jpeg"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("855", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud41()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-016B25FE3F01C6317B3C71779F73CFA0.jpeg"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("7621", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud42()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-07B442B70CE828B701263D43B05AB6B9.jpeg"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("870", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud43()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-087A10A95AA97B78845081FA72C990FF.jpeg"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("121", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud44()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-1778F966927C42E26BE246FD9D521AC2.jpeg"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("110051", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud45()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-1F7F0F9686733BAFAE42D9C28B912C0C.jpeg"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1033", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud46()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-28300409E38D971796A394DB97ED26B0.jpeg"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("110051", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud47()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-2BE045DB604737C556B5D6FB61955AFB.jpeg"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1033", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud48()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-2E40C80F2D79EE1402748027FB59FE87.jpeg"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("11297", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud49()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-32FF0A5B95CAF12992F8A7E2269749B5.jpeg"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1989", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud50()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-3EEFB5924F50CA9B8C34E6DF34D2FFF5.jpeg"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("6753", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud51()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-4116A5330EB2F12DF6A386C64AE0FDAF.jpeg"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1521", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud52()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-412D2CF0705963B0AB32BD1F66FD4778.jpeg"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("110051", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud53()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-44FE02BA2F62DDB517E802D3A3ECBBFB.jpeg"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("2234", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud54()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-4642A2D1D022355E082D2A1122663F40.jpeg"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1944", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud55()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-4835EBDEB0EAEB3C6A202A368F764F05.jpeg"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1175", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud56()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-4E964A82B780831EB7C782C177B5C4FB.jpeg"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("5373", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud57()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-502F62071E03387AA7D53BF68EDF6F6D.jpeg"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1771", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud58()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-5A29183DF1DE693205E7E64DC31C53D1.jpeg"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("11307", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud59()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-63D3B802EB21C73E81158CCE7F3420E5.jpeg"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("45", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud60()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-6CAA0CA27D9305653F25422983D133F8.jpeg"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("6753", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud61()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-788A7AB119E45EC3F629C324E2E3E559.jpeg"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("3307", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud62()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-798A2159C64DF1DC225463923A2798AB.jpeg"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("7557", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud63()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-7D328803C40D5C1155CB58B98354D4B7.jpeg"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("72", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud64()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-8346742363EF2A60660DB9DD68795781.jpeg"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("121", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud65()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-84F08BA81F9D0B5647101C49D8299FCA.jpeg"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("3307", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud66()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-8960FF234A8071E4336521A582E0F46E.jpeg"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("22123", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud67()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-8CD9A90B949199F7FE62A59BF8657AA3.jpeg"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1391", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud68()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-8F1F6004315F25ED03C74017370F27D9.jpeg"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("13573", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud69()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-904555A7EAD069505F028ACA368B8B17.jpeg"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("11479", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud70()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-938A3DB025C0180F4BA500E3C940FF26.jpeg"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("13957", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud71()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-950995D29A21006BA1CEEA9FFE4FB0E2.jpeg"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1807", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud72()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-96CAA10DC7690ED5C20F4332476148D6.jpeg"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("53671", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud73()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-972F60A35EE898E3DE4EB4C2DFC14544.jpeg"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("110169", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud74()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-99F5D475419E939780107B5AAD19E267.jpeg"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("110051", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud75()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-9EB8F5F0D912F7B6384F3CE444CE9BE6.jpeg"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("3414", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud76()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-A0F59BCF79009BB7572068D6FD201D1C.jpeg"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("5658", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud77()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-A10B8DFE496832E7CA8EA259C1C65F24.jpeg"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("462", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud78()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-A468B80F5DC740734CC90122A53558C3.jpeg"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("564", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud79()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-A61EF7C33247FB8B1A03B81CED97395C.jpeg"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1991", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud80()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-AE2058EEF308848F09D57546167E0BCB.jpeg"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("972", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud81()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-BF4A2CA76398E40864ACEF45072712A0.jpeg"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("441", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud82()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-C18FF32EF9A9C83DE946A035B5C767D7.jpeg"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("75700", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud83()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-C20312F9B3E00281927A1D9886A300F1.jpeg"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1771", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud84()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-C37056DB96978224DE9EE4CC29E47F07.jpeg"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("9061", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud85()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-C6B631AAB0CE602962A49D6696F99677.jpeg"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("11297", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud86()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-D0C364696C3882FDD95C92F50332056E.jpeg"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("75700", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud87()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-D966F0E693FB94C4963600A09604BBD9.jpeg"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("10373", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud88()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-D983F8AF648B0036F7F5157D76C8930B.jpeg"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("9061", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud89()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-DB71A2D0325E0B3B1CAEDF94DBD850D0.jpeg"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("115", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud90()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-DB7358775B18E6048CFF115702221A55.jpeg"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("13573", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud91()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-E689244154636BA6515A749114FB20A9.jpeg"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("664", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud92()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-E87902A73DBA6F861E92750D10B0DC9E.jpeg"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1992", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud93()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-F0A4D5DF32AB7A1EF5282EC5B358B62E.jpeg"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("2234", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud94()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-F1AE5A6AAE842935FA88CFAFC2438972.jpeg"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("3861", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud95()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-F2127CB2F7D24BD37D728329E27F3E31.jpeg"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("110051", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud96()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-F38E02385BE226B929BF3B38D74197C6.jpeg"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1244", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud97()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q2-F7B4B2A364646C5FDAFBCD849A6B2D0A.jpeg"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("45", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud98()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q3-427E1AB7147B86B7BCCBBFC1C3AF76B3.jpeg"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("855", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud99()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-pharmacode-q3-660FCC703D4288F53BEE4E5DCFDC81C1.jpeg"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("242", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud100()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "2-pharmacode-q2-AC333046591BC616C01F2C5A62AE315A.jpeg"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12091", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud101()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "2-pharmacode-q2-E3C7058DB5EB651427F078C496F1894B.jpeg"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 2);
            Assert.assertEquals("35524", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("35524", reader.getFoundBarCodes()[1].getCodeText());
        }
    }

    @Test
    public void test_FromCloud102()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "3-pharmacode-q2-E558C930F2E3E3AE442DD073712E78EF.jpeg"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12091", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
