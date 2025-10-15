package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Test(description = "Tests for Issue33833.")
public class Issue33833
{
    /**
     * <p>
     * Path to generatedFolder with files for testing.
     * </p>
     */
    private static final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33833");

    private static final String FileName = "DOC00000009.tif";

    private static final int BarcodesCount = 15;

    private final String[] ExpectedTexts = new String[]{
            "AZ000000014951",
            "AZ000000014949",
            "AZ000000014952",
            "AZ000000014953",
            "AZ000000014954",
            "AZ000000014955",
            "AZ000000014956",
            "AZ000000014957",
            "AZ000000014958",
            "AZ000000014959",
            "AZ000000014960",
            "AZ000000014961",
            "AZ000000014963",
            "AZ000000014962",
            "AZ000000014950"
    };

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    /// <summary>
    /// Tests recognition all DataMatrix barcodes.
    /// </summary>
    @Test
    public void testCustomerImageDataMatrix()
    {
        String path = Global.pathCombine(folder, FileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.DATA_MATRIX);
        List<String> recognizedTexts = new ArrayList<String>();
        for(BarCodeResult result : reader.readBarCodes())
        {
            Assert.assertFalse(recognizedTexts.contains(result.getCodeText()));
            recognizedTexts.add(result.getCodeText());
        }
        Assert.assertEquals(15, recognizedTexts.size(), "Need fix this test");
        //Assert.assertEquals(BarcodesCount).Count);

        for (String text : recognizedTexts)
        {
            Assert.assertTrue((new ArrayList<String>(Arrays.asList(ExpectedTexts))).contains(text));
        }
    }

    /// <summary>
    /// Tests recognition all Code128 barcodes.
    /// </summary>
    @Test
    public void testCustomerImageCode128()
    {
        String path = Global.pathCombine(folder, FileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.CODE_128);
        {
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
            List<String> recognizedTexts = new ArrayList<String>();
            for(BarCodeResult result : reader.readBarCodes())
            recognizedTexts.add(result.getCodeText());
            Assert.assertTrue(recognizedTexts.size() >= 4, "Need fix this test");
            Assert.assertTrue(recognizedTexts.contains("AZ000000014951"));
            Assert.assertTrue(recognizedTexts.contains("AZ000000014953"));
            Assert.assertTrue(recognizedTexts.contains("AZ000000014962"));
            Assert.assertTrue(recognizedTexts.contains("AZ000000014961"));
        }
    }

    /// <summary>
    /// Tests recognition all barcodes.
    /// </summary>
    @Test
    public void testCustomerImageCode128AndDataMatrix()
    {
        String path = Global.pathCombine(folder, FileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.CODE_128, DecodeType.DATA_MATRIX);
        reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
        List<String> recognizedDataMatrix = new ArrayList<String>();
        List<String> recognizedCode128 = new ArrayList<String>();
        for(BarCodeResult result : reader.readBarCodes())
        {
            if (result.getCodeType() == DecodeType.DATA_MATRIX)
                recognizedDataMatrix.add(result.getCodeText());
            else
            {
                if (result.getCodeType() == DecodeType.CODE_128)
                    recognizedCode128.add(result.getCodeText());
                else
                    Assert.fail("Incorrect recognition type.");
            }
        }
        Assert.assertEquals(15, recognizedDataMatrix.size(), "Need fix this test");
        Assert.assertTrue(recognizedCode128.size() >= 4, "Need fix this test");
        Assert.assertTrue(recognizedCode128.contains("AZ000000014951"));
        Assert.assertTrue(recognizedCode128.contains("AZ000000014953"));
        Assert.assertTrue(recognizedCode128.contains("AZ000000014962"));
        Assert.assertTrue(recognizedCode128.contains("AZ000000014961"));

        for (String text : recognizedDataMatrix)
        {
            Assert.assertTrue((new ArrayList<String>(Arrays.asList(ExpectedTexts))).contains(text));
        }
    }
}

