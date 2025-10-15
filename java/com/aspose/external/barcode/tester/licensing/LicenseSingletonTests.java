package com.aspose.external.barcode.tester.licensing;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LicenseSingletonTests
{
    @Test
    public void testLicenseSingleton() throws Exception
    {
        LicenseTestsCommon.resetLicense();
        Assert.assertFalse(LicenseTestsCommon.isLicensed());
        LicenseSingleton.setLicense();
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Global.getBarcodeJavaIssuesTestImagePath("BARCODJAVA10990"), "w8imytaxform-vertical.tif"), DecodeType.CODE_39_FULL_ASCII);
        for (BarCodeResult result : reader.readBarCodes())
        {
            System.out.printf("CodeText: %s%n", result.getCodeText());;
            System.out.printf("CodeType: %s%n", result.getCodeType());;
            Assert.assertEquals("123456789", result.getCodeText());
            Assert.assertEquals(DecodeType.CODE_39_FULL_ASCII, result.getCodeType());
        }
        Assert.assertTrue(LicenseTestsCommon.isLicensed());
    }
}
