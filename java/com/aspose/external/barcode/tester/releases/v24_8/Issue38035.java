package com.aspose.external.barcode.tester.releases.v24_8;

import com.aspose.barcode.BarCodeException;
import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.CodeLocation;
import com.aspose.barcode.generation.EncodeTypes;
import helpers.FrameworkTestUtils;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.IOException;

public class Issue38035
{
    private final static String Folder = Global.getTestDataFolder("Issues/Issue38035");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    private void initGenerator(BarcodeGenerator gen)
    {
        gen.getParameters().getBarcode().getXDimension().setPixels(5);
        gen.getParameters().getBarcode().getPadding().getTop().setPixels(5);
        gen.getParameters().getBarcode().getPadding().getBottom().setPixels(5);
        gen.getParameters().getBarcode().getPadding().getLeft().setPixels(5);
        gen.getParameters().getBarcode().getPadding().getRight().setPixels(5);
        gen.getParameters().getBarcode().getCodeTextParameters().setLocation(CodeLocation.NONE);
    }

    @Test
    public void test_MicroPdf417_Rows_Parameter() throws IOException {
        FrameworkTestUtils.generateAndCompare(Generator_Of_Test_MicroPdf417_Rows_Parameter(), Folder, "r17.png");
    }

    private BarcodeGenerator Generator_Of_Test_MicroPdf417_Rows_Parameter()
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.MICRO_PDF_417, "ASPOSE");
        initGenerator(gen);
        gen.getParameters().getBarcode().getPdf417().setRows(17);
        return gen;
    }

    @Test
    public void test_MicroPdf417_Columns_Parameter() throws IOException {
        FrameworkTestUtils.generateAndCompare(Generator_Of_Test_MicroPdf417_Columns_Parameter(), Folder, "c2.png");
    }

    private BarcodeGenerator Generator_Of_Test_MicroPdf417_Columns_Parameter()
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.MICRO_PDF_417, "ASPOSE");
        initGenerator(gen);
        gen.getParameters().getBarcode().getPdf417().setColumns(2);
        return gen;
    }

    @Test
    public void test_MicroPdf417_Columns_And_Rows_Pair() throws IOException {
        FrameworkTestUtils.generateAndCompare(Generator_Of_Test_MicroPdf417_Columns_And_Rows_Pair(), Folder, "c3r15.png");
    }

    private BarcodeGenerator Generator_Of_Test_MicroPdf417_Columns_And_Rows_Pair()
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.MICRO_PDF_417, "ASPOSE");
        initGenerator(gen);
        gen.getParameters().getBarcode().getPdf417().setColumns(3);
        gen.getParameters().getBarcode().getPdf417().setRows(15);
        return gen;
    }

    @Test
    public void test_MicroPdf417_Incorrect_Rows_Parameter()
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.MICRO_PDF_417, "ASPOSE");
        gen.getParameters().getBarcode().getPdf417().setRows(21);

        String exceptionMsg = "";
        try
        {
            gen.generateBarCodeImage();
        }
        catch (BarCodeException ex)
        {
            exceptionMsg = ex.getMessage();
        }
        Assert.assertEquals("Incorrect MicroPDF417 symbol size. Allowed columns and rows pairs are: \n1x11, 1x14, 1x17, 1x20, 1x24, 1x28,\n2x8, 2x11, 2x14, 2x17, 2x20, 2x23, 2x26,\n3x6, 3x8, 3x10, 3x12, 3x15, 3x20, 3x26, 3x32, 3x38, 3x44,\n4x4, 4x6, 4x8, 4x10, 4x12, 4x15, 4x20, 4x26, 4x32, 4x38, 4x44", exceptionMsg);
    }

    @Test
    public void test_MicroPdf417_Incorrect_Columns_Parameter()
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.MICRO_PDF_417, "ASPOSE");
        gen.getParameters().getBarcode().getPdf417().setColumns(5);

        String exceptionMsg = "";
        try
        {
            gen.generateBarCodeImage();
        }
        catch (BarCodeException ex)
        {
            exceptionMsg = ex.getMessage();
        }
        Assert.assertEquals("Incorrect MicroPDF417 symbol size. Allowed columns and rows pairs are: \n1x11, 1x14, 1x17, 1x20, 1x24, 1x28,\n2x8, 2x11, 2x14, 2x17, 2x20, 2x23, 2x26,\n3x6, 3x8, 3x10, 3x12, 3x15, 3x20, 3x26, 3x32, 3x38, 3x44,\n4x4, 4x6, 4x8, 4x10, 4x12, 4x15, 4x20, 4x26, 4x32, 4x38, 4x44", exceptionMsg);
    }

    @Test
    public void test_MicroPdf417_Incorrect_Columns_And_Rows_Pair()
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.MICRO_PDF_417, "ASPOSE");
        gen.getParameters().getBarcode().getPdf417().setColumns(3);
        gen.getParameters().getBarcode().getPdf417().setRows(17);

        String exceptionMsg = "";
        try
        {
            gen.generateBarCodeImage();
        }
        catch (BarCodeException ex)
        {
            exceptionMsg = ex.getMessage();
        }
        Assert.assertEquals("Incorrect MicroPDF417 symbol size. Allowed columns and rows pairs are: \n1x11, 1x14, 1x17, 1x20, 1x24, 1x28,\n2x8, 2x11, 2x14, 2x17, 2x20, 2x23, 2x26,\n3x6, 3x8, 3x10, 3x12, 3x15, 3x20, 3x26, 3x32, 3x38, 3x44,\n4x4, 4x6, 4x8, 4x10, 4x12, 4x15, 4x20, 4x26, 4x32, 4x38, 4x44", exceptionMsg);
    }
}
