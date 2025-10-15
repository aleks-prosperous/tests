package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Test(description = "Tests for Issue-19105.")
public class Issue19105
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue19105");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

        @Test
    public void RecognizeTest33_1CuttedImage()
    {
        String fileName = Global.pathCombine(folder, "test33_cutted1.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("1061532", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void RecognizeTest33_2CuttedImage()
    {
        String fileName = Global.pathCombine(folder, "test33_cutted2.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("/3306819", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void RecognizeBarcodeWith5()
    {
        String fileName = Global.pathCombine(folder, "barcode5.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("55", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("Code39")]
    public void RecognizeTest33()
    {
        List<String> values = new ArrayList<String>();

        String fileName = Global.pathCombine(folder, "test33.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39 , DecodeType.CODE_39_FULL_ASCII);
        {
            for(BarCodeResult result : reader.readBarCodes())
            values.add(result.getCodeText());

            Assert.assertEquals(2, values.size(), "Incorrect count of found barcodes");
            //Assert.assertEquals(1, values.size(), "Incorrect count of found barcodes");
            Assert.assertTrue(values.contains("1061532"), "Codetext 1061532 not found");
            Assert.assertTrue(values.contains("/3306819"), "Codetext /3306819 not found");
        }
    }

        @Test
        //[Category("Code39")]
    public void RecognizeTest33_Rotated()
    {
        List<String> values = new ArrayList<String>();

        String fileName = Global.pathCombine(folder, "test33_rotated.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39 , DecodeType.CODE_39_FULL_ASCII);
        {
            for(BarCodeResult result : reader.readBarCodes())
            values.add(result.getCodeText());

            Assert.assertEquals(2, values.size(), "Incorrect count of found barcodes");
            Assert.assertTrue(values.contains("1061532"), "Codetext 1061532 not found");
            Assert.assertTrue(values.contains("/3306819"), "Codetext /3306819 not found");
        }
    }

        @Test
    public void RecognizeTest33_Rotated_Vertical()
    {
        List<String> values = new ArrayList<String>();

        String fileName = Global.pathCombine(folder, "test33_rotated_vertical_scaleup.png");
        BarCodeReader reader = new BarCodeReader(fileName);
        {
            for(BarCodeResult result : reader.readBarCodes())
            values.add(result.getCodeText());

            Assert.assertEquals(2, values.size(), "Incorrect count of found barcodes");
            Assert.assertTrue(values.contains("1061532"), "Codetext 1061532 not found");
            Assert.assertTrue(values.contains("/3306819"), "Codetext /3306819 not found");
        }
    }

        @Test
    public void Recognize_exampleimageTIF()
    {
        String fileName = Global.pathCombine(folder, "exampleimage.TIF");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("BHS13155", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void Recognize_exampleimage_linespng()
    {
        String fileName = Global.pathCombine(folder, "exampleimage_lines.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");

            //Assert.assertTrue(reader.Read(), "Code128 recognition error.");
            //string s = reader.GetCodeText();
            //Assert.assertEquals("BHS13155", s);
            //Assert.IsFalse(reader.Read(), "Extra recognized");
        }
    }

        @Test
        //[Category("Code39")]
    public void RecognizeTest33_cutted()
    {
        List<String> values = new ArrayList<String>();

        String fileName = Global.pathCombine(folder, "test33_cutted.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39 , DecodeType.CODE_39_FULL_ASCII);
        {
            for(BarCodeResult result : reader.readBarCodes())
            values.add(result.getCodeText());
        }

        Assert.assertEquals(2, values.size(), "Incorrect count of found barcodes");
        Assert.assertTrue(values.contains("1061532"), "Codetext 1061532 not found");
        Assert.assertTrue(values.contains("/3306819"), "Codetext /3306819 not found");
    }

        @Test
        //[Category("Code39")]
    public void RecognizeTest33_AllTypes()
    {
        List<String> values = new ArrayList<String>();

        String fileName = Global.pathCombine(folder, "test33.tif");
        BarCodeReader reader = new BarCodeReader(fileName);
        {
            for(BarCodeResult result : reader.readBarCodes())
            values.add(result.getCodeText());

            Assert.assertEquals(2, values.size(), "Incorrect count of found barcodes");
            Assert.assertTrue(values.contains("1061532"), "Codetext 1061532 not found");
            Assert.assertTrue(values.contains("/3306819"), "Codetext /3306819 not found");
        }
    }

        @Test
    public void Recognize_exampleimageTIF_AllTypes()
    {
        String fileName = Global.pathCombine(folder, "exampleimage.TIF");
        BarCodeReader reader = new BarCodeReader(fileName);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("BHS13155", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
