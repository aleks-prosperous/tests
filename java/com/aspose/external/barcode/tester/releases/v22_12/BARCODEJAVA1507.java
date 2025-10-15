package com.aspose.external.barcode.tester.releases.v22_12;

import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class BARCODEJAVA1507
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
    public void test1() throws IOException
    {
        String expectedText = "ＺＺ／ＡＫ－　　１２------";
        BarcodeGenerator generator = new BarcodeGenerator(com.aspose.barcode.generation.EncodeTypes.QR,expectedText);
        BaseGenerationParameters baseParams = generator.getParameters();
        BarcodeParameters barcodeParams = baseParams.getBarcode();
        QrParameters qrParams = barcodeParams.getQR();
        qrParams.setQrErrorLevel(QRErrorLevel.LEVEL_M);
        qrParams.setQrEncodeMode(QREncodeMode.AUTO);
        qrParams.setQrEncodeType(QREncodeType.AUTO);
        generator.setCodeText(expectedText, StandardCharsets.UTF_8);
        qrParams.setQrVersion(QRVersion.VERSION_03);
        barcodeParams.getCodeTextParameters().setLocation(CodeLocation.NONE);

        BarCodeReader reader = new BarCodeReader(generator.generateBarCodeImage(), DecodeType.QR);
        BarCodeResult[] results = reader.readBarCodes();
        Assert.assertEquals(results[0].getCodeText(), expectedText);
    }
}
