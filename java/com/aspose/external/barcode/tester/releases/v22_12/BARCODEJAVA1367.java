package com.aspose.external.barcode.tester.releases.v22_12;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

public class BARCODEJAVA1367
{
    /// <summary>
    /// Path to folder with files for testing Issue38254.
    /// </summary>
    private static final String Folder = Global.getTestDataFolder("Issues\\Issue38254");
    private static final String expected = "13\t\t09\tAnsbacher\tAmelie\t19931008\t\t107299005\tA139156972\t1\t00\t00\t951956300\t819251603\t20210712\t1\tM54.5\t\tWS\tab\t\tKG\t6\t\t\t\t\tTraktion\t6\t1á2x w\u0094ch.\t\t0\t1";

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test_barcode_not_read()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "barcode_not_read_1654259282216_141421056659050501249399593.jpg"), DecodeType.PDF_417);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals(expected, reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
