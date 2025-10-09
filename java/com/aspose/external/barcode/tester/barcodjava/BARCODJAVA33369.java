package com.aspose.external.barcode.tester.barcodjava;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Test
public class BARCODJAVA33369
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
        try
        {
            String fileName = Global.pathCombine(Folder, "input001.tiff");

            BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);

            int counter = 0;
            for (BarCodeResult result : reader.readBarCodes())
            {
                counter++;
                Assert.assertNotNull(result.getCodeText());
                Assert.assertNotNull(result.getCodeType());
            }

            Assert.assertTrue(counter > 0);

        } catch (Exception e)
        {
            Assert.fail("Exception", e);
        }
    }

    @Test
    public void testTwo()
    {
        try
        {
            String fileName = Global.pathCombine(Folder, "input002.tiff");

            BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);

            int counter = 0;
            for (BarCodeResult result : reader.readBarCodes())
            {
                counter++;
                Assert.assertNotNull(result.getCodeText());
                Assert.assertNotNull(result.getCodeType());
            }

            Assert.assertTrue(counter > 0);

        } catch (Exception e)
        {
            Assert.fail("Exception", e);
        }
    }
}
