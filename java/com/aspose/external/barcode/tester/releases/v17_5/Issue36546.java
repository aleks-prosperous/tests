package com.aspose.external.barcode.tester.releases.v17_5;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;

@Test
public class Issue36546
{
    /**
     * <p>
     * Path to folder with files for testing Issue36546.
     * </p>
     */
    final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue36546");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testDecodeTypeAllSupportedTypes()
    {
        String fileName = Global.pathCombine(folder, "tmpbarcode1.jpg");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);
        Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
    }

    @Test
    public void testBarCodeReadTypeAllSupportedTypes()
    {
        String fileName = Global.pathCombine(folder, "tmpbarcode1.jpg");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);
        Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
    }

    @Test
    public void testMicrE13B()
    {
        String fileName = Global.pathCombine(folder, "tmpbarcode1.jpg");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.MICR_E_13_B);
        Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
    }

    @Test
    public void testMicrE13BBarCodeReadType()
    {
        String fileName = Global.pathCombine(folder, "tmpbarcode1.jpg");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.MICR_E_13_B);
        Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
    }

    @Test
    public void testMicrE13BSample()
    {
        String fileName = Global.pathCombine(folder, "667px-MICR2.svg.png");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.MICR_E_13_B);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("ABCD", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testA()
    {
        String fileName = Global.pathCombine(folder, "a.png");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.MICR_E_13_B);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("A", reader.getFoundBarCodes()[0].getCodeText());
    }
}
