package com.aspose.external.barcode.tester.barcodjava;


import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BARCODJAVA33400
{
    private final String Folder = Global.getTestDataFolder("Issues/Issue33708");

    @BeforeMethod
    public void setUp()
    {
        com.aspose.barcode.LicenseAssistant.setupLicense();
    }

    @Test
    public void pharma1()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "Output_net_5800_Pharmacode001.png"), DecodeType.PHARMACODE);
        BarCodeResult[] results = reader.readBarCodes();
        org.testng.Assert.assertEquals(results.length, 1);
        Assert.assertEquals("333", results[0].getCodeText());
    }

    @Test
    public void pharma2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "Output_net_5800_Pharmacode002.png"), DecodeType.PHARMACODE);
        BarCodeResult[] results = reader.readBarCodes();
        Assert.assertEquals(results.length, 1);
        Assert.assertEquals("123456", results[0].getCodeText());
    }
}
