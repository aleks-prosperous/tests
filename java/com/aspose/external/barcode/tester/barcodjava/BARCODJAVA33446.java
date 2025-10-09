package com.aspose.external.barcode.tester.barcodjava;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BARCODJAVA33446
{

    @BeforeMethod
    public void setLicense() throws Exception
    {
        com.aspose.barcode.LicenseAssistant.setupLicense();
    }

    @Test
    public void testIssue()
    {
        String expected = "McCode={ ARQ=38140878 }";
        BarCodeReader reader = new BarCodeReader(Global.getBarcodeJavaIssuesTestImagePath("BARCODJAVA33446") + "/saved12.png", DecodeType.QR);
        reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);
        reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
        BarCodeResult[] results = reader.readBarCodes();
        Assert.assertTrue(results.length > 0);
        for(BarCodeResult result : results)
            Assert.assertEquals(result.getCodeText(), expected);


    }
}
