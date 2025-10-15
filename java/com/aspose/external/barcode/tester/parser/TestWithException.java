package com.aspose.external.barcode.tester.parser;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;

public class TestWithException
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue15794");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }
    @Test
    public void test1()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(folder, "IMG_0041.JPG"), DecodeType.EAN_13);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("8005415040124", reader.getFoundBarCodes()[0].getCodeText());
    }
}
