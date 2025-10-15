package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;


@Test(description = "Tests for Issue-33122.")
public class Issue33122
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33122");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void DM2()
    {
        String fileName = Global.pathCombine(folder, "Barcodetest2.tif");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("'A181178||282.05'", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void DM4()
    {
        String fileName = Global.pathCombine(folder, "Barcodetest4.tif");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("'A176709||235.87'", reader.getFoundBarCodes()[0].getCodeText());
    }
}

