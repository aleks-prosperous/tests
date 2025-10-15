package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>
 * Tests Issue34137 tests. Fake recognition of MicroPdf417
 * </p>
 */
@Test(description = "Tests for Issue34137.")
public class Issue34137
{
    /**
     * <p>
     * Path to generatedFolder with files for testing.
     * </p>
     */
    private static final String Folder = Global.getTestDataFolder("Issues/Issue34137");

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

    /**
     * <p>
     * Tests fake recognition MicroPdf417.
     * </p>
     */
    @Test
    public void testCustomerImageFakeMicroPdf417()
    {
        final String fileName = "DOC00000012.tif";
        String path = Global.pathCombine(Folder, fileName);
        final BarCodeReader reader = new BarCodeReader(path, DecodeType.MICRO_PDF_417);
        Assert.assertEquals(reader.readBarCodes().length, 0, "Now ok, need to fix this test");
    }

    @Test
    public void test34137()
    {
        String[] ethalonData = new String[]
                {
                        "201402251343757",
                        "201402251343803",
                        "201402251343829",
                        "201402251343799",
                        "201402251343861",
                        "201402251343887",
                        "201402251343773",
                        "201402251343744",
                        "201402251343845",
                        "201402251343816",
                        "201402251343760",
                        "201402251343874",
                        "201402251343858",
                        "201402251343832",
                        "201402251343786",
                        "201402251343861",
                        "201402251343887",
                        "201402251343829",
                        "201402251343799",
                        "201402251343773",
                        "201402251343757",
                        "201402251343803",
                        "201402251343744",
                        "201402251343874",
                        "201402251343845",
                        "201402251343760",
                        "201402251343832",
                        "201402251343816",
                        "201402251343858",
                        "201402251343786"
                };

        String fileName = "DOC00000012.tif";
        String path = Global.pathCombine(Folder, fileName);
        testReader(path, new MultyDecodeType(DecodeType.DATA_MATRIX, DecodeType.CODE_128), ethalonData);
    }

    private void testReader(String path, BaseDecodeType readType, String[] expectedCodes)
    {
        BarCodeReader reader = new BarCodeReader(path, readType);
        reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
        testReader(reader, expectedCodes);
    }

    private void testReader(BarCodeReader reader, String[] expectedCodes)
    {
        List<String> actualCodes = new ArrayList<>();
        for(BarCodeResult result : reader.readBarCodes())
        actualCodes.add(result.getCodeText());
        Assert.assertEquals(expectedCodes.length, actualCodes.size());
        for (int i = 0; i < expectedCodes.length; i++)
        {
            Assert.assertTrue(actualCodes.contains(expectedCodes[i]));
        }
    }
}

