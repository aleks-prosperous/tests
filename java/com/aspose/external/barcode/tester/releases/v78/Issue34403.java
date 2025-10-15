package com.aspose.external.barcode.tester.releases.v78;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.BaseDecodeType;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.CollectionAssert;

import java.util.ArrayList;
import java.util.List;


@Test
public class Issue34403
{
    final String folder = Global.getTestDataFolder("Issues");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
        //[Category("AllSupportedTypes")]
    public void test_Issue34403_PathIV_TIFF_AllSupportedTypes()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34403\\PathIV.TIFF"), DecodeType.ALL_SUPPORTED_TYPES);
        {
            BaseDecodeType expectedType = DecodeType.scanSets(DecodeType.DATA_MATRIX, DecodeType.ONE_CODE);
            List<String> actualTexts = new ArrayList<String>();
            for(BarCodeResult result : reader.readBarCodes())
            {
                actualTexts.add(result.getCodeText());
                BaseDecodeType actualType = result.getCodeType();
                Assert.assertTrue(expectedType.containsAny(actualType), "Actual and expected type comparison: 'Issue34403\\PathIV.TIFF' failed. ");
            }

            String[] expectedTexts = new String[2];
            expectedTexts[0] = "ÿVÄ;\0!Tâ- \0\0\000000184";
            expectedTexts[1] = "9327000037056920453916105161301";

            CollectionAssert.areEquivalent(expectedTexts, actualTexts, "File 'Issue34403\\PathIV.TIFF': Expected and actual collections of code texts are not equivalent.");
        }
        System.out.println("Test for \"Issue34403\\PathIV.TIFF\" has completed successfully.");
    }

        @Test
        //[Category("OneCode")]
    public void test_Issue34403_2M0461619763_TIFF_OneCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34403\\2M0461619763.TIFF"), DecodeType.ONE_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("9327000037056920453916105161301", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("DataMatrix")]
    public void test_Issue34403_PathIV_TIFF_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34403\\PathIV.TIFF"), DecodeType.DATA_MATRIX);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("ÿVÄ;\0!Tâ- \0\0\000000184", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        //[Category("OneCode")]
    public void test_Issue34403_PathIV_TIFF_OneCode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "Issue34403\\PathIV.TIFF"), DecodeType.ONE_CODE);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("9327000037056920453916105161301", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
