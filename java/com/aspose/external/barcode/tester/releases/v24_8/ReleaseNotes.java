package com.aspose.external.barcode.tester.releases.v24_8;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.CustomerInformationInterpretingType;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.BarCodeImageFormat;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;
import java.io.IOException;

public class ReleaseNotes
{
    private final static String folder = Global.getTestDataFolder("Examples/release_24_8/");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void example1()
    {
        String filePath = folder + "qr.png";
        System.out.println(new File(filePath).exists());
        BarCodeReader reader = new BarCodeReader(filePath, DecodeType.QR);
        reader.setQualitySettings(com.aspose.barcode.barcoderecognition.QualitySettings.getHighQuality());
        for (BarCodeResult result : reader.readBarCodes())
        {
            System.out.println(result.getCodeText());
        }
    }

    @Test
    public void example2() throws IOException
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.AUSTRALIA_POST, "6212345678AP");
        gen.getParameters().getBarcode().getAustralianPost().setAustralianPostEncodingTable(CustomerInformationInterpretingType.C_TABLE);
        gen.getParameters().getBarcode().getBarHeight().setPixels(100);
        gen.getParameters().getBarcode().getAustralianPost().getAustralianPostShortBarHeight().setPixels(10);
        gen.getParameters().getBarcode().getPadding().getLeft().setPixels(10);
        gen.getParameters().getBarcode().getPadding().getTop().setPixels(10);
        gen.getParameters().getBarcode().getPadding().getRight().setPixels(10);
        gen.getParameters().getBarcode().getPadding().getBottom().setPixels(10);
        gen.save(folder + "AustraliaPost.png", BarCodeImageFormat.PNG);
    }

}
