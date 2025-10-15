package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.BaseDecodeType;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>
 * Tests Issue 33823 tests.
 * </p>
 */
@Test(description = "Tests for Issue33823.")
public class Issue33823
{
    /**
     * <p>
     * Path to generatedFolder with files for testing issue 33823.
     * </p>
     */
    String folder = Global.getIssuesTestImagePath(this.getClass().getSimpleName());

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
    /// Runs test with MedianSmoothing.
    /// </summary>
        @Test
    public void testWithMedianSmoothing()
    {
        String fileName = Global.pathCombine(folder, "00000001_00000001_1.tif");

        BarCodeReader reader = new BarCodeReader(fileName);
        {
            List<BaseDecodeType> readTypes = new ArrayList<BaseDecodeType>();
            List<String> values = new ArrayList<String>();
            for(BarCodeResult result : reader.readBarCodes())
            {
                readTypes.add(result.getCodeType());
                values.add(result.getCodeText());
            }
            Assert.assertTrue(readTypes.contains(DecodeType.CODE_128));
            Assert.assertTrue(readTypes.contains(DecodeType.DATA_MATRIX));
            Assert.assertTrue(values.contains("KAZ00000155654"));
            Assert.assertTrue(values.contains("7530009720911"));
            Assert.assertTrue(values.contains("WAW"));

            int lValCnt = 0;
            int lCode128Cnt = 0;
            for (int i = 0; i < readTypes.size(); ++i)
                if (readTypes.get(i).equals(DecodeType.CODE_128))
                    lCode128Cnt++;
            for (int i = 0; i < values.size(); ++i)
                if (values.get(i).equals("KAZ00000155654"))
                    lValCnt++;
            Assert.assertEquals(2, lValCnt);
            Assert.assertEquals(3, lCode128Cnt);
        }
    }

    /// <summary>
    /// Runs test with MedianSmoothing and specified symbologies.
    /// </summary>
        @Test
    public void testWithMedianSmoothingAndSymbologies()
    {
        String fileName = Global.pathCombine(folder, "00000001_00000001_1.tif");

        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128, DecodeType.DATA_MATRIX);
        {
            List<BaseDecodeType> readTypes = new ArrayList<BaseDecodeType>();
            List<String> values = new ArrayList<String>();
            for(BarCodeResult result : reader.readBarCodes())
            {
                readTypes.add(result.getCodeType());
                values.add(result.getCodeText());
            }
            Assert.assertTrue(readTypes.contains(DecodeType.CODE_128));
            Assert.assertTrue(readTypes.contains(DecodeType.DATA_MATRIX));
            Assert.assertTrue(values.contains("KAZ00000155654"));
            Assert.assertTrue(values.contains("7530009720911"));
            Assert.assertTrue(values.contains("WAW"));

            int lKazCnt = 0;
            int lCode128Cnt = 0;
            for (int i = 0; i < readTypes.size(); ++i)
                if (readTypes.get(i).equals(DecodeType.CODE_128))
                    lCode128Cnt++;
            for (int i = 0; i < values.size(); ++i)
                if (values.get(i).equals("KAZ00000155654"))
                    lKazCnt++;
            Assert.assertEquals(2, lKazCnt);
            Assert.assertEquals(3, lCode128Cnt);
        }
    }
}

