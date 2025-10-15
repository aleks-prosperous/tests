package com.aspose.external.barcode.tester.releases.v82;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.ChecksumValidation;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Issue36288
{
    final String folder = Global.getTestDataFolder("Issues");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
        //[Category("AustraliaPost")]
    public void test_Issue36288_australiapost_png_AustraliaPost()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36288\\australiapost.png"), DecodeType.AUSTRALIA_POST);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1112345678", reader.getFoundBarCodes()[0].getCodeText());
            double actualAngle = reader.getFoundBarCodes()[0].getRegion().getAngle();
            Assert.assertEquals(0d, actualAngle, "Actual and expected Angles comparison: @\'Issue36288\\australiapost.png\' failed. ");
        }
    }

        @Test
        //[Category("AustraliaPost")]
    public void test_Issue36288_australiapost_png_AustraliaPost2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36288\\australiapost.png"), DecodeType.AUSTRALIA_POST);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1112345678", reader.getFoundBarCodes()[0].getCodeText());
            String actualChkSum = reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum();
            Assert.assertEquals(actualChkSum, " 26 44 19 15", "Actual and expected check sum comparison: @\'Issue36288\\australiapost.png\' failed." +
                    " ");
        }
    }

        @Test
        //[Category("AustraliaPost")]
    public void test_Issue36288_australiapost_horflip_png_AustraliaPost()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36288\\australiapost_horflip.png"), DecodeType.AUSTRALIA_POST);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1112345678", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AustraliaPost")]
    public void test_Issue36288_australiapost_incorrect_png_AustraliaPost()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36288\\australiapost_incorrect.png"), DecodeType.AUSTRALIA_POST);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
        System.out.println("Test for \"Issue36288\\australiapost_incorrect.png\" has completed successfully.");
    }

        @Test
        //[Category("AustraliaPost")]
    public void test_Issue36288_australiapost_incorrect_png_AustraliaPost2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36288\\australiapost_incorrect.png"), DecodeType.AUSTRALIA_POST);
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.OFF);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1112345678", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AustraliaPost")]
    public void test_Issue36288_australiapost_incorrect_png_AustraliaPost3()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36288\\australiapost_incorrect.png"), DecodeType.AUSTRALIA_POST);
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.OFF);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1112345678", reader.getFoundBarCodes()[0].getCodeText());
            String actualChkSum = reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum();
            Assert.assertEquals(actualChkSum, " 26 19 44 15", "Actual and expected check sum comparison: @\'Issue36288\\australiapost_incorrect.pn" +
                    "g\' failed. ");
        }
    }

        @Test
        //[Category("AustraliaPost")]
    public void test_Issue36288_australiapost_incorrect2_png_AustraliaPost()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36288\\australiapost_incorrect2.png"), DecodeType.AUSTRALIA_POST);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
    }

        @Test
        //[Category("AustraliaPost")]
    public void test_Issue36288_australiapost_rot090_png_AustraliaPost()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36288\\australiapost_rot090.png"), DecodeType.AUSTRALIA_POST);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1112345678", reader.getFoundBarCodes()[0].getCodeText());
            double actualAngle = reader.getFoundBarCodes()[0].getRegion().getAngle();
            Assert.assertEquals(90d, actualAngle, "Actual and expected Angles comparison: @\'Issue36288\\australiapost_rot090.png\' fai" +
                    "led. ");
        }
    }

        @Test
        //[Category("AustraliaPost")]
    public void test_Issue36288_australiapost_rot180_png_AustraliaPost()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36288\\australiapost_rot180.png"), DecodeType.AUSTRALIA_POST);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1112345678", reader.getFoundBarCodes()[0].getCodeText());
            double actualAngle = reader.getFoundBarCodes()[0].getRegion().getAngle();
            Assert.assertEquals(180d, actualAngle, "Actual and expected Angles comparison: @\'Issue36288\\australiapost_rot180.png\' fai" +
                    "led. ");
        }
    }

        @Test
        //[Category("AustraliaPost")]
    public void test_Issue36288_australiapost_rot270_png_AustraliaPost()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36288\\australiapost_rot270.png"), DecodeType.AUSTRALIA_POST);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1112345678", reader.getFoundBarCodes()[0].getCodeText());
            double actualAngle = reader.getFoundBarCodes()[0].getRegion().getAngle();
            Assert.assertEquals(270d, actualAngle, "Actual and expected Angles comparison: @\'Issue36288\\australiapost_rot270.png\' fai" +
                    "led. ");
        }
    }

        @Test
        //[Category("AustraliaPost")]
    public void test_Issue36288_australiapost_verflip_png_AustraliaPost()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36288\\australiapost_verflip.png"), DecodeType.AUSTRALIA_POST);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1112345678", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AustraliaPost")]
    public void test_Issue36288_AustraliaPost2_png_AustraliaPost()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36288\\AustraliaPost2.png"), DecodeType.AUSTRALIA_POST);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1112345678", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AustraliaPost")]
    public void test_Issue36288_AustraliaPost3_png_AustraliaPost()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36288\\AustraliaPost3.png"), DecodeType.AUSTRALIA_POST);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1112345678", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AustraliaPost")]
    public void test_Issue36288_AustraliaPost4_png_AustraliaPost()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36288\\AustraliaPost4.png"), DecodeType.AUSTRALIA_POST);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("59564391110000010000033223", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("AustraliaPost")]
    public void test_Issue36288_AustraliaPost5_png_AustraliaPost()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36288\\AustraliaPost5.png"), DecodeType.AUSTRALIA_POST);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("59564391110000010000033223", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("OneCode")]
    public void test_Issue36288_onecode_png_OneCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36288\\onecode.png"), DecodeType.ONE_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("44999000000123456789941078350", reader.getFoundBarCodes()[0].getCodeText());
            double actualAngle = reader.getFoundBarCodes()[0].getRegion().getAngle();
            Assert.assertEquals(0d, actualAngle, "Actual and expected Angles comparison: @\'Issue36288\\onecode.png\' failed. ");
        }
    }

        @Test
        //[Category("OneCode")]
    public void test_Issue36288_onecode_png_OneCode2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36288\\onecode.png"), DecodeType.ONE_CODE);
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.ON);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("44999000000123456789941078350", reader.getFoundBarCodes()[0].getCodeText());
            String actualChkSum = reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum();
            Assert.assertEquals(actualChkSum, "1481", "Actual and expected check sum comparison: @\'Issue36288\\onecode.png\' failed. ");
        }
    }

        @Test
        //[Category("OneCode")]
    public void test_Issue36288_onecode_0123456709498765432101234567891_png_OneCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36288\\onecode_0123456709498765432101234567891.png"), DecodeType.ONE_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("0123456709498765432101234567891", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("OneCode")]
    public void test_Issue36288_onecode_horflip_png_OneCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36288\\onecode_horflip.png"), DecodeType.ONE_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("44999000000123456789941078350", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("OneCode")]
    public void test_Issue36288_onecode_rot090_png_OneCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36288\\onecode_rot090.png"), DecodeType.ONE_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("44999000000123456789941078350", reader.getFoundBarCodes()[0].getCodeText());
            double actualAngle = reader.getFoundBarCodes()[0].getRegion().getAngle();
            Assert.assertEquals(90d, actualAngle, "Actual and expected Angles comparison: @\'Issue36288\\onecode_rot090.png\' failed. ");
        }
    }

        @Test
        //[Category("OneCode")]
    public void test_Issue36288_onecode_rot180_png_OneCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36288\\onecode_rot180.png"), DecodeType.ONE_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("44999000000123456789941078350", reader.getFoundBarCodes()[0].getCodeText());
            double actualAngle = reader.getFoundBarCodes()[0].getRegion().getAngle();
            Assert.assertEquals(180d, actualAngle, "Actual and expected Angles comparison: @\'Issue36288\\onecode_rot180.png\' failed. ");
        }
    }

        @Test
        //[Category("OneCode")]
    public void test_Issue36288_onecode_rot270_png_OneCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36288\\onecode_rot270.png"), DecodeType.ONE_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("44999000000123456789941078350", reader.getFoundBarCodes()[0].getCodeText());
            double actualAngle = reader.getFoundBarCodes()[0].getRegion().getAngle();
            Assert.assertEquals(270d, actualAngle, "Actual and expected Angles comparison: @\'Issue36288\\onecode_rot270.png\' failed. ");
        }
    }

        @Test
        //[Category("OneCode")]
    public void test_Issue36288_onecode_verflip_png_OneCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36288\\onecode_verflip.png"), DecodeType.ONE_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("44999000000123456789941078350", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("OneCode")]
    public void test_Issue36288_onecode2_incorrect_png_OneCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36288\\onecode2_incorrect.png"), DecodeType.ONE_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
    }

        @Test
        //[Category("OneCode")]
    public void test_Issue36288_onecode2_incorrect_png_OneCode2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36288\\onecode2_incorrect.png"), DecodeType.ONE_CODE);
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.OFF);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("44999000000123456789941078350", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
