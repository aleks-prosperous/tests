package com.aspose.external.barcode.tester.releases.v18_6;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;

public class BARCODEJAVA8
{
    private static final String Folder = Global.getTestDataFolder("barcodjava_issues" + File.separator + "BARCODEJAVA8");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test1()
    {
        String expectedCodeText = "ELBR17~Male~01-Jan-1971~45~No~20~12~Half-yearly~6656000~272235~False~Male~01-Jan-1977~39~R1~20~12~500,000~212~R2~20~12~500,000~170~R3~20~12~500,000~6573~R4~0~0~0~0~R5~0~0~0~0~R6~0~0~0~0~R7~0~0~0~0~R8~0~0~0~0";
        BarCodeReader reader = new BarCodeReader(Folder + File.separator + "QRCODEE011.tiff");

        Assert.assertTrue(reader.readBarCodes().length > 0);
        Assert.assertEquals(expectedCodeText, reader.readBarCodes()[0].getCodeText());

    }

    @Test
    public void test2()
    {
        String expectedCodeText = "ELBR17~Male~01-Jan-1971~45~No~20~12~Half-yearly~6656000~272235~False~Male~01-Jan-1977~39~R1~20~12~500,000~212~R2~20~12~500,000~170~R3~20~12~500,000~6573~R4~0~0~0~0~R5~0~0~0~0~R6~0~0~0~0~R7~0~0~0~0~R8~0~0~0~0";
        BarCodeReader reader = new BarCodeReader(Folder + File.separator + "QRCODEE011__.tiff", DecodeType.QR);

        Assert.assertTrue(reader.readBarCodes().length > 0);
        Assert.assertEquals(expectedCodeText, reader.readBarCodes()[0].getCodeText());

    }
}
