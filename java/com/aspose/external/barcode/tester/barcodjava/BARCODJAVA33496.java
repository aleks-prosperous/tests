package com.aspose.external.barcode.tester.barcodjava;


import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BARCODJAVA33496
{
    final String Folder = Global.getTestDataFolder("Issues/Issue33136");

    @BeforeMethod
    public void setUp()
    {
        com.aspose.barcode.LicenseAssistant.setupLicense();
    }

    @Test
    public void testCertainReadType()
    {
        String fileName = Global.pathCombine(Folder, "0001_213944213946.tif");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39, DecodeType.CODE_39_FULL_ASCII);
        BarCodeResult[] results = reader.readBarCodes();
        Assert.assertEquals("0058", results[0].getCodeText());
        Assert.assertEquals(results.length, 1);
    }
}
