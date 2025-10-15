package com.aspose.external.barcode.tester.releases.v25_9;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.licensing.LicenseType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Issue37856
{
    final String Folder = Global.getTestDataFolder("Issues/Issue37856");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense(LicenseType.Total);
    }

    @Test
    public void test_Pdf417WithInvasion()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "MicrosoftTeams-image (2).jpg"), DecodeType.PDF_417);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("%MVL1CC95%0140%2008N01F%1%2008045TD53Y%NP198796%WCS022W%Hatch back / Luikrug%DATSUN%GO%Blue / Blou%MDHZBAAD0Z0005775%HR12856663B%2022-01-31%", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_Pdf417WithInvasionCut()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "disc-only.jpg"), DecodeType.PDF_417);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("%MVL1CC95%0140%2008N01F%1%2008045TD53Y%NP198796%WCS022W%Hatch back / Luikrug%DATSUN%GO%Blue / Blou%MDHZBAAD0Z0005775%HR12856663B%2022-01-31%",reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_Pdf417WithInvasionCutBarcodeOnly()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "barcode-only.jpg"), DecodeType.PDF_417);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("%MVL1CC95%0140%2008N01F%1%2008045TD53Y%NP198796%WCS022W%Hatch back / Luikrug%DATSUN%GO%Blue / Blou%MDHZBAAD0Z0005775%HR12856663B%2022-01-31%",reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
