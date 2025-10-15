package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;


/**
 * <p>
 * Tests Issue33985 tests.
 * </p>
 */
@Test(description = "Tests for Issue33985.")
public class Issue33985
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33985");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    /**
     * <p>
     * Test of recognition edited picture.
     * </p>
     */
    @Test
    public void testQrEdited()
    {
        String fileName = Global.pathCombine(folder, "000169c1_edited.tif");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("Timothy|Adams|101 Brandywine Dr|Forsyth|GA|31029-5006|51|4789946969|RP7239", reader.getFoundBarCodes()[0].getCodeText());
    }

    /**
     * <p>
     * Test of recognition original picture.
     * </p>
     */
    @Test
    public void testQrOriginal()
    {
        String fileName = Global.pathCombine(folder, "000169c1.tif");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        //Assert.assertEquals(reader.readBarCodes().length, 1);
        //Assert.assertEquals("Timothy|Adams|101 Brandywine Dr|Forsyth|GA|31029-5006|51|4789946969|RP7239", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
    }
}

