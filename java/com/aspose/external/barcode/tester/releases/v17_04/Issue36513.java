package com.aspose.external.barcode.tester.releases.v17_04;

import com.aspose.barcode.auxiliary.Global;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;

@Test
public class Issue36513
{
    final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue36513");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    /**
     * <p>
     * Tests recognition of "02_A_1_05.bmp" from Issue36513
     * </p>
     */
    @Test
    public void test_02_A_1_05()
    {
        String fileName = Global.pathCombine(folder, "02_A_1_05.bmp");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("YDEQR912", reader.getFoundBarCodes()[0].getCodeText());
    }

    /**
     * <p>
     * Tests recognition of rotated (90 degrees) "02_A_1_05.bmp" from Issue36513
     * </p>
     */
    @Test
    public void test_02_A_1_05_Rot90()
    {
        String fileName = Global.pathCombine(folder, "02_A_1_05_Rot90.png");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("YDEQR912", reader.getFoundBarCodes()[0].getCodeText());
    }

    /**
     * <p>
     * Tests recognition of rotated (180 degrees) "02_A_1_05.bmp" from Issue36513
     * </p>
     */
    @Test
    public void test_02_A_1_05_Rot180()
    {
        String fileName = Global.pathCombine(folder, "02_A_1_05_Rot180.png");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        reader.getQualitySettings().setDeconvolution(DeconvolutionMode.SLOW);
        reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("YDEQR912", reader.getFoundBarCodes()[0].getCodeText());
    }

    /**
     * <p>
     * Tests recognition of rotated (270 degrees) "02_A_1_05.bmp" from Issue36513
     * </p>
     */
    @Test
    public void test_02_A_1_05_Rot270()
    {
        String fileName = Global.pathCombine(folder, "02_A_1_05_Rot270.png");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("YDEQR912", reader.getFoundBarCodes()[0].getCodeText());
    }

    /**
     * <p>
     * Tests recognition of cutted "02_A_1_05.bmp" from Issue36513
     * </p>
     */
    @Test
    public void test_02_A_1_05_Edited()
    {
        String fileName = Global.pathCombine(folder, "02_A_1_05_Edited.png");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("YDEQR912", reader.getFoundBarCodes()[0].getCodeText());
    }

    /**
     * <p>
     * Tests recognition of "04_B_3_01.bmp" from Issue36513
     * </p>
     */
    @Test
    public void test_04_B_3_01()
    {
        String fileName = Global.pathCombine(folder, "04_B_3_01.bmp");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("YDelectronic0008\0", reader.getFoundBarCodes()[0].getCodeText());
    }
}

