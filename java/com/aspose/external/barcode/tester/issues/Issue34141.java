package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.InverseImageMode;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>
 * Tests Issue34141 tests. Can't recognize DataMatrix codes from the JPG image
 * </p>
 */
@Test(description = "Tests for Issue34141.")
public class Issue34141
{
    /**
     * <p>
     * Path to generatedFolder with files for testing.
     * </p>
     */
    private static final String folder = Global.getTestDataFolder("Issues/Issue34141");

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

    /// <summary>
    /// Test original customer image.
    /// </summary>
        @Test
    public void testIssue34141()
    {
        String fileName = Global.pathCombine(folder, "datamatrix-B4L7S02-IMG_20150106_150302.jpg");

        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        {
            reader.getQualitySettings().setInverseImage(InverseImageMode.ENABLED);

            List<String> lCodetexts = new ArrayList<String>();
            for(BarCodeResult result : reader.readBarCodes())
            lCodetexts.add(result.getCodeText());

            Assert.assertEquals(1, lCodetexts.size());
            Assert.assertTrue(lCodetexts.contains("B4L7S02"));
        }
    }

    /// <summary>
    /// Test inversed customer image.
    /// </summary>
        @Test
    public void test_datamatrix_inverse()
    {
        String fileName = Global.pathCombine(folder, "datamatrix-inverse.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        {
            List<String> lCodetexts = new ArrayList<String>();
            for(BarCodeResult result : reader.readBarCodes())
            lCodetexts.add(result.getCodeText());

            Assert.assertEquals(1, lCodetexts.size());
            Assert.assertTrue(lCodetexts.contains("B4L7S02"));
        }
    }

    /// <summary>
    /// Test cut first image
    /// </summary>
        @Test
    public void test_Cut1()
    {
        String fileName = Global.pathCombine(folder, "datamatrix-inverse_cut1.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        {
            List<String> lCodetexts = new ArrayList<String>();
            for(BarCodeResult result : reader.readBarCodes())
            lCodetexts.add(result.getCodeText());

            Assert.assertEquals(1, lCodetexts.size());
            Assert.assertTrue(lCodetexts.contains("B4L7S02"));
        }
    }

    /// <summary>
    /// Test cut second image
    /// </summary>
        @Test
    public void test_Cut2()
    {
        String fileName = Global.pathCombine(folder, "datamatrix-inverse_cut2.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
        }
    }


    /// <summary>
    /// Test cut second image
    /// </summary>
        @Test
    public void test_Cut2_Restored()
    {
        String fileName = Global.pathCombine(folder, "cut2_binarized_eroded.png");
        //image was restored with
        //HistoricalDocumentsBinarization.BSCBinarize(lBin, 1, 0.1f, 5);
        //BinarizedBitmapFunc.BlackErosion(lBin);
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        {
            List<String> lCodetexts = new ArrayList<String>();
            for(BarCodeResult result : reader.readBarCodes())
            lCodetexts.add(result.getCodeText());

            Assert.assertEquals(1, lCodetexts.size());
            Assert.assertTrue(lCodetexts.contains("cn032rtt7443147v00ko"));
        }
    }
}

