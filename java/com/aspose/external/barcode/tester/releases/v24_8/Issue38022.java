package com.aspose.external.barcode.tester.releases.v24_8;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.CustomerInformationInterpretingType;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.CodeLocation;
import com.aspose.barcode.generation.EncodeTypes;
import com.aspose.barcode.licensing.LicenseType;
import helpers.FrameworkTestUtils;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class Issue38022
{
    public static final String Folder = Global.getTestDataFolder("Issues\\Issue38022");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense(LicenseType.Total);
    }

    @Test
    public void Aus_Post_Short_Specified() throws IOException {
        BarcodeGenerator gen = generator_Australian_Post_Short(true);

        FrameworkTestUtils.generateAndCompare(generator_Australian_Post_Short(true), Folder, "Issue38022_Aus_Post_true.png");

        BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.AUSTRALIA_POST);
        {
            reader.getBarcodeSettings().getAustraliaPost().setCustomerInformationInterpretingType(
                    CustomerInformationInterpretingType.C_TABLE);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("6212345678AP", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void Aus_Post_Short_Not_Specified() throws IOException {
        BarcodeGenerator gen = generator_Australian_Post_Short(false);

        FrameworkTestUtils.generateAndCompare(generator_Australian_Post_Short(false), Folder, "Issue38022_Aus_Post_false.png");

        BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.AUSTRALIA_POST);
        {
            reader.getBarcodeSettings().getAustraliaPost().setCustomerInformationInterpretingType(CustomerInformationInterpretingType.C_TABLE);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("6212345678AP", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void Postnet_Short_Specified() throws IOException {
        BarcodeGenerator gen = generator_Postnet_Short(true);

        FrameworkTestUtils.generateAndCompare(generator_Postnet_Short(true), Folder, "Issue38022_Postnet_true.png");

        BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.POSTNET);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("5552357000", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void Postnet_Short_Not_Specified() throws IOException {
        BarcodeGenerator gen = generator_Postnet_Short(false);

        FrameworkTestUtils.generateAndCompare(generator_Postnet_Short(false), Folder, "Issue38022_Postnet_false.png");

        BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.POSTNET);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("5552357000", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    private BarcodeGenerator generator_Australian_Post_Short(boolean explicitShortBar)
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.AUSTRALIA_POST, "6212345678AP");
        gen.getParameters().getBarcode().getAustralianPost().setAustralianPostEncodingTable(CustomerInformationInterpretingType.C_TABLE);
        gen.getParameters().getBarcode().getBarHeight().setPixels(100);

        // If short bar is not specified, it is scaled to 0.26 * BarHeight
        if (explicitShortBar)
            gen.getParameters().getBarcode().getAustralianPost().getAustralianPostShortBarHeight().setPixels(10);

        gen.getParameters().getBarcode().getCodeTextParameters().setLocation(CodeLocation.NONE);
        gen.getParameters().getBarcode().getPadding().getLeft().setPixels(10);
        gen.getParameters().getBarcode().getPadding().getTop().setPixels(10);
        gen.getParameters().getBarcode().getPadding().getRight().setPixels(10);
        gen.getParameters().getBarcode().getPadding().getBottom().setPixels(10);

        return gen;
    }

    private BarcodeGenerator generator_Postnet_Short(boolean explicitShortBar)
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.POSTNET, "5552357000");
        gen.getParameters().getBarcode().getBarHeight().setPixels(100);

        // If short bar is not specified, it is scaled to 0.5 * BarHeight
        if (explicitShortBar)
            gen.getParameters().getBarcode().getPostal().getPostalShortBarHeight().setPixels(40);

        gen.getParameters().getBarcode().getCodeTextParameters().setLocation(CodeLocation.NONE);
        gen.getParameters().getBarcode().getPadding().getLeft().setPixels(10);
        gen.getParameters().getBarcode().getPadding().getTop().setPixels(10);
        gen.getParameters().getBarcode().getPadding().getRight().setPixels(10);
        gen.getParameters().getBarcode().getPadding().getBottom().setPixels(10);

        return gen;
    }
}
