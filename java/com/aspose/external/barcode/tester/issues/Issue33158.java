package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;

@Test(description = "Tests for Issue33158.")
public class Issue33158
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33158");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void demo001jpg()
    {
        String fileName = Global.pathCombine(folder, "001.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("01094702001001x2qouts@boehringer-ingelheim.com", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void demo002jpg()
    {
        String fileName = Global.pathCombine(folder, "002.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("02246082001001results@qc-dms.pharmastulln.de", reader.getFoundBarCodes()[0].getCodeText());
    }
}

