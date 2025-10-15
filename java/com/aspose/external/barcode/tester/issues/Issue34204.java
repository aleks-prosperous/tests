package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.logger.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.TestExternalHelper;

import java.awt.*;
import java.io.File;
import java.lang.reflect.Method;

public class Issue34204
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue34204");

    @AfterMethod
    public void afterFinish(Method testMethod)
    {
        Logger.methodFinished(getClass().getName() + "." + testMethod.getName());
    }

    @BeforeMethod
    public void setUp(Method testMethod)
    {
        utils.LicenseAssistant.setupLicense();
        Logger.methodStarted(getClass().getName() + "." + testMethod.getName());
    }

        @Test
    public void test_Issue34204_DatabarExpandedSTacked_png_DatabarExpandedStacked()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "DatabarExpandedSTacked.png"), DecodeType.DATABAR_EXPANDED_STACKED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)95012345678903(3103)000123", reader.getFoundBarCodes()[0].getCodeText());
            Point[] expectedPoints = new Point[4];
            expectedPoints[0] = new Point(0, 0);
            expectedPoints[1] = new Point(203, 0);
            expectedPoints[2] = new Point(203, 141);
            expectedPoints[3] = new Point(0, 141);

            TestExternalHelper.checkBarcodesRegionMatching(reader.getFoundBarCodes()[0].getRegion(), expectedPoints, 0.8);
        }
    }

        @Test
    public void test_Issue34204_DatabarStacked_png_DatabarStacked()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "DatabarStacked.png"), DecodeType.DATABAR_STACKED);
        {
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
}
