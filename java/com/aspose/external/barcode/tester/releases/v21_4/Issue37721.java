package com.aspose.external.barcode.tester.releases.v21_4;

import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import com.aspose.barcode.generation.MaxiCodeMode;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.nio.charset.StandardCharsets;

public class Issue37721
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
    public void test_MaxiCode_AllAsciiBytes()
    {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 256; ++i)
            sb.append((char)i);
        String lStr = sb.toString();
        int lChunkSize = 19;
        for (int i = 0; i < (lStr.length() / lChunkSize) + 1; ++i)
        {
            String lorig = lStr.substring(Math.min(i * lChunkSize, lStr.length() - lChunkSize),Math.min(i * lChunkSize, lStr.length() - lChunkSize) + lChunkSize);
            if (lorig.isEmpty()) continue;
            byte[] bytes = lorig.getBytes(StandardCharsets.US_ASCII);

            BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.MAXI_CODE, lorig);
            generator.getParameters().getBarcode().getMaxiCode().setMaxiCodeMode(MaxiCodeMode.MODE_4);
            BarCodeReader reader = new BarCodeReader(generator.generateBarCodeImage(), DecodeType.MAXI_CODE);
            BarCodeResult[] res = reader.readBarCodes();

            Assert.assertEquals(1, res.length);
            Assert.assertEquals(lorig, res[0].getCodeText());
        }
    }
}
