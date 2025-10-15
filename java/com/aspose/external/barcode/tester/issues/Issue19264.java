package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Test(description = "Tests for Issue19264.")
public class Issue19264
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue19264");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

        @Test
        //[Category("Pdf417")]
        //[Category("Code39")]
    public void testIMG0()
    {
        List<String> texts = new ArrayList<String>();
        List<BaseDecodeType> types = new ArrayList<BaseDecodeType>();

        String path = Global.pathCombine(folder, "IMG0.png");
        BarCodeReader reader = new BarCodeReader(path, DecodeType.ALL_SUPPORTED_TYPES);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        {
            for(BarCodeResult result : reader.readBarCodes())
            {
                texts.add(result.getCodeText());
                types.add(result.getCodeType());
            }

            Assert.assertTrue(texts.contains("PDF417 (Portable Data File) is a stacked linear two-dimensional barcode used in a variety of applications: primarily transport, postal, identification card and inventory management. It was invented by Ynjiun Wang at Symbol Technologies in 1991, and has spawned an Open Source decoder project together with an Open Source encoder. The PDF417 barcode is also called a symbol barcode and usually consists of 3 to 90 rows, each of which is like a small linear bar code."));
            Assert.assertTrue(texts.contains("0123456789+-/:.$"));
            Assert.assertTrue(texts.contains("0123456"));
            Assert.assertTrue(texts.contains("XRBarCode 0123456"));
            Assert.assertTrue(texts.contains("<FNC1>XRBarCode 0123456"));
            Assert.assertTrue(texts.contains("XRBARCODE%"));
            Assert.assertTrue(texts.contains("BarCODEL"));
            Assert.assertTrue(texts.contains("XRBARCODE"));
            Assert.assertTrue(texts.contains("XRBarCode"));

            Assert.assertTrue(types.contains(DecodeType.PDF_417));
            Assert.assertTrue(types.contains(DecodeType.CODABAR));
            Assert.assertTrue(types.contains(DecodeType.CODE_11));
            Assert.assertTrue(types.contains(DecodeType.CODE_128));
            Assert.assertTrue(types.contains(DecodeType.CODE_128));
            Assert.assertTrue(types.contains(DecodeType.CODE_39_FULL_ASCII));
            Assert.assertTrue(types.contains(DecodeType.CODE_93));
        }
    }

        @Test
    public void testIMG0_39()
    {
        List<String> texts = new ArrayList<String>();
        List<BaseDecodeType> types = new ArrayList<BaseDecodeType>();

        String fileName = Global.pathCombine(folder, "IMG0.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39);
        {
            for(BarCodeResult result : reader.readBarCodes())
            {
                texts.add(result.getCodeText());
                types.add(result.getCodeType());
            }
            Assert.assertEquals(2, texts.size());

            Assert.assertTrue(texts.contains("XRBARCODE%"));
            Assert.assertTrue(texts.contains("B+A+RCODEL"));

            Assert.assertTrue(types.contains(DecodeType.CODE_39));
            Assert.assertTrue(types.contains(DecodeType.CODE_39));
        }
    }

        @Test
    public void testIMG0_93()
    {
        String fileName = Global.pathCombine(folder, "IMG0.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_93);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        {
            Assert.assertEquals(reader.readBarCodes().length, 2);
            Assert.assertEquals("XRBARCODE", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("XRBarCode", reader.getFoundBarCodes()[1].getCodeText());
        }
    }

        @Test
    public void testIMG0_GS1Code128()
    {
        String fileName = Global.pathCombine(folder, "IMG0.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.GS_1_CODE_128);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        {
            Assert.assertEquals(reader.readBarCodes().length, 2);
            Assert.assertEquals("XRBarCode 0123456", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("<FNC1>XRBarCode 0123456", reader.getFoundBarCodes()[1].getCodeText());
        }
    }

        @Test
    public void testIMG1_Standard25()
    {
        String fileName = Global.pathCombine(folder, "IMG1.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.STANDARD_2_OF_5);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("01234567895", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void testIMG1_Matrix25()
    {
        String fileName = Global.pathCombine(folder, "IMG1.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.MATRIX_2_OF_5);
        {
            reader.setQualitySettings(QualitySettings.getHighPerformance());
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("001234567895", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void testIMG1_Interleaved25()
    {
        String fileName = Global.pathCombine(folder, "IMG1.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.INTERLEAVED_2_OF_5);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("001234567895", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void testIMG1_MSI()
    {
        String fileName = Global.pathCombine(folder, "IMG1.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.MSI);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("0123456789", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void testIMG1_UPCA()
    {
        String fileName = Global.pathCombine(folder, "IMG1.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.UPCA);
        Assert.assertEquals(reader.readBarCodes().length, 4);
        Assert.assertEquals("9785318001116", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals("785342354638", reader.getFoundBarCodes()[1].getCodeText());
        Assert.assertEquals("9785318001116", reader.getFoundBarCodes()[2].getCodeText());
        Assert.assertEquals("9785318001116", reader.getFoundBarCodes()[3].getCodeText());
    }

        @Test
    public void testIMG1_UPCE()
    {
        String fileName = Global.pathCombine(folder, "IMG1.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.UPCE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("04252614", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void testIMG1_ISBN()
    {
        List<String> list = new ArrayList<String>();
        String fileName = Global.pathCombine(folder, "IMG1.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ISBN);
        {
            for(BarCodeResult result : reader.readBarCodes())
            list.add(result.getCodeText());

            Assert.assertEquals(4, list.size());
            Assert.assertEquals("9785318001116", list.get(0));
            Assert.assertEquals("0785342354638", list.get(1));//EAN13
            Assert.assertEquals("9785318001116", list.get(2));
            Assert.assertEquals("9785318001116", list.get(3));
        }
    }

        @Test
    public void testIMG1_EAN13()
    {
        List<String> list = new ArrayList<String>();
        String fileName = Global.pathCombine(folder, "IMG1.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.EAN_13);
        {
            for(BarCodeResult result : reader.readBarCodes())
            {
                if (result.getCodeText().equals("0785342354638"))
                    continue;
                list.add(result.getCodeText());
            }
            Assert.assertEquals(3, list.size());
            Assert.assertEquals("9785318001116", list.get(0));
            Assert.assertEquals("9785318001116", list.get(1));
            Assert.assertEquals("9785318001116", list.get(2));
        }
    }

        @Test
    public void testIMG1_Supplement()
    {
        List<String> list = new ArrayList<String>();
        String fileName = Global.pathCombine(folder, "IMG1.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.SUPPLEMENT);
        {
            for(BarCodeResult result : reader.readBarCodes())
            list.add(result.getCodeText());

            Assert.assertEquals(2, list.size());
            Assert.assertTrue(list.contains("01234"));
            Assert.assertTrue(list.contains("01"));
        }
    }
}

