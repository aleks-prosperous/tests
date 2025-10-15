package com.aspose.external.barcode.tester.releases.v74;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Issue34289_SingleImage
{
    private final String folder = Global.getIssuesTestImagePath("Issue34289/");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void test_Issue34289_2015_09_19_17_46_42_jpg_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "2015_09_19_17_46_42.jpg"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("H20-WQ9-F91024-0927", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
