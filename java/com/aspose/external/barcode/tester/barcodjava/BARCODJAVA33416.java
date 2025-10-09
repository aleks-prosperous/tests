package com.aspose.external.barcode.tester.barcodjava;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BARCODJAVA33416
{
    public BARCODJAVA33416()
    {
    }


    @Test
    public void testClassExists() throws Exception
    {
        try
        {
            Class.forName("com.aspose.barcode.BuildVersionInfo");
        } catch (ClassNotFoundException e)
        {
            Assert.fail("Class com.aspose.barcode.BuildVersionInfo doesn't exist");
        }
    }

}

