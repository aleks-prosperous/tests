package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Test(description = "Tests for Issue-33151.")
public class Issue33151
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33151");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test1()
    {
        List<String> values = new ArrayList<String>();

        String fileName = Global.pathCombine(folder, "698.tif");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39);
        for(BarCodeResult result : reader.readBarCodes())
        values.add(result.getCodeText());

        Assert.assertEquals(2, values.size());
        Assert.assertTrue(values.contains("DTID%127"));
        Assert.assertTrue(values.contains("OID%707095"));
    }

    @Test
    public void test2()
    {
        List<String> values = new ArrayList<String>();

        String fileName = Global.pathCombine(folder, "20120216142419172.tif");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39);
        for(BarCodeResult result : reader.readBarCodes())
        values.add(result.getCodeText());

        Assert.assertEquals(2, values.size());
        Assert.assertTrue(values.contains("DTID%127"));
        Assert.assertTrue(values.contains("OID%707095"));
    }

    @Test
    public void test3()
    {
        List<String> values = new ArrayList<String>();

        String fileName = Global.pathCombine(folder, "20120217093924801.tif");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39);
        for(BarCodeResult result : reader.readBarCodes())
        values.add(result.getCodeText());

        Assert.assertEquals(2, values.size());
        Assert.assertTrue(values.contains("DTID%127"));
        Assert.assertTrue(values.contains("OID%707095"));
    }
}
