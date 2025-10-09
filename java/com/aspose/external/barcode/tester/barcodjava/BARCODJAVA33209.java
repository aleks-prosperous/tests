package com.aspose.external.barcode.tester.barcodjava;


import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class BARCODJAVA33209
{
    @BeforeMethod
    public void setLicense() throws Exception
    {
        com.aspose.barcode.LicenseAssistant.setupLicense();
    }

    @Test
    public void testOne() throws IOException
    {
        String path = Global.getBarcodeJavaIssuesTestImagePath(Global.pathCombine(this.getClass().getSimpleName(), "document_code128.jpg"));

        String expectedMessage = "What about your 10,000 promises ?";
        StringBuffer actual = new StringBuffer();
        BarCodeReader reader = new BarCodeReader(path);
        for (BarCodeResult result : reader.readBarCodes())
        {
            actual.append(result.getCodeText());
        }
        Assert.assertEquals(expectedMessage, actual.toString());

    }
}
