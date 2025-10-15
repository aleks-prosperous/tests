package com.aspose.external.barcode.tester.releases.v22_11;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.IOException;

@Test
public class BARCODEJAVA1400
{
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    private final static String filePath = Global.getTestDataFolder("Issues/BARCODEJAVA1400/Input.jpg");

    @Test
    public void test() throws IOException
    {
        BarCodeReader reader = new BarCodeReader(filePath, DecodeType.CODE_39, DecodeType.CODE_128);
        for (BarCodeResult result : reader.readBarCodes())
        {
            System.out.println("BarCode Type: " + result.getCodeTypeName());
            System.out.println("BarCode CodeText: " + result.getCodeText());
            Assert.assertEquals("Code128", result.getCodeTypeName());
            Assert.assertEquals("DR2039", result.getCodeText());
        }
    }
}
