package com.aspose.barcode.common.constants.micropdf417constants;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MicroPdf417SizeTests
{
    @Test
    public void test()
    {
        MicroPdf417Size microPdf417Size = new MicroPdf417Size(3,10,11);
        Assert.assertEquals(microPdf417Size.getCodewordsCount(), 11);
        Assert.assertEquals(microPdf417Size.getColumns(), 2);
        Assert.assertEquals(microPdf417Size.getRows(),3);
        Assert.assertEquals(microPdf417Size.getEccCount(), 10);
    }
}
