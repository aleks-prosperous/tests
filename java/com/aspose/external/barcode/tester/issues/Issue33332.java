package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

@Test(description = "Tests for Issue-33332.")
public class Issue33332
{
    private final String folder = Global.getTestDataFolder("Issues\\Issue33332");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void recognize1()
    {
        String fileName = Global.pathCombine(folder, "BW_150dpi.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("9223372036854775807", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void recognize2()
    {
        String fileName = Global.pathCombine(folder, "BW_150dpi_EC30_.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("9223372036854775807", reader.getFoundBarCodes()[0].getCodeText());
    }
}

