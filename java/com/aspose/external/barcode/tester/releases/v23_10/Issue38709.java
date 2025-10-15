package com.aspose.external.barcode.tester.releases.v23_10;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

public class Issue38709
{
    private final static String Folder = Global.getTestDataFolder("Issues/Issue38709");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test_CustomerImage()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "customers_barcode.png"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("MNP0500S07142300000100000003001001100000000000300000", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_Generated()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "generated.png"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("datamatrix", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
