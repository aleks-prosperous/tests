package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

@Test(description = "Tests for Issue33834.")
public class Issue33834
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33834");

    private final String FileName = "DOC00000010.tif";

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    private static final int BARCODES_COUNT = 19;

    private final String[] ExpectedTexts = new String[]{
            "AZ000000014945",
            "AZ000000014943",
            "AZ000000014941",
            "AZ000000014940",
            "AZ000000014948",
            "AZ000000014938",
            "AZ000000014937",
            "AZ000000014939",
            "AZ000000014935",
            "AZ000000014946",
            "AZ000000014936",
            "AZ000000014934",
            "AZ000000014932",
            "AZ000000014930",
            "AZ000000014933",
            "AZ000000014931",
            "AZ000000014944",
            "AZ000000014942",
            "AZ000000014947"
    };

    /**
     * <p>
     * Tests recognition all DataMatrix barcodes.
     * </p>
     */
    @Test
    public void testCustomerImageDataMatrix()
    {
        String path = Global.pathCombine(folder, "DOC00000010.tif");
        final BarCodeReader reader = new BarCodeReader(path, DecodeType.DATA_MATRIX);
        List<String> recognizedTexts = new ArrayList<String>();
        for(BarCodeResult result : reader.readBarCodes())
        {
            Assert.assertFalse(recognizedTexts.contains(result.getCodeText()));
            recognizedTexts.add(result.getCodeText());
        }
        Assert.assertEquals(BARCODES_COUNT, recognizedTexts.size());

        //foreach to while statements conversion
        Iterator tmp0 = (recognizedTexts).iterator();
        while (tmp0.hasNext())
        {
            String text = (String) tmp0.next();
            Assert.assertTrue(Arrays.asList(ExpectedTexts).contains(text));
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
        BarCodeReader reader = new BarCodeReader(path, DecodeType.CODE_128);
        {
            reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
            List<String> recognizedTexts = new ArrayList<>();
            for(BarCodeResult result : reader.readBarCodes())
            {
//                Assert.assertFalse(recognizedTexts.contains(result.getCodeText()));
                recognizedTexts.add(result.getCodeText());
            }
            //Assert.GreaterOrEqual(recognizedTexts.Count, 3);
            //Assert.Contains("AZ000000014940", recognizedTexts);
            Assert.assertTrue(recognizedTexts.contains("AZ000000014942"));
            Assert.assertTrue(recognizedTexts.contains("AZ000000014933"));
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
        String path = Global.pathCombine(folder, "DOC00000010.tif");
        final BarCodeReader reader = new BarCodeReader(path, DecodeType.CODE_128, DecodeType.DATA_MATRIX);
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
        //Assert.assertEquals(4, recognizedCode128.Count, "Need fix this test");
        //Assert.assertEquals(2, recognizedDataMatrix.Count, "Need fix this test");

        Assert.assertEquals(BARCODES_COUNT, recognizedDataMatrix.size());

        for (String text : ExpectedTexts)
        {
            Assert.assertTrue(recognizedDataMatrix.contains(text));
        }
    }
}

