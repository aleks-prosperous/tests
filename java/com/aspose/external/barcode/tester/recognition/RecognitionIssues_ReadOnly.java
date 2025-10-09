package com.aspose.external.barcode.tester.recognition;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.*;
import utils.TestExternalHelper;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RecognitionIssues_ReadOnly
{

    private String _folder;

        @BeforeMethod
    public void SetupTestFixture()
    {
        this._folder = Global.getTestDataFolder("Issues");
        com.aspose.barcode.LicenseAssistant.setupLicense();
    }

        @Test
        //[Category("EAN8")]
        //[Category("MSI")]
    public void test_Issue36321_00000039F_tif_EAN8_MSI()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue36321\\00000039F.tif"), DecodeType.scanSets(DecodeType.EAN_8, DecodeType.MSI));
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
        //[Category("Supplement")]
    public void test_Issue36321_00000052B_tif_Supplement()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue36321\\00000052B.tif"), DecodeType.SUPPLEMENT);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
        //[Category("Code128")]
        //[Category("UPCE")]
        //[Category("EAN13")]
    public void test_Issue36302_00000046F_tif_Code128_UPCE_EAN13()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue36302\\00000046F.tif"), DecodeType.scanSets(DecodeType.CODE_128, DecodeType.UPCE, DecodeType.EAN_13));
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
        //[Category("MSI")]
        //[Category("UPCE")]
    public void test_Issue36302_00000043F_tif_MSI_UPCE()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue36302\\00000043F.tif"), DecodeType.scanSets(DecodeType.MSI, DecodeType.UPCE));
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
        //[Category("Code128")]
        //[Category("Code128")]
        //[Category("MSI")]
        //[Category("EAN8")]
        //[Category("Code11")]
        //[Category("UPCE")]
    public void test_Issue36302_00000037B_tif_Code128_MSI_EAN8_Code11_UPCE()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue36302\\00000037B.tif"), DecodeType.scanSets(DecodeType.CODE_128, DecodeType.MSI, DecodeType.EAN_8, DecodeType.CODE_11, DecodeType.UPCE));
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
        //[Category("Code11")]
        //[Category("MSI")]
    public void test_Issue36302_00000015F_tif_Code11_MSI()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue36302\\00000015F.tif"), DecodeType.scanSets(DecodeType.CODE_11, DecodeType.MSI));
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
        //[Category("EAN8")]
    public void test_Issue36302_00000010_00000003_2_tif_EAN8()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue36302\\00000010_00000003_2.tif"), DecodeType.scanSets(DecodeType.EAN_8));
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
        //[Category("Code128")]
        //[Category("MSI")]
        //[Category("EAN8")]
        //[Category("EAN13")]
    public void test_Issue36302_00000001F_tif_Code128_MSI_EAN8_EAN13()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue36302\\00000001F.tif"), DecodeType.scanSets(DecodeType.CODE_128, DecodeType.MSI, DecodeType.EAN_8, DecodeType.EAN_13));
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
        //[Category("DutchKIX")]
    public void test_Issue36312_00000013F_tif_DutchKIX()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue36312\\00000013F.tif"), DecodeType.DUTCH_KIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
        //[Category("PatchCode")]
    public void test_Issue34403_2M0461619763_TIFF_PatchCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue34403\\2M0461619763.TIFF"), DecodeType.PATCH_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
        //[Category("PatchCode")]
    public void test_Issue34403_GBV2016030100022_001_TIFF_PatchCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue34403\\GBV2016030100022.001.TIFF"), DecodeType.PATCH_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
        //[Category("PatchCode")]
    public void test_Issue34403_PathIV_TIFF_PatchCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue34403\\PathIV.TIFF"), DecodeType.PATCH_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
        //[Category("Code128")]
    public void test_Issue33935_2014052811592031_tif_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33935\\20140528115920-31.tif"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
        //[Category("DataMatrix")]
    public void test_Issue34141_datamatrixB4L7S02IMG_20150106_150302_jpg_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue34141\\datamatrix-B4L7S02-IMG_20150106_150302.jpg"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
        //[Category("AustraliaPost")]
    public void test_Issue33424_Postal_AustraliaPost_Png_AustraliaPost()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33424\\Postal\\AustraliaPost.Png"), DecodeType.AUSTRALIA_POST);
        {
            Point[] expectedPoints = new Point[4];
            expectedPoints[0] = new Point(16, 4);
            expectedPoints[1] = new Point(162, 4);
            expectedPoints[2] = new Point(162, 22);
            expectedPoints[3] = new Point(16, 22);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            TestExternalHelper.checkBarcodesRegionMatching(reader.getFoundBarCodes()[0].getRegion(), expectedPoints, 0.98);
        }
    }

        @Test
        //[Category("OneCode")]
    public void test_Issue33424_Postal_OneCode_Png_OneCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33424\\Postal\\OneCode.Png"), DecodeType.ONE_CODE);
        {
            Point[] expectedPoints = new Point[4];
            expectedPoints[0] = new Point(16, 4);
            expectedPoints[1] = new Point(274, 4);
            expectedPoints[2] = new Point(274, 16);
            expectedPoints[3] = new Point(16, 16);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            TestExternalHelper.checkBarcodesRegionMatching(reader.getFoundBarCodes()[0].getRegion(), expectedPoints, 0.98);
        }
    }

        @Test
        //[Category("Planet")]
    public void test_Issue33424_Postal_Planet_Png_Planet()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33424\\Postal\\Planet.Png"), DecodeType.PLANET);
        {
            Point[] expectedPoints = new Point[4];
            expectedPoints[0] = new Point(16, 4);
            expectedPoints[1] = new Point(162, 4);
            expectedPoints[2] = new Point(162, 15);
            expectedPoints[3] = new Point(16, 15);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            TestExternalHelper.checkBarcodesRegionMatching(reader.getFoundBarCodes()[0].getRegion(), expectedPoints, 0.98);
        }
    }

        @Test
        //[Category("Postnet")]
    public void test_Issue33424_Postal_Postnet_Png_Postnet()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33424\\Postal\\Postnet.Png"), DecodeType.POSTNET);
        {
            Point[] expectedPoints = new Point[4];
            expectedPoints[0] = new Point(16, 4);
            expectedPoints[1] = new Point(162, 4);
            expectedPoints[2] = new Point(162, 15);
            expectedPoints[3] = new Point(16, 15);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            TestExternalHelper.checkBarcodesRegionMatching(reader.getFoundBarCodes()[0].getRegion(), expectedPoints, 0.98);
        }
    }

        @Test
        //[Category("RM4SCC")]
    public void test_Issue33424_Postal_RM4SCC_Png_RM4SCC()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33424\\Postal\\RM4SCC.Png"), DecodeType.RM_4_SCC);
        {
            Point[] expectedPoints = new Point[4];
            expectedPoints[0] = new Point(16, 4);
            expectedPoints[1] = new Point(134, 4);
            expectedPoints[2] = new Point(134, 22);
            expectedPoints[3] = new Point(16, 22);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            TestExternalHelper.checkBarcodesRegionMatching(reader.getFoundBarCodes()[0].getRegion(), expectedPoints, 0.98);
        }
    }

        @Test
        //[Category("DataMatrix")]
    public void test_Issue33424_2D_DataMatrix_Png_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33424\\2D\\DataMatrix.Png"), DecodeType.DATA_MATRIX);
        {
            Point[] expectedPoints = new Point[4];
            expectedPoints[0] = new Point(16, 4);
            expectedPoints[1] = new Point(35, 4);
            expectedPoints[2] = new Point(35, 23);
            expectedPoints[3] = new Point(16, 23);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            TestExternalHelper.checkBarcodesRegionMatching(reader.getFoundBarCodes()[0].getRegion(), expectedPoints, 0.98);
        }
    }

        @Test
        //[Category("QR")]
    public void test_Issue33424_2D_QR_Png_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33424\\2D\\QR.Png"), DecodeType.QR);
        {
            Point[] expectedPoints = new Point[4];
            expectedPoints[0] = new Point(15, 3);
            expectedPoints[1] = new Point(58, 3);
            expectedPoints[2] = new Point(58, 46);
            expectedPoints[3] = new Point(15, 46);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            TestExternalHelper.checkBarcodesRegionMatching(reader.getFoundBarCodes()[0].getRegion(), expectedPoints, 0.97);
        }
    }

        @Test
        //[Category("Aztec")]
    public void test_Issue33424_2D_Aztec_Png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33424\\2D\\Aztec.Png"), DecodeType.AZTEC);
        {
            Point[] expectedPoints = new Point[4];
            expectedPoints[0] = new Point(16, 4);
            expectedPoints[1] = new Point(45, 4);
            expectedPoints[2] = new Point(45, 33);
            expectedPoints[3] = new Point(16, 33);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            TestExternalHelper.checkBarcodesRegionMatching(reader.getFoundBarCodes()[0].getRegion(), expectedPoints, 0.98);
        }
    }

        @Test
        //[Category("Pdf417")]
    public void test_Issue33424_2D_Pdf417_Png_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33424\\2D\\Pdf417.Png"), DecodeType.PDF_417);
        {
            Point[] expectedPoints = new Point[4];
            expectedPoints[0] = new Point(16, 4);
            expectedPoints[1] = new Point(185, 4);
            expectedPoints[2] = new Point(185, 66);
            expectedPoints[3] = new Point(16, 66);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            TestExternalHelper.checkBarcodesRegionMatching(reader.getFoundBarCodes()[0].getRegion(), expectedPoints, 0.98);
        }
    }

        @Test
        //[Category("MacroPdf417")]
    public void test_Issue33424_2D_MacroPdf417_Png_MacroPdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33424\\2D\\MacroPdf417.Png"), DecodeType.MACRO_PDF_417);
        {
            Point[] expectedPoints = new Point[4];
            expectedPoints[0] = new Point(16, 4);
            expectedPoints[1] = new Point(423, 4);
            expectedPoints[2] = new Point(423, 633);
            expectedPoints[3] = new Point(16, 633);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            TestExternalHelper.checkBarcodesRegionMatching(reader.getFoundBarCodes()[0].getRegion(), expectedPoints, 0.98);
        }
    }

        @Test
        //[Category("MicroPdf417")]
    public void test_Issue33424_2D_MicroPdf417_Png_MicroPdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33424\\2D\\MicroPdf417.Png"), DecodeType.MICRO_PDF_417);
        {
            Point[] expectedPoints = new Point[4];
            expectedPoints[0] = new Point(118, 45);
            expectedPoints[1] = new Point(388, 45);
            expectedPoints[2] = new Point(388, 155);
            expectedPoints[3] = new Point(118, 155);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            TestExternalHelper.checkBarcodesRegionMatching(reader.getFoundBarCodes()[0].getRegion(), expectedPoints, 0.98);
        }
    }

        @Test
        //[Category("Code128")]
    public void test_Issue33597_TestingDifferentSizes_ReadOnly_0_27x18_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33597\\TestingDifferentSizes_ReadOnly_0_27x18.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
    }

        @Test
        //[Category("Code128")]
    public void test_Issue33597_TestingDifferentSizes_ReadOnly_1_28x18_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33597\\TestingDifferentSizes_ReadOnly_1_28x18.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
    }

        @Test
        //[Category("Code128")]
    public void test_Issue33597_TestingDifferentSizes_ReadOnly_2_29x18_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33597\\TestingDifferentSizes_ReadOnly_2_29x18.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
    }

        @Test
        //[Category("Code128")]
    public void test_Issue33597_TestingDifferentSizes_ReadOnly_3_30x18_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33597\\TestingDifferentSizes_ReadOnly_3_30x18.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
    }

        @Test
        //[Category("Code128")]
    public void test_Issue33597_TestingDifferentSizes_ReadOnly_4_31x18_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33597\\TestingDifferentSizes_ReadOnly_4_31x18.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
    }

        @Test
        //[Category("Code128")]
    public void test_Issue33597_TestingDifferentSizes_ReadOnly_5_32x18_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33597\\TestingDifferentSizes_ReadOnly_5_32x18.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
    }

        @Test
        //[Category("Code128")]
    public void test_Issue33597_TestingDifferentSizes_ReadOnly_6_33x18_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33597\\TestingDifferentSizes_ReadOnly_6_33x18.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
    }

        @Test
        //[Category("Code128")]
    public void test_Issue33597_TestingDifferentSizes_ReadOnly_7_34x18_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33597\\TestingDifferentSizes_ReadOnly_7_34x18.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
    }

        @Test
        //[Category("Code128")]
    public void test_Issue33597_TestingDifferentSizes_ReadOnly_8_35x18_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33597\\TestingDifferentSizes_ReadOnly_8_35x18.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
    }

        @Test
        //[Category("Code39Extended")]
    public void test_Issue33597_TestingDifferentSizes_ReadOnly_74_35x18_png_Code39Extended()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33597\\TestingDifferentSizes_ReadOnly_74_35x18.png"), DecodeType.CODE_39_FULL_ASCII);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
    }

        @Test
        //[Category("Code39Extended")]
    public void test_Issue33597_TestingDifferentSizes_ReadOnly_75_36x18_png_Code39Extended()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33597\\TestingDifferentSizes_ReadOnly_75_36x18.png"), DecodeType.CODE_39_FULL_ASCII);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
    }

        @Test
        //[Category("Code39Extended")]
    public void test_Issue33597_TestingDifferentSizes_ReadOnly_76_37x18_png_Code39Extended()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33597\\TestingDifferentSizes_ReadOnly_76_37x18.png"), DecodeType.CODE_39_FULL_ASCII);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
    }

        @Test
        //[Category("Code39Extended")]
    public void test_Issue33597_TestingDifferentSizes_ReadOnly_77_38x18_png_Code39Extended()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33597\\TestingDifferentSizes_ReadOnly_77_38x18.png"), DecodeType.CODE_39_FULL_ASCII);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
    }

        @Test
        //[Category("Code39Extended")]
    public void test_Issue33597_TestingDifferentSizes_ReadOnly_78_39x18_png_Code39Extended()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33597\\TestingDifferentSizes_ReadOnly_78_39x18.png"), DecodeType.CODE_39_FULL_ASCII);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
    }

        @Test
        //[Category("Code39Extended")]
    public void test_Issue33597_TestingDifferentSizes_ReadOnly_79_40x18_png_Code39Extended()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33597\\TestingDifferentSizes_ReadOnly_79_40x18.png"), DecodeType.CODE_39_FULL_ASCII);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
    }

        @Test
        //[Category("Code39Extended")]
    public void test_Issue33597_TestingDifferentSizes_ReadOnly_80_41x18_png_Code39Extended()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33597\\TestingDifferentSizes_ReadOnly_80_41x18.png"), DecodeType.CODE_39_FULL_ASCII);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
    }

        @Test
        //[Category("Code39Extended")]
    public void test_Issue33597_TestingDifferentSizes_ReadOnly_81_42x18_png_Code39Extended()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33597\\TestingDifferentSizes_ReadOnly_81_42x18.png"), DecodeType.CODE_39_FULL_ASCII);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
    }

        @Test
        //[Category("Code39Extended")]
    public void test_Issue33597_TestingDifferentSizes_ReadOnly_82_43x18_png_Code39Extended()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33597\\TestingDifferentSizes_ReadOnly_82_43x18.png"), DecodeType.CODE_39_FULL_ASCII);
        {
            BarCodeResult[] res = reader.readBarCodes();
            Assert.assertEquals(0, res.length, "false is ok");
        }
    }

        @Test
        //[Category("Code39Extended")]
    public void test_Issue33597_TestingDifferentSizes_ReadOnly_83_44x18_png_Code39Extended()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33597\\TestingDifferentSizes_ReadOnly_83_44x18.png"), DecodeType.CODE_39_FULL_ASCII);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
    }

        @Test
        //[Category("Code39Extended")]
    public void test_Issue33597_TestingDifferentSizes_ReadOnly_84_45x18_png_Code39Extended()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33597\\TestingDifferentSizes_ReadOnly_84_45x18.png"), DecodeType.CODE_39_FULL_ASCII);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
    }

        @Test
        //[Category("Code39Extended")]
    public void test_Issue33597_TestingDifferentSizes_ReadOnly_85_46x18_png_Code39Extended()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33597\\TestingDifferentSizes_ReadOnly_85_46x18.png"), DecodeType.CODE_39_FULL_ASCII);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
    }

        @Test
        //[Category("Code93Extended")]
    public void test_Issue33597_TestingDifferentSizes_ReadOnly_140_25x18_png_Code93Extended()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33597\\TestingDifferentSizes_ReadOnly_140_25x18.png"), DecodeType.CODE_93);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
    }

        @Test
        //[Category("Code93Extended")]
    public void test_Issue33597_TestingDifferentSizes_ReadOnly_141_26x18_png_Code93Extended()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33597\\TestingDifferentSizes_ReadOnly_141_26x18.png"), DecodeType.CODE_93);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
    }

        @Test
        //[Category("Code93Extended")]
    public void test_Issue33597_TestingDifferentSizes_ReadOnly_142_27x18_png_Code93Extended()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33597\\TestingDifferentSizes_ReadOnly_142_27x18.png"), DecodeType.CODE_93);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
    }

        @Test
        //[Category("Code93Extended")]
    public void test_Issue33597_TestingDifferentSizes_ReadOnly_143_28x18_png_Code93Extended()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33597\\TestingDifferentSizes_ReadOnly_143_28x18.png"), DecodeType.CODE_93);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
    }

        @Test
        //[Category("Code93Extended")]
    public void test_Issue33597_TestingDifferentSizes_ReadOnly_144_29x18_png_Code93Extended()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33597\\TestingDifferentSizes_ReadOnly_144_29x18.png"), DecodeType.CODE_93);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
    }

        @Test
        //[Category("Code93Extended")]
    public void test_Issue33597_TestingDifferentSizes_ReadOnly_145_30x18_png_Code93Extended()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33597\\TestingDifferentSizes_ReadOnly_145_30x18.png"), DecodeType.CODE_93);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
    }

        @Test
        //[Category("Code93Extended")]
    public void test_Issue33597_TestingDifferentSizes_ReadOnly_146_31x18_png_Code93Extended()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33597\\TestingDifferentSizes_ReadOnly_146_31x18.png"), DecodeType.CODE_93);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
    }

        @Test
        //[Category("Code93Extended")]
    public void test_Issue33597_TestingDifferentSizes_ReadOnly_216_25x18_png_Code93Extended()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33597\\TestingDifferentSizes_ReadOnly_216_25x18.png"), DecodeType.CODE_93);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
    }

        @Test
        //[Category("Code93Extended")]
    public void test_Issue33597_TestingDifferentSizes_ReadOnly_217_26x18_png_Code93Extended()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33597\\TestingDifferentSizes_ReadOnly_217_26x18.png"), DecodeType.CODE_93);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
    }

        @Test
        //[Category("Code93Extended")]
    public void test_Issue33597_TestingDifferentSizes_ReadOnly_218_27x18_png_Code93Extended()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33597\\TestingDifferentSizes_ReadOnly_218_27x18.png"), DecodeType.CODE_93);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
    }

        @Test
        //[Category("Code93Extended")]
    public void test_Issue33597_TestingDifferentSizes_ReadOnly_219_28x18_png_Code93Extended()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33597\\TestingDifferentSizes_ReadOnly_219_28x18.png"), DecodeType.CODE_93);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
    }

        @Test
        //[Category("Code93Extended")]
    public void test_Issue33597_TestingDifferentSizes_ReadOnly_220_29x18_png_Code93Extended()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33597\\TestingDifferentSizes_ReadOnly_220_29x18.png"), DecodeType.CODE_93);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
    }

        @Test
        //[Category("Code93Extended")]
    public void test_Issue33597_TestingDifferentSizes_ReadOnly_221_30x18_png_Code93Extended()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33597\\TestingDifferentSizes_ReadOnly_221_30x18.png"), DecodeType.CODE_93);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
    }

        @Test
        //[Category("Code93Extended")]
    public void test_Issue33597_TestingDifferentSizes_ReadOnly_222_31x18_png_Code93Extended()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33597\\TestingDifferentSizes_ReadOnly_222_31x18.png"), DecodeType.CODE_93);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
    }

        @Test
        //[Category("DataMatrix")]
    public void test_Issue33845_oneDataMatrix_png_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33845\\oneDataMatrix.png"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("D000180090955", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Standard2of5")]
    public void test_Issue23729_aspose_png_Standard2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue23729\\aspose.png"), DecodeType.STANDARD_2_OF_5);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
    }

        @Test
        //[Category("Codabar")]
    public void test_Issue33516_SymbologyItem_26_Codabar_png_Codabar()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33516\\SymbologyItem_26_Codabar.png"), DecodeType.CODABAR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code11")]
    public void test_Issue33516_SymbologyItem_27_Code11_png_Code11()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33516\\SymbologyItem_27_Code11.png"), DecodeType.CODE_11);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code39Standard")]
    public void test_Issue33516_SymbologyItem_28_Code39Standard_png_Code39Standard()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33516\\SymbologyItem_28_Code39Standard.png"), DecodeType.CODE_39);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code39Extended")]
    public void test_Issue33516_SymbologyItem_29_Code39Extended_png_Code39Extended()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33516\\SymbologyItem_29_Code39Extended.png"), DecodeType.CODE_39_FULL_ASCII);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code93Standard")]
    public void test_Issue33516_SymbologyItem_30_Code93Standard_png_Code93Standard()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33516\\SymbologyItem_30_Code93Standard.png"), DecodeType.CODE_93);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code93Extended")]
    public void test_Issue33516_SymbologyItem_31_Code93Extended_png_Code93Extended()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33516\\SymbologyItem_31_Code93Extended.png"), DecodeType.CODE_93);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code128")]
    public void test_Issue33516_SymbologyItem_32_Code128_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33516\\SymbologyItem_32_Code128.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("GS1Code128")]
    public void test_Issue33516_SymbologyItem_33_GS1Code128_png_GS1Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33516\\SymbologyItem_33_GS1Code128.png"), DecodeType.GS_1_CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("EAN8")]
    public void test_Issue33516_SymbologyItem_34_EAN8_png_EAN8()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33516\\SymbologyItem_34_EAN8.png"), DecodeType.EAN_8);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345007", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("EAN13")]
    public void test_Issue33516_SymbologyItem_35_EAN13_png_EAN13()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33516\\SymbologyItem_35_EAN13.png"), DecodeType.EAN_13);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1234500000003", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("EAN14")]
    public void test_Issue33516_SymbologyItem_36_EAN14_png_EAN14()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33516\\SymbologyItem_36_EAN14.png"), DecodeType.EAN_14);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)12345000000007", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("SCC14")]
    public void test_Issue33516_SymbologyItem_37_SCC14_png_SCC14()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33516\\SymbologyItem_37_SCC14.png"), DecodeType.SCC_14);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)12345000000007", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("SSCC18")]
    public void test_Issue33516_SymbologyItem_38_SSCC18_png_SSCC18()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33516\\SymbologyItem_38_SSCC18.png"), DecodeType.SSCC_18);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(00)123450000000000007", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("UPCA")]
    public void test_Issue33516_SymbologyItem_39_UPCA_png_UPCA()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33516\\SymbologyItem_39_UPCA.png"), DecodeType.UPCA);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123450000007", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("UPCE")]
    public void test_Issue33516_SymbologyItem_40_UPCE_png_UPCE()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33516\\SymbologyItem_40_UPCE.png"), DecodeType.UPCE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("01234505", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ISBN")]
    public void test_Issue33516_SymbologyItem_41_ISBN_png_ISBN()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33516\\SymbologyItem_41_ISBN.png"), DecodeType.ISBN);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("9781234500009", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Standard2of5")]
    public void test_Issue33516_SymbologyItem_42_Standard2of5_png_Standard2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33516\\SymbologyItem_42_Standard2of5.png"), DecodeType.STANDARD_2_OF_5);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Interleaved2of5")]
    public void test_Issue33516_SymbologyItem_43_Interleaved2of5_png_Interleaved2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33516\\SymbologyItem_43_Interleaved2of5.png"), DecodeType.INTERLEAVED_2_OF_5);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("012345", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Matrix2of5")]
    public void test_Issue33516_SymbologyItem_44_Matrix2of5_png_Matrix2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33516\\SymbologyItem_44_Matrix2of5.png"), DecodeType.MATRIX_2_OF_5);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ItalianPost25")]
    public void test_Issue33516_SymbologyItem_45_ItalianPost25_png_ItalianPost25()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33516\\SymbologyItem_45_ItalianPost25.png"), DecodeType.ITALIAN_POST_25);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("012345", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("IATA2of5")]
    public void test_Issue33516_SymbologyItem_46_IATA2of5_png_IATA2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33516\\SymbologyItem_46_IATA2of5.png"), DecodeType.IATA_2_OF_5);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123457", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ITF14")]
    public void test_Issue33516_SymbologyItem_47_ITF14_png_ITF14()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33516\\SymbologyItem_47_ITF14.png"), DecodeType.ITF_14);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345000000007", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("ITF6")]
    public void test_Issue33516_SymbologyItem_48_ITF6_png_ITF6()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33516\\SymbologyItem_48_ITF6.png"), DecodeType.ITF_6);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123450", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("MSI")]
    public void test_Issue33516_SymbologyItem_49_MSI_png_MSI()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33516\\SymbologyItem_49_MSI.png"), DecodeType.MSI);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("VIN")]
    public void test_Issue33516_SymbologyItem_50_VIN_png_VIN()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33516\\SymbologyItem_50_VIN.png"), DecodeType.VIN);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345000300000000", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DeutschePostIdentcode")]
    public void test_Issue33516_SymbologyItem_51_DeutschePostIdentcode_png_DeutschePostIdentcode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33516\\SymbologyItem_51_DeutschePostIdentcode.png"), DecodeType.DEUTSCHE_POST_IDENTCODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123450000000", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DeutschePostLeitcode")]
    public void test_Issue33516_SymbologyItem_52_DeutschePostLeitcode_png_DeutschePostLeitcode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33516\\SymbologyItem_52_DeutschePostLeitcode.png"), DecodeType.DEUTSCHE_POST_LEITCODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345000000000", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("OPC")]
    public void test_Issue33516_SymbologyItem_53_OPC_png_OPC()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33516\\SymbologyItem_53_OPC.png"), DecodeType.OPC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1234500005", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("PZN")]
    public void test_Issue33516_SymbologyItem_54_PZN_png_PZN()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33516\\SymbologyItem_54_PZN.png"), DecodeType.PZN);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("-1234504", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Pharmacode")]
    public void test_Issue33516_SymbologyItem_55_Pharmacode_png_Pharmacode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33516\\SymbologyItem_55_Pharmacode.png"), DecodeType.PHARMACODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("SwissPostParcel")]
    public void test_Issue33516_SymbologyItem_56_SwissPostParcel_png_SwissPostParcel()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33516\\SymbologyItem_56_SwissPostParcel.png"), DecodeType.SWISS_POST_PARCEL);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("981234500000000000", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("MacroPdf417")]
    public void test_Issue13470_encode_bmp_MacroPdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue13470\\encode.bmp"), DecodeType.MACRO_PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 15);
            //graphic file is encoded
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_Issue34074_ean_upc_png_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue34074\\ean_upc.png"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 2);
            Assert.assertEquals("012345678905", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("012345678905", reader.getFoundBarCodes()[1].getCodeText());
        }
    }

        @Test
        //[Category("Code128")]
    public void test_Issue33572_IMG0convSmall_png_Code128() throws IOException
        {
        BufferedImage img = ImageIO.read(new File(Global.pathCombine(this._folder, "Issue33572\\IMG0convSmall.png")));
        BarCodeReader reader = new BarCodeReader(img, new Rectangle(43, 1120, 30, 580), DecodeType.CODE_128);
        {
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("TMG1000000000090000000800000001", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_Issue33441_booklandbarcode_png_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33441\\bookland-bar-code.png"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            //Assert.assertTrue(reader.Read(), "Read image: @\\'Issue33441\\bookland-bar-code.png\\' failed. ");
            List<String> values = new ArrayList<String>();
            for(BarCodeResult result : reader.readBarCodes())
            values.add(result.getCodeText());

            TestExternalHelper.contains("9780735200449", values);
            TestExternalHelper.contains("51299", values);
        }
        System.out.println("Test for \"Issue33441\\bookland-bar-code.png\" has completed successfully.");
    }

        @Test
        //[Category("DataMatrix")]
    public void test_Issue33586_Untitled2_jpg_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33586\\Untitled2.jpg"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(":AAAAvGg0ByEJ9w|ac", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_Issue33677_image004_gif_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33677\\image004.gif"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
        //[Category("MSI")]
    public void test_Issue33412_Outputpage85_bmp_MSI()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33412\\Outputpage85.bmp"), DecodeType.MSI);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_Issue33412_Outputpage85_bmp_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33412\\Outputpage85.bmp"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_Issue33412_Outputpage47_bmp_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33412\\Outputpage47.bmp"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_Issue33412_Outputpage157_bmp_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33412\\Outputpage157.bmp"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_Issue33412_Outputpage151_bmp_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33412\\Outputpage151.bmp"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
    }

        @Test
        //[Category("PatchCode")]
    public void test_Issue33412_Outputpage151_bmp_PatchCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33412\\Outputpage151.bmp"), DecodeType.PATCH_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
    }

        @Test
        //[Category("PatchCode")]
    public void test_Issue33412_Outputpage157_bmp_PatchCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33412\\Outputpage157.bmp"), DecodeType.PATCH_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
    }

        @Test
        //[Category("PatchCode")]
    public void test_Issue33412_Outputpage35_bmp_PatchCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33412\\Outputpage35.bmp"), DecodeType.PATCH_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
    }

        @Test
        //[Category("PatchCode")]
    public void test_Issue33412_Outputpage47_bmp_PatchCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33412\\Outputpage47.bmp"), DecodeType.PATCH_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
    }

        @Test
        //[Category("PatchCode")]
    public void test_Issue33412_Outputpage68_bmp_PatchCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33412\\Outputpage68.bmp"), DecodeType.PATCH_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
    }

        @Test
        //[Category("PatchCode")]
    public void test_Issue33412_Outputpage85_bmp_PatchCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33412\\Outputpage85.bmp"), DecodeType.PATCH_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
    }

        @Test
        //[Category("PatchCode")]
    public void test_Issue33412_Outputpage94_bmp_PatchCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33412\\Outputpage94.bmp"), DecodeType.PATCH_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
    }

        @Test
        //[Category("EAN8")]
    public void test_Issue33412_Outputpage151_bmp_EAN8()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33412\\Outputpage151.bmp"), DecodeType.EAN_8);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
    }

        @Test
        //[Category("UPCE")]
    public void test_Issue33412_Outputpage151_bmp_UPCE()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33412\\Outputpage151.bmp"), DecodeType.UPCE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
    }

        @Test
        //[Category("Matrix2of5")]
    public void test_Issue33412_Outputpage157_bmp_Matrix2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33412\\Outputpage157.bmp"), DecodeType.MATRIX_2_OF_5);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
    }

        @Test
        //[Category("Codabar")]
    public void test_Issue33412_Outputpage157_bmp_Codabar()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33412\\Outputpage157.bmp"), DecodeType.CODABAR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
    }

        @Test
        //[Category("Code128")]
        //[Category("AustraliaPost")]
    public void test_Issue33253_Combined_Fail_1_png_Code128_AustraliaPost()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33253\\Combined_Fail_1.png"), DecodeType.scanSets(DecodeType.CODE_128, DecodeType.AUSTRALIA_POST));
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
    }

        @Test
        //[Category("Code93Standard")]
        //[Category("AustraliaPost")]
    public void test_Issue33253_Combined_Fail_2_png_Code93Standard_AustraliaPost()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33253\\Combined_Fail_2.png"), DecodeType.scanSets(DecodeType.CODE_93, DecodeType.AUSTRALIA_POST));
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
    }

        @Test
        //[Category("Code128")]
        //[Category("AustraliaPost")]
    public void test_Issue33253_Combined_Fail_3_png_Code128_AustraliaPost()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33253\\Combined_Fail_3.png"), DecodeType.scanSets(DecodeType.CODE_128, DecodeType.AUSTRALIA_POST));
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
        //[Category("Code39Extended")]
        //[Category("Code39Standard")]
    public void test_Issue33136_cisco_image4_png_Code39Extended_Code39Standard()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33136\\cisco_image4.png"), DecodeType.scanSets(DecodeType.CODE_39_FULL_ASCII, DecodeType.CODE_39));
        {
            Assert.assertEquals(reader.readBarCodes().length, 3);
            Assert.assertEquals("043071", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("043073", reader.getFoundBarCodes()[1].getCodeText());
            Assert.assertEquals("043074", reader.getFoundBarCodes()[2].getCodeText());
        }
    }

        @Test
        //[Category("Code39Extended")]
        //[Category("Code39Standard")]
    public void test_Issue33136_cisco_image4_png_Code39Extended_Code39Standard2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33136\\cisco_image4.png"), DecodeType.scanSets(DecodeType.CODE_39_FULL_ASCII, DecodeType.CODE_39));
        {
            Assert.assertEquals(reader.readBarCodes().length, 3);
            Assert.assertEquals("043071", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("043073", reader.getFoundBarCodes()[1].getCodeText());
            Assert.assertEquals("043074", reader.getFoundBarCodes()[2].getCodeText());
        }
    }

        @Test
        //[Category("Code39Extended")]
        //[Category("Code39Standard")]
    public void test_Issue33136_cisco_image2_png_Code39Extended_Code39Standard()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33136\\cisco_image2.png"), DecodeType.scanSets(DecodeType.CODE_39_FULL_ASCII, DecodeType.CODE_39));
        {
            reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);
            Assert.assertEquals(reader.readBarCodes().length, 2);
            Assert.assertEquals("046342", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("046341", reader.getFoundBarCodes()[1].getCodeText());
        }
    }

        @Test
        //[Category("Code39Extended")]
        //[Category("Code39Standard")]
    public void test_Issue33136_cisco_image2_png_Code39Extended_Code39Standard2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33136\\cisco_image2.png"), DecodeType.scanSets(DecodeType.CODE_39_FULL_ASCII, DecodeType.CODE_39));
        {
            reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);
            Assert.assertEquals(reader.readBarCodes().length, 2);
            Assert.assertEquals("046342", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("046341", reader.getFoundBarCodes()[1].getCodeText());
        }
    }

        @Test
        //[Category("Code39Extended")]
        //[Category("Code39Standard")]
    public void test_Issue33136_cisco_image1_png_Code39Extended_Code39Standard()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33136\\cisco_image1.png"), DecodeType.scanSets(DecodeType.CODE_39_FULL_ASCII, DecodeType.CODE_39));
        {
            Assert.assertEquals(reader.readBarCodes().length, 2);
            Assert.assertEquals("046348", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("046347", reader.getFoundBarCodes()[1].getCodeText());
        }
    }

        @Test
        //[Category("Code39Extended")]
        //[Category("Code39Standard")]
    public void test_Issue33136_cisco_image1_png_Code39Extended_Code39Standard2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33136\\cisco_image1.png"), DecodeType.scanSets(DecodeType.CODE_39_FULL_ASCII, DecodeType.CODE_39));
        {
            Assert.assertEquals(reader.readBarCodes().length, 2);
            Assert.assertEquals("046348", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("046347", reader.getFoundBarCodes()[1].getCodeText());
        }
    }

        @Test
        //[Category("Code39Extended")]
        //[Category("Code39Standard")]
    public void test_Issue33136_cisco_image0_png_Code39Extended_Code39Standard()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33136\\cisco_image0.png"), DecodeType.scanSets(DecodeType.CODE_39_FULL_ASCII, DecodeType.CODE_39));
        {
            Assert.assertEquals(reader.readBarCodes().length, 2);
            Assert.assertEquals("046346", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("046344", reader.getFoundBarCodes()[1].getCodeText());
        }
    }

        @Test
        //[Category("Code39Extended")]
        //[Category("Code39Standard")]
    public void test_Issue22846_img008_tif_Code39Extended_Code39Standard()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue22846\\img008.tif"), DecodeType.scanSets(DecodeType.CODE_39_FULL_ASCII, DecodeType.CODE_39));
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("OLS-106", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_Issue33127_Three_Barcodes_png_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33127\\Three_Barcodes.png"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 3);
            Assert.assertEquals("01234321", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("Pegasus Imaging - BarcodeXpress 5 - 1D and 2D barcode reader/writer", reader.getFoundBarCodes()[1].getCodeText());
            Assert.assertEquals("44123123456123456789", reader.getFoundBarCodes()[2].getCodeText());
        }
    }

        @Test
        //[Category("Pharmacode")]
    public void test_Issue33254_Pharmacode_3_Nok_png_Pharmacode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33254\\Pharmacode_3_Nok.png"), DecodeType.PHARMACODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
        //[Category("Pharmacode")]
    public void test_Issue33254_Pharmacode_7_Nok_png_Pharmacode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33254\\Pharmacode_7_Nok.png"), DecodeType.PHARMACODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
        //[Category("QR")]
    public void test_Issue33985_000169c1_tif_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33985\\000169c1.tif"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
        //[Category("DataMatrix")]
    public void test_Issue33810_2_PNG_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33810\\2.PNG"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("10056004350113100300004", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Interleaved2of5")]
    public void test_Issue33725_AMA_testBarcodeForAspose_tif_Interleaved2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33725\\AMA_testBarcodeForAspose.tif"), DecodeType.INTERLEAVED_2_OF_5);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
    }

        @Test
        //[Category("RM4SCC")]
    public void test_Issue33731_cisco_image3_png_RM4SCC()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33731\\cisco_image3.png"), DecodeType.RM_4_SCC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_Issue33824_cutted_second_tif_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33824\\cutted_second.tif"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("AZ000000393738", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DataMatrix")]
    public void test_Issue33657_1code_2_png_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33657\\1code_2.png"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
        //[Category("DataMatrix")]
    public void test_Issue33657_1code_2_inverted_png_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33657\\1code_2_inverted.png"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("8000258038", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code39Extended")]
        //[Category("Code39Standard")]
    public void test_Issue22846_img010_tif_Code39Extended_Code39Standard()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue22846\\img010.tif"), DecodeType.scanSets(DecodeType.CODE_39_FULL_ASCII, DecodeType.CODE_39));
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
        //[Category("DataMatrix")]
    public void test_Issue33327_datamatrix144x144_gif_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33327\\datamatrix144x144.gif"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
        //[Category("DataMatrix")]
    public void test_Issue32427_dataMatrix_GreenBG_png_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue32427\\dataMatrix_GreenBG.png"), DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("abc", reader.getFoundBarCodes()[0].getCodeText());
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_Issue17536_doublebarcode_tif_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue17536\\doublebarcode.tif"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("10000862", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Pdf417")]
    public void test_Issue18101_sample3_tif_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue18101\\sample3.tif"), DecodeType.PDF_417);
        {
            reader.getQualitySettings().setAllowIncorrectBarcodes(true);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("\"BT_SO\"|\"GDZUVU.EMUS\"|\"JANEE\"|\"41187\"|\"0TCABA\"", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("GS1Code128")]
        //[Category("Code39Extended")]
        //[Category("Code39Standard")]
        //[Category("EAN13")]
        //[Category("EAN14")]
        //[Category("EAN8")]
        //[Category("PatchCode")]
    public void test_Issue18355_AsposeBarcode_Error_Index_was_outside_the_bounds_of_the_array_tif_GS1Code128_Code39Extended_Code39Standard_EAN13_EAN14_EAN8_PatchCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue18355\\AsposeBarcode_Error_Index_was_outside_the_bounds_of_the_array.tif"), DecodeType.scanSets(DecodeType.GS_1_CODE_128, DecodeType.CODE_39_FULL_ASCII, DecodeType.CODE_39, DecodeType.EAN_13, DecodeType.EAN_14, DecodeType.EAN_8, DecodeType.PATCH_CODE));
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
    }

        @Test
        //[Category("GS1Code128")]
        //[Category("Code39Extended")]
        //[Category("Code39Standard")]
        //[Category("EAN13")]
        //[Category("EAN14")]
        //[Category("EAN8")]
        //[Category("PatchCode")]
    public void test_Issue18355_AsposeBarcode_Error_Object_reference_not_set_to_an_instance_of_an_object_tif_GS1Code128_Code39Extended_Code39Standard_EAN13_EAN14_EAN8_PatchCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue18355\\AsposeBarcode_Error_Object_reference_not_set_to_an_instance_of_an_object.tif"), DecodeType.scanSets(DecodeType.GS_1_CODE_128, DecodeType.CODE_39_FULL_ASCII, DecodeType.CODE_39, DecodeType.EAN_13, DecodeType.EAN_14, DecodeType.EAN_8, DecodeType.PATCH_CODE));
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
    }

        @Test
        //[Category("GS1Code128")]
        //[Category("Code39Extended")]
        //[Category("Code39Standard")]
        //[Category("EAN13")]
        //[Category("EAN14")]
        //[Category("EAN8")]
        //[Category("PatchCode")]
    public void test_Issue18355_FindPATCHIII_in_image_tif_GS1Code128_Code39Extended_Code39Standard_EAN13_EAN14_EAN8_PatchCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue18355\\FindPATCHIII_in_image.tif"), DecodeType.scanSets(DecodeType.GS_1_CODE_128, DecodeType.CODE_39_FULL_ASCII, DecodeType.CODE_39, DecodeType.EAN_13, DecodeType.EAN_14, DecodeType.EAN_8, DecodeType.PATCH_CODE));
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
        //[Category("Code128")]
    public void test_Issue18813_dualbarcodeimage_bmp_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue18813\\dualbarcodeimage.bmp"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 2);
            Assert.assertEquals("L4HTGYEB", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("MRL472", reader.getFoundBarCodes()[1].getCodeText());
        }
    }

        @Test
        //[Category("Code128")]
    public void test_Issue19105_exampleimage_lines_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue19105\\exampleimage_lines.png"), DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_Issue13748_BIL01192010NY00FL_309_png_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue13748\\BIL-01192010-NY-00-FL_309.png"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
    }

        @Test
        //[Category("MSI")]
    public void test_Issue13748_BIL01192010NY00FL_309_png_MSI()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue13748\\BIL-01192010-NY-00-FL_309.png"), DecodeType.MSI);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
    }

        @Test
        //[Category("Pdf417")]
    public void test_Issue28279_SD1Macro1_png_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue28279\\SD1Macro1.png"), DecodeType.PDF_417);
        {
            reader.getQualitySettings().setAllowIncorrectBarcodes(true);
            Assert.assertEquals(reader.readBarCodes().length, 1);
        }
    }

        @Test
        //[Category("Pdf417")]
    public void test_Issue28279_SD1Macro2_png_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue28279\\SD1Macro2.png"), DecodeType.PDF_417);
        {
            reader.getQualitySettings().setAllowIncorrectBarcodes(true);
            Assert.assertEquals(reader.readBarCodes().length, 1);
        }
    }

        @Test
        //[Category("Code39Extended")]
        //[Category("Code39Standard")]
    public void test_Issue28448_ga_edit_300dbi_jpg_Code39Extended_Code39Standard()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue28448\\ga_edit_300dbi.jpg"), DecodeType.scanSets(DecodeType.CODE_39_FULL_ASCII, DecodeType.CODE_39));
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("2-CERTIFICATIONS", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code39Extended")]
        //[Category("Code39Standard")]
    public void test_Issue28448_ga_noedit_300dpi_jpg_Code39Extended_Code39Standard()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue28448\\ga_noedit_300dpi.jpg"), DecodeType.scanSets(DecodeType.CODE_39_FULL_ASCII, DecodeType.CODE_39));
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("2-CERTIFICATIONS", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_Issue31285_Aspose_BarCode144x144_bmp_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue31285\\Aspose.BarCode144x144.bmp"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_Issue31285_TextTooLong_bmp_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue31285\\TextTooLong.bmp"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
    }

        @Test
        //[Category("DataMatrix")]
    public void test_Issue32427_color_101010_NOTHING_FOUND_bmp_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue32427\\color_101010_NOTHING_FOUND.bmp"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("NOTHING FOUND", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DataMatrix")]
    public void test_Issue32427_color_000099_abc_bmp_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue32427\\color_000099_abc.bmp"), DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("abc", reader.getFoundBarCodes()[0].getCodeText());
    }

        @Test
        //[Category("DataMatrix")]
    public void test_Issue32427_color_000099_MAMA_MILA_RAMU_123_bmp_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue32427\\color_000099_MAMA_MILA_RAMU_123.bmp"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("MAMA_MILA_RAMU_123", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DataMatrix")]
    public void test_Issue32427_color_green_abc_bmp_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue32427\\color_green_abc.bmp"), DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("abc", reader.getFoundBarCodes()[0].getCodeText());
    }

        @Test
        //[Category("IATA2of5")]
    public void test_Issue33231_aspose_invalidechecksum_png_IATA2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33231\\aspose_invalidechecksum.png"), DecodeType.IATA_2_OF_5);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
    }

        @Test
        //[Category("DataMatrix")]
    public void test_Issue33257_Barcode200DPIC_png_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33257\\Barcode200DPIC.png"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
        //[Category("DatabarOmniDirectional")]
    public void test_Issue33268_GS1_DataBar_Omnidirectional_jpg_DatabarOmniDirectional()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33268\\GS1_DataBar_Omnidirectional.jpg"), DecodeType.DATABAR_OMNI_DIRECTIONAL);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)76123456789008", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DatabarOmniDirectional")]
    public void test_Issue33268_rss14_png_DatabarOmniDirectional()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33268\\rss14.png"), DecodeType.DATABAR_OMNI_DIRECTIONAL);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)01234567890128", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DatabarOmniDirectional")]
    public void test_Issue33268_2200px_png_DatabarOmniDirectional()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33268\\2200px.png"), DecodeType.DATABAR_OMNI_DIRECTIONAL);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)00075678164125", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DatabarLimited")]
    public void test_Issue33269_xam2_png_DatabarLimited()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33269\\xam2.png"), DecodeType.DATABAR_LIMITED);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)00123456789012", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Matrix2of5")]
    public void test_Issue33297_test_tif_Matrix2of5()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33297\\test.tif"), DecodeType.MATRIX_2_OF_5);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
        //[Category("Pdf417")]
    public void test_Issue33326_barcode0_jpg_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33326\\barcode0.jpg"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_Issue33403_cutted_png_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33403\\cutted.png"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_Issue33429_Test4_jpg_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33429\\Test4.jpg"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
            Assert.assertEquals(reader.readBarCodes().length, 6);
            Assert.assertEquals("Samuel", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("12345", reader.getFoundBarCodes()[1].getCodeText());
            Assert.assertEquals("wws super", reader.getFoundBarCodes()[2].getCodeText());
            Assert.assertEquals("www.si-wws.de", reader.getFoundBarCodes()[3].getCodeText());
            Assert.assertEquals("Test1", reader.getFoundBarCodes()[4].getCodeText());
            Assert.assertEquals("Test2", reader.getFoundBarCodes()[5].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_Issue33430_qr_error_ab_png_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33430\\qr_error_ab.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }

        @Test
        //[Category("ISBN")]
    public void test_Issue19264_IMG1_png_ISBN()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue19264\\IMG1.png"), DecodeType.ISBN);
        {
            Assert.assertEquals(reader.readBarCodes().length, 4);
            Assert.assertEquals("9785318001116", reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("0785342354638", reader.getFoundBarCodes()[1].getCodeText());
            Assert.assertEquals("9785318001116", reader.getFoundBarCodes()[2].getCodeText());
            Assert.assertEquals("9785318001116", reader.getFoundBarCodes()[3].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_Issue33429_bigQR_png_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33429\\bigQR.png"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Pdf417")]
    public void test_Issue33429_tmp_bmp_Pdf417()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33429\\tmp.bmp"), DecodeType.PDF_417);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("ABCDEF", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DataMatrix")]
    public void test_Issue33429_Outputpage68_bmp_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this._folder, "Issue33429\\Outputpage68.bmp"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("00000000001200370000", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
