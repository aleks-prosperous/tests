package com.aspose.external.barcode.tester.barcodjava;

import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.DataMatrixEncodeMode;
import com.aspose.barcode.generation.EncodeTypes;
import com.aspose.barcode.logger.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

@Test
public class BARCODJAVA33489
{
    @AfterMethod
    public void afterFinish(Method testMethod)
    {
        Logger.methodFinished(getClass().getName() + "." + testMethod.getName());
    }

    @BeforeMethod
    public void before(Method testMethod) throws Exception
    {
        Logger.methodStarted(getClass().getName() + "." + testMethod.getName());
    }

    @Test(description = "Java specific issue found in Issue33245.testDataLimitExceptionBinary()")
    public void reproduceTest()
    {
        String text = "\0";
        try
        {
            BarcodeGenerator builder = new BarcodeGenerator(EncodeTypes.DATA_MATRIX, text);
            builder.getParameters().getBarcode().getDataMatrix().setDataMatrixEncodeMode(DataMatrixEncodeMode.BYTES);
            builder.generateBarCodeImage();
        } catch (Exception e)
        {
            Assert.fail();
        }
    }
}
