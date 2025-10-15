package com.aspose.external.barcode.tester.releases.v17_10;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;

public class Issue36681
{
    private String folder = Global.getTestDataFolder("Issues" + File.separatorChar + "Issue36681");

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
    public void testDatabarExpandedStacked()
    {
        String file = folder + "(01)95012345678903(3103)000123(3103)000123.png";
        BarCodeReader reader = new BarCodeReader(file, DecodeType.DATABAR_EXPANDED_STACKED);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("(01)95012345678903(3103)000123(3103)000123", reader.getFoundBarCodes()[0].getCodeText());
    }
}
