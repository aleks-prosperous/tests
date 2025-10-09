package com.aspose.external.barcode.tester.barcodjava;

import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.BarCodeException;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BARCODJAVA33401
{
    @BeforeMethod
    public void setUp()
    {
        com.aspose.barcode.LicenseAssistant.setupLicense();
    }

    @Test
    public void generationNoException()
    {
        BarcodeGenerator bb = new BarcodeGenerator(EncodeTypes.PHARMACODE, "999999");
            try
            {
                bb.generateBarCodeImage();
            } catch (RuntimeException ex)
            {
                Assert.fail("No exception must be thrown, " + ex.getMessage());
            }
    }

    @Test(expectedExceptions = BarCodeException.class)
    public void generationException()
    {
        BarcodeGenerator bb = new BarcodeGenerator(EncodeTypes.PHARMACODE, "999999");
        bb.getParameters().getBarcode().setThrowExceptionWhenCodeTextIncorrect(true);
        bb.generateBarCodeImage();
    }
}
