package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


@Test(description = "Tests for Issue33841.")
public class Issue33841
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33841");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    private static final String FileName = "DOC00000008.tif";

    private static final int BarcodesCount = 20;

    private final String[] ExpectedTexts = new String[]{
            "AZ000001074612",
            "AZ000001074614",
            "AZ000001074616",
            "AZ000001074618",
            "AZ000001074620",
            "AZ000001074622",
            "AZ000001074624",
            "AZ000001074626",
            "AZ000001074628",
            "AZ000001074630",
            "AZ000001074632",
            "AZ000001074634",
            "AZ000001074636",
            "AZ000001074638",
            "AZ000001074640",
            "AZ000001074642",
            "AZ000001074644",
            "AZ000001074646",
            "AZ000001074648",
            "AZ000001074650",
    };

    /// <summary>
    /// Tests recognition all DataMatrix barcodes.
    /// </summary>
    @Test
    public void testCustomerImageDataMatrix()
    {
        String path = Global.pathCombine(folder, FileName);
        BarCodeReader reader = new BarCodeReader(path, DecodeType.DATA_MATRIX);
        {
            List<String> recognizedTexts = new ArrayList<>();
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
            {
                Assert.assertFalse(recognizedTexts.contains(result.getCodeText()));
                recognizedTexts.add(result.getCodeText());
            }
            Assert.assertEquals(BarcodesCount, recognizedTexts.size());

            for(String text : ExpectedTexts)
            Assert.assertTrue(recognizedTexts.contains(text));
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
            Assert.assertEquals(BarcodesCount, recognizedCode128.size());
            Assert.assertEquals(BarcodesCount, recognizedDataMatrix.size());

            for(String text : ExpectedTexts)
            {
                Assert.assertTrue(recognizedCode128.contains(text));
            }

            for(String text : ExpectedTexts)
            {
                Assert.assertTrue(recognizedDataMatrix.contains(text));
            }
        }
    }
}

