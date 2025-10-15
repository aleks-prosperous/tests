package com.aspose.external.barcode.tester.releases.v78;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.QualitySettings;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


@Test
public class Issue34364
{
    final String folder = Global.getTestDataFolder("Issues");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
        //[Category("DataLogic2of5")]
    public void test_Issue34364_dataLogic2of5_1_png_DataLogic2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34364\\dataLogic2of5_1.png"), DecodeType.DATA_LOGIC_2_OF_5);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1234567890", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DataLogic2of5")]
    public void test_Issue34364_dataLogic2of5_2_png_DataLogic2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34364\\dataLogic2of5_2.png"), DecodeType.DATA_LOGIC_2_OF_5);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("0012300123", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DataLogic2of5")]
    public void test_Issue34364_dataLogic2of5_3_png_DataLogic2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34364\\dataLogic2of5_3.png"), DecodeType.DATA_LOGIC_2_OF_5);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("55555", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
