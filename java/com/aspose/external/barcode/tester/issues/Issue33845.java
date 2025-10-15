package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


@Test(description = "Tests for Issue33845.")
public class Issue33845
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33845");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    private static final String FileName = "DOC00000013.tif";

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
            "D000180090955"
    };

    private static final String[] ExpectedDatamatrixTexts = new String[]{
    "D000180090936",
            "D000180090937",
            "D000180090938",
            "D000180090939",
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
            "D000180090952",
            "D000180090953",
            "D000180090954",
            "D000180090955"
};

    @Test
    public void testOneDataMatrixRotated()
    {
        String fileName = Global.pathCombine(folder, "oneDataMatrixRotated.png");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("D000180090955", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testOneDataMatrix()
    {
        String fileName = Global.pathCombine(folder, "oneDataMatrix.png");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("D000180090955", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test8thBlock()
    {
        String fileName = Global.pathCombine(folder, "DOC00000013_8thBlockR.png");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("D000180090941", reader.getFoundBarCodes()[0].getCodeText());
    }

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
        Assert.assertEquals(20, recognizedTexts.size());

        for(String text : ExpectedDatamatrixTexts)
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
        Assert.assertEquals(20, recognizedDataMatrix.size());

        for(String text : ExpectedTexts)
        {
            Assert.assertTrue(recognizedCode128.contains(text));
        }

        for(String text : ExpectedDatamatrixTexts)
        {
            Assert.assertTrue(recognizedDataMatrix.contains(text));
        }
    }
}

