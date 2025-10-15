package com.aspose.external.barcode.tester.releases.v21_4;

import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import com.aspose.barcode.generation.Pdf417CompactionMode;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

public class Issue37720
{
    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void SetUp()
    {
        LicenseAssistant.setupLicense();
    }


  @Test
    public void test_MicroPdf417_AllAsciiBytes()
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 256; ++i)
            sb.append((char)i);
        String lStr = sb.toString();
        int lChunkSize = 20;
        for (int i = 0; i < (lStr.length() / lChunkSize) + 1; ++i)
        {
            String lorig = lStr.substring(Math.min(i * lChunkSize, lStr.length() - lChunkSize), Math.min(i * lChunkSize, lStr.length() - lChunkSize) + lChunkSize);
            if (lorig.isEmpty()) continue;

            BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.MICRO_PDF_417, lorig);
            generator.getParameters().getBarcode().getPdf417().setPdf417CompactionMode(Pdf417CompactionMode.BINARY);
            BarCodeReader reader = new BarCodeReader(generator.generateBarCodeImage(), DecodeType.MICRO_PDF_417);
            BarCodeResult[] res = reader.readBarCodes();

            Assert.assertEquals(1, res.length);
            Assert.assertEquals(lorig, res[0].getCodeText());
        }
    }
}
