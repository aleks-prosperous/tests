package com.aspose.external.barcode.tester.releases.v17_8;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;

public class Issue36639
{
    /**
     * <p>
     * Path to folder with files for testing Issue36624.
     * </p>
     */
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue36639");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

        @Test
        //[Category("DatabarTruncated")]
    public void test_Read_DatabarTruncated()
    {
        String fileName = Global.pathCombine(folder, "DatabarTruncated.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATABAR_TRUNCATED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)24012345678905", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.DATABAR_TRUNCATED, reader.getFoundBarCodes()[0].getCodeType());
        }
    }

        @Test
        //[Category("DatabarOmniDirectional")]
    public void test_Read_DatabarOmniDirectional()
    {
        String fileName = Global.pathCombine(folder, "DatabarTruncated.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATABAR_OMNI_DIRECTIONAL);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)24012345678905", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.DATABAR_OMNI_DIRECTIONAL, reader.getFoundBarCodes()[0].getCodeType());
        }
    }

        @Test
        //[Category("DatabarOmniDirectional")]
        //[Category("AllSupportedTypes")]
    public void test_Read_AllSupportedTypes()
    {
        String fileName = Global.pathCombine(folder, "DatabarTruncated.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)24012345678905", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.DATABAR_OMNI_DIRECTIONAL, reader.getFoundBarCodes()[0].getCodeType());
        }
    }

        @Test
        //[Category("DatabarOmniDirectional")]
    public void test_GenerateAndRead_DatabarOmniDirectional()
    {
        String text = "(01)2401234567890";

        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATABAR_OMNI_DIRECTIONAL, text);
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.DATABAR_OMNI_DIRECTIONAL);
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals("(01)24012345678905", reader.getFoundBarCodes()[0].getCodeText());
                Assert.assertEquals(DecodeType.DATABAR_OMNI_DIRECTIONAL, reader.getFoundBarCodes()[0].getCodeType());
            }
        }
    }

        @Test
        //[Category("DatabarTruncated")]
    public void test_GenerateAndRead_DatabarTruncated()
    {
        String text = "(01)2401234567890";

        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATABAR_TRUNCATED, text);
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.DATABAR_TRUNCATED);
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals("(01)24012345678905", reader.getFoundBarCodes()[0].getCodeText());
                Assert.assertEquals(DecodeType.DATABAR_TRUNCATED, reader.getFoundBarCodes()[0].getCodeType());
            }
        }
    }
}
