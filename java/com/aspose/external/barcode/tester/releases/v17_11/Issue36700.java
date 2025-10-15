package com.aspose.external.barcode.tester.releases.v17_11;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;

public class Issue36700
{
    private String folder = Global.getTestDataFolder("Issues" + File.separatorChar + "Issue36700");

    /**
     * <p>
     * Prepares to run these tests.
     * </p>
     */
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testDataMatrixAll()
    {
        String file = folder + "CR51727000003_1.tif";
        BarCodeReader reader = new BarCodeReader(file, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 2);
        Assert.assertEquals("*5VALSSN01COMBJOB3414720170919000003*", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals("20170920T1FJ0020000000000200010004040400", reader.getFoundBarCodes()[1].getCodeText());
    }

    @Test
    public void testDataMatrixAllResized()
    {
        String file = folder + "CR51727000003_1_resized.tif";
        BarCodeReader reader = new BarCodeReader(file, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 2);
        Assert.assertEquals("*5VALSSN01COMBJOB3414720170919000003*", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals("20170920T1FJ0020000000000200010004040400", reader.getFoundBarCodes()[1].getCodeText());
    }

    @Test
    public void testDataMatrixTop()
    {
        String file = folder + "CR51727000003_1_top.tif";
        BarCodeReader reader = new BarCodeReader(file, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("*5VALSSN01COMBJOB3414720170919000003*", reader.getFoundBarCodes()[0].getCodeText());

    }

    @Test
    public void testDataMatrixTopPng()
    {
        String file = folder + "CR51727000003_1_top.png";
        BarCodeReader reader = new BarCodeReader(file, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("*5VALSSN01COMBJOB3414720170919000003*", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testDataMatrixToppPngResized()
    {
        String file = folder + "CR51727000003_1_top_resized.png";
        BarCodeReader reader = new BarCodeReader(file, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("*5VALSSN01COMBJOB3414720170919000003*", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testDataMatrixRight()
    {
        String file = folder + "CR51727000003_1_right.tif";
        BarCodeReader reader = new BarCodeReader(file, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("20170920T1FJ0020000000000200010004040400", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testDataMatrixNewbits()
    {
        String file = folder + "newbits.png";
        BarCodeReader reader = new BarCodeReader(file, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("*5VALSSN01COMBJOB3414720170919000003*", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testMicrE13B()
    {
        String file = folder + "CR51727000003_1.tif";
        BarCodeReader reader = new BarCodeReader(file, DecodeType.MICR_E_13_B);
        Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
    }

    @Test
    public void testAllSupportedTypes()
    {
        String file = folder + "CR51727000003_1.tif";
        BarCodeReader reader = new BarCodeReader(file);
        Assert.assertEquals(reader.readBarCodes().length, 2);
        Assert.assertEquals("*5VALSSN01COMBJOB3414720170919000003*", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals("20170920T1FJ0020000000000200010004040400", reader.getFoundBarCodes()[1].getCodeText());
    }
}
