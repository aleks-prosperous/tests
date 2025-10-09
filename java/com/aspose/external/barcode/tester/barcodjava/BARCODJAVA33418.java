package com.aspose.external.barcode.tester.barcodjava;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BARCODJAVA33418
{
    public BARCODJAVA33418()
    {
    }


    @Test
    public void testClassExists() throws Exception
    {
        try
        {
            Class.forName("com.aspose.barcode.generation.CodabarSymbol");
        } catch (ClassNotFoundException e)
        {
            Assert.fail("Class com.aspose.barcode.CodabarSymbol doesn't exist");
        }
    }

}

