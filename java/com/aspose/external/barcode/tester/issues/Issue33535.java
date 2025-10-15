package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

//import com.aspose.barcode.barcoderecognition.RecognitionHints;

@Test(description = "Tests for Issue33535.")
public class Issue33535
{
    private final String folder = Global.getTestDataFolder("Issues\\Issue33535");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testRecognition()
    {
        String fileName = Global.pathCombine(folder, "input.gif");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("{r: 2, v: \"vTasks_Tests\", TaskToTestFormID: 32285}", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test(description = "Fake recognition of MicrE13B barcode")
    public void testRecognitionAllTypes()
    {
        String fileName = Global.pathCombine(folder, "input.gif");
        final BarCodeReader reader = new BarCodeReader(fileName);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("{r: 2, v: \"vTasks_Tests\", TaskToTestFormID: 32285}", reader.getFoundBarCodes()[0].getCodeText());

    }

    @Test
    public void testRecognitionForRotatedPicture()
    {
        String fileName = Global.pathCombine(folder, "inputLeft90.png");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("{r: 2, v: \"vTasks_Tests\", TaskToTestFormID: 32285}", reader.getFoundBarCodes()[0].getCodeText());


    }

    @Test
    public void testRecognitionForRotatedAndResized()
    {
        String fileName = Global.pathCombine(folder, "inputLeft90Resized.png");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("{r: 2, v: \"vTasks_Tests\", TaskToTestFormID: 32285}", reader.getFoundBarCodes()[0].getCodeText());

    }
}

