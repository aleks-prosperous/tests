package com.aspose.external.barcode.tester.barcodjava;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

@Test
public class BARCODJAVA10990
{
    @BeforeMethod
    public void setLicense() throws Exception
    {
//        com.aspose.barcode.LicenseAssistant.setupLicense();
        com.aspose.barcode.LicenseAssistant.setupLicense();
    }

    @Test
    public void testOne() throws IOException
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Global.getBarcodeJavaIssuesTestImagePath("BARCODJAVA10990"), "w8imytaxform-vertical.tif"), DecodeType.CODE_39_FULL_ASCII);
        for (BarCodeResult result : reader.readBarCodes())
        {
            Assert.assertEquals("123456789", result.getCodeText());
            Assert.assertEquals(DecodeType.CODE_39_FULL_ASCII, result.getCodeType());
        }

    }
}
