package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;


@Test(description = "Tests for Issue33362.")
public class Issue33362
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33362");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void attempt1()
    {
        String fileName = Global.pathCombine(folder, "code39ext-19.jpg");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39_FULL_ASCII);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("ZhsFgVUHHp1 BYp*G/U5iRV", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void attempt2()
    {
        String fileName = Global.pathCombine(folder, "code39ext-20.jpg");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39_FULL_ASCII);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("ma.u* GYtU0dz/3pLG80NJJL", reader.getFoundBarCodes()[0].getCodeText());
    }
}

