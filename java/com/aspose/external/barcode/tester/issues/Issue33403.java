package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;

@Test(description = "Tests for Issue33403.")
public class Issue33403
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33403");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testFromScreenShot()
    {
        String fileName = Global.pathCombine(folder, "[Untitled]_2202201211071100.tif");
        BarCodeReader reader = new BarCodeReader(fileName);
        Assert.assertEquals(reader.readBarCodes().length, 2);
        Assert.assertEquals("3000000000144", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals("01093629146918", reader.getFoundBarCodes()[1].getCodeText());
    }

    @Test
    public void testFromScreenShotConcreteTypes()
    {
        String fileName = Global.pathCombine(folder, "[Untitled]_2202201211071100.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.INTERLEAVED_2_OF_5, DecodeType.EAN_13, DecodeType.UPCE);
        Assert.assertEquals(reader.readBarCodes().length, 2);
        Assert.assertEquals("3000000000144", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals("01093629146918", reader.getFoundBarCodes()[1].getCodeText());
    }

    @Test
    public void testCutted()
    {
        String fileName = Global.pathCombine(folder, "cutted.png");
        BarCodeReader reader = new BarCodeReader(fileName);
        Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
    }
}

