package com.aspose.external.barcode.tester.releases.v24_5;

import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.CodeLocation;
import com.aspose.barcode.generation.EncodeTypes;
import com.aspose.barcode.generation.RectMicroQRVersion;
import com.aspose.barcode.licensing.LicenseType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class Issue38943
{
    @BeforeMethod
    public void setUp(Method testMethod)
    {
        utils.LicenseAssistant.setupLicense(LicenseType.Total);
    }

    @Test
    public void testBarcodeRecognitionType()
    {
        String codetext = "Aspose";
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.RECT_MICRO_QR, codetext);
        {
            generator.getParameters().getBarcode().getCodeTextParameters().setLocation(CodeLocation.BELOW);
            generator.getParameters().getBarcode().getQR().setRectMicroQrVersion(RectMicroQRVersion.R11x77);
            BarCodeReader reader = new BarCodeReader(generator.generateBarCodeImage(), DecodeType.RECT_MICRO_QR);
            {
                BarCodeResult[] barCodeResults = reader.readBarCodes();
                Assert.assertEquals(1, barCodeResults.length);
                BarCodeResult barCodeResult = barCodeResults[0];
                Assert.assertEquals(codetext, barCodeResult.getCodeText());
                Assert.assertEquals("RectMicroQR", barCodeResult.getCodeTypeName());
            }
        }
    }
}
