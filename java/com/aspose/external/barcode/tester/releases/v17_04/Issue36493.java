package com.aspose.external.barcode.tester.releases.v17_04;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarcodeQualityMode;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;


@Test(description = "Tests for Issue36493.")
public class Issue36493
{
    final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue36493");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void test_01_A_1_08()
    {
        String filename = "01_A_1_08.bmp";
        String path = Global.pathCombine(folder, filename);
        final BarCodeReader reader = new BarCodeReader(path, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("YDEQR93", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test_01_A_1_08_Copy()
    {
        String filename = "01_A_1_08 - Copy.bmp";
        String path = Global.pathCombine(folder, filename);
        final BarCodeReader reader = new BarCodeReader(path, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("YDEQR93", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test_02_A_1_05()
    {
        String filename = "02_A_1_05.bmp";
        String path = Global.pathCombine(folder, filename);
        final BarCodeReader reader = new BarCodeReader(path, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("YDEQR912", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test_04_B_3_01()
    {
        String filename = "04_B_3_01.bmp";
        String path = Global.pathCombine(folder, filename);
        final BarCodeReader reader = new BarCodeReader(path, DecodeType.QR);

        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("YDelectronic0008\0", reader.getFoundBarCodes()[0].getCodeText());

    }

    @Test
    public void test_04_B_3_01_edited()
    {
        String filename = "04_B_3_01_edited.png";
        String path = Global.pathCombine(folder, filename);
        final BarCodeReader reader = new BarCodeReader(path, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("YDelectronic0008\0", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test_05_B_3_01()
    {
        String filename = "05_B_3_01.bmp";
        String path = Global.pathCombine(folder, filename);
        final BarCodeReader reader = new BarCodeReader(path, DecodeType.QR);
        reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("YDelectronic0008\0", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test_09_A_1_08()
    {
        String filename = "09_A_1_08.bmp";
        String path = Global.pathCombine(folder, filename);
        final BarCodeReader reader = new BarCodeReader(path, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("YDEQR93", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test_09_A_1_08_edited()
    {
        String filename = "09_A_1_08_edited.png";
        String path = Global.pathCombine(folder, filename);
        final BarCodeReader reader = new BarCodeReader(path, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("YDEQR93", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test_10_B_3_08()
    {
        String filename = "10_B_3_08.bmp";
        String path = Global.pathCombine(folder, filename);
        final BarCodeReader reader = new BarCodeReader(path, DecodeType.QR);
        reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("YDelectronic0002\0", reader.getFoundBarCodes()[0].getCodeText());
    }
}

