package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;

public class Issue34197
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue34197");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testIssue34197BarcodeJpgQR()
    {
        BarCodeReader reader = new BarCodeReader(folder + "barcode.jpg", DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        String actualText = reader.getFoundBarCodes()[0].getCodeText();
        Assert.assertEquals("1101605566", actualText, "Expected and Actual text comparison: @\'Issue34197\\barcode.jpg\' failed. ");
        System.out.println("Test for \"Issue34197\\barcode.jpg\" has completed successfully.");
    }
}
