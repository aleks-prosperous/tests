package com.aspose.external.barcode.tester.releases.v18_1;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.XDimensionMode;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


@Test
public class Issue36747
{
    /**
     * <p>
     * Path to folder with files for testing Issue36747.
     * </p>
     */
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue36747");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testQROriginal()
    {
        String fileName = folder + "MultipleQRCodesSample.jpg";
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        List<String> recognizedResults = new ArrayList<>();
        for(BarCodeResult result : reader.readBarCodes())
        recognizedResults.add(result.getCodeText());
        assertRecognizedResults(recognizedResults);
    }

    @Test
    public void testQROriginalAllSupportedTypes()
    {
        String fileName = folder + "MultipleQRCodesSample.jpg";
        BarCodeReader reader = new BarCodeReader(fileName);
        List<String> recognizedResults = new ArrayList<>();
        for(BarCodeResult result : reader.readBarCodes())
        recognizedResults.add(result.getCodeText());
        assertRecognizedResults(recognizedResults);
    }

    @Test
    public void testQRScaled()
    {
        String fileName = folder + "MultipleQRCodesSample_scaled.png";
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        List<String> recognizedResults = new ArrayList<>();
        for(BarCodeResult result : reader.readBarCodes())
        recognizedResults.add(result.getCodeText());
        assertRecognizedResults(recognizedResults);
    }

    @Test
    public void testQRScaledAllSupportedTypes()
    {
        String fileName = folder + "MultipleQRCodesSample_scaled.png";
        BarCodeReader reader = new BarCodeReader(fileName);
        List<String> recognizedResults = new ArrayList<>();
        for(BarCodeResult result : reader.readBarCodes())
        recognizedResults.add(result.getCodeText());
        assertRecognizedResults(recognizedResults);
    }

    @Test
    public void testQRScaled2()
    {
        String fileName = folder + "MultipleQRCodesSample_scaled2.png";
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);
        List<String> recognizedResults = new ArrayList<>();
        for(BarCodeResult result : reader.readBarCodes())
        recognizedResults.add(result.getCodeText());
        assertRecognizedResults(recognizedResults);
    }

    @Test
    public void testQRScaled2AllSupportedTypes()
    {
        String fileName = folder + "MultipleQRCodesSample_scaled2.png";
        BarCodeReader reader = new BarCodeReader(fileName);
        List<String> recognizedResults = new ArrayList<>();
        for(BarCodeResult result : reader.readBarCodes())
        recognizedResults.add(result.getCodeText());
        assertRecognizedResults(recognizedResults);
    }

    private void assertRecognizedResults(List<String> recognizedResults)
    {
        Assert.assertEquals(13, recognizedResults.size(), "Count of recognized barcode isn't correct.");
        Assert.assertTrue(recognizedResults.contains("PKG-F"));
        Assert.assertTrue(recognizedResults.contains("PKG-E"));
        Assert.assertTrue(recognizedResults.contains("PKG-D"));
        Assert.assertTrue(recognizedResults.contains("PKG-C"));
        Assert.assertTrue(recognizedResults.contains("PKG-B"));
        Assert.assertTrue(recognizedResults.contains("PKG-A"));
        Assert.assertTrue(recognizedResults.contains("Other"));
        Assert.assertTrue(recognizedResults.contains("PKG-K"));
        Assert.assertTrue(recognizedResults.contains("PKG-J"));
        Assert.assertTrue(recognizedResults.contains("PKG-I"));
        Assert.assertTrue(recognizedResults.contains("PKG-H"));
        Assert.assertTrue(recognizedResults.contains("PKG-G"));
        Assert.assertTrue(recognizedResults.contains("ST12385"));
    }
}

