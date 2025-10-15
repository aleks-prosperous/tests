package com.aspose.external.barcode.tester.releases.v17_9;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;

public class Issue36660
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separatorChar + "Issue36660");

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
        //[Category("AustraliaPost")]
    public void test_Read_AustraliaPost_fromGif()
    {
        String fileName = Global.pathCombine(folder, "AustralianPost.gif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.AUSTRALIA_POST);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1199922233", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.AUSTRALIA_POST, reader.getFoundBarCodes()[0].getCodeType());
        }
    }

        @Test
        //[Category("AustraliaPost")]
        //[Category("AllSupportedTypes")]
    public void test_Read_AustraliaPost_fromGif_AllSupportedTypes()
    {
        String fileName = Global.pathCombine(folder, "AustralianPost.gif");
        BarCodeReader reader = new BarCodeReader(fileName);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1199922233", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.AUSTRALIA_POST, reader.getFoundBarCodes()[0].getCodeType());
        }
    }

        @Test
        //[Category("AustraliaPost")]
    public void test_Read_AustraliaPost_fromGif_cutVersion2()
    {
        String fileName = Global.pathCombine(folder, "AustralianPost_cut2.gif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.AUSTRALIA_POST);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1199922233", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.AUSTRALIA_POST, reader.getFoundBarCodes()[0].getCodeType());
        }
    }

        @Test
        //[Category("AustraliaPost")]
    public void test_Read_AustraliaPost_fromGif_cutVersion()
    {
        String fileName = Global.pathCombine(folder, "AustralianPost_cut.gif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.AUSTRALIA_POST);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1199922233", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.AUSTRALIA_POST, reader.getFoundBarCodes()[0].getCodeType());
        }
    }

        @Test
        //[Category("DutchKIX")]
    public void test_Read_DutchKIX_fromGif()
    {
        String fileName = Global.pathCombine(folder, "DutchKIX.gif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DUTCH_KIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345678", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.DUTCH_KIX, reader.getFoundBarCodes()[0].getCodeType());
        }
    }

        @Test
        //[Category("DutchKIX")]
        //[Category("AllSupportedTypes")]
    public void test_Read_DutchKIX_fromGif_AllSupportedTypes()
    {
        String fileName = Global.pathCombine(folder, "DutchKIX.gif");
        BarCodeReader reader = new BarCodeReader(fileName);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345678", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.DUTCH_KIX, reader.getFoundBarCodes()[0].getCodeType());
        }
    }

        @Test
        //[Category("OneCode")]
    public void test_Read_OneCode_fromGif()
    {
        String fileName = Global.pathCombine(folder, "OneCode.gif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ONE_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("2020202020202020202011111", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.ONE_CODE, reader.getFoundBarCodes()[0].getCodeType());
        }
    }

        @Test
        //[Category("OneCode")]
        //[Category("AllSupportedTypes")]
    public void test_Read_OneCode_fromGif_AllSupportedTypes()
    {
        String fileName = Global.pathCombine(folder, "OneCode.gif");
        BarCodeReader reader = new BarCodeReader(fileName);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("2020202020202020202011111", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.ONE_CODE, reader.getFoundBarCodes()[0].getCodeType());
        }
    }

        @Test
        //[Category("Planet")]
    public void test_Read_Planet_fromGif()
    {
        String fileName = Global.pathCombine(folder, "Planet.gif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PLANET);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1234567800000", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.PLANET, reader.getFoundBarCodes()[0].getCodeType());
        }
    }

        @Test
        //[Category("Planet")]
        //[Category("AllSupportedTypes")]
    public void test_Read_Planet_fromGif_AllSupportedTypes()
    {
        String fileName = Global.pathCombine(folder, "Planet.gif");
        BarCodeReader reader = new BarCodeReader(fileName);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1234567800000", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.PLANET, reader.getFoundBarCodes()[0].getCodeType());
        }
    }

        @Test
        //[Category("Postnet")]
    public void test_Read_Postnet_fromGif()
    {
        String fileName = Global.pathCombine(folder, "Postnet.gif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.POSTNET);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345678901", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.POSTNET, reader.getFoundBarCodes()[0].getCodeType());
        }
    }

        @Test
        //[Category("Postnet")]
        //[Category("AllSupportedTypes")]
    public void test_Read_Postnet_fromGif_AllSupportedTypes()
    {
        String fileName = Global.pathCombine(folder, "Postnet.gif");
        BarCodeReader reader = new BarCodeReader(fileName);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345678901", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.POSTNET, reader.getFoundBarCodes()[0].getCodeType());
        }
    }

        @Test
        //[Category("RM4SCC")]
    public void test_Read_RM4SCC_fromGif()
    {
        String fileName = Global.pathCombine(folder, "RM4SCC.gif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.RM_4_SCC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1234567800000", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.RM_4_SCC, reader.getFoundBarCodes()[0].getCodeType());
        }
    }

        @Test
        //[Category("RM4SCC")]
        //[Category("AllSupportedTypes")]
    public void test_Read_RM4SCC_fromGif_AllSupportedTypes()
    {
        String fileName = Global.pathCombine(folder, "RM4SCC.gif");
        BarCodeReader reader = new BarCodeReader(fileName);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1234567800000", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(DecodeType.RM_4_SCC, reader.getFoundBarCodes()[0].getCodeType());
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_Read_SingaporePost_fromGif_AllSupportedTypes()
    {
        String fileName = Global.pathCombine(folder, "SingaporePost.gif");
        BarCodeReader reader = new BarCodeReader(fileName);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123456", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
