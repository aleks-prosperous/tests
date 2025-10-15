package com.aspose.external.barcode.tester.releases.v25_6;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.QualitySettings;
import com.aspose.barcode.licensing.LicenseType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Issue39292
{
    final String _folder = Global.getTestDataFolder("Issues/Issue39292");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense(LicenseType.Total);
    }

    @Test
    public void Test_PharmacodeSingleDecodeType()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "pharmacode.png"), DecodeType.PHARMACODE);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("875", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void Test_PharmacodeMultiDecodeType()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "pharmacode.png"));
        {
            reader.setBarCodeReadType(DecodeType.PHARMACODE);
            reader.setQualitySettings(QualitySettings.getHighPerformance());

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("875", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
