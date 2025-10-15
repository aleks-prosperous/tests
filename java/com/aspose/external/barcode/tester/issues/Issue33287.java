package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;

@Test(description = "Tests for Issue33287.")
public class Issue33287
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33287");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testFaxB90_tif()
    {
        String fileName = Global.pathCombine(folder, "FaxB90.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PDF_417);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("C1112,345829,9/3/2011", reader.getFoundBarCodes()[0].getCodeText());
    }
}

