package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;

public class Issue34262
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue34262");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testIssue34262Canon22015082807455782914TifQR()
    {
        BarCodeReader reader = new BarCodeReader(folder + "Canon2_20150828074557829_14.tif", DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("F29406947", reader.getFoundBarCodes()[0].getCodeText());
    }
}
