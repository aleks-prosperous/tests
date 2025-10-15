package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;


@Test(description = "Tests for Issue34092.")
public class Issue34092
{
    final String folder = Global.getTestDataFolder("Issues/Issue34092");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }


    @Test
    public void testMainImage()
    {
        String fileName = Global.pathCombine(folder, "9.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        List<String> lResults = new ArrayList<String>();
        for(BarCodeResult result : reader.readBarCodes())
        lResults.add(result.getCodeText());

        Assert.assertEquals(lResults.size(), 4);
        Assert.assertTrue(lResults.contains("http://banquescotia.com"));
        Assert.assertTrue(lResults.contains("http://desjardins.com"));
        Assert.assertTrue(lResults.contains("http://google.com"));
        Assert.assertTrue(lResults.contains("http://desjardins.com"));
    }


}

