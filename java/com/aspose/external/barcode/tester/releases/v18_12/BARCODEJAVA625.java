package com.aspose.external.barcode.tester.releases.v18_12;

import com.aspose.barcode.auxiliary.Global;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

public class BARCODEJAVA625
{
    static final String Folder = Global.getTestDataFolder("barcodjava_issues/BARCODEJAVA625");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test1()
    {
        String fileName = "test.jpg";
        String expectedText = "690458960500";
        String expectedCheckSum = "4";
        BaseDecodeType expectedDecodeType = DecodeType.EAN_13;
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, fileName));
        reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.ON);
        BarCodeResult[] results = reader.readBarCodes();
        Assert.assertEquals(results.length, 1);
        Assert.assertEquals(expectedText + expectedCheckSum, results[0].getCodeText());
        Assert.assertEquals(results[0].getCodeType(), expectedDecodeType);
    }
}
