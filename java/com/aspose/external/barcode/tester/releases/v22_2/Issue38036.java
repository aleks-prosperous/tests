package com.aspose.external.barcode.tester.releases.v22_2;

import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

public class Issue38036
{
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test_Pdf417_Truncated_Quiet_Zones()
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.PDF_417, "ASPOSE");
        gen.getParameters().getBarcode().getPdf417().setColumns(3);
        gen.getParameters().getBarcode().getPdf417().setPdf417Truncate(true);
        gen.getParameters().getBarcode().getXDimension().setPixels(2);
        gen.getParameters().getBarcode().getPadding().getLeft().setPixels(5);
        gen.getParameters().getBarcode().getPadding().getRight().setPixels(5);

        Assert.assertEquals(182, gen.generateBarCodeImage().getWidth());
    }
}
