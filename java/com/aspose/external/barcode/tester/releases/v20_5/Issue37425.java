package com.aspose.external.barcode.tester.releases.v20_5;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.XDimensionMode;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

public class Issue37425
{
    /// <summary>
    /// Path to folder with files for testing Issue37425.
    /// </summary>
    private String Folder = Global.getTestDataFolder("Issues\\Issue37425");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void SetUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test_barcode()
    {
        String fileName = Global.pathCombine(Folder, "barcode.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Truth resides silently in the seat of power\r\n~670055", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_QrCode_uy95()
    {
        String fileName = Global.pathCombine(Folder, "QrCode_uy95.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Silence is the ultimate weapon of power\r\n~676321", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_QrCode_wv31()
    {
        String fileName = Global.pathCombine(Folder, "QrCode_wv31.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Silence is the ultimate weapon of power\r\n~677895", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
