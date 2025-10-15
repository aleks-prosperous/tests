package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.BarcodeQualityMode;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.CollectionAssert;
import utils.LicenseAssistant;

import java.util.ArrayList;
import java.util.List;

//import com.aspose.barcode.barcoderecognition.RecognitionHints;


@Test(description = "Tests for Issue33544.")
public class Issue33544
{
    private final String folder = Global.getTestDataFolder("Issues\\Issue33544");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testPage1()
    {
        String fileName = Global.pathCombine(folder, "Page1.png");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(":AAAB7DWG0TzWBA", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testPage1Cutted()
    {
        String fileName = Global.pathCombine(folder, "Page1_cutted.png");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(":AAAB7DWG0TzWBA", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testPage2()
    {
        String fileName = Global.pathCombine(folder, "Page2.png");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(":AAAB7DWG0TzWBA", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testPage2Cutted()
    {
        String fileName = Global.pathCombine(folder, "Page2_cutted.png");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(":AAAB7DWG0TzWBA", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testPage3()
    {
        String fileName = Global.pathCombine(folder, "Page3.png");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(":AAAB7DWG0TzWBA", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testPage3Cutted()
    {
        String fileName = Global.pathCombine(folder, "Page3_cutted.png");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(":AAAB7DWG0TzWBA", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testPage4Rotated()
    {
        String fileName = Global.pathCombine(folder, "Page4.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(":AAAB7DWG0TzWBA", reader.getFoundBarCodes()[0].getCodeText());
    }

     @Test
    public void testPage5()
    {
        String fileName = Global.pathCombine(folder, "Page5.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 2);
        Assert.assertEquals("(p1:AAAB7DWG0TzWBA)SA20130514a|X:60;Opt:OR;COESA:0%;AP:ApAct;U:UK;COEGL:0%;PV:PI;RG:RUC;CST:None;ACLim:AEMP;YY:IMS-EILP", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals(":AAAB7DWG0TzWBA", reader.getFoundBarCodes()[1].getCodeText());
    }

    @Test
    public void testPage6()
    {
        String fileName = Global.pathCombine(folder, "Page6.png");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(":AAAB7DNGiKyRNg", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testPage7()
    {
        String fileName = Global.pathCombine(folder, "Page7.png");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(":AAAB7DNGiKyRNg", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testPage8()
    {
        String fileName = Global.pathCombine(folder, "Page8.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        {
            List<String> lCodetexts = new ArrayList<String>();
            for(BarCodeResult result : reader.readBarCodes())
            lCodetexts.add(result.getCodeText());
            Assert.assertEquals(2, lCodetexts.size());
            CollectionAssert.contains("(p1:AAAB7DNGiKyRNg)SA20130514a|X:60;Opt:OR;COESA:0%;AP:ApAct;U:UK;COEGL:0%;PV:PI;RG:RUC;CST:None;ACLim:AEMP;YY:IMS-EILP", lCodetexts);
            CollectionAssert.contains(":AAAB7DNGiKyRNg", lCodetexts);
        }
    }
}

