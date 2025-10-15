package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.DeconvolutionMode;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * <p>
 * Tests Issue34113 tests.
 * </p>
 */
@Test(description = "Tests for Issue34113.")
public class Issue34113
{
    /**
     * <p>
     * Path to generatedFolder with files for testing.
     * </p>
     */
    private static final String folder = Global.getTestDataFolder("Issues/Issue34113");

    /**
     * <p>
     * Prepares to run these tests.
     * </p>
     */
    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    /**
     * <p>
     * Test corrupted page01
     * </p>
     */
    @Test
    public void pdfPage01()
    {
        String filename = (Global.pathCombine(folder, "pdf-page1.png"));
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.PDF_417);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("7fe5cb5d-272f-4e6d-afc0-4e6cf36c5442", reader.getFoundBarCodes()[0].getCodeText());

    }

    /**
     * <p>
     * Test corrupted page09
     * </p>
     */
    @Test
    public void pdfPage09()
    {
        String filename = (Global.pathCombine(folder, "pdf-page9.png"));
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.PDF_417);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("ef5ec82c-a60f-4470-b0ef-44d6466872db", reader.getFoundBarCodes()[0].getCodeText());

    }

    /**
     * <p>
     * Test corrupted page25
     * </p>
     */
    @Test
    public void pdfPage25()
    {
        String filename = (Global.pathCombine(folder, "pdf-page25.png"));
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.PDF_417);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("e7b052ca-5a8d-4a6e-93dc-c5484f8e697d", reader.getFoundBarCodes()[0].getCodeText());
    }

    /**
     * <p>
     * Test corrupted page26
     * </p>
     */
    @Test
    public void pdfPage26()
    {
        String filename = (Global.pathCombine(folder, "pdf-page26.png"));
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.PDF_417);
        reader.getQualitySettings().setDeconvolution(DeconvolutionMode.SLOW);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("686edeed-30d6-4c1a-8c7b-fa415bcf8374", reader.getFoundBarCodes()[0].getCodeText());

    }

    /**
     * <p>
     * Test corrupted page29
     * </p>
     */
    @Test
    public void pdfPage29()
    {
        String filename = (Global.pathCombine(folder, "pdf-page29.png"));
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.PDF_417);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("b02cb7b3-0a97-465b-a060-3fe7195604fc", reader.getFoundBarCodes()[0].getCodeText());


    }

    /**
     * <p>
     * Test corrupted page29
     * </p>
     */
    @Test
    public void pdfPage36()
    {
        String filename = (Global.pathCombine(folder, "pdf-page36.png"));
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.PDF_417);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("ee16390b-cea2-4081-8a2f-23168a9bb0e9", reader.getFoundBarCodes()[0].getCodeText());
    }

    /**
     * <p>
     * Test corrupted page29
     * </p>
     */
    @Test
    public void pdfPage52()
    {
        String filename = (Global.pathCombine(folder, "pdf-page52.png"));
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.PDF_417);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("abdf5873-67db-472d-99c2-6b4ed15d6095", reader.getFoundBarCodes()[0].getCodeText());
    }

    /**
     * <p>
     * Test corrupted page29
     * </p>
     */
    @Test
    public void pdfPage70()
    {
        String filename = (Global.pathCombine(folder, "pdf-page70.png"));
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.PDF_417);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("9b68afc2-3c6f-46f8-bd92-bee2658b57f7", reader.getFoundBarCodes()[0].getCodeText());
    }

    /**
     * <p>
     * Test corrupted page29
     * </p>
     */
    @Test
    public void pdfPage72()
    {
        String filename = (Global.pathCombine(folder, "pdf-page72.png"));
        BarCodeReader reader = new BarCodeReader(filename, DecodeType.PDF_417);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("4d308dff-22fe-4b9d-8ca6-0b7c3c6cf8a2", reader.getFoundBarCodes()[0].getCodeText());
    }

}

