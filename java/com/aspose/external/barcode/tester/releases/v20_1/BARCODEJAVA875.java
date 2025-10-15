package com.aspose.external.barcode.tester.releases.v20_1;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.TestExternalHelper;

import java.awt.*;
import java.io.File;

public class BARCODEJAVA875
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue34204");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void test_Issue34204_DatabarStacked_png_DatabarStacked()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "DatabarStacked.png"), DecodeType.DATABAR_STACKED);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("(01)24012345678905", reader.getFoundBarCodes()[0].getCodeText());
        Point[] expectedPoints = new Point[4];
        expectedPoints[0] = new Point(16, 17);
        expectedPoints[1] = new Point(117, 17);
        expectedPoints[2] = new Point(117, 42);
        expectedPoints[3] = new Point(16, 42);

        TestExternalHelper.checkBarcodesRegionMatching(reader.getFoundBarCodes()[0].getRegion(), expectedPoints, 0.8);
    }
}
