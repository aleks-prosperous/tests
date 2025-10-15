package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;

public class Issue34166
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue34166");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testIssue34166PdfBarCodeExtractorFixture0005PngDataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(folder + "PdfBarCodeExtractorFixture.0005.png", DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("RM0000280A", reader.getFoundBarCodes()[0].getCodeText());
    }
}
