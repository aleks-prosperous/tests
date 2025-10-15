package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;

//import com.aspose.barcode.barcoderecognition.RecognitionHints;


@Test(description = "Tests for Issue33602.")
public class Issue33602
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33602");
    private static final String ExpectedText = "McCode={CLI=82565260768\r\nSPE=08075911000190\r\nBLC=04 - OLIVEIRA\r\nUNI=111\r\nTPO=2}";

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testRecognitionWithSymbologyAndRotation()
    {
        String filename = Global.pathCombine(folder, "Reserva00038845.TIF");
        final BarCodeReader reader = new BarCodeReader(filename, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(ExpectedText, reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testRecognitionWithSymbology()
    {
        String filename = Global.pathCombine(folder, "Reserva00038845.TIF");
        final BarCodeReader reader = new BarCodeReader(filename, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(ExpectedText, reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testRecognitionWithRotation()
    {
        String filename = Global.pathCombine(folder, "Reserva00038845.TIF");
        final BarCodeReader reader = new BarCodeReader(filename);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(ExpectedText, reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testRecognition()
    {
        String filename = Global.pathCombine(folder, "Reserva00038845.TIF");
        final BarCodeReader reader = new BarCodeReader(filename);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(ExpectedText, reader.getFoundBarCodes()[0].getCodeText());
    }
}

