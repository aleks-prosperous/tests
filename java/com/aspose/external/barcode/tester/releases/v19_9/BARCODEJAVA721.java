package com.aspose.external.barcode.tester.releases.v19_9;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

public class BARCODEJAVA721
{
    private String Folder = Global.getBarcodeJavaIssuesTestImagePath("BARCODEJAVA721");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test1()
    {
        String bmp = Global.pathCombine(Folder,"Pharmacode1voie.gif");

        BarCodeReader reader = new BarCodeReader(bmp, DecodeType.PHARMACODE);
        Assert.assertEquals(reader.readBarCodes().length, 0);
    }
}
