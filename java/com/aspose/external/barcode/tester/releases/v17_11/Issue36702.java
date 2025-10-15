package com.aspose.external.barcode.tester.releases.v17_11;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;

public class Issue36702
{
    private String folder = Global.getTestDataFolder("Issues" + File.separatorChar + "Issue36702");

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
        //[Category("Supplement")]
    public void test_DecodeType_IncorrectSupplement_2()
    {
        String fileName = Global.pathCombine(folder, "incorrectSupplement.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.SUPPLEMENT);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
    }

        @Test
        //[Category("Supplement")]
    public void test_DecodeType_IncorrectSupplement_5()
    {
        String fileName = Global.pathCombine(folder, "incorrectSupplement5.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.SUPPLEMENT);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
    }

        @Test
        //[Category("Supplement")]
    public void test_DecodeType_Supplement_5()
    {
        String fileName = Global.pathCombine(folder, "supplement5.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.SUPPLEMENT);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Supplement")]
    public void test_DecodeType_Supplement_2()
    {
        String fileName = Global.pathCombine(folder, "supplement2.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.SUPPLEMENT);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("82", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
