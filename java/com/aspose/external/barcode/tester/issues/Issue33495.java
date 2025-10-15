package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


@Test(description = "Tests for Issue-31285.")
public class Issue33495
{
    private final String folder = Global.getTestDataFolder("Issues/Issue31285");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void recognizeMaximumText()
    {
        final int textSize = 1558;
        StringBuilder code = new StringBuilder(textSize);
        for (int i = 0; i < textSize; i++)
        {
            code.append((char) ('a' + i % 26));
        }
        String expectedText = code.toString();

        final String file = "GeneratedMaximumText.png";
        String fullPath = Global.pathCombine(folder, file);
        BarCodeReader reader = new BarCodeReader(fullPath, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(expectedText, reader.getFoundBarCodes()[0].getCodeText());
    }
}

