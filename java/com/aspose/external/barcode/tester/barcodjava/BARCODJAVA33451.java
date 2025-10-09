package com.aspose.external.barcode.tester.barcodjava;


import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BARCODJAVA33451
{
    @BeforeMethod
    public void setUp()
    {
        com.aspose.barcode.LicenseAssistant.setupLicense();
    }

    @Test
    public void test1()
    {
        String expected = "SAT20140528CCBA000005";
        String filePath = Global.getBarcodeJavaIssuesTestImagePath("BARCODJAVA33451") + "barcode.gif";
        BarCodeReader reader = new BarCodeReader(filePath, DecodeType.CODE_39);
        BarCodeResult[] results  = reader.readBarCodes();
        Assert.assertEquals(results.length, 1);
        System.out.println("codetext: " + results[0].getCodeText() + " Symbology: " + results[0].getCodeType());
        Assert.assertEquals(results[0].getCodeText(), expected);

    }

    @Test
    public void test2()
    {
        String expected = "SAT000005";
        String filePath = Global.getBarcodeJavaIssuesTestImagePath("BARCODJAVA33451") + "/original.gif";
        BarCodeReader reader = new BarCodeReader(filePath, DecodeType.CODE_39);
        BarCodeResult[] results  = reader.readBarCodes();
        Assert.assertEquals(results.length, 1);
        System.out.println("codetext: " + results[0].getCodeText() + " Symbology: " + results[0].getCodeType());
        Assert.assertEquals(results[0].getCodeText(), expected);

    }
}
