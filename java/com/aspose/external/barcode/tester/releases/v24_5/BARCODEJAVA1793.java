package com.aspose.external.barcode.tester.releases.v24_5;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.CodeLocation;
import com.aspose.barcode.generation.EncodeTypes;
import com.aspose.barcode.licensing.LicenseType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.image.BufferedImage;
import java.lang.reflect.Method;

import static com.aspose.barcode.generation.RectMicroQRVersion.R11x77;

public class BARCODEJAVA1793
{
    private final String Folder = Global.getTestDataFolder("Issues/Issue38878");

    @BeforeMethod
    public void setUp(Method testMethod)
    {
        utils.LicenseAssistant.setupLicense(LicenseType.Total);
    }

    @Test
    public void test()
    {
        String codetext = "Aspose";
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.RECT_MICRO_QR, codetext);
        generator.getParameters().getBarcode().getCodeTextParameters().setLocation(CodeLocation.BELOW);
        generator.getParameters().getBarcode().getQR().setRectMicroQrVersion(R11x77);
        BufferedImage image = generator.generateBarCodeImage();
        BarCodeReader reader = new BarCodeReader(image, DecodeType.RECT_MICRO_QR);
        BarCodeResult[] barCodeResults = reader.readBarCodes();
        Assert.assertEquals(1, barCodeResults.length);
        BarCodeResult barCodeResult = barCodeResults[0];
        Assert.assertEquals(codetext, barCodeResult.getCodeText());
        Assert.assertEquals("RectMicroQR",barCodeResult.getCodeTypeName());
    }
}
