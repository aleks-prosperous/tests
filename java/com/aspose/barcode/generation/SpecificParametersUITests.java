package com.aspose.barcode.generation;

import com.aspose.barcode.barcodecontrol.SpecificParametersUI;
import com.aspose.barcode.barcodecontrol.SpecificParametersUIWrapper;
import com.aspose.barcode.barcoderecognition.CustomerInformationInterpretingType;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.swing.*;

public class SpecificParametersUITests
{
    SpecificParametersUI ui;

    @BeforeTest
    public void beforeTest()
    {
        BarcodeGenerator barcodeGenerator = new BarcodeGenerator(EncodeTypes.DATA_MATRIX);
        JButton jButton = new JButton();
        BaseGenerationParameters baseGenerationParameters = barcodeGenerator.getParameters();
        ui = new SpecificParametersUIWrapper(baseGenerationParameters, jButton).getSpecificParametersUI();
    }

    @Test
    public void testPostalParameters()
    {
        PostalParameters actual = ui.getPostal();
        PostalParameters expected = new PostalParameters();
        Unit unit = new Unit(3.654F, GraphicsUnit.POINT);
        expected.setPostalShortBarHeight(unit);
        Assert.assertEquals(actual.getPostalShortBarHeight(), expected.getPostalShortBarHeight());
    }

    @Test
    public void testAustralianPostParameters()
    {
        AustralianPostParameters actual = ui.getAustralianPost();
        AustralianPostParameters expected = new AustralianPostParameters();
        Unit unit = new Unit(3.654F, GraphicsUnit.POINT);
        expected.setAustralianPostShortBarHeight(unit);
        Assert.assertEquals(actual.getAustralianPostShortBarHeight(), expected.getAustralianPostShortBarHeight());
        Assert.assertEquals(actual.getAustralianPostEncodingTable(), CustomerInformationInterpretingType.C_TABLE);
    }
  @Test
    public void testDataBarParameters()
    {
        DataBarParameters actual = ui.getDataBar();
        Assert.assertEquals(actual.getAspectRatio(), 1.0F);
        Assert.assertEquals(actual.getColumns(), 0);
        Assert.assertEquals(actual.getRows(), 0);
        actual.setRows(10);
        actual.setColumns(12);
        actual.setAllowOnlyGS1Encoding(true);
        actual.setAspectRatio(3f);
        Assert.assertEquals(actual.getAspectRatio(), 3.0F);
        Assert.assertEquals(actual.getColumns(), 12);
        Assert.assertEquals(actual.getRows(), 10);
    }
 @Test
    public void testCodablockParameters()
    {
        CodablockParameters actual = ui.getCodablock();
        Assert.assertEquals(actual.getAspectRatio(), 1.0F);
        Assert.assertEquals(actual.getColumns(), 0);
        Assert.assertEquals(actual.getRows(), 0);
        actual.setRows(10);
        actual.setColumns(12);
        actual.setAspectRatio(3f);
        Assert.assertEquals(actual.getAspectRatio(), 3.0F);
        Assert.assertEquals(actual.getColumns(), 12);
        Assert.assertEquals(actual.getRows(), 10);
    }
//@Test
//    public void testDataMatrixParameters()
//    {
//        DataMatrixParameters actual = ui.getDataMatrix();
//        Assert.assertEquals(actual.getAspectRatio(), 1.0F);
//        Assert.assertEquals(actual.getColumns(), 0);
//        Assert.assertEquals(actual.getRows(), 0);
//        actual.setRows(10);
//        actual.setColumns(12);
//        actual.setAspectRatio(3f);
//        Assert.assertEquals(actual.getAspectRatio(), 3.0F);
//        Assert.assertEquals(actual.getColumns(), 12);
//        Assert.assertEquals(actual.getRows(), 10);
//    }
}
