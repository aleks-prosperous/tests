package com.aspose.external.barcode.tester.barcodjava;

import com.aspose.barcode.LicenseAssistant;
import com.aspose.barcode.generation.EncodeTypes;
import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.CustomerInformationInterpretingType;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.AutoSizeMode;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.external.barcode.tester.helpers.Assistance;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.image.BufferedImage;

public class BARCODEJAVA1148
{
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }


    @Test
    public void testCustomerInformationInterpretingType1()
    {
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.AUSTRALIA_POST);
        generator.setCodeText("59123456781234567");
        generator.getParameters().getBarcode().getAustralianPost().setAustralianPostEncodingTable(CustomerInformationInterpretingType.N_TABLE);
        generator.getParameters().setAutoSizeMode(AutoSizeMode.NEAREST);
        generator.getParameters().getImageWidth().setPixels(500);
        generator.getParameters().getImageHeight().setPixels(200);
        BufferedImage image = generator.generateBarCodeImage();
        Assistance.saveBufferedImage(image, "PNG", Global.getBarcodejavaIssuesGeneratedImagesFolder("CustomerInformationInterpretingTypeTests/test1.png"));
        BarCodeReader reader = new BarCodeReader(image, DecodeType.AUSTRALIA_POST);
        reader.getBarcodeSettings().getAustraliaPost().setCustomerInformationInterpretingType(CustomerInformationInterpretingType.N_TABLE);
        for (BarCodeResult barCodeResult : reader.readBarCodes())
        {
            System.out.println("CodeText : " + barCodeResult.getCodeText());
            System.out.println("CodeType : " + barCodeResult.getCodeTypeName());
        }
    }


    @Test
    public void testCustomerInformationInterpretingType2()
    {
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.AUSTRALIA_POST);
        generator.setCodeText("6212345678");
        generator.getParameters().getBarcode().getAustralianPost().setAustralianPostEncodingTable(CustomerInformationInterpretingType.C_TABLE);
        BufferedImage image = generator.generateBarCodeImage();
        generator.getParameters().setAutoSizeMode(AutoSizeMode.INTERPOLATION);
        generator.getParameters().getImageWidth().setPixels(300);
        generator.getParameters().getImageHeight().setPixels(150);
        Assistance.saveBufferedImage(image, "PNG", Global.getBarcodejavaIssuesGeneratedImagesFolder("CustomerInformationInterpretingTypeTests/test2.png"));
        BarCodeReader reader = new BarCodeReader((image), DecodeType.AUSTRALIA_POST);
        reader.getBarcodeSettings().getAustraliaPost().setCustomerInformationInterpretingType(CustomerInformationInterpretingType.C_TABLE);
        for (BarCodeResult barCodeResult : reader.readBarCodes())
        {
            System.out.println("CodeText : " + barCodeResult.getCodeText());
            System.out.println("CodeType : " + barCodeResult.getCodeTypeName());
        }
    }
}
