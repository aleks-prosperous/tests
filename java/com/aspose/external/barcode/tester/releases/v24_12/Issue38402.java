package com.aspose.external.barcode.tester.releases.v24_12;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.licensing.LicenseType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Issue38402
{
    static final String Folder = Global.getTestDataFolder("Issues\\Issue38402");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense(LicenseType.Total);
    }

    @Test
    public void test_Code39FromPdf1()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "25279650-001_1.png"), DecodeType.CODE_39_FULL_ASCII);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("GV10789077", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_Code39FromPdf2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "25279650-001_2.png"), DecodeType.CODE_39_FULL_ASCII);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("GV10789184", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_Code39FromDoc1()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "from_doc_1.png"), DecodeType.CODE_39_FULL_ASCII);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("GV10789187", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_Code39FromDoc2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "from_doc_2.png"), DecodeType.CODE_39_FULL_ASCII);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("GV10788660", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_Code39FromDoc3()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "from_doc_3.png"), DecodeType.CODE_39_FULL_ASCII);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("GV10788924", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_Code39FromDoc4()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "from_doc_4.png"), DecodeType.CODE_39_FULL_ASCII);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("GV10789169", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
