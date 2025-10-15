package com.aspose.external.barcode.tester.releases.v24_2;

import com.aspose.barcode.auxiliary.Global;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

public class BARCODEJAVA683
{
    private final String Folder = Global.getTestDataFolder("Issues\\BARCODEJAVA683");
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test()
    {
        String expectedText = "FV50CE";
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "SonyDV_BatteryPack_00.JPG"), DecodeType.MICRO_QR);
        reader.setQualitySettings(QualitySettings.getHighQuality());
        BarCodeResult[] barCodeResults = reader.readBarCodes();
        Assert.assertEquals(barCodeResults.length, 1);
        Assert.assertEquals(barCodeResults[0].getCodeText(), expectedText);
    }
}
