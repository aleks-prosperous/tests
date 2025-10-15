package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.InvalidCodeException;
import com.aspose.barcode.auxiliary.StringExtensions;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.DataMatrixEncodeMode;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.image.BufferedImage;

@Test(description = "Tests for Issue33469.")
public class Issue33469
{
        @Test
    public void testGoodGeneration()
    {
        String text = StringExtensions.newString('a', 277);
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATA_MATRIX, text);
        {
            gen.getParameters().getBarcode().getDataMatrix().setRows(64);
            gen.getParameters().getBarcode().getDataMatrix().setColumns(64);
            gen.getParameters().getBarcode().getDataMatrix().setDataMatrixEncodeMode(DataMatrixEncodeMode.BYTES);
            BufferedImage bitmap = gen.generateBarCodeImage(); { }
        }
    }

        @Test
    public void testExceptionDataLimit()
    {
        try
        {
            String text = StringExtensions.newString('a', 279);
            text += 'a';
            BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATA_MATRIX, text);
            {
                gen.getParameters().getBarcode().getDataMatrix().setRows(64);
                gen.getParameters().getBarcode().getDataMatrix().setColumns(64);
                gen.getParameters().getBarcode().getDataMatrix().setDataMatrixEncodeMode(DataMatrixEncodeMode.BYTES);
                BufferedImage bitmap = gen.generateBarCodeImage(); { }
            }
        }
        catch (InvalidCodeException e)
        {
            return;
        }
        Assert.fail("InvalidCodeException expected");
    }
}

