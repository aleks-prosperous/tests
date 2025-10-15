package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;


@Test(description = "Tests for Issue34070.")
public class Issue34070
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue34070");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testMainImage()
    {
        String fileName = Global.pathCombine(folder, "1.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("http://bit.ly/hOvdU4?r=qr", reader.getFoundBarCodes()[0].getCodeText());
    }


}

