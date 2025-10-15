package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


@Test(description = "Tests for Issue-16752.")
public class Issue16752
{
    private final String folder = Global.getTestDataFolder("Issues/Issue16752");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
    public void Recognize1()
    {
        String fileName = Global.pathCombine(folder, "pdf417test.png");
        BarCodeReader reader = new BarCodeReader(fileName);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("HPD1234", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void Recognize2()
    {
        String fileName = Global.pathCombine(folder, "ExtractFromPdf.png");
        BarCodeReader reader = new BarCodeReader(fileName);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("HPD1234", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}

