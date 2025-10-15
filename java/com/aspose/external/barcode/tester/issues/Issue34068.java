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
 * Tests Issue34068 tests. Incorrect recognition of Pdf417 code from the tif image
 * </p>
 */
@Test(description = "Tests for Issue34068.")
public class Issue34068
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue34068");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    /**
     * <p>
     * Test original image
     * </p>
     */
    @Test
    public void testOriginalPdf417()
    {
        String fileName = "00010.tif";

        String path = Global.pathCombine(folder, fileName);
        final BarCodeReader reader = new BarCodeReader(path, DecodeType.PDF_417);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("T1\r0006\rMO\rMO1040A/2014\r0\rV11.01PWT6F1040A\r\r\r\r\r006\r132459876\r567656412\r" +
                "SMITH\rJOHN\r\r\r\rSMITH\rLISA\r\r\r\r\rCOLE\r510 E TOWNSHIP LINE RD\rJEFFERSON CITY\r" +
                "MO\r65103\r\r\r\r\r\r\r\r\r\r\r52638\r\r\r\r0\r\r52638\r\r\r\r\rX\r\r\r\r\r" +
                "4200\r5000\r\r\r5000\r12400\r1\r1200\r\r\r0\r\r\r22800\r29838\r\r\r" +
                "1565\r\r\r\r\r\r\r\r\r\r\r\r\r\r1700\r0\r\r\r\r\r\r1700\r\r\r\r\r\r\r\r\r\r\r\r" +
                "135\r0\r0\r0\r0\r0\r0\r0\r0\r0\r0\r00\r0\r00\r0\r135\r\r\r" +
                "0\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r" +
                "0\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r" +
                "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r" +
                "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r" +
                "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r" +
                "\r\r\r\r\r\rC\r032158793\r2657318645\r*EOD*\r", reader.getFoundBarCodes()[0].getCodeText());
    }
}

