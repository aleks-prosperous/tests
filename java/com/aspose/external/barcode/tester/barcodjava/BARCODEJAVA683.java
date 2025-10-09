package com.aspose.external.barcode.tester.barcodjava;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.QualitySettings;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.aspose.barcode.LicenseAssistant;

public class BARCODEJAVA683
{
    String folder = Global.getIssuesTestImagePath("Issue36352");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test(enabled = false)
    public void test()
    {
        String expectedText = "FV50CE";
        BarCodeReader reader = new BarCodeReader(folder + "SonyDV_BatteryPack_00.JPG", DecodeType.MICRO_QR);
        reader.setQualitySettings(QualitySettings.getHighQuality());
        BarCodeResult[] barCodeResults = reader.readBarCodes();
        Assert.assertEquals(barCodeResults.length, 1);
        Assert.assertEquals(barCodeResults[0].getCodeText(), expectedText);
    }
}
