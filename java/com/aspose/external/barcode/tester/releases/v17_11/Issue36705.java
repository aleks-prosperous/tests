package com.aspose.external.barcode.tester.releases.v17_11;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;

public class Issue36705
{
    private String folder = Global.getTestDataFolder("Issues" + File.separatorChar + "Issue36705");

    /**
     * <p>
     * Prepares to run these tests.
     * </p>
     */
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testAllSupportedTypes()
    {
        String file = folder + "image2_barcode_test.png";
        BarCodeReader reader = new BarCodeReader(file);
        Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
    }

    @Test
    public void testCode128()
    {
        String file = folder + "image2_barcode_test.png";
        BarCodeReader reader = new BarCodeReader(file, DecodeType.CODE_128);
        Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
    }

    @Test
    public void testCodabar()
    {
        String file = folder + "image2_barcode_test.png";
        BarCodeReader reader = new BarCodeReader(file, DecodeType.CODABAR);
        Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
    }
}
