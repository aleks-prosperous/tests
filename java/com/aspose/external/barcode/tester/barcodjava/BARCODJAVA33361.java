package com.aspose.external.barcode.tester.barcodjava;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test
public class BARCODJAVA33361
{
    @BeforeMethod
    public void setLicense() throws Exception
    {
        com.aspose.barcode.LicenseAssistant.setupLicense();
    }

    @Test
    public void testOne()
    {
        try
        {
            String fileName = Global.getBarcodeJavaIssuesTestImagePath("BARCODJAVA33361") + "/IMG_0045.JPG";
            System.out.println("File path: " + fileName);
            BarCodeReader reader = new BarCodeReader(fileName, DecodeType.EAN_13);

            int counter = 0;
            for (BarCodeResult result : reader.readBarCodes())
            {
                counter++;
                Assert.assertNotNull(result.getCodeText());
                Assert.assertEquals(result.getCodeText(), "0087752011362");
                Assert.assertNotNull(result.getCodeType());
                Assert.assertEquals(result.getCodeType(), DecodeType.EAN_13);
            }

            Assert.assertTrue(counter > 0);
            System.out.println("Reads number: " + counter);
        } catch (Exception e)
        {
            Assert.fail("Exception", e);
        }
    }
}
