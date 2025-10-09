package com.aspose.barcode.complexbarcode;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PaymentsCleaningResultTests
{
    @Test
    public void testCleanValue()
    {
        Payments.CleaningResult[] cleaningResults = new Payments.CleaningResult[]{new Payments.CleaningResult()};
        Payments.cleanValue("1234", cleaningResults);
        System.out.println(cleaningResults[0]);
        Assert.assertEquals(cleaningResults[0].getCleanedString(), "1234");
        Assert.assertFalse(cleaningResults[0].getReplacedUnsupportedChars());
    }
    @Test
    public void testSetReplacedUnsupportedChars()
    {
        Payments.CleaningResult cleaningResults = new Payments.CleaningResult();
        cleaningResults.setReplacedUnsupportedChars(true);
        Assert.assertTrue(cleaningResults.getReplacedUnsupportedChars());
    }
   @Test
    public void testCleaningResult()
    {
        Payments.CleaningResult cleaningResults = new Payments.CleaningResult();
        Assert.assertNull(cleaningResults.getCleanedString());
        Assert.assertFalse(cleaningResults.getReplacedUnsupportedChars());
    }
}
