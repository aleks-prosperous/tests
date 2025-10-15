package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;

public class Issue34232
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue34232");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testIssue34232ImageBarcodeJpgDataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(folder + "Image_barcode.jpg", DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("O60000000020120000529339", reader.getFoundBarCodes()[0].getCodeText());
    }
}
