package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;


@Test(description = "Tests for Issue33412.")
public class Issue33412
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33412");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testOutputpage151_bmp()
    {
        String fileName = Global.pathCombine(folder, "Outputpage151.bmp");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PATCH_CODE);
        Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
    }

    @Test
    public void testOutputpage157_bmp()
    {
        String fileName = Global.pathCombine(folder, "Outputpage157.bmp");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PATCH_CODE);
        Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
    }

    @Test
    public void testOutputpage35_bmp()
    {
        String fileName = Global.pathCombine(folder, "Outputpage35.bmp");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PATCH_CODE);
        Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
    }

    @Test
    public void testOutputpage47_bmp()
    {
        String fileName = Global.pathCombine(folder, "Outputpage47.bmp");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PATCH_CODE);
        Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
    }

    @Test
    public void testOutputpage68_bmp()
    {
        String fileName = Global.pathCombine(folder, "Outputpage68.bmp");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PATCH_CODE);
        Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
    }

    @Test
    public void testOutputpage85_bmp()
    {
        String fileName = Global.pathCombine(folder, "Outputpage85.bmp");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PATCH_CODE);
        Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");

    }

    @Test
    public void testOutputpage94_bmp()
    {
        String fileName = Global.pathCombine(folder, "Outputpage94.bmp");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PATCH_CODE);
        Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");

    }

    @Test
    public void testOutputpage151_bmp_AllTypes()
    {
        String fileName = Global.pathCombine(folder, "Outputpage151.bmp");
        final BarCodeReader reader = new BarCodeReader(fileName);
        Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");

    }

    @Test
    public void testOutputpage151_bmp_EAN8()
    {
        String fileName = Global.pathCombine(folder, "Outputpage151.bmp");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.EAN_8);
        Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");

    }

    @Test
    public void testOutputpage151_bmp_UPCE()
    {
        String fileName = Global.pathCombine(folder, "Outputpage151.bmp");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.UPCE);
        Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
    }

    /**
     * <p>
     * Test picture without barcodes
     * </p>
     */
    @Test
    public void testOutputpage157_bmp_AllTypes()
    {
        String fileName = Global.pathCombine(folder, "Outputpage157.bmp");
        final BarCodeReader reader = new BarCodeReader(fileName);
        Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
    }

    @Test
    public void testOutputpage157_bmp_Matrix2of5()
    {
        String fileName = Global.pathCombine(folder, "Outputpage157.bmp");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.MATRIX_2_OF_5);
        Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
    }

    @Test
    public void testOutputpage157_bmp_Codabar()
    {
        String fileName = Global.pathCombine(folder, "Outputpage157.bmp");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODABAR);
        Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
    }

    @Test
    //There is problem with this test in release verion
    public void testOutputpage35_bmp_AllTypes()
    {
        String fileName = Global.pathCombine(folder, "Outputpage35.bmp");
        final BarCodeReader reader = new BarCodeReader(fileName);
        Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
    }

    @Test
    public void testOutputpage47_bmp_AllTypes()
    {
        String fileName = Global.pathCombine(folder, "Outputpage47.bmp");
        final BarCodeReader reader = new BarCodeReader(fileName);
        Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
    }

    @Test
    public void testOutputpage68_bmp_AllTypes()
    {
        String fileName = Global.pathCombine(folder, "Outputpage68.bmp");
        final BarCodeReader reader = new BarCodeReader(fileName);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("00000000001200370000", reader.getFoundBarCodes()[0].getCodeText());

    }

    @Test
    public void testOutputpage85_bmp_AllTypes()
    {
        String fileName = Global.pathCombine(folder, "Outputpage85.bmp");
        final BarCodeReader reader = new BarCodeReader(fileName);
        Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
    }

    @Test
    public void testOutputpage85_bmp_MSI()
    {
        String fileName = Global.pathCombine(folder, "Outputpage85.bmp");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.MSI);
        Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
    }

    @Test
    public void testOutputpage94_bmp_AllTypes()
    {
        String fileName = Global.pathCombine(folder, "Outputpage94.bmp");
        final BarCodeReader reader = new BarCodeReader(fileName);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("00000000001200370000", reader.getFoundBarCodes()[0].getCodeText());
    }
}

