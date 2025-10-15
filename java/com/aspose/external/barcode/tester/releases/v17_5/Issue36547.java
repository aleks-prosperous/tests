package com.aspose.external.barcode.tester.releases.v17_5;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;

@Test
public class Issue36547
{
    /**
     * <p>
     * Path to folder with files for testing Issue36547.
     * </p>
     */
    final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue36547");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

        @Test
        //[Category("AllSupportedTypes")]
        //[Category("EAN13")]
    public void test_AllSupportedTypes()
    {
        String fileName = Global.pathCombine(folder, "UPCbarcode.png");
        BarCodeReader reader = new BarCodeReader(fileName);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("889842095388", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("88984209538", reader.getFoundBarCodes()[0].getExtended().getOneD().getValue());
            Assert.assertEquals("8", reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum());
            Assert.assertEquals(DecodeType.UPCA, reader.getFoundBarCodes()[0].getCodeType());
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
        //[Category("EAN13")]
    public void test_AllSupportedTypes_WithChecksum()
    {
        String fileName = Global.pathCombine(folder, "UPCbarcode.png");
        BarCodeReader reader = new BarCodeReader(fileName);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("889842095388", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.UPCA, reader.getFoundBarCodes()[0].getCodeType());
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
        //[Category("EAN13")]
    public void test_AllSupportedTypes_WithChecksum2()
    {
        String fileName = Global.pathCombine(folder, "UPCbarcode.png");
        BarCodeReader reader = new BarCodeReader(fileName);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("889842095388", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.UPCA, reader.getFoundBarCodes()[0].getCodeType());
            Assert.assertEquals("8", reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum());
        }
    }

        @Test
        //[Category("EAN13")]
    public void test_EAN13()
    {
        String fileName = Global.pathCombine(folder, "UPCbarcode.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.EAN_13);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("0889842095388", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("UPCA")]
    public void test_UPCA()
    {
        String fileName = Global.pathCombine(folder, "UPCbarcode.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.UPCA);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("889842095388", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
