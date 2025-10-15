package com.aspose.external.barcode.tester.releases.v23_4;

import com.aspose.barcode.generation.BarCodeImageFormat;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class BARCODEJAVA1519
{
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test() throws IOException
    {
        ByteArrayOutputStream output = new ByteArrayOutputStream(10000);
        int maxTime = 250;
        long elapsedTime = 0;
        int loopCount = 10;
        for(int i = 0; i < loopCount; i++)
        {
            long startTime = System.currentTimeMillis();
            final BarcodeGenerator bb = new BarcodeGenerator(EncodeTypes.ISBN);
            bb.setCodeText("978-3-16-148410-0");
            bb.save(output, BarCodeImageFormat.JPEG);
            elapsedTime += System.currentTimeMillis() - startTime;
        }
        long resultTime = elapsedTime / loopCount;
        Assert.assertTrue( resultTime < maxTime);
    }
}
