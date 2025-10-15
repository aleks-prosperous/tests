package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


@Test(description = "Tests for Issue33430.")
public class Issue33430
{
    final String folder = Global.getTestDataFolder("Issues/Issue33430");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void testError_AB()
    {
        final String fileName = "qr_error_ab.png";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
    }

    @Test
    public void testEmptyQRCode()
    {
        final String fileName = "qrbarcode_empty.png";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testEmptyQRCodeBinary()
    {
        final String fileName = "qrbarcode_empty_byte.png";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("", reader.getFoundBarCodes()[0].getCodeText());
    }
}

