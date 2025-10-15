package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;


@Test(description = "Tests for Issue-33563.")
public class Issue33563
{
    private final String folder = Global.getTestDataFolder("Issues\\Issue33563");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test1()
    {
        String fileName = Global.pathCombine(folder, "IMG0.png");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("1305DOEL05409;8;53;ENR CO:S-2;E7651C4D128C2E0CE9F246F215145A32;", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test2()
    {
        String fileName = Global.pathCombine(folder, "notworking_fullfile.png");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("1305DOEL05409;8;53;ENR CO:S-2;E7651C4D128C2E0CE9F246F215145A32;", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test3()
    {
        String fileName = Global.pathCombine(folder, "notworking_normalres.png");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("1305DOEL05409;8;53;ENR CO:S-2;E7651C4D128C2E0CE9F246F215145A32;", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test4()
    {
        String fileName = Global.pathCombine(folder, "working_file_7percent.png");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("1305DOEL05409;8;53;ENR CO:S-2;E7651C4D128C2E0CE9F246F215145A32;", reader.getFoundBarCodes()[0].getCodeText());

    }

    @Test
    public void test5()
    {
        String fileName = Global.pathCombine(folder, "OutputbyAspose.pdf8.0.0.png");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("1305DOEL05409;8;53;ENR CO:S-2;E7651C4D128C2E0CE9F246F215145A32;", reader.getFoundBarCodes()[0].getCodeText());
    }
}

