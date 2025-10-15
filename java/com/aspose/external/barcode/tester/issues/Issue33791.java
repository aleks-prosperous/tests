package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.BaseDecodeType;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;


@Test(description = "Tests for Issue33791.")
public class Issue33791
{
    String folder = Global.getIssuesTestImagePath(this.getClass().getSimpleName());

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void test03()
    {
        List<String> values = new ArrayList<String>();
        List<BaseDecodeType> types = new ArrayList<BaseDecodeType>();

        String fileName = Global.pathCombine(folder, "03.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX, DecodeType.CODE_128);
        for(BarCodeResult result : reader.readBarCodes())
        {
            types.add(result.getCodeType());
            values.add(result.getCodeText());
        }

        // Code128 found but not absolutely right"
        Assert.assertEquals(2, values.size(), "if 2 - maybe Code128 found correct ? ");
        Assert.assertTrue(values.contains("AZ000000393740"));
    }

    @Test
    public void test03DM()
    {
        String fileName = Global.pathCombine(folder, "031.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("AZ000000393740", reader.getFoundBarCodes()[0].getCodeText());
    }
}

