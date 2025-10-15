package com.aspose.external.barcode.tester.releases.v17_12;

import org.testng.Assert;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

public class Issue36722
{
    @Test
    public void testSetLicense()
    {
        long start = System.currentTimeMillis();
        LicenseAssistant.setupLicense();
        long stop = System.currentTimeMillis();
        long result = stop - start;
        System.out.println("Setting lisense took " + result + "ms");
        Assert.assertTrue(result < 1000);
    }
}
