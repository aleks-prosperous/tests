package com.aspose.external.barcode.tester.releases.v21_7;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

public class BARCODEJAVA1151
{
    private final static String Folder = Global.getTestDataFolder("Issues\\BARCODEJAVA1151");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test()
    {
        String fileName = "photoScalled2.png";
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, fileName));
        BarCodeResult[] res = reader.readBarCodes();
        Assert.assertEquals(res.length, 1);
        Assert.assertEquals(res[0].getCodeType(), DecodeType.EAN_13);
        Assert.assertEquals(res[0].getCodeText(), "5029053564135");
    }
}
