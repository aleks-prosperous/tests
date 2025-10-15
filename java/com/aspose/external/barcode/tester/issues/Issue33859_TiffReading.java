package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Issue33859_TiffReading
{

    private String _folder;

    @BeforeMethod
    public void setupTestFixture()
    {
        this._folder = Global.getIssuesTestImagePath("Issue33859");
        utils.LicenseAssistant.setupLicense();
    }

        @Test
    public void test_Issue33859_test_tif_Code39Standard() throws IOException
        {
        BufferedImage img = ImageIO.read(new File(Global.pathCombine(this._folder, "test.tif")));
        {
            BarCodeReader reader = new BarCodeReader(img, DecodeType.CODE_39);
            {
                List<String> actualTexts = new ArrayList<>();
                for(BarCodeResult result : reader.readBarCodes())
                actualTexts.add(result.getCodeText());

                String[] expectedTexts = new String[2];
                expectedTexts[0] = "CTSCASNY";
                expectedTexts[1] = "SUBLTR";

                //Assert.assertEquals(expectedTexts.Length, actualTexts.Count);
                for(String expectedText : expectedTexts)
                {
                    Assert.assertFalse(actualTexts.contains(expectedText), "Now ok need to fix this test.");
                }
                //CollectionAssert.IsSubsetOf ( actualTexts, expectedTexts, @" File 'Issue33859\test.tif': Expected and actual collections of code texts do not meet requirements." );
            }
        }
    }
}
