package com.aspose.external.barcode.tester.releases.v19_9;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

public class BARCODEJAVA722
{
    private String Folder = Global.getBarcodeJavaIssuesTestImagePath("BARCODEJAVA722");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test1()
    {
        String expectedCodeText = "(01)12587455463918FcGjYu";
        String bmp = Global.pathCombine(Folder,"GS1-databar-expanded.gif");
        BarCodeReader reader = new BarCodeReader(bmp, DecodeType.ALL_SUPPORTED_TYPES);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(expectedCodeText, reader.readBarCodes()[0].getCodeText());
    }
}
