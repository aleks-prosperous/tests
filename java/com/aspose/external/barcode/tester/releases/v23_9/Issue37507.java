package com.aspose.external.barcode.tester.releases.v23_9;

import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

public class Issue37507
{
    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test_GS1Aztec()
    {
        String codetext = "(01)95012345678903(3103)000123";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.GS_1_AZTEC, codetext);
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.GS_1_AZTEC);
            {
                Assert.assertEquals(1, reader.readBarCodes().length);
                Assert.assertEquals(DecodeType.GS_1_AZTEC, reader.getFoundBarCodes()[0].getCodeType());
                Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }
}
