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

/**
 * <p>
 * Issue34044 tests. Can't recognize QR code form the PDF document
 * </p>
 */
@Test(description = "Tests for Issue34044.")
public class Issue34044
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue34044");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    /**
     * <p>
     * Tests recogntion with symbology QR.
     * </p>
     */
    @Test
    public void testRecognitionAsQR()
    {
        String fileName = Global.pathCombine(folder, "Page7.png");

        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        List<String> lCodetexts = new ArrayList<String>();
        for(BarCodeResult result : reader.readBarCodes())
        lCodetexts.add(result.getCodeText());
        Assert.assertTrue(lCodetexts.contains("http://banquescotia.com"));
        Assert.assertTrue(lCodetexts.contains("http://desjardins.com"));
        Assert.assertEquals(reader.getFoundCount(), 2);
    }
}
