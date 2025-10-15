package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.QualitySettings;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;


/**
 * <p>
 * Tests Issue33990 tests.
 * </p>
 */
@Test(description = "Tests for Issue33990.")
public class Issue33990
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33990");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }


    /**
     * <p>
     * Test generated picture in 6.6 version.
     * </p>
     */
    @Test
    public void testGeneratedIn66Version()
    {
        String fileName = Global.pathCombine(folder, "Test128-f_Aspose.BarCode.v6.6.jpg");
        final BarCodeReader reader = new BarCodeReader(fileName);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("<FNC1>", reader.getFoundBarCodes()[0].getCodeText());

    }

    /**
     * <p>
     * Test generated picture.
     * </p>
     */
    @Test
    public void testGenerated()
    {
        String fileName = Global.pathCombine(folder, "Test128-f_Aspose.BarCode.v6.9.jpg");
        final BarCodeReader reader = new BarCodeReader(fileName);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("f", reader.getFoundBarCodes()[0].getCodeText());

    }

    /**
     * <p>
     * Test generation and recognition picture.
     * </p>
     */
    @Test
    public void testGenerationAndRecognition()
    {
        String text = "f";

        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.CODE_128, text);
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage());
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(text, reader.getFoundBarCodes()[0].getCodeText());
    }
}

