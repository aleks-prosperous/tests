package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;
import utils.TestExternalHelper;

import java.awt.*;
import java.io.File;

public class Issue34220
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue34220");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

        @Test
    public void test_Issue34220_Page5_png_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Page5.png"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("GAC2014-997002", reader.getFoundBarCodes()[0].getCodeText());
            Point[] expectedPoints = new Point[4];
            expectedPoints[0] = new Point(1826, 948);
            expectedPoints[1] = new Point(1721, 948);
            expectedPoints[2] = new Point(1826, 1048);
            expectedPoints[3] = new Point(1721, 1048);

            TestExternalHelper.checkBarcodesRegionMatching(reader.getFoundBarCodes()[0].getRegion(), expectedPoints, 0.8);
        }
    }

        @Test
    public void test_Issue34220_Page6_png_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Page6.png"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("GAC2014-997002", reader.getFoundBarCodes()[0].getCodeText());
            Point[] expectedPoints = new Point[4];
            expectedPoints[0] = new Point(1618, 383);
            expectedPoints[1] = new Point(1723, 383);
            expectedPoints[2] = new Point(1723, 485);
            expectedPoints[3] = new Point(1619, 486);

            TestExternalHelper.checkBarcodesRegionMatching(reader.getFoundBarCodes()[0].getRegion(), expectedPoints, 0.8);
        }
    }
}
