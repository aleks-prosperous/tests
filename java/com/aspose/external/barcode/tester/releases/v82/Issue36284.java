package com.aspose.external.barcode.tester.releases.v82;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.ChecksumValidation;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Issue36284
{
    final String folder = Global.getTestDataFolder("Issues");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
        //[Category("Planet")]
    public void test_Issue36284_planet_png_Planet()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36284\\planet.png"), DecodeType.PLANET);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345", reader.getFoundBarCodes()[0].getCodeText());
            double actualAngle = reader.getFoundBarCodes()[0].getRegion().getAngle();
            Assert.assertEquals(0d, actualAngle, "Actual and expected Angles comparison: @\'Issue36284\\planet.png\' failed. ");
        }
    }

        @Test
        //[Category("Planet")]
    public void test_Issue36284_planet_png_Planet2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36284\\planet.png"), DecodeType.PLANET);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345", reader.getFoundBarCodes()[0].getCodeText());
            String actualChkSum = reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum();
            Assert.assertEquals(actualChkSum, "5", "Actual and expected check sum comparison: @\'Issue36284\\planet.png\' failed. ");
        }
    }

        @Test
        //[Category("Planet")]
    public void test_Issue36284_planet_incorrectchecksum_png_Planet()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36284\\planet_incorrectchecksum.png"), DecodeType.PLANET);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
    }

        @Test
        //[Category("Planet")]
    public void test_Issue36284_planet_incorrectchecksum_png_Planet2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36284\\planet_incorrectchecksum.png"), DecodeType.PLANET);
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.OFF);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("123457", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Planet")]
    public void test_Issue36284_planet_rot090_png_Planet()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36284\\planet_rot090.png"), DecodeType.PLANET);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345", reader.getFoundBarCodes()[0].getCodeText());
            double actualAngle = reader.getFoundBarCodes()[0].getRegion().getAngle();
            Assert.assertEquals(90d, actualAngle, "Actual and expected Angles comparison: @\'Issue36284\\planet_rot090.png\' failed. ");
        }
    }

        @Test
        //[Category("Planet")]
    public void test_Issue36284_planet_rot180_png_Planet()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36284\\planet_rot180.png"), DecodeType.PLANET);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345", reader.getFoundBarCodes()[0].getCodeText());
            double actualAngle = reader.getFoundBarCodes()[0].getRegion().getAngle();
            Assert.assertEquals(180d, actualAngle, "Actual and expected Angles comparison: @\'Issue36284\\planet_rot180.png\' failed. ");
        }
    }

        @Test
        //[Category("Planet")]
    public void test_Issue36284_planet_rot270_png_Planet()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36284\\planet_rot270.png"), DecodeType.PLANET);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345", reader.getFoundBarCodes()[0].getCodeText());
            double actualAngle = reader.getFoundBarCodes()[0].getRegion().getAngle();
            Assert.assertEquals(270d, actualAngle, "Actual and expected Angles comparison: @\'Issue36284\\planet_rot270.png\' failed. ");
        }
    }

        @Test
        //[Category("Postnet")]
    public void test_Issue36284_postnet2_png_Postnet()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36284\\postnet2.png"), DecodeType.POSTNET);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("56789", reader.getFoundBarCodes()[0].getCodeText());
            String actualChkSum = reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum();
            Assert.assertEquals(actualChkSum, "5", "Actual and expected check sum comparison: @\'Issue36284\\postnet2.png\' failed. ");
        }
        System.out.println("Test for \"Issue36284\\postnet2.png\" has completed successfully.");
    }

        @Test
        //[Category("Postnet")]
    public void test_Issue36284_postnet2_incorrect_png_Postnet()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36284\\postnet2_incorrect.png"), DecodeType.POSTNET);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
    }

        @Test
        //[Category("Postnet")]
    public void test_Issue36284_postnet2_incorrect_png_Postnet2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36284\\postnet2_incorrect.png"), DecodeType.POSTNET);
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.OFF);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("567897", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Postnet")]
    public void test_Issue36284_postnet2_rot180_png_Postnet()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36284\\postnet2_rot180.png"), DecodeType.POSTNET);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("56789", reader.getFoundBarCodes()[0].getCodeText());
            double actualAngle = reader.getFoundBarCodes()[0].getRegion().getAngle();
            Assert.assertEquals(180d, actualAngle, "Actual and expected Angles comparison: @\'Issue36284\\postnet2_rot180.png\' failed. " +
                    "");
        }
    }

        @Test
        //[Category("Postnet")]
    public void test_Issue36284_postnet2_rot270_png_Postnet()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36284\\postnet2_rot270.png"), DecodeType.POSTNET);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("56789", reader.getFoundBarCodes()[0].getCodeText());
            double actualAngle = reader.getFoundBarCodes()[0].getRegion().getAngle();
            Assert.assertEquals(270d, actualAngle, "Actual and expected Angles comparison: @\'Issue36284\\postnet2_rot270.png\' failed. " +
                    "");
        }
    }

        @Test
        //[Category("RM4SCC")]
    public void test_Issue36284_RM4SCC_png_RM4SCC()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36284\\RM4SCC.png"), DecodeType.RM_4_SCC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1234567890", reader.getFoundBarCodes()[0].getCodeText());
            double actualAngle = reader.getFoundBarCodes()[0].getRegion().getAngle();
            Assert.assertEquals(0d, actualAngle, "Actual and expected Angles comparison: @\'Issue36284\\RM4SCC.png\' failed. ");
        }
        System.out.println("Test for \"Issue36284\\RM4SCC.png\" has completed successfully.");
    }

        @Test
        //[Category("RM4SCC")]
    public void test_Issue36284_RM4SCC_incorrect_png_RM4SCC()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36284\\RM4SCC_incorrect.png"), DecodeType.RM_4_SCC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
        }
    }

        @Test
        //[Category("RM4SCC")]
    public void test_Issue36284_RM4SCC_incorrect_png_RM4SCC2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36284\\RM4SCC_incorrect.png"), DecodeType.RM_4_SCC);
        {
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.OFF);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("12345678907", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("RM4SCC")]
    public void test_Issue36284_RM4SCC_rot090_png_RM4SCC()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36284\\RM4SCC_rot090.png"), DecodeType.RM_4_SCC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1234567890", reader.getFoundBarCodes()[0].getCodeText());
            double actualAngle = reader.getFoundBarCodes()[0].getRegion().getAngle();
            Assert.assertEquals(90d, actualAngle, "Actual and expected Angles comparison: @\'Issue36284\\RM4SCC_rot090.png\' failed. ");
        }
    }

        @Test
        //[Category("RM4SCC")]
    public void test_Issue36284_RM4SCC_rot180_png_RM4SCC()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36284\\RM4SCC_rot180.png"), DecodeType.RM_4_SCC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1234567890", reader.getFoundBarCodes()[0].getCodeText());
            double actualAngle = reader.getFoundBarCodes()[0].getRegion().getAngle();
            Assert.assertEquals(180d, actualAngle, "Actual and expected Angles comparison: @\'Issue36284\\RM4SCC_rot180.png\' failed. ");
        }
    }

        @Test
        //[Category("RM4SCC")]
    public void test_Issue36284_RM4SCC_rot270_png_RM4SCC()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36284\\RM4SCC_rot270.png"), DecodeType.RM_4_SCC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1234567890", reader.getFoundBarCodes()[0].getCodeText());
            double actualAngle = reader.getFoundBarCodes()[0].getRegion().getAngle();
            Assert.assertEquals(270d, actualAngle, "Actual and expected Angles comparison: @\'Issue36284\\RM4SCC_rot270.png\' failed. ");
        }
    }

        @Test
        //[Category("RM4SCC")]
    public void test_Issue36284_RM4SCC_rot270_png_RM4SCC2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36284\\RM4SCC_rot270.png"), DecodeType.RM_4_SCC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1234567890", reader.getFoundBarCodes()[0].getCodeText());
            String actualChkSum = reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum();
            Assert.assertEquals(actualChkSum, "6", "Actual and expected check sum comparison: @\'Issue36284\\RM4SCC_rot270.png\' failed." +
                    " ");
        }
    }
}
