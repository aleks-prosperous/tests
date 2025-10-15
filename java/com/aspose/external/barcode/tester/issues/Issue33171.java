package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.BarcodeQualityMode;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;


@Test(description = "Tests for Issue33171.")
public class Issue33171
{
    String folder = Global.getTestDataFolder(Global.pathCombine("Issues", this.getClass().getSimpleName()));

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    // TODO Image.selectActiveFrame works incorrect. Use Issue33171.test_FullImage_java_adapted test method
    public void testFullImage()
    {
        List<String> values = new ArrayList<String>();

        String fileName = Global.pathCombine(folder, "fattura_300_scalagrigi.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39, DecodeType.CODE_39_FULL_ASCII, DecodeType.INTERLEAVED_2_OF_5);
        reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
        for(BarCodeResult result : reader.readBarCodes())
        values.add(result.getCodeText());
        Assert.assertEquals(2, values.size(), "Must be 2");
        Assert.assertTrue(values.contains("01093221911611"));
        Assert.assertTrue(values.contains("FFAMA112AM00559A1"));

    }

    @Test
    public void testCode39()
    {
        String fileName = Global.pathCombine(folder, "fatt39.png");
        List<String> values = new ArrayList<>();
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39, DecodeType.CODE_39_FULL_ASCII, DecodeType.INTERLEAVED_2_OF_5);
        reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
        for(BarCodeResult result : reader.readBarCodes())
        values.add(result.getCodeText());
        Assert.assertTrue(values.contains("FFAMA112AM00559A1"));
    }

    @Test
    public void testInterleaved25()
    {
        String fileName = Global.pathCombine(folder, "fattInter25.png");
        BarCodeReader reader = new BarCodeReader(fileName);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("01093221911611", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test_fattInter25()
    {
        String fileName = Global.pathCombine(folder, "fattInter25.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.INTERLEAVED_2_OF_5);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("01093221911611", reader.getFoundBarCodes()[0].getCodeText());
    }
}