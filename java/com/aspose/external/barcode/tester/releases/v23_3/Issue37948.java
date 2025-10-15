package com.aspose.external.barcode.tester.releases.v23_3;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

public class Issue37948
{
    /// <summary>
    /// Path to folder with files for testing Issue33948.
    /// </summary>
    private static final String Folder = Global.getTestDataFolder("Issues\\Issue37948");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test_DotCode_CorruptedImage()
    {
        String file = Global.pathCombine(Folder, "DotCode.png");

        BarCodeReader reader = new BarCodeReader(file, DecodeType.DOT_CODE);
        {
            reader.readBarCodes();
            Assert.assertEquals(1, reader.getFoundBarCodes().length);
            Assert.assertEquals("0123456789", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_Pdf417_CorruptedImage()
    {
        String file = Global.pathCombine(Folder, "Pdf417.png");

        BarCodeReader reader = new BarCodeReader(file, DecodeType.PDF_417);
        {
            reader.readBarCodes();
            Assert.assertEquals(1, reader.getFoundBarCodes().length);
            Assert.assertEquals("0123456789", reader.getFoundBarCodes()[0].getCodeText());
        }


    }
}
