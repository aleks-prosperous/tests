package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


@Test(description = "Tests for Issue33148.")
public class Issue33148
{
    private final String folder = Global.getTestDataFolder("Issues/Issue33148");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }


    @Test
    public void testAsposeTest()
    {
        String fileName = Global.pathCombine(folder, "IMGAsposeTest.png");
        final String text = "\"BT_SO\"|\"12971\"|\"GALAK\"|\"YURIY\"|\"61690\"|\"08/28/2011\"";
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PDF_417);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(text, reader.getFoundBarCodes()[0].getCodeText());
    }


    @Test
    public void testGoodImage()
    {
        final String text = "\"BT_SO\"|\"12971\"|\"GALAK\"|\"YURIY\"|\"61690\"|\"08/28/2011\"";
        String fileName = Global.pathCombine(folder, "IDAutomationStreamingPDF417.gif");
        BarCodeReader reader = new BarCodeReader(fileName);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(text, reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testTestPNG()
    {
        String fileName = Global.pathCombine(folder, "test.png");
        final String text = "\"BT_SO\"|\"12971\"|\"GALAK\"|\"YURIY\"|\"61690\"|\"08/28/2011\"";
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PDF_417);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(text, reader.getFoundBarCodes()[0].getCodeText());
    }


    @Test
    public void testImageFromPdf()
    {
        final String text = "UniqueID:18597734-8B5E-41C5-AF25-D7072E06924D|DocumentCategory:FC|DocumentName:Form A|FileNumber:001117F01";
        String fileName = Global.pathCombine(folder, "fromPdf.png");
        BarCodeReader reader = new BarCodeReader(fileName);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(text, reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testConvertedPage1()
    {
        final String text = "UniqueID:18597734-8B5E-41C5-AF25-D7072E06924D|DocumentCategory:FC|DocumentName:Form A|FileNumber:001117F01";
        String fileName = Global.pathCombine(folder, "fromPdf.png");
        BarCodeReader reader = new BarCodeReader(fileName);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(text, reader.getFoundBarCodes()[0].getCodeText());
    }
}
