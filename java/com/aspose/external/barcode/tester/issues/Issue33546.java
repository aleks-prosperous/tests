package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;


@Test(description = "Tests for Issue33546.")
public class Issue33546
{
    private final String folder = Global.getTestDataFolder("Issues\\Issue33546");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    public void test1()
    {
        String fileName = Global.pathCombine(folder, "Output1.png");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("||04|111819741|0159000001760|ROSSI ROBERTO|RSSRRT67A15D548C|590|A8|A800882|", reader.getFoundBarCodes()[0].getCodeText());
    }

    public void test2()
    {
        String fileName = Global.pathCombine(folder, "Output2.png");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("||04|111819741|0159000001760|ROSSI ROBERTO|RSSRRT67A15D548C|590|A8|A800882|", reader.getFoundBarCodes()[0].getCodeText());
    }
}

