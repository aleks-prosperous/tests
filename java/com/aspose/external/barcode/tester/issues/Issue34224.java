package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;

public class Issue34224
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue34224");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testIssue34224Page78JpgOneCode()
    {
        BarCodeReader reader = new BarCodeReader(folder + "Page78.jpg", DecodeType.ONE_CODE);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        String actualText = reader.getFoundBarCodes()[0].getCodeText();
        Assert.assertEquals("0030096900918400007539083220534", actualText, "Expected and Actual text comparison: Page78.jpg failed. ");
    }
}
