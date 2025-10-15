package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;

@Test(description = "Tests for Issue33351.")
public class Issue33351
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33351");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void demo()
    {
        String fileName = Global.pathCombine(folder, "Document_d094d_1.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("9223372036854775807", reader.getFoundBarCodes()[0].getCodeText());
    }
}

