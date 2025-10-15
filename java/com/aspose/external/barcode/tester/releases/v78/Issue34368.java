package com.aspose.external.barcode.tester.releases.v78;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Issue34368
{
    final String folder = Global.getTestDataFolder("Issues");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
        //[Category("MicrE13B")]
    public void test_Issue34368_MicrBlank1_png_MicrE13B()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34368\\MicrBlank1.png"), DecodeType.MICR_E_13_B);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("A1211D1161A8939D6403C9B0000001000B", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("MicrE13B")]
    public void test_Issue34368_MicrBlank2_png_MicrE13B()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34368\\MicrBlank2.png"), DecodeType.MICR_E_13_B);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("A322270055A123456", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("MicrE13B")]
    public void test_Issue34368_MicrBlank3_png_MicrE13B()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34368\\MicrBlank3.png"), DecodeType.MICR_E_13_B);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("A011234567A001234567C243", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("MicrE13B")]
    public void test_Issue34368_MicrBlank4_png_MicrE13B()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34368\\MicrBlank4.png"), DecodeType.MICR_E_13_B);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("A321171184A040008583292C0304B0000000629B", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
