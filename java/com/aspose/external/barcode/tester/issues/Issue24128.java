package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.CodeLocation;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.awt.image.BufferedImage;

public class Issue24128
{
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testEAN13NoException1()
    {
        final String codeText = "4045w07469227";
        final BufferedImage bmp = generate(codeText);
        recognize(bmp, "4045074692276");
    }

    @Test
    public void testEAN13NoException2()
    {
        final String codeText = "4045227";
        BufferedImage bmp = generate(codeText);
        recognize(bmp, "4045227000002");
    }

    @Test
    public void testEAN13NoException3()
    {
        String codeText = "test123";
        BufferedImage bmp = generate(codeText);
        recognize(bmp, "1230000000000");
    }

    @Test
    public void testEAN13NoException4()
    {
        String codeText = "test123TEST456";
        BufferedImage bmp = generate(codeText);
        recognize(bmp, "1234560000005");
    }

    private BufferedImage generate(String codeText)
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.EAN_13, codeText);
            gen.getParameters().getBarcode().getCodeTextParameters().setLocation(CodeLocation.NONE);
            return gen.generateBarCodeImage();
    }

    private void recognize(BufferedImage bmp, String requiredCodeText)
    {
        BarCodeReader reader = new BarCodeReader(bmp, DecodeType.EAN_13);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(requiredCodeText, reader.getFoundBarCodes()[0].getCodeText());
    }
}
