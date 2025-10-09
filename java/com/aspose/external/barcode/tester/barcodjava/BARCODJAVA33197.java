package com.aspose.external.barcode.tester.barcodjava;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class BARCODJAVA33197
{
    @BeforeMethod
    public void setLicense() throws Exception
    {
        com.aspose.barcode.LicenseAssistant.setupLicense();
    }

    @Test
    public void testOne() throws IOException
    {
        BarCodeReader reader = new BarCodeReader(Global.getBarcodeJavaIssuesTestImagePath(Global.pathCombine(this.getClass().getSimpleName(), "Provider+Request+Letter.bmp")), DecodeType.CODE_39_FULL_ASCII);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(reader.readBarCodes()[0].getCodeText(), "LTR201104271002003");

    }
}
