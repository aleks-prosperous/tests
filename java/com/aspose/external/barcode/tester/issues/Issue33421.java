//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33421.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="08f2.2013 14:58:02">
//     Copyright (c) 2001-2011 Aspose Pty Ltd. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------------------------------------------

package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.XDimensionMode;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;
import utils.TestExternalHelper;

import java.io.File;


@Test(description = "Tests for Issue33421.")
public class Issue33421
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33421");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

        @Test
    public void test_1D_0()
    {
            String fileName = "1D_0.png";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            TestExternalHelper.assertValueCloseTo(reader.getFoundBarCodes()[0].getRegion().getAngle(), 0, 5);
        }
    }

        @Test
    public void test_1D_90()
    {
            final String fileName = "1D_90.png";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            TestExternalHelper.assertValueCloseTo(reader.getFoundBarCodes()[0].getRegion().getAngle(), 90, 5);
        }
    }

        @Test
    public void test_1D_180()
    {
            final String fileName = "1D_180.png";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            TestExternalHelper.assertValueCloseTo(reader.getFoundBarCodes()[0].getRegion().getAngle(), 180, 5);
        }
    }

        @Test
    public void test_1D_270()
    {
            final String fileName = "1D_270.png";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            TestExternalHelper.assertValueCloseTo(reader.getFoundBarCodes()[0].getRegion().getAngle(), 270, 5);
        }
    }

        @Test
    public void test_1D_15()
    {
            final String fileName = "1D_15.jpg";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            TestExternalHelper.assertValueCloseTo(reader.getFoundBarCodes()[0].getRegion().getAngle(), 15, 5);
        }
    }

        @Test
    public void test_1D_30()
    {
            final String fileName = "1D_30.jpg";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            TestExternalHelper.assertValueCloseTo(reader.getFoundBarCodes()[0].getRegion().getAngle(), 30, 5);
        }
    }

        @Test
    public void test_1D_45()
    {
            final String fileName = "1D_45.jpg";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            TestExternalHelper.assertValueCloseTo(reader.getFoundBarCodes()[0].getRegion().getAngle(), 45, 5);
        }
    }

        @Test
    public void test_1D_60()
    {
            final String fileName = "1D_60.jpg";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            TestExternalHelper.assertValueCloseTo(reader.getFoundBarCodes()[0].getRegion().getAngle(), 60, 5);
        }
    }

        @Test
    public void test_1D_75()
    {
            final String fileName = "1D_75.jpg";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            TestExternalHelper.assertValueCloseTo(reader.getFoundBarCodes()[0].getRegion().getAngle(), 75, 5);
        }
    }

        @Test
    public void test_1D_105()
    {
            final String fileName = "1D_105.jpg";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            TestExternalHelper.assertValueCloseTo(reader.getFoundBarCodes()[0].getRegion().getAngle(), 105, 5);
        }
    }

        @Test
    public void test_1D_120()
    {
            final String fileName = "1D_120.jpg";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            TestExternalHelper.assertValueCloseTo(reader.getFoundBarCodes()[0].getRegion().getAngle(), 120, 5);
        }
    }

        @Test
    public void test_1D_135()
    {
            final String fileName = "1D_135.jpg";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            TestExternalHelper.assertValueCloseTo(reader.getFoundBarCodes()[0].getRegion().getAngle(), 135, 5);
        }
    }

        @Test
    public void test_1D_150()
    {
            final String fileName = "1D_150.jpg";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            TestExternalHelper.assertValueCloseTo(reader.getFoundBarCodes()[0].getRegion().getAngle(), 150, 5);
        }
    }

        @Test
    public void test_1D_165()
    {
            final String fileName = "1D_165.jpg";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            TestExternalHelper.assertValueCloseTo(reader.getFoundBarCodes()[0].getRegion().getAngle(), 165, 5);
        }
    }

        @Test
    public void test_1D_195()
    {
            final String fileName = "1D_195.jpg";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            TestExternalHelper.assertValueCloseTo(reader.getFoundBarCodes()[0].getRegion().getAngle(), 195, 5);
        }
    }

        @Test
    public void test_1D_210()
    {
            final String fileName = "1D_210.jpg";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            TestExternalHelper.assertValueCloseTo(reader.getFoundBarCodes()[0].getRegion().getAngle(), 210, 5);
        }
    }

        @Test
    public void test_1D_225()
    {
            final String fileName = "1D_225.jpg";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            TestExternalHelper.assertValueCloseTo(reader.getFoundBarCodes()[0].getRegion().getAngle(), 225, 5);
        }
    }

        @Test
    public void test_1D_240()
    {
            final String fileName = "1D_240.jpg";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            TestExternalHelper.assertValueCloseTo(reader.getFoundBarCodes()[0].getRegion().getAngle(), 240, 5);
        }
    }

        @Test
    public void test_1D_255()
    {
            final String fileName = "1D_255.jpg";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            TestExternalHelper.assertValueCloseTo(reader.getFoundBarCodes()[0].getRegion().getAngle(), 255, 5);
        }
    }

        @Test
    public void test_1D_285()
    {
            final String fileName = "1D_285.jpg";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            TestExternalHelper.assertValueCloseTo(reader.getFoundBarCodes()[0].getRegion().getAngle(), 285, 5);
        }
    }

        @Test
    public void test_1D_300()
    {
            final String fileName = "1D_300.jpg";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            TestExternalHelper.assertValueCloseTo(reader.getFoundBarCodes()[0].getRegion().getAngle(), 300, 5);
        }
    }

        @Test
    public void test_1D_315()
    {
            final String fileName = "1D_315.jpg";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            TestExternalHelper.assertValueCloseTo(reader.getFoundBarCodes()[0].getRegion().getAngle(), 315, 5);
        }
    }

        @Test
    public void test_1D_330()
    {
            final String fileName = "1D_330.jpg";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            TestExternalHelper.assertValueCloseTo(reader.getFoundBarCodes()[0].getRegion().getAngle(), 330, 5);
        }
    }

        @Test
    public void test_1D_345()
    {
            final String fileName = "1D_345.jpg";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            TestExternalHelper.assertValueCloseTo(reader.getFoundBarCodes()[0].getRegion().getAngle(), 345, 5);
        }
    }

        @Test
    public void test_Postal_0()
    {
            final String fileName = "postal_AustraliaPost_0.png";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.AUSTRALIA_POST);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1112345678", reader.getFoundBarCodes()[0].getCodeText());
            TestExternalHelper.assertValueCloseTo(reader.getFoundBarCodes()[0].getRegion().getAngle(), 0, 5);
        }
    }

        @Test
    public void test_Postal_90()
    {
            final String fileName = "postal_AustraliaPost_90.png";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.AUSTRALIA_POST);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1112345678", reader.getFoundBarCodes()[0].getCodeText());
            TestExternalHelper.assertValueCloseTo(reader.getFoundBarCodes()[0].getRegion().getAngle(), 90, 5);
        }
    }

        @Test
    public void test_Postal_180()
    {
            final String fileName = "postal_AustraliaPost_180.png";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.AUSTRALIA_POST);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1112345678", reader.getFoundBarCodes()[0].getCodeText());
            TestExternalHelper.assertValueCloseTo(reader.getFoundBarCodes()[0].getRegion().getAngle(), 180, 5);
        }
    }

        @Test
    public void test_Postal_270()
    {
            final String fileName = "postal_AustraliaPost_270.png";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.AUSTRALIA_POST);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1112345678", reader.getFoundBarCodes()[0].getCodeText());
            TestExternalHelper.assertValueCloseTo(reader.getFoundBarCodes()[0].getRegion().getAngle(), 270, 5);
        }
    }

        @Test
    public void test_Aztec_0()
    {
            final String fileName = "Aztec_0.png";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123456 ABCDE", reader.getFoundBarCodes()[0].getCodeText());
            TestExternalHelper.assertValueCloseTo(reader.getFoundBarCodes()[0].getRegion().getAngle(), 0, 5);
        }
    }

        @Test
    public void test_Aztec_90()
    {
            final String fileName = "Aztec_90.png";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123456 ABCDE", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(90d, reader.getFoundBarCodes()[0].getRegion().getAngle());
        }
    }

        @Test
    public void test_Aztec_180()
    {
            final String fileName = "Aztec_180.png";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123456 ABCDE qwertyuiop", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(180d, reader.getFoundBarCodes()[0].getRegion().getAngle());
        }
    }

        @Test
    public void test_Aztec_270()
    {
            final String fileName = "Aztec_270.png";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123456", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(270d, reader.getFoundBarCodes()[0].getRegion().getAngle());
        }
    }

        @Test
    public void test_PDF417_0()
    {
            final String fileName = "PDF417_0.png";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123456 ABCDE qwertyuiop", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(0d, reader.getFoundBarCodes()[0].getRegion().getAngle());
        }
    }

        @Test
    public void test_PDF417_3()
    {
            final String fileName = "PDF417_3.png";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("ABCDEF", reader.getFoundBarCodes()[0].getCodeText());
            TestExternalHelper.assertValueCloseTo(reader.getFoundBarCodes()[0].getRegion().getAngle(), 354, 5);
        }
    }

        @Test
    public void test_MicroPDF417_0()
    {
            final String fileName = "MicroPDF417_0.png";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.MICRO_PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Zorro Wins", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(0d, reader.getFoundBarCodes()[0].getRegion().getAngle());
        }
    }

        @Test
    public void test_QR_0()
    {
            final String fileName = "QR_0.png";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123456 ABCDE qwertyuiop", reader.getFoundBarCodes()[0].getCodeText());
            TestExternalHelper.assertValueCloseTo(reader.getFoundBarCodes()[0].getRegion().getAngle(), 0, 5);
        }
    }

        @Test
    public void test_QR_90()
    {
        final String fileName = "QR_90.png";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123456 ABCDE qwertyuiop", reader.getFoundBarCodes()[0].getCodeText());
            TestExternalHelper.assertValueCloseTo(reader.getFoundBarCodes()[0].getRegion().getAngle(), 90, 5);
        }
    }

        @Test
    public void test_QR_180()
    {
            final String fileName = "QR_180.png";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123456 ABCDE qwertyuiop", reader.getFoundBarCodes()[0].getCodeText());
            TestExternalHelper.assertValueCloseTo(reader.getFoundBarCodes()[0].getRegion().getAngle(), 180, 5);
        }
    }


        @Test
    public void test_QR_270()
    {
            final String fileName = "QR_270.png";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123456 ABCDE qwertyuiop", reader.getFoundBarCodes()[0].getCodeText());
            TestExternalHelper.assertValueCloseTo(reader.getFoundBarCodes()[0].getRegion().getAngle(), 270, 5);
        }
    }

        @Test
    public void test_QR_2()
    {
            final String fileName = "QR_2.jpg";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123456 ABCDE qwertyuiop", reader.getFoundBarCodes()[0].getCodeText());
            TestExternalHelper.assertValueCloseTo(reader.getFoundBarCodes()[0].getRegion().getAngle(), 2, 5);
        }
    }

        @Test
    public void test_QR_75()
    {
            final String fileName = "QR_75.jpg";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.QR);
        {
            reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123456 ABCDE qwertyuiop", reader.getFoundBarCodes()[0].getCodeText());
            TestExternalHelper.assertValueCloseTo(reader.getFoundBarCodes()[0].getRegion().getAngle(), 75, 5);
        }
    }

        @Test
    public void test_Datamatrix_0()
    {
            final String fileName = "Datamatrix_0.png";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123456 ABCDE qwertyuiop", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(0d, reader.getFoundBarCodes()[0].getRegion().getAngle());
        }
    }

        @Test
    public void test_Datamatrix_90()
    {
            final String fileName = "Datamatrix_90.png";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123456 ABCDE qwertyuiop", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(90d, reader.getFoundBarCodes()[0].getRegion().getAngle());
        }
    }

        @Test
    public void test_Datamatrix_180()
    {
            final String fileName = "Datamatrix_180.png";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123456 ABCDE qwertyuiop", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(180d, reader.getFoundBarCodes()[0].getRegion().getAngle());
        }
    }


        @Test
    public void test_Datamatrix_270()
    {
            final String fileName = "Datamatrix_270.png";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123456 ABCDE qwertyuiop", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(270d, reader.getFoundBarCodes()[0].getRegion().getAngle());
        }
    }

        @Test
    public void test_Datamatrix_0_Rect()
    {
            final String fileName = "Datamatrix_0_Rect.png";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("ABCDE", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(0d, reader.getFoundBarCodes()[0].getRegion().getAngle());
        }
    }

        @Test
    public void test_Datamatrix_90_Rect()
    {
            final String fileName = "Datamatrix_90_Rect.png";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("A", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(90d, reader.getFoundBarCodes()[0].getRegion().getAngle());
        }
    }

        @Test
    public void test_Datamatrix_180_Rect()
    {
            final String fileName = "Datamatrix_180_Rect.png";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("ABCDE", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(180d, reader.getFoundBarCodes()[0].getRegion().getAngle());
        }
    }


        @Test
    public void test_Datamatrix_270_Rect()
    {
            final String fileName = "Datamatrix_270_Rect.png";
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("ABCDE", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(270d, reader.getFoundBarCodes()[0].getRegion().getAngle());
        }
    }
}

