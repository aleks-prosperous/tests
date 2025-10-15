package com.aspose.external.barcode.tester.releases.v23_9;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

public class Issue38631
{
    private final static String Folder = Global.getTestDataFolder("Issues\\Issue38631");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test_SampleErrorFile()
    {
        //use pdf417 bacause fast recognition engine. We need to just open the file
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "Sample Error File.bmp"), DecodeType.PDF_417);
        {
            Assert.assertEquals(0, reader.readBarCodes().length);
        }
    }
}
