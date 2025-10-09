package com.aspose.external.barcode.tester.barcodjava;

import com.aspose.barcode.generation.EncodeTypes;
import com.aspose.barcode.generation.BarCodeImageFormat;
import com.aspose.barcode.generation.BarcodeGenerator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.ByteArrayOutputStream;

@Test
public class BARCODJAVA33314
{
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
            BarcodeGenerator builder = new BarcodeGenerator(EncodeTypes.CODE_128);
            // set code text
            builder.setCodeText("123456");
            ByteArrayOutputStream outStream = new ByteArrayOutputStream();

            Assert.assertTrue(outStream.size() == 0);

            // save barcode image
            builder.save(outStream, BarCodeImageFormat.JPEG);

            Assert.assertTrue(outStream.size() > 0);
        } catch (Exception e)
        {
            Assert.fail("Exception", e);
        }
    }
}
