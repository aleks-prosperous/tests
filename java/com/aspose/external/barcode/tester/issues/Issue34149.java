package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>
 * Tests Issue34149 tests. Stack overflow error while reading Code128 code from the tif image
 * </p>
 */
@Test(description = "Tests for Issue34149.")
public class Issue34149
{
    /**
     * <p>
     * Path to generatedFolder with files for testing.
     * </p>
     */
    private static final String folder = Global.getTestDataFolder("Issues/Issue34149");

    /**
     * <p>
     * Prepares to run these tests.
     * </p>
     */
    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    /**
     * <p>
     * Test with LineCodesRestoration hint
     * </p>
     */
    @Test
    public void testWithRestoration()
    {
        String fileName = Global.pathCombine(folder, "20150407141613620+redacted.TIF");

        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        List<String> lCodetexts = new ArrayList<String>();
        for(BarCodeResult result : reader.readBarCodes())
        lCodetexts.add(result.getCodeText());
        Assert.assertTrue(lCodetexts.contains("142006543"));
        Assert.assertTrue(lCodetexts.contains("4040624"));
    }

    /**
     * <p>
     * Test with regular recognition
     * </p>
     */
    @Test
    public void testRegular()
    {
        String fileName = Global.pathCombine(folder, "20150407141613620+redacted.TIF");

        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        List<String> lCodetexts = new ArrayList<String>();
        for(BarCodeResult result : reader.readBarCodes())
        lCodetexts.add(result.getCodeText());
        Assert.assertTrue(lCodetexts.contains("142006543"));
        Assert.assertTrue(lCodetexts.contains("4040624"));
        Assert.assertEquals(reader.getFoundCount(), 2);
    }
}

