package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.DeconvolutionMode;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;
import utils.TestExternalHelper;

import java.awt.*;
import java.io.File;

public class Issue33898
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33898");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

        @Test
        
    public void test_Issue33898_Page1_png_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Page1.png"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("GAC2014-997001", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Issue33898_Page10_png_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Page10.png"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("GAC2014-997003", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Issue33898_Page11_png_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Page11.png"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("GAC2014-997003", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Issue33898_Page12_png_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Page12.png"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("GAC2014-997003", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Issue33898_Page2_png_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Page2.png"), DecodeType.DATA_MATRIX);
        {
            reader.getQualitySettings().setDeconvolution(DeconvolutionMode.SLOW);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("GAC2014-997001", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Issue33898_Page3_png_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Page3.png"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("GAC2014-997001", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Issue33898_Page4_png_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Page4.png"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("GAC2014-997001", reader.getFoundBarCodes()[0].getCodeText());
            Point[] expectedPoints = new Point[4];

            expectedPoints[0] = new Point(1708, 35);
            expectedPoints[1] = new Point(1602, 35);
            expectedPoints[2] = new Point(1602, 142);
            expectedPoints[3] = new Point(1708, 142);
            TestExternalHelper.checkBarcodesRegionMatching(reader.getFoundBarCodes()[0].getRegion(), expectedPoints, 0.8);
        }
    }

        @Test
        
    public void test_Issue33898_Page6_png_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Page6.png"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("GAC2014-997002", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Issue33898_Page7_png_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Page7.png"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("GAC2014-997002", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Issue33898_Page8_png_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Page8.png"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("GAC2014-997002", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        
    public void test_Issue33898_Page9_png_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Page9.png"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("GAC2014-997003", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
