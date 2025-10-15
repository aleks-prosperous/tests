package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Issue33136
{
    final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33136");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void test0001_213944213946tif()
    {
        String fileName = Global.pathCombine(folder, "0001_213944213946.tif");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39, DecodeType.CODE_39_FULL_ASCII);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("0058", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test0001_213944213946tif_Second()
    {
        String fileName = Global.pathCombine(folder, "0001_213944213946.tif");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("0058", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test0001_213944213946tif_third()
    {
        String fileName = Global.pathCombine(folder, "0001_213944213946.tif");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("0058", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testcisco_MP_fax45tif()
    {
        String fileName = Global.pathCombine(folder, "cisco_MP_fax45.tif");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39);
        reader.getQualitySettings().setAllowIncorrectBarcodes(true);
        Assert.assertEquals(reader.readBarCodes().length, 2);
        Assert.assertEquals("046346", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals("046344", reader.getFoundBarCodes()[1].getCodeText());
    }

    @Test
    public void testcisco_MP_fax45tif_Cutted()
    {
        String fileName = Global.pathCombine(folder, "cisco_MP_fax45_cutted.tif");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39);
        reader.getQualitySettings().setAllowIncorrectBarcodes(true);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("046346", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testCiscoPNG1()
    {
        List<String> values = new ArrayList<String>();
        String fileName = Global.pathCombine(folder, "cisco_image0.png");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39, DecodeType.CODE_39_FULL_ASCII);
        reader.getQualitySettings().setAllowIncorrectBarcodes(true);
        reader.getQualitySettings().setDeconvolution(DeconvolutionMode.FAST);
        for(BarCodeResult result : reader.readBarCodes())
            values.add(result.getCodeText());

        Assert.assertEquals(2, values.size());
    }

    @Test
    public void testCiscoPNG1_MS()
    {
        List<String> values = new ArrayList<String>();
        String fileName = Global.pathCombine(folder, "cisco_image0.png");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39, DecodeType.CODE_39_FULL_ASCII);
        reader.getQualitySettings().setAllowIncorrectBarcodes(true);
        reader.getQualitySettings().setDeconvolution(DeconvolutionMode.FAST);
        for(BarCodeResult result : reader.readBarCodes())
            values.add(result.getCodeText());

        Assert.assertEquals(2, values.size()); // smoothing adds the same barcode
    }

    @Test
    public void testCiscoPNG2()
    {
        List<String> values = new ArrayList<String>();
        String fileName = Global.pathCombine(folder, "cisco_image1.png");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39, DecodeType.CODE_39_FULL_ASCII);
        reader.getQualitySettings().setAllowIncorrectBarcodes(true);
        reader.getQualitySettings().setDeconvolution(DeconvolutionMode.FAST);
        for(BarCodeResult result : reader.readBarCodes())
            values.add(result.getCodeText());

        Assert.assertEquals(2, values.size());
    }

    @Test
    public void testCiscoPNG2_MS()
    {
        List<String> values = new ArrayList<String>();
        String fileName = Global.pathCombine(folder, "cisco_image1.png");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39, DecodeType.CODE_39_FULL_ASCII);
        reader.getQualitySettings().setAllowIncorrectBarcodes(true);
        reader.getQualitySettings().setDeconvolution(DeconvolutionMode.FAST);
        for(BarCodeResult result : reader.readBarCodes())
            values.add(result.getCodeText());

        Assert.assertEquals(2, values.size());
    }

    @Test
    public void testCiscoPNG3()
    {
        List<String> values = new ArrayList<String>();
        String fileName = Global.pathCombine(folder, "cisco_image2.png");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39, DecodeType.CODE_39_FULL_ASCII);
        reader.getQualitySettings().setAllowIncorrectBarcodes(true);
        reader.getQualitySettings().setDeconvolution(DeconvolutionMode.FAST);
        for(BarCodeResult result : reader.readBarCodes())
            values.add(result.getCodeText());

        Assert.assertEquals(2, values.size());
    }

    @Test
    public void testCiscoPNG3_MS()
    {
        List<String> values = new ArrayList<String>();
        String fileName = Global.pathCombine(folder, "cisco_image2.png");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39, DecodeType.CODE_39_FULL_ASCII);
        reader.getQualitySettings().setAllowIncorrectBarcodes(true);
        reader.getQualitySettings().setDeconvolution(DeconvolutionMode.FAST);
        for(BarCodeResult result : reader.readBarCodes())
            values.add(result.getCodeText());


        Assert.assertEquals(2, values.size());
    }

    @Test
    public void testCiscoPNG4()
    {
        String fileName = Global.pathCombine(folder, "cisco_image3.png");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39, DecodeType.CODE_39_FULL_ASCII);
        reader.getQualitySettings().setAllowIncorrectBarcodes(true);
        reader.getQualitySettings().setDeconvolution(DeconvolutionMode.FAST);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("046379", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testCiscoPNG5()
    {
        List<String> values = new ArrayList<String>();
        String fileName = Global.pathCombine(folder, "cisco_image4.png");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39, DecodeType.CODE_39_FULL_ASCII);
        reader.getQualitySettings().setAllowIncorrectBarcodes(true);
        reader.getQualitySettings().setDeconvolution(DeconvolutionMode.FAST);
        for(BarCodeResult result : reader.readBarCodes())
            values.add(result.getCodeText());

        Assert.assertEquals(3, values.size());
    }

    @Test
    public void testCiscoPNG5_MS()
    {
        List<String> values = new ArrayList<String>();
        String fileName = Global.pathCombine(folder, "cisco_image4.png");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39, DecodeType.CODE_39_FULL_ASCII);
        reader.getQualitySettings().setAllowIncorrectBarcodes(true);
        reader.getQualitySettings().setDeconvolution(DeconvolutionMode.FAST);
        for(BarCodeResult result : reader.readBarCodes())
            values.add(result.getCodeText());

        Assert.assertEquals(3, values.size());
    }
}
