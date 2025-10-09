package com.aspose.external.barcode.tester.barcodjava;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Test
public class BARCODJAVA31409
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
            String fileName = Global.pathCombine(Folder, "barcode.png");

            BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);

            int counter = 0;
            for (BarCodeResult result : reader.readBarCodes())
            {
                counter++;
                Assert.assertNotNull(result.getCodeText());

                Assert.assertNotNull(result.getCodeType());
            }

            Assert.assertEquals(counter, 4);

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
            String fileName = Global.pathCombine(Folder, "MyBarCode1.png");

            BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);

            int counter = 0;
            for (BarCodeResult result : reader.readBarCodes())
            {
                counter++;
                Assert.assertNotNull(result.getCodeText());

                Assert.assertNotNull(result.getCodeType());
            }

            Assert.assertEquals(counter, 4);

        } catch (Exception e)
        {
            Assert.fail("Exception", e);
        }
    }
}
