package com.aspose.external.barcode.tester.releases.v20_7;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

public class BARCODEJAVA919
{
    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void SetUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test(enabled = false) //expects to be resolved in .NET
    public void test1()
    {
//        String bmp = Global.getBarcodeJavaIssuesTestImagePath("BARCODEJAVA919") + "1.png";
        String bmp = Global.getBarcodeJavaIssuesTestImagePath("BARCODEJAVA919") + "1.png";
        com.aspose.barcode.barcoderecognition.BarCodeReader reader1 = new com.aspose.barcode.barcoderecognition.BarCodeReader(bmp, com.aspose.barcode.barcoderecognition.DecodeType.ALL_SUPPORTED_TYPES);
        for (BarCodeResult result : reader1.readBarCodes()) {
            System.out.println("CodeText: " + result.getCodeText());
            System.out.println("Symbology type: " + result.getCodeType());
        }
    }
}
