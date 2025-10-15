package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


@Test(description = "Tests for Issue33782.")
public class Issue33782
{
    String folder = Global.getIssuesTestImagePath(this.getClass().getSimpleName());

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void testOneCode()
    {
        String fileName = Global.pathCombine(folder, "onecode-0.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ONE_CODE);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("4391513376861200355832080702246", reader.getFoundBarCodes()[0].getCodeText());
    }
}

