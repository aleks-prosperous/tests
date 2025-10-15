package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.MultyDecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.util.ArrayList;
import java.util.List;

public class Issue36786
{
    /// <summary>
    /// Path to folder with files for testing Issue36786.
    /// </summary>
    private String folder = Global.getTestDataFolder("Issues\\Issue36786");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
        @BeforeMethod
    public void SetUp()
    {
        LicenseAssistant.setupLicense();
    }

    /// <summary>
    /// Tests recogntion with symbology.
    /// </summary>
        @Test
    public void test_pdf_image_300dpi()
    {
        String fileName = Global.pathCombine(folder, "pdf_image_300dpi.png");
        BarCodeReader reader = new BarCodeReader(fileName, new MultyDecodeType(DecodeType.DATA_MATRIX));
        {
            List<String> lCodetexts = new ArrayList<String>();
            for(BarCodeResult result : reader.readBarCodes())
            lCodetexts.add(result.getCodeText());

            Assert.assertEquals(2, lCodetexts.size());
            Assert.assertEquals("TAJFJA;G;EAHIGI]]A;F", lCodetexts.get(0));
            Assert.assertEquals("TAJFJA;G;EAHIGI]]A;F", lCodetexts.get(1));
        }
    }

    /// <summary>
    /// Tests recogntion with All Supported symbologies.
    /// </summary>
        @Test
    public void test_pdf_image_300dpi_AllSupported()
    {
        String fileName = Global.pathCombine(folder, "pdf_image_300dpi.png");
        BarCodeReader reader = new BarCodeReader(fileName);
        {
            List<String> lCodetexts = new ArrayList<String>();
            for(BarCodeResult result : reader.readBarCodes())
            lCodetexts.add(result.getCodeText());

            Assert.assertEquals(2, lCodetexts.size());
            Assert.assertEquals("TAJFJA;G;EAHIGI]]A;F", lCodetexts.get(0));
            Assert.assertEquals("TAJFJA;G;EAHIGI]]A;F", lCodetexts.get(1));
        }
    }
}
