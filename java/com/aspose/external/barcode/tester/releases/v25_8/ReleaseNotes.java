package com.aspose.external.barcode.tester.releases.v25_8;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.BarCodeImageFormat;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.CodeLocation;
import com.aspose.barcode.generation.EncodeTypes;
import com.aspose.barcode.licensing.LicenseType;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.awt.*;
import java.io.IOException;

public class ReleaseNotes
{
    private String filePath = Global.getTestDataFolder("ReleaseNotes/v25_8");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense(LicenseType.Total);
    }

    @Test
    public void example1() throws IOException
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.QR, "Aspose");
        gen.getParameters().getImage().getPdf().setTextAsPath(true);
        gen.getParameters().getBarcode().getCodeTextParameters().setLocation(CodeLocation.BELOW);
        gen.getParameters().getBarcode().getCodeTextParameters().setColor(Color.GREEN);
        gen.save(filePath + "barcode.pdf", BarCodeImageFormat.PDF);
    }

    @Test
    public void example2() throws IOException
    {
        BarCodeReader reader = new BarCodeReader(filePath + "code39.png", DecodeType.CODE_39_FULL_ASCII);
        for (BarCodeResult result : reader.readBarCodes())
        {
            System.out.println("CodeType: " + result.getCodeTypeName());
            System.out.println("CodeText: " + result.getCodeText());
        }
    }

    // Recognize using default
    @Test
    public void example3() throws IOException
    {
        BarCodeReader reader = new BarCodeReader(filePath + "barcode.png");
        for (BarCodeResult result : reader.readBarCodes())
        {
            System.out.println("CodeType: " + result.getCodeTypeName());
            System.out.println("CodeText: " + result.getCodeText());
        }
    }

    // Explicitly use MostCommonTypes
    @Test
    public void example4() throws IOException
    {
        BarCodeReader reader = new BarCodeReader(filePath + "barcode.png", DecodeType.MOST_COMMON_TYPES);
        for (BarCodeResult result : reader.readBarCodes())
        {
            System.out.println("CodeType: " + result.getCodeTypeName());
            System.out.println("CodeText: " + result.getCodeText());
        }
    }

    // Fallback to AllSupportedTypes (slower scan)
    @Test
    public void example5() throws IOException
    {
        BarCodeReader reader = new BarCodeReader(filePath + "barcode.png", DecodeType.ALL_SUPPORTED_TYPES);
        for (BarCodeResult result : reader.readBarCodes())
        {
            System.out.println("CodeType: " + result.getCodeTypeName());
            System.out.println("CodeText: " + result.getCodeText());
        }
    }

    @Test
    public void example6() throws IOException
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.CODE_128, "Aspose");
        gen.getParameters().getBarcode().getXDimension().setPixels(2);
        gen.getParameters().getBarcode().getBarHeight().setPixels(150);
        gen.save(filePath + "barcode_code_128.png", BarCodeImageFormat.PNG);

        // Recognize multiple 1D barcode types
        BarCodeReader reader = new BarCodeReader(filePath + "barcode_code_128.png",
                DecodeType.CODE_11, DecodeType.IATA_2_OF_5,
                DecodeType.EAN_13, DecodeType.EAN_8, DecodeType.INTERLEAVED_2_OF_5,
                DecodeType.STANDARD_2_OF_5, DecodeType.UPCA,
                DecodeType.DATA_LOGIC_2_OF_5, DecodeType.DATABAR_OMNI_DIRECTIONAL,
                DecodeType.DATABAR_EXPANDED, DecodeType.CODE_128,
                DecodeType.CODE_93, DecodeType.MATRIX_2_OF_5, DecodeType.UPCE,
                DecodeType.DATABAR_LIMITED, DecodeType.CODE_39, DecodeType.MSI);
            for (BarCodeResult result : reader.readBarCodes())
            {
                System.out.println("CodeType: " + result.getCodeTypeName());
                System.out.println("CodeText: " + result.getCodeText());
            }
        }
}
