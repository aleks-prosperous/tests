package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.DeconvolutionMode;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


@Test(description = "Tests for Issue18813.")
public class Issue18813
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue18813");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testCode128()
    {
        List<String> values = new ArrayList<String>();

        String fileName = Global.pathCombine(folder, "dualbarcodeimage.bmp");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        reader.getQualitySettings().setDeconvolution(DeconvolutionMode.SLOW);
        for(BarCodeResult result : reader.readBarCodes())
            values.add(result.getCodeText());
        Assert.assertTrue(values.contains("MRL472"));
        Assert.assertTrue(values.contains("L4HTGYEB"));
    }
}

