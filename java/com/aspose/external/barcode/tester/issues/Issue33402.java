package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


@Test(description = "Tests for Issue33402.")
public class Issue33402
{
    private final String folder = Global.getTestDataFolder("Issues/Issue33402");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void testConverter()
    {
        String fileName = Global.pathCombine(folder, "IMG0.png");
        BarCodeReader reader = new BarCodeReader(fileName);
        Assert.assertEquals(reader.readBarCodes().length, 2);
        Assert.assertEquals("zhpgGHG33cuqju3TdPkrTTXbIu6+pNsHXb7UTWmp9KmqfxBVAgAlRoRfhm/tqKKrwJB7M93m89ZLw7lkKto7+Rd603nUnkN9KQ3usqvHE+4FIJQgGTku7A==", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals("b6eb40984bf4", reader.getFoundBarCodes()[1].getCodeText());
    }
}

