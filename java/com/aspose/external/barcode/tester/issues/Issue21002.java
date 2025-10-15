package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.MultyDecodeType;
import com.aspose.external.barcode.tester.helpers.RecognitionHelper;
import com.aspose.external.barcode.tester.helpers.data.CodetextWithType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;


@Test(description = "Tests for Issue21002.")
public class Issue21002
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue21002");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

        @Test
    public void testQROnly()
    {
        String fileName = Global.pathCombine(folder, "QR-exception.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("634555888777453678", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
    public void testAll()
    {
        RecognitionHelper.testRecognized(folder, "QR-exception.png", DecodeType.ALL_SUPPORTED_TYPES,
                new CodetextWithType[] {
                        new CodetextWithType(DecodeType.CODE_39, "090"),
                        new CodetextWithType(DecodeType.CODE_39, "000"),
                        new CodetextWithType(DecodeType.QR, "634555888777453678"),
                        new CodetextWithType(DecodeType.CODE_39, "180"),
                        new CodetextWithType(DecodeType.CODE_39, "270"),
                        new CodetextWithType(DecodeType.CODE_128, "634555888777453678"),
                }, true, false, true);
    }

        @Test
    public void testConcreteTypes()
    {
        RecognitionHelper.testRecognized(folder, "QR-exception.png", new MultyDecodeType(DecodeType.QR, DecodeType.CODE_128, DecodeType.CODE_39),
                new CodetextWithType[] {
                        new CodetextWithType(DecodeType.CODE_39, "090"),
                        new CodetextWithType(DecodeType.CODE_39, "000"),
                        new CodetextWithType(DecodeType.QR, "634555888777453678"),
                        new CodetextWithType(DecodeType.CODE_39, "180"),
                        new CodetextWithType(DecodeType.CODE_39, "270"),
                        new CodetextWithType(DecodeType.CODE_128, "634555888777453678"),
                }, true, false, true);
    }
}

