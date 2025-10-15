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


@Test(description = "Tests for Issue34003.")
public class Issue34003
{
    final String folder = Global.getTestDataFolder("Issues/Issue34003");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }


    @Test
    public void testMainImage()
    {
        String fileName = Global.pathCombine(folder, "DSC00015.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        List<String> lResults = new ArrayList<String>();
        for(BarCodeResult result : reader.readBarCodes())
        lResults.add(result.getCodeText());
        Assert.assertEquals(lResults.size(), 2);
        Assert.assertEquals(lResults.get(0), "P0011187");
        Assert.assertEquals(lResults.get(1), "P0011187");
    }


}

