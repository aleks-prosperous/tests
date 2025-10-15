package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;

//import com.aspose.barcode.barcoderecognition.RecognitionHints;


@Test(description = "Tests for Issue13824.")
public class Issue13824
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue13824");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
    public void testDemoWithRotating()
    {
        String fileName = Global.pathCombine(folder, "5.JPG");
        BarCodeReader reader = new BarCodeReader(fileName);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("S7482288F", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void testDemo_rotated()
    {
        String fileName = Global.pathCombine(folder, "5_rotated.JPG");
        BarCodeReader reader = new BarCodeReader(fileName);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("S7482288F", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}

