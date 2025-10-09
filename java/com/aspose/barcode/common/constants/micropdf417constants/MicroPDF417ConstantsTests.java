package com.aspose.barcode.common.constants.micropdf417constants;

import com.aspose.ms.System.Collections.Generic.List;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MicroPDF417ConstantsTests
{
    @Test
    public void testGetRapList()
    {
        RowAddressPatternList rowAddressPatternList = MicroPDF417Constants.getRAPList();
        Assert.assertEquals(rowAddressPatternList.size(), 104);
        RowAddressPattern rowAddressPatternActual = rowAddressPatternList.get(0);
        RowAddressPattern rowAddressPatternExpected = new RowAddressPattern(1, 0, new int[]{2, 2, 1, 3, 1, 1});
        Assert.assertEquals(rowAddressPatternActual.getNumber(), rowAddressPatternExpected.getNumber());
        Assert.assertEquals(rowAddressPatternActual.getType(), rowAddressPatternExpected.getType());
        Assert.assertEquals(rowAddressPatternActual.getPattern(), rowAddressPatternExpected.getPattern());
    }

    @Test
    public void testGetSideRAPList()
    {
        RowAddressPatternList rowAddressPatternList = MicroPDF417Constants.getSideRAPList();
        Assert.assertEquals(rowAddressPatternList.size(), 52);
        RowAddressPattern rowAddressPatternActual = rowAddressPatternList.get(3);
        RowAddressPattern rowAddressPatternExpected = new RowAddressPattern(4, 0, new int[]{2, 2, 2, 2, 1, 1});
        Assert.assertEquals(rowAddressPatternActual.getNumber(), rowAddressPatternExpected.getNumber());
        Assert.assertEquals(rowAddressPatternActual.getType(), rowAddressPatternExpected.getType());
        Assert.assertEquals(rowAddressPatternActual.getPattern(), rowAddressPatternExpected.getPattern());
    }

    @Test
    public void testGetCenterRAPList()
    {
        RowAddressPatternList rowAddressPatternList = MicroPDF417Constants.getCenterRAPList();
        Assert.assertEquals(rowAddressPatternList.size(), 52);
        RowAddressPattern rowAddressPatternActual = rowAddressPatternList.get(3);
        RowAddressPattern rowAddressPatternExpected = new RowAddressPattern(4, 1, new int[]{1, 3, 1, 1, 3, 1});
        Assert.assertEquals(rowAddressPatternActual.getNumber(), rowAddressPatternExpected.getNumber());
        Assert.assertEquals(rowAddressPatternActual.getType(), rowAddressPatternExpected.getType());
        Assert.assertEquals(rowAddressPatternActual.getPattern(), rowAddressPatternExpected.getPattern());
    }

    @Test
    public void testGetBarCodeSizesList()
    {
        List<MicroPdf417Size> microPdf417SizeList = MicroPDF417Constants.getBarCodeSizesList();
        Assert.assertEquals(microPdf417SizeList.size(), 34);
        MicroPdf417Size microPdf417SizeActual = microPdf417SizeList.get(3);
        MicroPdf417Size microPdf417SizeExpected = new MicroPdf417Size(20, 8, 11);
        Assert.assertEquals(microPdf417SizeActual.getColumns(), microPdf417SizeExpected.getColumns());
        Assert.assertEquals(microPdf417SizeActual.getCodewordsCount(), microPdf417SizeExpected.getCodewordsCount());
        Assert.assertEquals(microPdf417SizeActual.getEccCount(), microPdf417SizeExpected.getEccCount());
        Assert.assertEquals(microPdf417SizeActual.getRows(), microPdf417SizeExpected.getRows());
    }

    @Test
    public void testGetRowAssignmentsList()
    {
        List<RowAssignment> rowAssignment = MicroPDF417Constants.getRowAssignmentsList();
        Assert.assertEquals(rowAssignment.size(), 34);
        RowAssignment rowAssignmentActual = rowAssignment.get(5);
        RowAssignment rowAssignmentExpected = new RowAssignment(1, 20, 25, 52, 33, 8);
        Assert.assertEquals(rowAssignmentActual.getCenterRAPNumbes(), rowAssignmentExpected.getCenterRAPNumbes());
        Assert.assertEquals(rowAssignmentActual.getLeftRAPNumbers(), rowAssignmentExpected.getLeftRAPNumbers());
        Assert.assertEquals(rowAssignmentActual.getRightRapNumbers(), rowAssignmentExpected.getRightRapNumbers());
    }

    @Test
    public void testGetCluster0CodeWords()
    {
        CodeWordList codeWordList = MicroPDF417Constants.getCluster0CodeWords();
        Assert.assertEquals(codeWordList.size(), 929);
        CodeWord codeWordActual = codeWordList.get(5);
        CodeWord codeWordExpected = new CodeWord(5, 0, new int[]{5, 1, 1, 1, 1, 2, 5, 1});
        Assert.assertEquals(codeWordActual.getValue(), codeWordExpected.getValue());
        Assert.assertEquals(codeWordActual.getCluster(), codeWordExpected.getCluster());
        Assert.assertEquals(codeWordActual.getPattern(), codeWordExpected.getPattern());
    }

    @Test
    public void testGetCluster3CodeWords()
    {
        CodeWordList codeWordList = MicroPDF417Constants.getCluster3CodeWords();
        Assert.assertEquals(codeWordList.size(), 929);
        CodeWord codeWordActual = codeWordList.get(5);
        CodeWord codeWordExpected = new CodeWord(5, 3, new int[]{4, 1, 1, 1, 1, 3, 1, 5});
        Assert.assertEquals(codeWordActual.getValue(), codeWordExpected.getValue());
        Assert.assertEquals(codeWordActual.getCluster(), codeWordExpected.getCluster());
        Assert.assertEquals(codeWordActual.getPattern(), codeWordExpected.getPattern());
    }

    @Test
    public void testGetCluster6CodeWords()
    {
        CodeWordList codeWordList = MicroPDF417Constants.getCluster6CodeWords();
        Assert.assertEquals(codeWordList.size(), 929);
        CodeWord codeWordActual = codeWordList.get(5);
        CodeWord codeWordExpected = new CodeWord(5, 6, new int[]{1, 1, 1, 1, 1, 3, 4, 5});
        Assert.assertEquals(codeWordActual.getValue(), codeWordExpected.getValue());
        Assert.assertEquals(codeWordActual.getCluster(), codeWordExpected.getCluster());
        Assert.assertEquals(codeWordActual.getPattern(), codeWordExpected.getPattern());
    }

}
