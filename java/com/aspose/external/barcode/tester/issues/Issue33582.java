package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Issue33582
{
    /// <summary>
    /// Path to folder with files for testing Issue36675.
    /// </summary>
    private static final String folder = Global.getTestDataFolder("Issues\\Issue33582");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
        @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
        //////[Category("Pdf417")]
    public void test_Pdf417_3d()
    {
        String file = Global.pathCombine(folder, "reduced_img_rotated.jpg");
        final String expectedText = "@\n\u001e\rANSI 636011040002DL00410463ZD05040003DLDAQ1686657                  \nDCSCHAKRABORTY                             \nDDEN\nDACSAURAV                                  \nDDFN\nDADNONE                                    \nDDGN\nDCAD     \nDCBB           \nDCDNONE \nDBD07062012\nDBB03161979\nDBA03052014\nDBC1\nDAU067 in\nDAYBRO\nDAG2414 SOCIETY DR                    \nDAICLAYMONT            \nDAJDE\nDAK197031761  \nDCF2012070668950991686657   \nDCGUSA\nDCUNONE \nDAW161\nDAHWHITNEY APTS                       \nDDAM\nDDB02082010\rZD\r";
        BarCodeReader reader = new BarCodeReader(file, DecodeType.PDF_417);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(expectedText, reader.getFoundBarCodes()[0].getCodeText());
    }
}
