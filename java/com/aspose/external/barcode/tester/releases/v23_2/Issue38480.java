package com.aspose.external.barcode.tester.releases.v23_2;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.DeconvolutionMode;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

public class Issue38480
{
    private static final String Folder = Global.getTestDataFolder("Issues\\Issue38480");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test_SettlementSheet_DRV_WRIDE_DK_12_25_36_709()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "SettlementSheet-DRV-WRIDE-DK_12-25-36.709.TIF"), DecodeType.CODE_39, DecodeType.CODE_39_FULL_ASCII);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("WRIDE-209681-20221218", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_SettlementSheet_DRV_YANCA_DK_12_25_38_100()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "SettlementSheet-DRV-YANCA-DK_12-25-38.100.TIF"), DecodeType.CODE_39, DecodeType.CODE_39_FULL_ASCII);
        {
            reader.getQualitySettings().setDeconvolution(DeconvolutionMode.SLOW);
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("YANCA-209682-20221218", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_cut_1()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "cut_1.png"), DecodeType.CODE_39, DecodeType.CODE_39_FULL_ASCII);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("WRIDE-209681-20221218", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_cut_2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "cut_2.png"), DecodeType.CODE_39, DecodeType.CODE_39_FULL_ASCII);
        {
            reader.getQualitySettings().setDeconvolution(DeconvolutionMode.SLOW);
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("YANCA-209682-20221218", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
