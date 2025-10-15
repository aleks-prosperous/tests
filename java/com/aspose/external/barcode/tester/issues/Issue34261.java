package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;

public class Issue34261
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue34261");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testIssue34261Canon22015082807244397724TifQR()
    {
        BarCodeReader reader = new BarCodeReader(folder + "Canon2_20150828072443977_24.tif", DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("F26880617", reader.getFoundBarCodes()[0].getCodeText());
    }
}
