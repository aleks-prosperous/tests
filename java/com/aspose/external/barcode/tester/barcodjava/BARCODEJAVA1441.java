package com.aspose.external.barcode.tester.barcodjava;


import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.aspose.barcode.LicenseAssistant;

import java.io.IOException;
import java.util.Locale;

public class BARCODEJAVA1441
{
    String folder = Global.getIssuesTestImagePath("BARCODEJAVA1441");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test(enabled = false)
    public void test() throws IOException
    {
        String dataDir = folder + "2894_001_L1_2021-09-22_15-30-16-8230_0.jpeg";
        // Initialize barcode reader
        BarCodeReader reader1 = new BarCodeReader(dataDir, DecodeType.CODE_39);
        BarCodeResult[] result = reader1.readBarCodes();
        System.out.println(result.length);
        for (int j = 0; j < result.length; j++)
        {
            System.out.println("CodeText: " + result[j].getCodeText());
            System.out.println("Symbology type: " + result[j].getCodeType());
            if(0 == j)
            {
                String expectedCodetext = "N80126667";
                Assert.assertEquals(result[j].getCodeText(), expectedCodetext);
            }
        }
    }
}
