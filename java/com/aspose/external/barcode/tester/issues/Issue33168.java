// Copyright (c) 2001-2011 Aspose Pty Ltd. All Rights Reserved.

package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Test(description = "Tests for Issue-33168.")
public class Issue33168
{
    final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33168");

    @BeforeMethod
    public void SetUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void test_BookCover_EAN13_Standard()
    {
        String fileName = Global.pathCombine(folder, "BookCover_EAN13_Standard).Tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.EAN_13);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("9771672944114", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_ExpressForm_CODE128_standard()
    {
        List<String> values = new ArrayList<String>();

        String fileName = Global.pathCombine(folder, "ExpressForm_CODE128(standard).Tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        {
            for(BarCodeResult result : reader.readBarCodes())
                values.add(result.getCodeText());
        }

        Assert.assertEquals(4, values.size());
        Assert.assertTrue(values.contains("106985875382"));
        Assert.assertTrue(values.contains("H8085423727"));
        Assert.assertTrue(values.contains("<FNC1>2109023877053256328843"));//bytescout recognizes the same
    }

    @Test
    public void test_In20120315093622200E09B5D()
    {
        String fileName = Global.pathCombine(folder, "In20120315093622200E09B5D-pdf.Tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.EAN_13);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("9787111099253", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_Random_EAN13_Fine()
    {
        String fileName = Global.pathCombine(folder, "Random_EAN13(Fine).Tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.EAN_13);
        {
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("3800035621228", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_Random_EAN13_standard()
    {
        String fileName = Global.pathCombine(folder, "Random_EAN13(standard).Tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.EAN_13);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("9771672258105", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_Random_EAN13_2Fine()
    {
        String fileName = Global.pathCombine(folder, "Random_EAN13_2(Fine).Tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.EAN_13);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("9780586025949", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_Random_ScanToFax_Code39_Fine()
    {
        String fileName = Global.pathCombine(folder, "Random_ScanToFax_Code39(Fine).Tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("HKGLS100", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test_Random_QR_Fine()
    {
        String fileName = Global.pathCombine(folder, "Random_QR(Fine).Tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("MECARD:N:李杜冰;TEL:13500001344;EMAIL:dubing.lee@gmail.com;;", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test_Random_QR_Fine_Page0() throws IOException
    {
        String fullPath = Global.pathCombine(folder, "Random_QR(Fine)\\Page 0.tiff");
//        BufferedImage image = ImageIO.read(new File(fullPath));
        {
            BarCodeReader reader = new BarCodeReader(fullPath, DecodeType.QR);
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals("MECARD:N:李杜冰;TEL:13500001344;EMAIL:dubing.lee@gmail.com;;", reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }

    @Test
    public void test_Random_QR_Fine_Page1() throws IOException
    {
        String fullPath = Global.pathCombine(folder, "Random_QR(Fine)\\Page 1.tiff");
//        BufferedImage image = ImageIO.read(new File(fullPath));
        {
            BarCodeReader reader = new BarCodeReader(fullPath, DecodeType.QR);
            {
                reader.getQualitySettings().setDeconvolution(DeconvolutionMode.SLOW);
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals("株式会社デ", reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }

    @Test
    public void test_Random_QR_Fine_Page2() throws IOException
    {
        List<String> values = new ArrayList<String>();

        String fullPath = Global.pathCombine(folder, "Random_QR(Fine)\\Page 2.tiff");
//        BufferedImage image = ImageIO.read(new File(fullPath));
        {
            BarCodeReader reader = new BarCodeReader(fullPath, DecodeType.QR);
            {
                for(BarCodeResult result : reader.readBarCodes())
                    values.add(result.getCodeText());

                Assert.assertEquals(5, values.size());
                Assert.assertTrue(values.contains("123456789012345678901234567890123456789012345678901234567890123456789012"));
                Assert.assertTrue(values.contains("3456789012345678901234567890123456789012345678901234567890123456789012345"));
                Assert.assertTrue(values.contains("123456789012345678901234567890123456789012345678901234567890123456789012"));
                Assert.assertTrue(values.contains("3456789012345678901234567890123456789012345678901234567890123456789012345"));
            }
        }
    }

    @Test
    public void test_BookCover_EAN13_Standard_AllSup()
    {
        List<BaseDecodeType> readTypes = new ArrayList<BaseDecodeType>();
        List<String> values = new ArrayList<String>();

        String fileName = Global.pathCombine(folder, "BookCover_EAN13_Standard).Tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);
        {
            for(BarCodeResult result : reader.readBarCodes())
            {
                readTypes.add(result.getCodeType());
                values.add(result.getCodeText());
            }

            Assert.assertEquals(2, readTypes.size());
            Assert.assertEquals(2, values.size());
            //Assert.contains(DecodeType.EAN_13, readTypes);
            Assert.assertTrue(readTypes.contains(DecodeType.ISSN));
            Assert.assertTrue(readTypes.contains(DecodeType.SUPPLEMENT));
            //Assert.contains("9771672944114",values);
            Assert.assertTrue(values.contains("16729447"));
            Assert.assertTrue(values.contains("02"));
        }
    }

    @Test
    public void test_ExpressForm_CODE128_standard_AllSup()
    {
        List<String> values = new ArrayList<String>();

        String fileName = Global.pathCombine(folder, "ExpressForm_CODE128(standard).Tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);
        {
            for(BarCodeResult result : reader.readBarCodes())
                values.add(result.getCodeText());
        }

        Assert.assertEquals(4, values.size()); // found a extra code
        Assert.assertTrue(values.contains("106985875382"));
        Assert.assertTrue(values.contains("H8085423727"));
        Assert.assertTrue(values.contains("(21)09023877053256328843"));//bytescout recognizes the same
    }

    @Test
    public void test_In20120315093622200E09B5D_AllSup()
    {
        List<BaseDecodeType> readTypes = new ArrayList<BaseDecodeType>();
        List<String> values = new ArrayList<String>();

        String fileName = Global.pathCombine(folder, "In20120315093622200E09B5D-pdf.Tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);
        {
            for(BarCodeResult result : reader.readBarCodes())
            {
                readTypes.add(result.getCodeType());
                values.add(result.getCodeText());
            }

            Assert.assertEquals(1, readTypes.size());
            Assert.assertEquals(1, values.size());
            Assert.assertTrue(readTypes.contains(DecodeType.ISBN));
            Assert.assertTrue(values.contains("9787111099253"));
        }
    }

    @Test
    public void test_Random_EAN13_Fine_AllSup()
    {
        String fileName = Global.pathCombine(folder, "Random_EAN13(Fine).Tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("3800035621228", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_Random_EAN13_standard_AllSup()
    {
        List<BaseDecodeType> readTypes = new ArrayList<BaseDecodeType>();
        List<String> values = new ArrayList<String>();

        String fileName = Global.pathCombine(folder, "Random_EAN13(standard).Tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);
        {
            for(BarCodeResult result : reader.readBarCodes())
            {
                readTypes.add(result.getCodeType());
                values.add(result.getCodeText());
            }

            Assert.assertEquals(2, readTypes.size());
            Assert.assertEquals(2, values.size());
            //Assert.contains(DecodeType.EAN_13, readTypes);
            Assert.assertTrue(readTypes.contains(DecodeType.ISSN));
            Assert.assertTrue(readTypes.contains(DecodeType.SUPPLEMENT));
            //Assert.contains("9771672258105", values);
            Assert.assertTrue(values.contains("16722582"));
            Assert.assertTrue(values.contains("02"));
        }
    }

    @Test
    public void test_Random_EAN13_2Fine_AllSup()
    {
        List<BaseDecodeType> readTypes = new ArrayList<BaseDecodeType>();
        List<String> values = new ArrayList<String>();

        String fileName = Global.pathCombine(folder, "Random_EAN13_2(Fine).Tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);
        {
            for(BarCodeResult result : reader.readBarCodes())
            {
                readTypes.add(result.getCodeType());
                values.add(result.getCodeText());
            }

            Assert.assertEquals(2, readTypes.size());
            Assert.assertEquals(2, values.size());
            Assert.assertTrue(readTypes.contains(DecodeType.ISBN));
            Assert.assertTrue(readTypes.contains(DecodeType.SUPPLEMENT));
            Assert.assertTrue(values.contains("9780586025949"));
            Assert.assertTrue(values.contains("00499"));
        }
    }

    @Test
    public void test_Random_ScanToFax_Code39_Fine_AllSup()
    {
        String fileName = Global.pathCombine(folder, "Random_ScanToFax_Code39(Fine).Tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("HKGLS100", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_Random_QR_Fine_AllSup()
    {
        String fileName = Global.pathCombine(folder, "Random_QR(Fine).Tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("MECARD:N:李杜冰;TEL:13500001344;EMAIL:dubing.lee@gmail.com;;", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_Random_QR_Fine_Page0_AllSup() throws IOException
    {
        String fullPath = Global.pathCombine(folder, "Random_QR(Fine)\\Page 0.tiff");
        BufferedImage image = ImageIO.read(new File(fullPath));
        {
            BarCodeReader reader = new BarCodeReader(fullPath, DecodeType.ALL_SUPPORTED_TYPES);
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals("MECARD:N:李杜冰;TEL:13500001344;EMAIL:dubing.lee@gmail.com;;", reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }

    @Test
    public void test_Random_QR_Fine_Page1_AllSup() throws IOException
    {
        String fullPath = Global.pathCombine(folder, "Random_QR(Fine)\\Page 1.tiff");
//        BufferedImage image = ImageIO.read(new File(fullPath));
        {
            BarCodeReader reader = new BarCodeReader(fullPath, DecodeType.ALL_SUPPORTED_TYPES);
            {
                reader.getQualitySettings().setDeconvolution(DeconvolutionMode.SLOW);
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals("株式会社デ", reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }

    @Test
    public void test_Random_QR_Fine_Page2_AllSup() throws IOException
    {
        List<String> values = new ArrayList<String>();

        String fullPath = Global.pathCombine(folder, "Random_QR(Fine)\\Page 2.tiff");
//        BufferedImage image = ImageIO.read(new File(fullPath));
        {
            BarCodeReader reader = new BarCodeReader(fullPath, DecodeType.ALL_SUPPORTED_TYPES);
            {
                for(BarCodeResult result : reader.readBarCodes())
                    values.add(result.getCodeText());

                Assert.assertEquals(5, values.size());
                Assert.assertTrue(values.contains("123456789012345678901234567890123456789012345678901234567890123456789012"));
                Assert.assertTrue(values.contains("3456789012345678901234567890123456789012345678901234567890123456789012345"));
                Assert.assertTrue(values.contains("123456789012345678901234567890123456789012345678901234567890123456789012"));
                Assert.assertTrue(values.contains("3456789012345678901234567890123456789012345678901234567890123456789012345"));
            }
        }
    }
}