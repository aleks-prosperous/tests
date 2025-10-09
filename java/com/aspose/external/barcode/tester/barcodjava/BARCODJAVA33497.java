package com.aspose.external.barcode.tester.barcodjava;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BARCODJAVA33497
{
    final String Folder = Global.getTestDataFolder("Issues/Issue33453");

    @BeforeMethod
    public void setLicense() throws Exception
    {
        com.aspose.barcode.LicenseAssistant.setupLicense();
    }


    @Test
    public void test1()
    {
        final String fileName = "Image+1.TIF";
        String path = Global.pathCombine(Folder, fileName);
        final BarCodeReader reader = new BarCodeReader(path, DecodeType.CODE_128);
        Assert.assertTrue(reader.readBarCodes().length > 0);
        Assert.assertEquals("H00123192899A", reader.readBarCodes()[0].getCodeText());
    }

    @Test
    public void test2()
    {
        final String fileName = "Image+2.TIF";
        String path = Global.pathCombine(Folder, fileName);
        final BarCodeReader reader = new BarCodeReader(path, DecodeType.CODE_128);
        Assert.assertTrue(reader.readBarCodes().length > 0);
        Assert.assertEquals("H00123192899A", reader.readBarCodes()[0].getCodeText());
    }
}
