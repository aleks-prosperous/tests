package com.aspose.external.barcode.tester.barcodjava;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.ChecksumValidation;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Test
public class BARCODJAVA31627
{
    @BeforeClass
    public void setLicense() throws Exception
    {
        com.aspose.barcode.LicenseAssistant.setupLicense();
    }

    @Test(enabled = false)
    public void testOne()
    {
        try
        {
            String fileName = Global.getBarcodeJavaIssuesTestImagePath("BARCODJAVA31627/00000001.TIF");

            BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);
            reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.ON);
            int counter = 0;
            for (BarCodeResult result : reader.readBarCodes())
            {
                counter++;
                Assert.assertNotNull(result.getCodeText());

                Assert.assertEquals(result.getCodeText(), "BL4370");
                Assert.assertNotNull(result.getCodeType());
            }

            Assert.assertTrue(counter > 0);

        } catch (Exception e)
        {
            Assert.fail("Exception", e);
        }
    }
}
