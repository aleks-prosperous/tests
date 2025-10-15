package com.aspose.external.barcode.tester.releases.v17_01;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Issue33257
{
    final String folder = Global.getTestDataFolder("Issues/Issue33257/");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }


        @Test
    public void Bad1()
    {
        String filename = Global.pathCombine(folder, "Barcode200DPIA.png");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("ZZZ#WAS#EF#0203##Unknown#Cost Estimate - Conventional#Cost Estimate Sheet#Test#6/19/2012#True#N/A", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void Bad2()
    {
        String filename = Global.pathCombine(folder, "Barcode200DPIB.png");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("ZZZ#WAS#EF#0203##Unknown#Summary MSS#Summary MSS#Test#6/19/2012#True#N/A", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void Bad3()
    {
        String filename = Global.pathCombine(folder, "Barcode200DPIC.png");
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }
}
