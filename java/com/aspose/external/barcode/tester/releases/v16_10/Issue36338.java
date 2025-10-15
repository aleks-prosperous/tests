package com.aspose.external.barcode.tester.releases.v16_10;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Issue36338
{
    String folder = Global.getTestDataFolder("Issues");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
        //[Category("EAN13")]
    public void test_Issue36338_Correct_png_EAN13()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36338\\Correct.png"), DecodeType.EAN_13);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("5160511119013", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("EAN13")]
    public void test_Issue36338_Incorrect_png_EAN13()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36338\\Incorrect.png"), DecodeType.EAN_13);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("5160511119013", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("EAN13")]
    public void test_Issue36338_Incorrect2_png_EAN13()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36338\\Incorrect2.png"), DecodeType.EAN_13);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("5160511050019", reader.getFoundBarCodes()[0].getCodeText());
        }
        System.out.println("Test for \"Issue36338\\Incorrect2.png\" has completed successfully.");
    }
}
