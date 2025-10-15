package com.aspose.external.barcode.tester.releases.v25_4;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.QualitySettings;
import com.aspose.barcode.licensing.LicenseType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Issue37357
{
    final String _folder = Global.getTestDataFolder("Issues/Issue37357");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense(LicenseType.Total);
    }

    @Test
    public void test_FromCloud1()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "0-databar-q2-2589298BFA9587E915960FB3D08DA631.png"), DecodeType.DATABAR_EXPANDED_STACKED);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)94605025037605(3103)001671(17)270324", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "0-databar-q2-57569C9D7A99DFDE4B4AA0BD74237A2D.png"), DecodeType.DATABAR_EXPANDED_STACKED);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)94605025037605(3103)001671(17)270324", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud3()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "0-databar-q2-6211B74276A602B138CAB85ACD7B8960.png"), DecodeType.DATABAR_EXPANDED_STACKED);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)94605025037605(3103)001671(17)270324", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud4()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "0-databar-q2-920A743AD6FF1F22E7DBE75278369116.jpeg"), DecodeType.DATABAR_EXPANDED);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("25336144500086070491215565<FNC1>172511303902001000", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "0-databar-q2-ACDA46B3A3456B15707A74B3DB4B674D.jpeg"), DecodeType.DATABAR_STACKED_OMNI_DIRECTIONAL);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)09354249000101", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud6()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "0-True-7E2DCCFF9B439C41FC62DE72EA50F416.png"), DecodeType.DATABAR_EXPANDED_STACKED);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)03583788144779(21)000001627048", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud7()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-databar-q2-0B5EBC8E5AADDA6016C669182FA7EEFD.jpeg"), DecodeType.DATABAR_EXPANDED_STACKED);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)94605025002207(3103)000194(17)240321", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud8()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-databar-q2-358B3EC41276A6203ED555D351EBDD2C.jpeg"), DecodeType.DATABAR_EXPANDED_STACKED);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)00628693422017(13)250103(10)RDJS-034", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud9()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-databar-q2-80AA8A8D0F758E9BA9FD1C9EA57EB67E.jpeg"), DecodeType.DATABAR_EXPANDED_STACKED);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)03583787248959(21)000000580020", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud10()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-databar-q2-82F24CB177297AC6AB8FAE5D1125DA33.jpeg"), DecodeType.DATABAR_EXPANDED_STACKED);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(91)6250111064241000370000012600000000", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_FromCloud11()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "1-databar-q2-997DFEB529397542FE7D9BCCCE11067F.jpeg"), DecodeType.DATABAR_EXPANDED_STACKED);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)94605025025954(3103)000212(17)240321", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
