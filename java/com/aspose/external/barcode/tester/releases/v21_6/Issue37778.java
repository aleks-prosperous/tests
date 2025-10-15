package com.aspose.external.barcode.tester.releases.v21_6;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

public class Issue37778
{
    /// <summary>
    /// Path to folder with files for testing Issue37778.
    /// </summary>
    private final static String Folder = Global.getTestDataFolder("Issues\\Issue37778");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test_QRWithSaltAndPaperImage()
    {
        int lAllowedTimeInMs = 10000;
        long watch = System.currentTimeMillis();
        //recognize
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "6output.jpg"), DecodeType.QR);
        {
            reader.setTimeout(lAllowedTimeInMs + 5000);
            Assert.assertEquals(0, reader.readBarCodes().length, "fale QR is recognized");
        }
        //
        long lScanDuration = System.currentTimeMillis() - watch;
        String scanRow = "Issue37778.Test_QRWithSaltAndPaperImage recognition time:" + lScanDuration + "ms";
        System.out.println(scanRow);

        if (lAllowedTimeInMs < lScanDuration)
            Assert.fail(scanRow);
    }
}
