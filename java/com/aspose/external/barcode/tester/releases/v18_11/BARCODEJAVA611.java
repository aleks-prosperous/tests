package com.aspose.external.barcode.tester.releases.v18_11;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.MultyDecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.util.ArrayList;
import java.util.List;

public class BARCODEJAVA611
{
    private final static String Folder = Global.getTestDataFolder("Issues\\BARCODEJAVA611");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test(expectedExceptions = IllegalArgumentException.class,
    expectedExceptionsMessageRegExp = "Wrong filename passed.")
    public void test1()
    {
        String fileName = Global.pathCombine(Folder, "stub.png");
        BarCodeReader reader = new BarCodeReader(fileName, new MultyDecodeType(DecodeType.QR, DecodeType.GS_1_QR));
        {
            List<String> lCodetexts = new ArrayList<>();
            for(BarCodeResult result : reader.readBarCodes())
                lCodetexts.add(result.getCodeText());

            Assert.assertEquals(1, lCodetexts.size());
            Assert.assertTrue(lCodetexts.contains("AaBbCc"));
        }
    }
}
