package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;

public class Issue34082
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue34082");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testIssue34082defaultSizePngCode93Standard()
    {
        BarCodeReader reader = new BarCodeReader(folder + "1_2_defaultSize.png", DecodeType.CODE_93);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("1260", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testIssue34082DefaultSizePngCode93Standard()
    {
        BarCodeReader reader = new BarCodeReader(folder + "3_1_defaultSize.png", DecodeType.CODE_93);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("1259", reader.getFoundBarCodes()[0].getCodeText());
    }
}
