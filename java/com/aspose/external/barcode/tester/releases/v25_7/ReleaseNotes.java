package com.aspose.external.barcode.tester.releases.v25_7;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.QualitySettings;
import com.aspose.barcode.generation.BarCodeImageFormat;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import com.aspose.barcode.licensing.LicenseType;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class ReleaseNotes
{
    final String folder = Global.getTestDataFolder("ReleaseNotes/v25_7/");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense(LicenseType.Total);
    }

    @Test(description = "Encode DataMatrix text using Shift-JIS")
    public void example1() throws IOException
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATA_MATRIX);
        if (Charset.isSupported("Shift_JIS"))
        {
            Charset charset = Charset.forName("Shift_JIS");
            gen.setCodeText("車種名", charset);
            String filePath = folder + "barcode1-java.png";
            gen.save(filePath, BarCodeImageFormat.PNG);
            BarCodeReader reader = new BarCodeReader(filePath, DecodeType.DATA_MATRIX);
            BarCodeResult[] barCodeResults = reader.readBarCodes();
            for (BarCodeResult result : barCodeResults)
            {
                System.out.println("BarCode CodeText: " + result.getCodeText(charset));
            }
        }
    }

    @Test(description = "Encode codetext using UTF-8 with BOM")
    public void example2() throws IOException
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.QR);
        gen.setCodeText("車種名", StandardCharsets.UTF_8, true);
        String filePath = folder + "barcode2-java.png";
        gen.save(filePath, BarCodeImageFormat.PNG);
        BarCodeReader reader = new BarCodeReader(filePath, DecodeType.QR);
        BarCodeResult[] barCodeResults = reader.readBarCodes();
        for (BarCodeResult result : barCodeResults)
        {
            System.out.println("BarCode CodeText: " + result.getCodeText(StandardCharsets.UTF_8));
        }
    }

    @Test(description = "Code 128 recognition performance")
    public void example3() throws IOException
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.CODE_128, "ASPOSE");
        String filePath = folder + "barcode3-java.png";
        gen.save(filePath, BarCodeImageFormat.PNG);
        BarCodeReader reader = new BarCodeReader(filePath, DecodeType.CODE_128);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        BarCodeResult[] barCodeResults = reader.readBarCodes();
        for (BarCodeResult result : barCodeResults)
        {
            System.out.println("BarCode CodeText: " + result.getCodeText());
        }
    }

    @Test(description = "GS1 DataMatrix generation")
    public void example4() throws IOException
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.GS_1_DATA_MATRIX, "(00)057139091004349375(241)24140053(91)SkamoDoor Board 225 P2(243)035402");
        String filePath = folder + "barcode4-java.png";
        gen.save(filePath, BarCodeImageFormat.PNG);
        BarCodeReader reader = new BarCodeReader(filePath, DecodeType.GS_1_DATA_MATRIX);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        BarCodeResult[] barCodeResults = reader.readBarCodes();
        for (BarCodeResult result : barCodeResults)
        {
            System.out.println("BarCode CodeText: " + result.getCodeText());
        }
    }
}
