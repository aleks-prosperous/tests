package com.aspose.barcode.common.constants.micropdf417constants;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MicroPdf417SymbolModelTests
{
    @Test
    public void test()
    {
        MicroPdf417Size microPdf417Size = new MicroPdf417Size(4,10,11);
        int[] codewords = new int[]{3,5,7,9};
//        MicroPdf417SymbolModel microPdf417SymbolModel = new MicroPdf417SymbolModel(microPdf417Size,codewords);
        MicroPdf417SymbolModel microPdf417SymbolModel = new MicroPdf417SymbolModel();
        microPdf417SymbolModel.setCodewords(codewords);
        microPdf417SymbolModel.setSize(microPdf417Size);
        Assert.assertEquals(microPdf417SymbolModel.getCodewords(),codewords);
        Assert.assertEquals(microPdf417SymbolModel.getSize(),microPdf417Size);
    }
}
