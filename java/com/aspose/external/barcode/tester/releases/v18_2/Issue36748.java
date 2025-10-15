package com.aspose.external.barcode.tester.releases.v18_2;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;

public class Issue36748
{
    /**
     * <p>
     * Path to folder with files for testing Issue36748.
     * </p>
     */
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue36748");

    /**
     * <p>
     * Prepares to run these tests.
     * </p>
     */
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testAztec1()
    {
        String expectedMessage = "Aztec Code is a public domain 2D matrix barcode symbology of nominally square symbols built on a square grid with a distinctive square bullseye pattern at their center.";
        String fileName = folder + "aztec_google1.gif";
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.AZTEC);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(expectedMessage, reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals(DecodeType.AZTEC, reader.getFoundBarCodes()[0].getCodeType());
    }

    @Test
    public void testAztec4()
    {
        String expectedFileName = folder + "aztec_google4_Expected.txt";
        String expectedMessage = utils.File.readAllText(expectedFileName);
        String fileName = folder + "aztec_google4.png";
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.AZTEC);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(expectedMessage, reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals(DecodeType.AZTEC, reader.getFoundBarCodes()[0].getCodeType());
    }

    @Test
    public void testPdf41716()
    {
        String fileName = folder + "pdf417_google16.jpg";
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PDF_417);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals(DecodeType.PDF_417, reader.getFoundBarCodes()[0].getCodeType());
    }

    @Test
    public void testPdf41716Cut()
    {
        String fileName = folder + "pdf417_google16_cut.jpg";
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PDF_417);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals(DecodeType.PDF_417, reader.getFoundBarCodes()[0].getCodeType());
    }

    @Test
    public void testPdf4173()
    {
        String expectedMessage = "Now is the winter of our discontent, made glorious summer by this sun of York; and all the clouds that lour'd upon our house, in the deep bosom of the ocean buried.";
        String fileName = folder + "pdf417_google3_checkWord.jpg";
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PDF_417);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(expectedMessage, reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals(DecodeType.PDF_417, reader.getFoundBarCodes()[0].getCodeType());
    }

    @Test
    public void testPdf4173Cut()
    {
        String expectedMessage = "Now is the winter of our discontent, made glorious summer by this sun of York; and all the clouds that lour'd upon our house, in the deep bosom of the ocean buried.";
        String fileName = folder + "pdf417_google3_checkWord_cut.jpg";
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PDF_417);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(expectedMessage, reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals(DecodeType.PDF_417, reader.getFoundBarCodes()[0].getCodeType());
    }
}
