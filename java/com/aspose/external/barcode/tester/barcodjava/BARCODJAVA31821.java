package com.aspose.external.barcode.tester.barcodjava;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

@Test
public class BARCODJAVA31821
{
    String Folder = Global.getBarcodeJavaIssuesTestImagePath(this.getClass().getSimpleName());

    @BeforeClass
    public void setLicense() throws Exception
    {
        com.aspose.barcode.LicenseAssistant.setupLicense();
    }

    @Test
    public void testOne()
    {
        String filePath = Folder;
        List<String> files = new ArrayList<String>();
        files.add(filePath + "PDF-417.tif");

        for (String fileName : files)
        {
            try
            {


                BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PDF_417);
//                reader.setOrientationHints(Orientation.Rotate180);

                int counter = 0;
                for (BarCodeResult result : reader.readBarCodes())
                {
                    counter++;
                    Assert.assertNotNull(result.getCodeText());

                    String expectedTest = "In addition to features typical of two dimensional bar codes, PDF417's capabilities include:\n\n    * Linking. PDF417 symbols can link to other symbols which are scanned in sequence allowing even more data to be stored.\n    * User-specified dimensions. The user can decide how wide the narrowest vertical bar (X dimension) is, and how tall the rows are (Y dimension).\n    * Public domain format. Anyone can implement systems using this format without any license.[citati\n\nEncoding\n\nOf the 929 available codewords, 900 are used for data, and 29 for special functions. Three different encoding schemes are defined and can be mixed as necessary within a single symbol.\n\n    * Text: each codeword represents one or two characters.\n    * Byte: each group of 5 codewords represents 6 bytes.\n    * Numeric: groups of up to 15 codewords represent as many as 44 decimal digits.";
                    Assert.assertEquals(result.getCodeText(), expectedTest);
                    Assert.assertNotNull(result.getCodeType());
                }

                Assert.assertEquals(counter, 1);

            } catch (Exception e)
            {
                Assert.fail("Exception", e);
            }

        }
    }
}
