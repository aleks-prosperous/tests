package com.aspose.external.barcode.tester.releases.v24_3;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.licensing.LicenseType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class Issue38805
{

    private final String Folder = Global.getTestDataFolder("Issues/Issue38805");
    @BeforeMethod
    public void setUp(Method testMethod)
    {
        utils.LicenseAssistant.setupLicense(LicenseType.Total);
    }

    @Test
    public void test_ExtraLargeQR()
    {
        String fileName = Global.pathCombine(Folder, "ExtraLargeQR.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("https://claim-1000.me/", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
