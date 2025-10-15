package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;


@Test(description = "Tests for Issue33202.")
public class Issue33202
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33202");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void attempt1()
    {
        String fileName = Global.pathCombine(folder, "200563.tif");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("http://slancasterw2008/sites/forms/caprequests/Capital Requests?uid=21a10733-3c56-435e-a835-592537b24791", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void attempt2()
    {
        String fileName = Global.pathCombine(folder, "extracted.png");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("http://slancasterw2008/sites/forms/caprequests/Capital Requests?uid=21a10733-3c56-435e-a835-592537b24791", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void attempt3()
    {
        String fileName = Global.pathCombine(folder, "scaled2.png");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("http://slancasterw2008/sites/forms/caprequests/Capital Requests?uid=21a10733-3c56-435e-a835-592537b24791", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void attempt4()
    {
        String fileName = Global.pathCombine(folder, "img0.png");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("http://slancasterw2008/sites/forms/caprequests/Capital Requests?uid=21a10733-3c56-435e-a835-592537b24791", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void attempt5()
    {
        String fileName = Global.pathCombine(folder, "paint.png");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("http://slancasterw2008/sites/forms/caprequests/Capital Requests?uid=21a10733-3c56-435e-a835-592537b24791", reader.getFoundBarCodes()[0].getCodeText());
    }
}

