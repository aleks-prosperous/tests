package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


@Test(description = "Tests for Issue33844.")
public class Issue33844
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33844");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    private final String[] ExpectedTexts = new String[]{
            "201402251343887",
            "201402251343874",
            "201402251343861",
            "201402251343845",
            "201402251343858",
            "201402251343832",
            "201402251343803",
            "201402251343816",
            "201402251343829",
            "201402251343786",
            "201402251343799",
            "201402251343773",
            "201402251343760",
            "201402251343757",
            "201402251343744"
    };

    /*
     * <p>
     * Tests recognition all DataMatrix barcodes.
     * </p>
     */
    @Test
    public void testCustomerImageDataMatrix()
    {
        final String fileName = "DOC00000012.tif";
        String path = Global.pathCombine(folder, fileName);
        final BarCodeReader reader = new BarCodeReader(path, DecodeType.DATA_MATRIX);
        List<String> recognizedTexts = new ArrayList<String>();
        for(BarCodeResult result : reader.readBarCodes())
        {
            Assert.assertFalse(recognizedTexts.contains(result.getCodeText()));
            recognizedTexts.add(result.getCodeText());
        }
        Assert.assertEquals(15, recognizedTexts.size());

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
        final String fileName = "DOC00000012.tif";
        String path = Global.pathCombine(folder, fileName);
        final BarCodeReader reader = new BarCodeReader(path, DecodeType.CODE_128);
        reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
        List<String> recognizedTexts = new ArrayList<String>();
        for(BarCodeResult result : reader.readBarCodes())
        {
            Assert.assertFalse(recognizedTexts.contains(result.getCodeText()));
            recognizedTexts.add(result.getCodeText());
        }
        Assert.assertEquals(15, recognizedTexts.size());

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
        final String fileName = "DOC00000012.tif";
        String path = Global.pathCombine(folder, fileName);
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
        Assert.assertEquals(15, recognizedCode128.size());
        Assert.assertEquals(15, recognizedDataMatrix.size());

        for (String text : ExpectedTexts)
        {
            Assert.assertTrue(recognizedDataMatrix.contains(text));
            Assert.assertTrue(recognizedCode128.contains(text));
        }


    }
}

