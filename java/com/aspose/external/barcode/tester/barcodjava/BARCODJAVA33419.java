package com.aspose.external.barcode.tester.barcodjava;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BARCODJAVA33419
{
    public BARCODJAVA33419()
    {
    }


    @Test
    public void testClassExists() throws Exception
    {
        try
        {
            Class.forName("com.aspose.barcode.generation.EnableChecksum");
        } catch (ClassNotFoundException e)
        {
            Assert.fail("Class com.aspose.barcode.generation.EnableChecksum doesn't exist");
        }
    }

}

