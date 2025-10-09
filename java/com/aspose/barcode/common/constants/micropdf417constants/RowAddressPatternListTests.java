package com.aspose.barcode.common.constants.micropdf417constants;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RowAddressPatternListTests
{
    @Test
    public void testGetRAPNumber()
    {
        RowAddressPatternList rowAddressPatternList = MicroPDF417Constants.getRAPList();
        int[] symbol = new int[]{1,1,2,2,3,1};
        int rapNumber = rowAddressPatternList.getRAPNumber(symbol,1);
        Assert.assertEquals(rapNumber,1);
    }
}