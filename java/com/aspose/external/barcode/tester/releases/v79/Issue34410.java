package com.aspose.external.barcode.tester.releases.v79;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarcodeQualityMode;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.XDimensionMode;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Issue34410
{
    final String folder = Global.getTestDataFolder("Issues");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
        //[Category("QR")]
    public void test_Issue34410_Page1_Jpeg_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34410\\Page#1.Jpeg"), DecodeType.QR);
        {
            reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1;3544dccb-05a1-4385-81b2-8f06d1863e5b;790ffc2f-1e8c-4cfc-bb01-e1f5bf6a0636;1;22e" +
                    "1678b-df4b-429b-b14b-de0ec2e852d0;a2270c95-a753-4613-87c0-24bc80143ae1", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_Issue34410_Page2_Jpeg_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34410\\Page#2.Jpeg"), DecodeType.QR);
        {
            reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1;3544dccb-05a1-4385-81b2-8f06d1863e5b;790ffc2f-1e8c-4cfc-bb01-e1f5bf6a0636;2;22e" +
                    "1678b-df4b-429b-b14b-de0ec2e852d0;a2270c95-a753-4613-87c0-24bc80143ae1", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_Issue34410_Page3_Jpeg_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34410\\Page#3.Jpeg"), DecodeType.QR);
        {
            reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1;3544dccb-05a1-4385-81b2-8f06d1863e5b;790ffc2f-1e8c-4cfc-bb01-e1f5bf6a0636;3;22e" +
                    "1678b-df4b-429b-b14b-de0ec2e852d0;a2270c95-a753-4613-87c0-24bc80143ae1", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_Issue34410_Page4_Jpeg_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34410\\Page#4.Jpeg"), DecodeType.QR);
        {
            reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1;3544dccb-05a1-4385-81b2-8f06d1863e5b;790ffc2f-1e8c-4cfc-bb01-e1f5bf6a0636;4;22e" +
                    "1678b-df4b-429b-b14b-de0ec2e852d0;a2270c95-a753-4613-87c0-24bc80143ae1", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_Issue34410_Page5_Jpeg_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34410\\Page#5.Jpeg"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1;3544dccb-05a1-4385-81b2-8f06d1863e5b;790ffc2f-1e8c-4cfc-bb01-e1f5bf6a0636;5;22e" +
                    "1678b-df4b-429b-b14b-de0ec2e852d0;a2270c95-a753-4613-87c0-24bc80143ae1", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_Issue34410_Page6_Jpeg_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34410\\Page#6.Jpeg"), DecodeType.QR);
        {
            reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1;3544dccb-05a1-4385-81b2-8f06d1863e5b;790ffc2f-1e8c-4cfc-bb01-e1f5bf6a0636;6;22e" +
                    "1678b-df4b-429b-b14b-de0ec2e852d0;a2270c95-a753-4613-87c0-24bc80143ae1", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_Issue34410_Page7_Jpeg_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34410\\Page#7.Jpeg"), DecodeType.QR);
        {
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1;3544dccb-05a1-4385-81b2-8f06d1863e5b;790ffc2f-1e8c-4cfc-bb01-e1f5bf6a0636;7;22e" +
                    "1678b-df4b-429b-b14b-de0ec2e852d0;a2270c95-a753-4613-87c0-24bc80143ae1", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_Issue34410_Page8_Jpeg_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34410\\Page#8.Jpeg"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1;3544dccb-05a1-4385-81b2-8f06d1863e5b;790ffc2f-1e8c-4cfc-bb01-e1f5bf6a0636;8;22e" +
                    "1678b-df4b-429b-b14b-de0ec2e852d0;a2270c95-a753-4613-87c0-24bc80143ae1", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("QR")]
    public void test_Issue34410_Page9_Jpeg_QR()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34410\\Page#9.Jpeg"), DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1;3544dccb-05a1-4385-81b2-8f06d1863e5b;790ffc2f-1e8c-4cfc-bb01-e1f5bf6a0636;9;22e" +
                    "1678b-df4b-429b-b14b-de0ec2e852d0;a2270c95-a753-4613-87c0-24bc80143ae1", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
