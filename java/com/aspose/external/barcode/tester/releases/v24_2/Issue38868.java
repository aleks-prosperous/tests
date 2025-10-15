package com.aspose.external.barcode.tester.releases.v24_2;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

public class Issue38868
{
    private final String Folder = Global.getTestDataFolder("Issues\\Issue38868");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test_CustomerImage()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "01_pages_png.png"), DecodeType.DOT_CODE);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("12345678", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
