package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;


@Test(description = "Tests for Issue-33311.")
public class Issue33311
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33311");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void recognizeOriginal()
    {
        String fileName = Global.pathCombine(folder, "735px-Code39_Wikipedia_svg.png");
        BarCodeReader reader = new BarCodeReader(fileName);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("WIKIPEDIA$", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void recognizeWithWhiteBackground()
    {
        String fileName = Global.pathCombine(folder, "735px-Code39_Wikipedia_svg.bmp");
        BarCodeReader reader = new BarCodeReader(fileName);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("WIKIPEDIA$", reader.getFoundBarCodes()[0].getCodeText());
    }
}

