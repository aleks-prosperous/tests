package com.aspose.barcode.barcodecontrol;

import com.aspose.barcode.generation.*;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.swing.*;
import java.nio.charset.StandardCharsets;

public class Pdf417ParametersUITests
{
    Pdf417ParametersUI ui;

    @BeforeTest
    public void beforeTest()
    {
        BarcodeGenerator barcodeGenerator = new BarcodeGenerator(EncodeTypes.DATA_MATRIX);
        JButton jButton = new JButton();
        Pdf417Parameters pdf417Parameters = barcodeGenerator.getParameters().getBarcode().getPdf417();
        ui = new Pdf417ParametersUI(pdf417Parameters, jButton);
    }

    @Test
    public void testGetPdf417CompactionMode()
    {
        Assert.assertEquals(ui.getPdf417CompactionMode(), Pdf417CompactionMode.AUTO);
        ui.setPdf417CompactionMode(Pdf417CompactionMode.BINARY);
        Assert.assertEquals(ui.getPdf417CompactionMode(), Pdf417CompactionMode.BINARY);
    }

    @Test
    public void testGetPdf417ErrorLevel()
    {
        Assert.assertEquals(ui.getPdf417ErrorLevel(), Pdf417ErrorLevel.LEVEL_2);
        ui.setPdf417ErrorLevel(Pdf417ErrorLevel.LEVEL_3);
        Assert.assertEquals(ui.getPdf417ErrorLevel(), Pdf417ErrorLevel.LEVEL_3);
    }

    @Test
    public void testGetPdf417Truncate()
    {
        Assert.assertFalse(ui.getPdf417Truncate());
        ui.setPdf417Truncate(true);
        Assert.assertTrue(ui.getPdf417Truncate());
    }

    @Test
    public void testGetColumns()
    {
        Assert.assertEquals(ui.getColumns(), 0);
        ui.setColumns(4);
        Assert.assertEquals(ui.getColumns(), 4);
    }

    @Test
    public void testGetRows()
    {
        Assert.assertEquals(ui.getRows(), 0);
        ui.setRows(5);
        Assert.assertEquals(ui.getRows(), 5);
    }

    @Test
    public void testGetAspectRatio()
    {
        Assert.assertEquals(ui.getAspectRatio(), 1f);
        ui.setAspectRatio(3f);
        Assert.assertEquals(ui.getAspectRatio(), 3f);
    }

    @Test
    public void testGetPdf417MacroFileID()
    {
        Assert.assertEquals(ui.getPdf417MacroFileID(), -1);
        ui.setPdf417MacroFileID(3);
        Assert.assertEquals(ui.getPdf417MacroFileID(), 3);
    }

    @Test
    public void testGetPdf417MacroSegmentID()
    {
        Assert.assertEquals(ui.getPdf417MacroSegmentID(), 0);
        ui.setPdf417MacroSegmentID(33);
        Assert.assertEquals(ui.getPdf417MacroSegmentID(), 33);
    }

    @Test
    public void testGetPdf417MacroSegmentsCount()
    {
        Assert.assertEquals(ui.getPdf417MacroSegmentsCount(), 0);
        ui.setPdf417MacroSegmentsCount(33);
        Assert.assertEquals(ui.getPdf417MacroSegmentsCount(), 33);
    }
}
