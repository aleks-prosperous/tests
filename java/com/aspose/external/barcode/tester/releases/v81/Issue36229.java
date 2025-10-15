package com.aspose.external.barcode.tester.releases.v81;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Issue36229
{
    final String folder = Global.getTestDataFolder("Issues");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void testBarcodeBuilderRecognizer()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36229\\DataMatrix01_cutted.tif"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("424D4D415231364252433F379A45D7F4788F76C4C00BC4D31061E63F0B0136CB3C9C385BBC0E85C2B" +
                    "985", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
