package com.aspose.external.barcode.tester.releases.v16_11;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.XDimensionMode;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.image.BufferedImage;

@Test
public class Issue33909
{
    /// <summary>
    /// Path to folder with files for testing Issue33826.
    /// </summary>
    private final String folder = Global.getIssuesTestImagePath("Issue33909");

    /// <summary>
    /// Original code text in barcodes from PDF file.
    /// </summary>
    private final String OriginalCodeText = "{\"DT\":17,\"DN\":\"76b782c7-9937-447d-8415-bb5a142529b6\",\"WM\":null,\"WN\":null,\"J\":\"bc_13_2_n\",\"SO\":\"0900783319\",\"H\":\"Mudit Bhardwaj\",\"CRN\":\"khjkhjk\",\"DD\":\"Apr 23, 2014\",\"GR\":\"? 28,179.18\",\"ID\":\"? 0.00\",\"NT\":\"? 28,179.18\",\"T\":\"? 28,179.18\",\"ST\":[{\"O\":10,\"K\":\"DEPARTMENT\",\"V\":\"LLOYDMINSTER~~LLOYDMINSTER DEPARTMENT\",\"L\":80,\"AV\":[\"\",\"DRILL & COMP - JACKFISH PROJECTS~~DRILLING & COMPLETIONS FOR JACKFISH\",\"DRILLING & COMPLETIONS~~DRILLING & COMPLETIONS DEPARTMENT\",\"PRODUCTION ENGINEERING~~ PRODUCTION ENGINEERING\",\"SWAN HILLS~~ SWAN HILLS DEPARTMENT\",\"LLOYDMINSTER~~LLOYDMINSTER DEPARTMENT\",\"ROCKY MOUNTAIN HOUSE~~ ROCKY MOUNTAIN HOUSE DEPARTMENT\",\"BONNYVILLE~~ BONNYVILLE DEPARTMENT\",\"FAIRVIEW~~ FAIRVIEW DEPARTMENT\"],\"R\":false},{\"O\":20,\"K\":\"AFE NUMBER\",\"V\":null,\"L\":80,\"AV\":[],\"R\":false},{\"O\":30,\"K\":\"COST CENTER\",\"V\":null,\"L\":80,\"AV\":[],\"R\":false},{\"O\":40,\"K\":\"ORDERED BY NAME\",\"V\":\"45435\",\"L\":80,\"AV\":[],\"R\":false},{\"O\":50,\"K\":\"LOCATION CODE\",\"V\":\"23424\",\"L\":80,\"AV\":[],\"R\":false},{\"O\":60,\"K\":\"OPERATIONS CATEGRY\",\"V\":null,\"L\":80,\"AV\":[\"\",\"DRILLING~~ DRILLING\",\"COMPLETIONS-DOWNHOLE~~ COMPLETIONS - DOWNHOLE EQUIPMENT \\/ SERVICE\",\"COMPLETIONS-WELL SITE EQUI~~ COMPLETIONS -WELL SITE EQUIPMENT\",\"OPERATIONS~~ OPERATIONS\",\"WORKOVERS~~  WORKOVERS\"],\"R\":false},{\"O\":70,\"K\":\"MAJOR \\/ MINOR CODE\",\"V\":null,\"L\":80,\"AV\":[],\"R\":false},{\"O\":80,\"K\":\"CONTRACT NUMBER\",\"V\":\"2342343\",\"L\":80,\"AV\":[],\"R\":false}],\"HD\":\"? 0.00\",\"CC\":\"CAD\"}";

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
        @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    /// <summary>
    /// Tests of recognition first barcode from PDF file.
    /// </summary>
        @Test
    public void testRecognizeExtractedFirstBarCode()
    {
        String fileName = Global.pathCombine(folder, "QRCodeComparison_extracted_01.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(OriginalCodeText, reader.getFoundBarCodes()[0].getCodeText());
    }

    /// <summary>
    /// Tests of recognition second barcode from PDF file.
    /// </summary>
        @Test
    public void testRecognizeExtractedSecondBarCode()
    {
        String fileName = Global.pathCombine(folder, "QRCodeComparison_extracted_02.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(OriginalCodeText, reader.getFoundBarCodes()[0].getCodeText());
    }

    /// <summary>
    /// Generate barcode through bitmap and recognize.
    /// </summary>
        @Test
    public void testWithGeneratingBarCodeThroughBitmap()
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.QR, OriginalCodeText);
            BufferedImage bitmap = gen.generateBarCodeImage();
            BarCodeReader reader = new BarCodeReader(bitmap, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(OriginalCodeText, reader.getFoundBarCodes()[0].getCodeText());
    }

    /// <summary>
    /// Generate barcode through bitmap with xDimension and yDimension 2 and recognize.
    /// </summary>
        @Test
    public void testWithGeneratingBarCodeThroughBitmapWithDimension2()
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.QR, OriginalCodeText);
            gen.getParameters().getBarcode().getXDimension().setMillimeters(2);
            gen.getParameters().getBarcode().getBarHeight().setMillimeters(2);
            BufferedImage bitmap = gen.generateBarCodeImage();
            BarCodeReader reader = new BarCodeReader(bitmap, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(OriginalCodeText, reader.getFoundBarCodes()[0].getCodeText());
    }

    /// <summary>
    /// Generate barcode and recognize.
    /// </summary>
        @Test
    public void testWithGeneratingBarCode()
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.QR, OriginalCodeText);
        BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(OriginalCodeText, reader.getFoundBarCodes()[0].getCodeText());
    }
}
