package com.aspose.external.barcode.tester.extended;

import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.generation.DataMatrixEccType;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class BarCodeBuilderAccessTests
{
    String folder = Global.getGeneratedImagesFolder("extended");

    @Test
    public void testAccessDataMatrixEcc() throws IOException
    {
        BarcodeGenerator builder = new BarcodeGenerator(EncodeTypes.PDF_417);
        buildBarcode(builder, DataMatrixEccType.ECC_AUTO);
        buildBarcode(builder, DataMatrixEccType.ECC_000);
        buildBarcode(builder, DataMatrixEccType.ECC_050);
        buildBarcode(builder, DataMatrixEccType.ECC_080);
        buildBarcode(builder, DataMatrixEccType.ECC_100);
        buildBarcode(builder, DataMatrixEccType.ECC_140);
        buildBarcode(builder, DataMatrixEccType.ECC_200);
    }

    private void buildBarcode(BarcodeGenerator builder, DataMatrixEccType dataMatrixEccType) throws IOException
    {
        builder.setCodeText("DataMatrixEccType " + dataMatrixEccType);
        builder.getParameters().getBarcode().getDataMatrix().setDataMatrixEcc(dataMatrixEccType);
        Assert.assertEquals(builder.getParameters().getBarcode().getDataMatrix().getDataMatrixEcc(), dataMatrixEccType);
        builder.save(folder + "DataMatrixEcc_" + dataMatrixEccType + ".png");
    }
}
