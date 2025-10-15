package com.aspose.external.barcode.tester.releases.v18_7;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

public class Issue36215
{
    /// <summary>
    /// Path to folder with files for testing Issue36689.
    /// </summary>
    private static final String folder = Global.getTestDataFolder("Issues\\Issue36215");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
        @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

        @Test
    public void test_DatabarExpandedStacked_All()
    {
        String file = Global.pathCombine(folder, "DatabarExpandedStacked_Sample.png");
        BarCodeReader reader = new BarCodeReader(file);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("(8110)106141411234562891101201212085010048000214025610048000310123191000", reader.getFoundBarCodes()[0].getCodeText());
    }

        @Test
    public void test_DatabarExpandedStacked()
    {
        String file = Global.pathCombine(folder, "DatabarExpandedStacked_Sample.png");
        BarCodeReader reader = new BarCodeReader(file, DecodeType.DATABAR_EXPANDED_STACKED);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("(8110)106141411234562891101201212085010048000214025610048000310123191000", reader.getFoundBarCodes()[0].getCodeText());
    }
}
