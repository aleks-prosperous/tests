package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Test(description = "Tests for Issue33837.")
public class Issue33837
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33837");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    private static final String fileName = "DOC00000003.tif";

    private static final int barcodesCount = 15;

    private static final String[] ExpectedTexts = new String[]{
    "AZ000000014949","AZ000000014950","AZ000000014951","AZ000000014952","AZ000000014953","AZ000000014954","AZ000000014955","AZ000000014956","AZ000000014957","AZ000000014958","AZ000000014959","AZ000000014960","AZ000000014961","AZ000000014962","AZ000000014963"
};

    /**
     * <p>
     * Tests recognition all DataMatrix barcodes.
     * </p>
     */
    @Test
    public void testCustomerImageDataMatrix()
    {
        String path = Global.pathCombine(folder, fileName);
        final BarCodeReader reader = new BarCodeReader(path, DecodeType.DATA_MATRIX);
        List<String> recognizedTexts = new ArrayList<String>();
        for(BarCodeResult result : reader.readBarCodes())
        {
            Assert.assertFalse(recognizedTexts.contains(result.getCodeText()));
            recognizedTexts.add(result.getCodeText());
        }
        Assert.assertEquals(barcodesCount, recognizedTexts.size());

        for(String text : ExpectedTexts)
        {
            Assert.assertTrue(recognizedTexts.contains(text));
        }
    }

    /// <summary>
    /// Tests recognition all Code128 barcodes.
    /// </summary>
    @Test
    public void testCustomerImageCode128()
    {
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.CODE_128);
        {
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
            List<String> recognizedTexts = new ArrayList<String>();
            for(BarCodeResult result : reader.readBarCodes())
            {
                Assert.assertFalse(recognizedTexts.contains(result.getCodeText()));
                recognizedTexts.add(result.getCodeText());
            }
            Assert.assertEquals(barcodesCount, recognizedTexts.size());

            for(String text : ExpectedTexts)
            {
                Assert.assertTrue(recognizedTexts.contains(text));
            }
        }
    }

    /// <summary>
    /// Tests recognition all barcodes.
    /// </summary>
    @Test
    public void testCustomerImageCode128AndDataMatrix()
    {
        String path = Global.pathCombine(folder, fileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.CODE_128, DecodeType.DATA_MATRIX);
        {
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
            List<String> recognizedDataMatrix = new ArrayList<>();
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
            Assert.assertEquals(barcodesCount, recognizedCode128.size());
            Assert.assertEquals(barcodesCount, recognizedDataMatrix.size());

            for(String text : ExpectedTexts)
            {
                Assert.assertTrue(recognizedDataMatrix.contains(text));
                Assert.assertTrue(recognizedCode128.contains(text));
            }
        }
    }
}

