package com.aspose.barcode.barcodecontrol;

import com.aspose.barcode.generation.*;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.swing.*;
import java.nio.charset.StandardCharsets;

public class DataMatrixParametersUITests
{
    DataMatrixParametersUI ui;

    @BeforeTest
    public void beforeTest()
    {
        BarcodeGenerator barcodeGenerator = new BarcodeGenerator(EncodeTypes.DATA_MATRIX);
        JButton jButton = new JButton();
        DataMatrixParameters dataMatrixParameters = barcodeGenerator.getParameters().getBarcode().getDataMatrix();
        ui = new DataMatrixParametersUI(dataMatrixParameters, jButton);
    }

    @Test
    public void testGetDataMatrixEcc()
    {

        DataMatrixEccType dataMatrixEccType = ui.getDataMatrixEcc();
        Assert.assertEquals(dataMatrixEccType.getValue(), 6);
    }

    @Test
    public void testGetDataMatrixVersion()
    {
        DataMatrixVersion dataMatrixVersion = ui.getDataMatrixVersion();
        Assert.assertEquals(dataMatrixVersion.getValue(), 0);
    }

    @Test
    public void testGetDataMatrixEncodeMode()
    {
        DataMatrixEncodeMode dataMatrixEncodeMode = ui.getDataMatrixEncodeMode();
        Assert.assertEquals(dataMatrixEncodeMode.getValue(), 0);
    }

    @Test
    public void testGetStructuredAppendBarcodeId()
    {
        int id = ui.getStructuredAppendBarcodeId();
        Assert.assertEquals(id, 0);
        ui.setStructuredAppendBarcodeId(12);
        Assert.assertEquals(ui.getStructuredAppendBarcodeId(), 12);
    }

    @Test
    public void testGetStructuredAppendBarcodesCount()
    {
        int id = ui.getStructuredAppendBarcodesCount();
        Assert.assertEquals(id, 0);
        ui.setStructuredAppendBarcodesCount(12);
        Assert.assertEquals(ui.getStructuredAppendBarcodesCount(), 12);
    }

    @Test
    public void testGetStructuredAppendFileId()
    {
        int id = ui.getStructuredAppendFileId();
        Assert.assertEquals(id, 0);
        ui.setStructuredAppendFileId(12);
        Assert.assertEquals(ui.getStructuredAppendFileId(), 12);
    }

    @Test
    public void testIsReaderProgramming()
    {
        boolean readerProgramming = ui.isReaderProgramming();
        Assert.assertFalse(readerProgramming);
        ui.setReaderProgramming(true);
        Assert.assertTrue(ui.isReaderProgramming());
    }

    @Test
    public void testGetMacroCharacters()
    {
        Assert.assertEquals(ui.getMacroCharacters(), MacroCharacter.NONE);
        ui.setMacroCharacters(MacroCharacter.MACRO_05);
        Assert.assertEquals(ui.getMacroCharacters(), MacroCharacter.MACRO_05);
    }

    @Test
    public void testGetColumns()
    {
        Assert.assertEquals(ui.getColumns(), 0);
        ui.setColumns(100);
        Assert.assertEquals(ui.getColumns(), 100);
    }

    @Test
    public void testGetRows()
    {
        Assert.assertEquals(ui.getRows(), 0);
        ui.setRows(100);
        Assert.assertEquals(ui.getRows(), 100);
    }

    @Test
    public void testGetAspectRatio()
    {
        Assert.assertEquals(ui.getAspectRatio(), 1f);
        ui.setAspectRatio(3f);
        Assert.assertEquals(ui.getAspectRatio(), 3f);
    }

    @Test
    public void testGetECIEncoding()
    {
        Assert.assertEquals(ui.getECIEncoding(), ECIEncodings.ISO_8859_1);
        ui.setECIEncoding(ECIEncodings.ISO_8859_4);
        Assert.assertEquals(ui.getECIEncoding(), ECIEncodings.ISO_8859_4);
    }
}
