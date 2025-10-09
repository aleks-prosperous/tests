package com.aspose.external.barcode.tester.barcodjava;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;

public class BARCODJAVA33414
{
    final String folder = Global.getBarcodeJavaIssuesTestImagePath(this.getClass().getSimpleName());

    @BeforeMethod
    public void setUp()
    {
        com.aspose.barcode.LicenseAssistant.setupLicense();
    }

    @Test
    public void reproduceTest() throws IOException
    {
        String path = Global.pathCombine(folder, "7102019531_177_1040_20137114224.tif");
        BarCodeReader reader = new BarCodeReader(path, DecodeType.CODE_39);
        java.util.List<String> res = new ArrayList<String>();
        for (BarCodeResult result : reader.readBarCodes())
        {
            res.add(result.getCodeText());
        }

        Assert.assertTrue(res.contains("7102019531"));
        Assert.assertTrue(res.contains("351178"));
    }
}
