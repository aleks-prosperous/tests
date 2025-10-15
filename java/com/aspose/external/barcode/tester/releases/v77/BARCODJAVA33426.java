package com.aspose.external.barcode.tester.releases.v77;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

@Test
public class BARCODJAVA33426
{
    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void test() throws IOException
    {
        String expectedResult = "E200A05B520086C93E11BCA863028B412";
        String filePath = Global.getBarcodeJavaIssuesTestImagePath(this.getClass().getSimpleName());
        String filename = filePath + "/false_positive.png";
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(reader.readBarCodes()[0].getCodeText(), expectedResult);
        System.out.println(reader.readBarCodes()[0].getCodeType() + ": " + reader.readBarCodes()[0].getCodeText());
    }

}
