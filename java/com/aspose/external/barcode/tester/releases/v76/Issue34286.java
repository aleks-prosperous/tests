package com.aspose.external.barcode.tester.releases.v76;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Issue34286
{
    final String folder = Global.getTestDataFolder("Issues/Issue34286");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void testRecognition()
    {
        String filename = folder + "Laser1.PNG";
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("D19-WQ9-F91046-0811", reader.getFoundBarCodes()[0].getCodeText());
    }
}
