package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;

@Test(description = "Tests for Issue-33226.")
public class Issue33226
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33226");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testImage1()
    {
        final String file = "img0.bmp";
        String fullPath = Global.pathCombine(folder, file);
        BarCodeReader reader = new BarCodeReader(fullPath, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("386F10EB-2C0F-4510-BF87-F831C5C50CEB", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testImage2()
    {
        final String file = "Error.png";
        String fullPath = Global.pathCombine(folder, file);
        BarCodeReader reader = new BarCodeReader(fullPath, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("386F10EB-2C0F-4510-BF87-F831C5C50CEB", reader.getFoundBarCodes()[0].getCodeText());
    }
}

