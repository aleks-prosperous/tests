package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;


@Test(description = "Tests for Issue-33256.")
public class Issue33256
{
    final String folder = Global.getTestDataFolder("Issues/Issue33256");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void testNativepng()
    {
        List<String> values = new ArrayList<String>();

        String fileName = Global.pathCombine(folder, "Native.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        for(BarCodeResult result : reader.readBarCodes())
        values.add(result.getCodeText());

        Assert.assertEquals(2, values.size());
        Assert.assertTrue(values.contains("1390799827"));
        Assert.assertTrue(values.contains("917618"));
    }

    @Test
    public void testNativepngAllSupportedTypes()
    {
        List<String> values = new ArrayList<String>();

        String fileName = Global.pathCombine(folder, "Native.png");
        BarCodeReader reader = new BarCodeReader(fileName);
        for(BarCodeResult result : reader.readBarCodes())
        values.add(result.getCodeText());

        Assert.assertEquals(2, values.size());
        Assert.assertTrue(values.contains("1390799827"));
        Assert.assertTrue(values.contains("917618"));
    }
}

