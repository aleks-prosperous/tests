package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.image.BufferedImage;

public class Issue36956
{
        @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
    public void test_DatabarExpanded_Generation_And_Recognition_With_Ai_Not_FixedCodeLength()
    {
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.DATABAR_EXPANDED);
            generator.setCodeText("(01)00766907146318(10)123(21)1234567");

            BufferedImage barcode = generator.generateBarCodeImage();
            BarCodeReader reader = new BarCodeReader(barcode);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("(01)00766907146318(10)123(21)1234567", reader.getFoundBarCodes()[0].getCodeText());
    }
}
