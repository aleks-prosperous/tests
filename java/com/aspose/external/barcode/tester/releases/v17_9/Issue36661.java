package com.aspose.external.barcode.tester.releases.v17_9;

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

public class Issue36661
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separatorChar + "Issue36661");

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
        //[Category("UPCA")]
    public void test_ReadUPCA()
    {
        String fileName = Global.pathCombine(folder, "UpcaGs1DatabarCoupon.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.UPCA);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("514141100906", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DatabarExpandedStacked")]
    public void test_ReadDatabarExpandedStacked()
    {
        String fileName = Global.pathCombine(folder, "UpcaGs1DatabarCoupon.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATABAR_EXPANDED_STACKED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(8102)03", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void test_DatabarExpandedStacked_Long_3Rows()
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATABAR_EXPANDED_STACKED, "514141100906(8102)03");
        {
            gen.getParameters().getBarcode().getDataBar().setRows(3);
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.DATABAR_EXPANDED_STACKED);
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals("514141100906(8102)03", reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }

        @Test
        //[Category("DatabarStacked")]
    public void test_DatabarStacked()
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATABAR_STACKED, "(8102)03");
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.DATABAR_STACKED);
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals("(01)81020300000000", reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }

        @Test
        //[Category("DatabarExpandedStacked")]
    public void test_ReadDatabarExpandedStacked_only()
    {
        String fileName = Global.pathCombine(folder, "DatabarExpandedStacked.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATABAR_EXPANDED_STACKED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(8102)03", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DatabarExpandedStacked")]
    public void test_ReadDatabarExpandedStacked_zxing()
    {
        String fileName = Global.pathCombine(folder, "(8102)03_xzing.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATABAR_EXPANDED_STACKED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(8102)03", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DatabarExpandedStacked")]
    public void test_DatabarExpandedStacked_0100012345678905()
    {
        String fileName = Global.pathCombine(folder, "(01)00012345678905.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATABAR_EXPANDED_STACKED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)00012345678905", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DatabarExpandedStacked")]
        //[Category("AllSupportedTypes")]
    public void test_ReadDatabarExpandedStacked_cutted()
    {
        String fileName = Global.pathCombine(folder, "UpcaGs1DatabarCoupon_cutted.png");
        BarCodeReader reader = new BarCodeReader(fileName);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(8102)03", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("UPCA")]
        //[Category("DatabarExpandedStacked")]
    public void test_ReadUPCA_and_DatabarExpandedStacked()
    {
        String fileName = Global.pathCombine(folder, "UpcaGs1DatabarCoupon.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.UPCA, DecodeType.DATABAR_EXPANDED_STACKED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 2);
            Assert.assertEquals("514141100906", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("(8102)03", reader.getFoundBarCodes()[1].getCodeText());
        }
    }

        @Test
        //[Category("UPCA")]
        //[Category("DatabarExpandedStacked")]
        //[Category("AllSupportedTypes")]
    public void test_ReadUPCA_and_DatabarExpandedStacked_AllSupportedTypes()
    {
        String fileName = Global.pathCombine(folder, "UpcaGs1DatabarCoupon.png");
        BarCodeReader reader = new BarCodeReader(fileName);
        {
            Assert.assertEquals(reader.readBarCodes().length, 2);
            Assert.assertEquals("514141100906", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("(8102)03", reader.getFoundBarCodes()[1].getCodeText());
        }
    }
}
