package com.aspose.external.barcode.tester.releases.v24_9;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.CustomerInformationInterpretingType;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.IOException;

public class ApiChanges
{
    private final static String folder = Global.getTestDataFolder("Comments");
    private final static String image_path_to_save1 = folder + "image_to_save1.jpg";
    private final static String image_path_to_save2 = folder + "image_to_save2.jpg";
    private final static String image_path_to_save3 = folder + "image_to_save3.jpg";
    private final static String image_path_to_save4 = folder + "image_to_save4.jpg";

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void example1() throws IOException
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.AUSTRALIA_POST, "6212345678AP");
        gen.getParameters().getBarcode().getAustralianPost().setAustralianPostEncodingTable(CustomerInformationInterpretingType.C_TABLE);
        gen.getParameters().getBarcode().getBarHeight().setPixels(100);
        gen.save(image_path_to_save1);
    }

    @Test
    public void example2() throws IOException
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.AUSTRALIA_POST, "6212345678AP");
        gen.getParameters().getBarcode().getAustralianPost().getAustralianPostShortBarHeight().setPixels(10);
        gen.getParameters().getBarcode().getPadding().getLeft().setPixels(10);
        gen.getParameters().getBarcode().getPadding().getTop().setPixels(10);
        gen.getParameters().getBarcode().getPadding().getRight().setPixels(10);
        gen.getParameters().getBarcode().getPadding().getBottom().setPixels(10);
        gen.save(image_path_to_save2, com.aspose.barcode.generation.BarCodeImageFormat.PNG);
    }

    @Test
    public void example3() throws IOException
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.POSTNET, "5552357000");
        gen.getParameters().getBarcode().getBarHeight().setPixels(100);
        // If short bar is not specified, it is scaled to 0.5 * BarHeight
        gen.getParameters().getBarcode().getPostal().getPostalShortBarHeight().setPixels(40);
        gen.getParameters().getBarcode().getCodeTextParameters().setLocation(CodeLocation.NONE);
        gen.getParameters().getBarcode().getPadding().getLeft().setPixels(10);
        gen.getParameters().getBarcode().getPadding().getTop().setPixels(10);
        gen.getParameters().getBarcode().getPadding().getRight().setPixels(10);
        gen.getParameters().getBarcode().getPadding().getBottom().setPixels(10);
        gen.save(image_path_to_save3, com.aspose.barcode.generation.BarCodeImageFormat.PNG);
    }

    /**
     * Encode and decode PZN7
     * When you provide a 6-digit code text to the BarcodeGenerator with EncodeTypes.PZN,
     * the library interprets it as a PZN7 barcode.
     * The PZN7 format consists of 7 digits: 6 data digits plus 1 check digit calculated by the system.
     **/
    @Test
    public void example4() throws IOException
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.PZN, "123456");
        BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.PZN);
        BarCodeResult[] barCodeResults = reader.readBarCodes();
        for (BarCodeResult result : barCodeResults)
        {
            System.out.println(result.getCodeTypeName() + ":" + result.getCodeText());
        }
    }

    /**
     * Encode and decode PZN8
     * When you provide a 7-digit code text, the library generates a PZN8 barcode.
     * The PZN8 format consists of 8 digits: 7 data digits plus 1 check digit calculated by the system.
     **/
    @Test
    public void example5() throws IOException
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.PZN, "1234567");
        BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.PZN);
        BarCodeResult[] barCodeResults = reader.readBarCodes();
        for (BarCodeResult result : barCodeResults)
        {
            System.out.println(result.getCodeTypeName() + ":" + result.getCodeText());
        }
    }

    @Test
    public void example6() throws IOException
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.QR, "Aspose");
            gen.getParameters().getBarcode().getQR().setQrVersion(QRVersion.VERSION_15);
            gen.getParameters().getBarcode().getQR().setQrErrorLevel(QRErrorLevel.LEVEL_M);
        BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.QR);
        BarCodeResult[] barCodeResults = reader.readBarCodes();
        for (BarCodeResult result : barCodeResults)
        {
            System.out.println("Codetype: " + result.getCodeTypeName());
            System.out.println("Codetext: " + result.getCodeText());
            System.out.println("QR version: " + result.getExtended().getQR().getQRVersion());
            System.out.println("Error level: " + result.getExtended().getQR().getQRErrorLevel());
        }
    }
}
