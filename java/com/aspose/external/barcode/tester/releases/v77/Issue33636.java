package com.aspose.external.barcode.tester.releases.v77;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Issue33636
{
    final String folder = Global.getTestDataFolder("Issues/Issue33636");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
    public void test1()
    {
        String fileName = Global.pathCombine(folder, "correctedPDF417-FedEx.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(
                    "[)>010210011840267910002710790201FDE131189974151 1/11LBN133 West 19th StreetNew YorkNYPaul Sutton0610ZED00311ZDuomo Photography12Z212243115013Z000015Z305864118Z197806818E320Z0.00128ZK 26Z09c6",
                    reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
