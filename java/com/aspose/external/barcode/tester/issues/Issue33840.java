package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


@Test(description = "Tests for Issue33840.")
public class Issue33840
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33840");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    private static final String FileName = "DOC00000007.tif";

    private static final int BarcodesCount = 20;

    private final String[] ExpectedTexts = new String[]{
            "D000180090936",
            "D000180090937",
            "D000180090938",
            "D000180090939",
            "D000180090940",
            "D000180090941",
            "D000180090942",
            "D000180090943",
            "D000180090944",
            "D000180090945",
            "D000180090946",
            "D000180090947",
            "D000180090948",
            "D000180090949",
            "D000180090950",
            "D000180090951",
            "D000180090952",
            "D000180090953",
            "D000180090954",
            "D000180090955",
    };

    /**
     * <p>
     * Tests recognition all DataMatrix barcodes.
     * </p>
     */
    @Test
    public void testCustomerImageDataMatrix()
    {
        String path = Global.pathCombine(folder, FileName);
        final BarCodeReader reader = new BarCodeReader(path, DecodeType.DATA_MATRIX);
        List<String> recognizedTexts = new ArrayList<String>();
        for(BarCodeResult result : reader.readBarCodes())
        {
            Assert.assertFalse(recognizedTexts.contains(result.getCodeText()));
            recognizedTexts.add(result.getCodeText());
        }
        Assert.assertEquals(BarcodesCount, recognizedTexts.size());

        for (String text : ExpectedTexts)
        {
            Assert.assertTrue(recognizedTexts.contains(text));
        }
    }

    /**
     * <p>
     * Tests recognition all Code128 barcodes.
     * </p>
     */
    @Test
    public void testCustomerImageCode128()
    {
        String path = Global.pathCombine(folder, FileName);
        final BarCodeReader reader = new BarCodeReader(path, DecodeType.CODE_128);
        reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
        List<String> recognizedTexts = new ArrayList<String>();
        for(BarCodeResult result : reader.readBarCodes())
        {
            Assert.assertFalse(recognizedTexts.contains(result.getCodeText()));
            recognizedTexts.add(result.getCodeText());
        }
        Assert.assertEquals(BarcodesCount, recognizedTexts.size());

        for (String text : ExpectedTexts)
        {
            Assert.assertTrue(recognizedTexts.contains(text));
        }
    }

    /**
     * <p>
     * Tests recognition all barcodes.
     * </p>
     */
    @Test
    public void testCustomerImageCode128AndDataMatrix()
    {
        String path = Global.pathCombine(folder, FileName);
        final BarCodeReader reader = new BarCodeReader(path, DecodeType.CODE_128, DecodeType.DATA_MATRIX);
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
        Assert.assertEquals(BarcodesCount, recognizedCode128.size());
        Assert.assertEquals(BarcodesCount, recognizedDataMatrix.size());

        for (String text : ExpectedTexts)
        {
            Assert.assertTrue(recognizedCode128.contains(text));
        }

        for (String text : ExpectedTexts)
        {
            Assert.assertTrue(recognizedDataMatrix.contains(text));
        }

    }
}

