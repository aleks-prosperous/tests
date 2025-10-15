package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.BaseDecodeType;
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
 * Tests Issue33831 tests.
 * </p>
 */
@Test(description = "Tests for Issue33831.")
public class Issue33831
{
    /**
     * <p>
     * Path to generatedFolder with files for testing Issue33829.
     * </p>
     */
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33831");

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

    /**
     * <p>
     * Tests recognition of image from Issue33831
     * </p>
     */
    @Test
    public void testIssue33831()
    {
        String fileName = folder + "00000023_00000007_6.tif";
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX, DecodeType.CODE_128);

        List<BaseDecodeType> readTypes = new ArrayList<>();
        List<String> values = new ArrayList<>();
        for(BarCodeResult result : reader.readBarCodes())
        {
            readTypes.add(result.getCodeType());
            values.add(result.getCodeText());
        }
        Assert.assertTrue(readTypes.contains(DecodeType.CODE_128));
        Assert.assertTrue(readTypes.contains(DecodeType.DATA_MATRIX));
        Assert.assertTrue(values.contains("AZ000000393742"));

        int lValCnt = 0;
        for (int i = 0; i < values.size(); ++i)
        {
            if (values.get(i).equals("AZ000000393742"))
            {
                lValCnt++;
            }
        }
        Assert.assertEquals(2, lValCnt);
    }
}

