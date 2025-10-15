package com.aspose.external.barcode.tester.releases.v18_11;

import com.aspose.barcode.auxiliary.Global;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

public class Issue36945
{
    /// <summary>
    /// Path to folder with files for testing Issue36945.
    /// </summary>
    private final static String folder = Global.getTestDataFolder("Issues\\Issue36945");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    /// <summary>
    /// Tests recogntion with symbology.
    /// </summary>
        @Test
    public void test_testcop()
    {
        String fileName = Global.pathCombine(folder, "testcop.png");
        BarCodeReader reader = new BarCodeReader(fileName, new MultyDecodeType(DecodeType.QR, DecodeType.GS_1_QR));
        {
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
            reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("50711434", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    /// <summary>
    /// Tests recogntion with All Supported symbologies.
    /// </summary>
        @Test
    public void test_testcop_cut()
    {
        String fileName = Global.pathCombine(folder, "testcop_cut.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);
        reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
        reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("50711434", reader.getFoundBarCodes()[0].getCodeText());
    }
    /// <summary>
    /// Tests recogntion with All Supported symbologies.
    /// </summary>
        @Test
    public void test_testcop_AllSupported()
    {
        String fileName = Global.pathCombine(folder, "testcop.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);
        reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
        reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("50711434", reader.getFoundBarCodes()[0].getCodeText());
    }
}
