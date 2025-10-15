package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;


@Test(description = "Tests for Issue13748.")
public class Issue13748
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue13748");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test()
    {
        final String fileName = "BIL-01192010-NY-00-FL_309.png";
        String path = Global.pathCombine(folder, fileName);
        final BarCodeReader reader = new BarCodeReader(path);
        Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
    }

    @Test
    public void testMSIType()
    {
        final String fileName = "BIL-01192010-NY-00-FL_309.png";
        String path = Global.pathCombine(folder, fileName);

        final BarCodeReader reader = new BarCodeReader(path, DecodeType.MSI);
        Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
    }
}

