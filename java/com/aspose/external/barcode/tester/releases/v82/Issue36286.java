package com.aspose.external.barcode.tester.releases.v82;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.DeconvolutionMode;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.CollectionAssert;

import java.util.ArrayList;
import java.util.List;


public class Issue36286
{
    final String folder = Global.getTestDataFolder("Issues");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
        //[Category("AustraliaPost")]
    public void test_Issue36286_australiapost_allrotations_png_AustraliaPost()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36286\\australiapost_allrotations.png"), DecodeType.AUSTRALIA_POST);
        {
            List<String> actualTexts = new ArrayList<String>();
            for(BarCodeResult result : reader.readBarCodes())
            actualTexts.add(result.getCodeText());

            String[] expectedTexts = new String[4];
            expectedTexts[0] = "1111111111";
            expectedTexts[1] = "1122222222";
            expectedTexts[2] = "1144444444";
            expectedTexts[3] = "1133333333";

            CollectionAssert.areEquivalent(expectedTexts, actualTexts, " File 'Issue36286\\australiapost_allrotations.png': Expected and actual collections of code texts do not meet requirements.");
        }
        System.out.println("Test for \"Issue36286\\australiapost_allrotations.png\" has completed successfully.");
    }

        @Test
        //[Category("OneCode")]
    public void test_Issue36286_onecode_allrotations_png_OneCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36286\\onecode_allrotations.png"), DecodeType.ONE_CODE);
        {
            List<String> actualTexts = new ArrayList<String>();
            for(BarCodeResult result : reader.readBarCodes())
            actualTexts.add(result.getCodeText());

            String[] expectedTexts = new String[4];
            expectedTexts[0] = "10001234567890123456";
            expectedTexts[1] = "20001234567890123456";
            expectedTexts[2] = "30001234567890123456";
            expectedTexts[3] = "40001234567890123456";

            CollectionAssert.areEquivalent(expectedTexts, actualTexts, " File 'Issue36286\\onecode_allrotations.png': Expected and actual collections of code texts do not meet requirements.");
        }
        System.out.println("Test for \"Issue36286\\onecode_allrotations.png\" has completed successfully.");
    }

        @Test
        //[Category("Planet")]
    public void test_Issue36286_planet_allrotations_png_Planet()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36286\\planet_allrotations.png"), DecodeType.PLANET);
        {
            List<String> actualTexts = new ArrayList<String>();
            for(BarCodeResult result : reader.readBarCodes())
            actualTexts.add(result.getCodeText());

            String[] expectedTexts = new String[4];
            expectedTexts[0] = "1002345678";
            expectedTexts[1] = "2002345678";
            expectedTexts[2] = "3002345678";
            expectedTexts[3] = "4002345678";

            CollectionAssert.areEquivalent(expectedTexts, actualTexts, " File 'Issue36286\\planet_allrotations.png': Expected and actual collections of code texts do not meet requirements.");
        }
        System.out.println("Test for \"Issue36286\\planet_allrotations.png\" has completed successfully.");
    }

        @Test
        //[Category("Postnet")]
    public void test_Issue36286_postnet_allrotations_png_Postnet()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36286\\postnet_allrotations.png"), DecodeType.POSTNET);
        {
            List<String> actualTexts = new ArrayList<String>();
            for(BarCodeResult result : reader.readBarCodes())
            actualTexts.add(result.getCodeText());

            String[] expectedTexts = new String[4];
            expectedTexts[0] = "1002345678";
            expectedTexts[1] = "2002345678";
            expectedTexts[2] = "3002345678";
            expectedTexts[3] = "4002345678";

            CollectionAssert.areEquivalent(expectedTexts, actualTexts, " File 'Issue36286\\postnet_allrotations.png': Expected and actual collections of code texts do not meet requirements.");
        }
        System.out.println("Test for \"Issue36286\\postnet_allrotations.png\" has completed successfully.");
    }

        @Test
        //[Category("Postnet")]
    public void test_Issue36286_postnet_two_png_Postnet()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36286\\postnet_two.png"), DecodeType.POSTNET);
        {
            List<String> actualTexts = new ArrayList<String>();
            for(BarCodeResult result : reader.readBarCodes())
            actualTexts.add(result.getCodeText());

            String[] expectedTexts = new String[2];
            expectedTexts[0] = "12345";
            expectedTexts[1] = "23456";

            CollectionAssert.areEquivalent(expectedTexts, actualTexts, " File 'Issue36286\\postnet_two.png': Expected and actual collections of code texts do not meet requirements.");
        }
        System.out.println("Test for \"Issue36286\\postnet_two.png\" has completed successfully.");
    }

        @Test
        //[Category("RM4SCC")]
    public void test_Issue36286_RM4SCC__allrotations_png_RM4SCC()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36286\\RM4SCC__allrotations.png"), DecodeType.RM_4_SCC);
        {
            List<String> actualTexts = new ArrayList<String>();
            for(BarCodeResult result : reader.readBarCodes())
            actualTexts.add(result.getCodeText());

            String[] expectedTexts = new String[4];
            expectedTexts[0] = "1111111111";
            expectedTexts[1] = "2222222222";
            expectedTexts[2] = "3333333333";
            expectedTexts[3] = "4444444444";

            CollectionAssert.areEquivalent(expectedTexts, actualTexts, " File 'Issue36286\\RM4SCC__allrotations.png': Expected and actual collections of code texts do not meet requirements.");
        }
        System.out.println("Test for \"Issue36286\\RM4SCC__allrotations.png\" has completed successfully.");
    }

        @Test
        //[Category("Planet")]
    public void test_Issue36286_20150521125508119_0001_cut1_tif_Planet()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36286\\20150521125508119_0001_cut1.tif"), DecodeType.PLANET);
        {
            reader.getQualitySettings().setDeconvolution(DeconvolutionMode.SLOW);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("990000836439", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Planet")]
    public void test_Issue36286_20150521125508119_0001_cut2_tif_Planet()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue36286\\20150521125508119_0001_cut2.tif"), DecodeType.PLANET);
        {
            reader.getQualitySettings().setDeconvolution(DeconvolutionMode.SLOW);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("990000836439", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
