package com.aspose.external.barcode.tester.barcodjava;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.InputStream;

@Test
public class BARCODJAVA33325
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
            String fileName = Global.pathCombine(Folder, "Error.tif");

            InputStream stream = new FileInputStream(fileName);
            BarCodeReader reader = new BarCodeReader(stream, DecodeType.CODE_128);
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
