package com.aspose.external.barcode.tester.barcodjava;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;

@Test
public class BARCODJAVA33461
{
    private final String folder = Global.getTestDataFolder("barcodjava_issues" + File.separatorChar + "BARCODJAVA33461");

    @BeforeMethod
    public void setUp()
    {
        com.aspose.barcode.LicenseAssistant.setupLicense();
    }

    @Test
    public void testIssue()
    {
        BarCodeReader reader = new BarCodeReader(folder + "c3.jpg", DecodeType.ALL_SUPPORTED_TYPES);
        Assert.assertEquals(reader.readBarCodes().length, 1); //false
    }
}
