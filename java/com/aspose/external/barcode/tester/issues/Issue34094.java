package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;

public class Issue34094
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue34094");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testIssue34094Page8PngAztec()
    {
        BarCodeReader reader = new BarCodeReader(folder + "Page8.png", DecodeType.AZTEC);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("Gomaro Aztec http://www.gomaro.ch/Code_Aztec.htm", reader.getFoundBarCodes()[0].getCodeText());
    }
}
