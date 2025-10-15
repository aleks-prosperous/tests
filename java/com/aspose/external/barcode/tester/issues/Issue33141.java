package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;


@Test(description = "Tests for Issue-33141.")
public class Issue33141
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33141");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test()
    {
        String fileName = Global.pathCombine(folder, "00000001.tif");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        Assert.assertEquals(reader.readBarCodes().length, 2);
        Assert.assertEquals("CY0534", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals("CY0534", reader.getFoundBarCodes()[1].getCodeText());
    }
}

