package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;

@Test(description = "Tests for Issue-33172.")
public class Issue33172
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33172");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void demo()
    {
        String fileName = Global.pathCombine(folder, "Untitled_2202201211073600.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("3000000000120", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void demoWithType()
    {
        String fileName = Global.pathCombine(folder, "Untitled_2202201211073600.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.EAN_13);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("3000000000120", reader.getFoundBarCodes()[0].getCodeText());
    }
}

