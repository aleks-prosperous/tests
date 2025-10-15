package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;
import utils.TestExternalHelper;

import java.awt.*;
import java.io.File;

@Test(description = "Tests for Issue33487.")
public class Issue33487
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33487");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testRegion()
    {
        String fileName = folder + "images2.jpg";
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("123456L", reader.getFoundBarCodes()[0].getCodeText());
        Point[] expectedPoints = new Point[4];
        expectedPoints[0] = new Point(11, 13);
        expectedPoints[1] = new Point(11, 79);
        expectedPoints[2] = new Point(203, 13);
        expectedPoints[3] = new Point(203, 79);
        TestExternalHelper.checkBarcodesRegionMatching(reader.getFoundBarCodes()[0].getRegion(), expectedPoints, 0.8);
    }
}

