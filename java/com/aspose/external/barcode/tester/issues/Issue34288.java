package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class Issue34288
{
    private final String folder = Global.getTestDataFolder("Issues/Issue34288");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }


    @Test
    public void test() throws IOException
    {
        String expectedResult = "H20-WQ9-F91024-2159";
        String filename = "/2015_09_19_17_21_36.jpg";
        BarCodeReader reader = new BarCodeReader(folder + filename, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("H20-WQ9-F91024-2159", reader.getFoundBarCodes()[0].getCodeText());
    }
}
