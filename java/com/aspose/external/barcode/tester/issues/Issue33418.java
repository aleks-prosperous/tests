package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


@Test(description = "Tests for Issue33418.")
public class Issue33418
{
    final String folder = Global.getTestDataFolder("Issues/Issue33418");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void testBrokenImage()
    {
        final String text = "\"BT_SO\"|\"12971\"|\"GALAK\"|\"YURIY\"|\"61690\"|\"08/28/2011\"";
        String fileName = Global.pathCombine(folder, "IDAutomationStreamingPDF417_Broken.gif");
        BarCodeReader reader = new BarCodeReader(fileName);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(text, reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testConvertedCutted()
    {
        String fileName = Global.pathCombine(folder, "onepage_Cutted.png");
        BarCodeReader reader = new BarCodeReader(fileName);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("zhpgGHG33cuqju3TdPkrTTXbIu6+pNsHXb7UTWmp9KmqfxBVAgAlRoRfhm/tqKKrwJB7M93m89ZLw7lkKto7+Rd603nUnkN9KQ3usqvHE+4FIJQgGTku7A==", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testBrokenImage2()
    {
        final String text = "\"BT_SO\"|\"12971\"|\"GALAK\"|\"YURIY\"|\"61690\"|\"08/28/2011\"";
        String fileName = Global.pathCombine(folder, "IDAutomationStreamingPDF417_Broken2.gif");
        BarCodeReader reader = new BarCodeReader(fileName);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(text, reader.getFoundBarCodes()[0].getCodeText());
    }
}

