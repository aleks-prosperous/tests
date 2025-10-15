package com.aspose.external.barcode.tester.releases.v22_11;

import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class BARCODEJAVA1456
{
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test(enabled = false) //TODO BARCODEJAVA-1506
    public void test() throws IOException
    {
        String expected = "０１２３４５６７８９";
        BarcodeGenerator generator = new BarcodeGenerator(com.aspose.barcode.generation.EncodeTypes.QR, expected);
        BaseGenerationParameters baseParams = generator.getParameters();
        BarcodeParameters barcodeParams = baseParams.getBarcode();
        QrParameters qrParams = barcodeParams.getQR();

        qrParams.setQrErrorLevel(QRErrorLevel.LEVEL_M);
        qrParams.setQrEncodeMode(QREncodeMode.AUTO);
        qrParams.setQrEncodeType(QREncodeType.AUTO);
        generator.setCodeText(expected, StandardCharsets.UTF_8);
        qrParams.setQrVersion(QRVersion.VERSION_02);

        barcodeParams.getCodeTextParameters().setLocation(CodeLocation.NONE);

        BufferedImage actual = generator.generateBarCodeImage();

        BarCodeReader reader = new BarCodeReader(actual, DecodeType.QR);
        BarCodeResult[] results = reader.readBarCodes();
        Assert.assertEquals(results[0].getCodeText(), expected);
    }
}
