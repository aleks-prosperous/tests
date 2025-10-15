package com.aspose.external.barcode.tester.releases.v24_12;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.ChecksumValidation;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.licensing.LicenseType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BARCODEJAVA1416
{
    static final String Folder = Global.getTestDataFolder("Issues\\BARCODEJAVA1416\\");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense(LicenseType.Total);
    }

    @Test
    public void test()
    {
        String fileName = Folder + "CapturFiles_2022-08-15_15-16.jpg";
        String expectedCodetext = "(01)32203727";
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.GS_1_CODE_128);
        reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.OFF);
        Assert.assertEquals(expectedCodetext, reader.readBarCodes()[0].getCodeText());
    }
}