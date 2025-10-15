package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


@Test(description = "Tests for Issue33409.")
public class Issue33409
{
    final String folder = Global.getTestDataFolder("Issues/Issue33409");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void testDemo()
    {
        String fileName = Global.pathCombine(folder, "insert-in-pdf.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("BG10.99/657552/S", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testWithGeneration()
    {
        final String codeText = "BG10.99/657552/S";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.CODE_39, codeText);
        BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.CODE_39);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(codeText, reader.getFoundBarCodes()[0].getCodeText());
    }
}

