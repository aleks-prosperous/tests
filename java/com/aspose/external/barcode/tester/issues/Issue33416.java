package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;


@Test(description = "Tests for Issue33416.")
public class Issue33416
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33416");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testTif()
    {
        String fileName = Global.pathCombine(folder, "TestImage.tif");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.EAN_13);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("2407369001804", reader.getFoundBarCodes()[0].getCodeText());
    }
}

