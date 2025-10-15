package com.aspose.external.barcode.tester.releases.v16_11;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class Issue36344
{
    private final String folder = Global.getTestDataFolder("Issues/Issue36344");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void test0() throws IOException
    {
        String filename = "/DataMatrix10.tiff";

        BarCodeReader reader = new BarCodeReader(folder + filename, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("424D4A414E31364252435467303318443847AAC44B7A7D0138A6909EFCB580BEE0FDBF22D5A8F3007" +
                "322", reader.getFoundBarCodes()[0].getCodeText());
    }
}
