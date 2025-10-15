package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;


@Test(description = "Tests for Issue33352.")
public class Issue33352
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33352");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void tryAztec()
    {
        String fileName = Global.pathCombine(folder, "azteccode-11.jpg");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.AZTEC);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("OEOv36Ic3cuLkkIPnzSnhD91usjndyB3WYdlHE0oAty6vnmth", reader.getFoundBarCodes()[0].getCodeText());
    }
}

