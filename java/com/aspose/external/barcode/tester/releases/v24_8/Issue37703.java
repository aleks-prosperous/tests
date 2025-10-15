package com.aspose.external.barcode.tester.releases.v24_8;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.complexbarcode.ComplexBarcodeGenerator;
import com.aspose.barcode.complexbarcode.SwissQRCodetext;
import com.aspose.barcode.generation.AutoSizeMode;
import helpers.FrameworkTestUtils;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.awt.image.BufferedImage;
import java.io.IOException;

public class Issue37703
{
    /// <summary>
    /// Path to folder with files for testing Issue37703.
    /// </summary>
    private static final String Folder = Global.getTestDataFolder("Issues\\Issue37703");

    private SwissQRCodetext defaultSwissQR()
    {
        SwissQRCodetext swissQRCodetext = new SwissQRCodetext();
        swissQRCodetext.getBill().setAccount("CH450023023099999999A");
        swissQRCodetext.getBill().getCreditor().setName("Name");
        swissQRCodetext.getBill().getCreditor().setCountryCode("NL");

        return swissQRCodetext;
    }

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void SetUp()
    {
        LicenseAssistant.setupLicense();
    }


    @Test
    public void test_SwissQR_Cross() throws IOException {
        FrameworkTestUtils.compareBitmaps(Generator_Of_Test_SwissQR_Cross(), Folder, "swiss.png");
    }

    private BufferedImage Generator_Of_Test_SwissQR_Cross()
    {
        ComplexBarcodeGenerator gen = new ComplexBarcodeGenerator(defaultSwissQR());
        return gen.generateBarCodeImage();
    }

    @Test
    public void test_SwissQR_Cross_Interpolation() throws IOException {
        FrameworkTestUtils.compareBitmaps(generator_Of_Test_SwissQR_Cross_Interpolation(), Folder, "swiss_Interpolation.png");
    }

    private BufferedImage generator_Of_Test_SwissQR_Cross_Interpolation()
    {
        ComplexBarcodeGenerator gen = new ComplexBarcodeGenerator(defaultSwissQR());
        gen.getParameters().setAutoSizeMode(AutoSizeMode.INTERPOLATION);
        gen.getParameters().getImageHeight().setPixels(400);
        gen.getParameters().getImageWidth().setPixels(800);
        return gen.generateBarCodeImage();
    }

    @Test
    public void test_SwissQR_Cross_Nearest() throws IOException {
        FrameworkTestUtils.compareBitmaps(generator_Of_Test_SwissQR_Cross_Nearest(), Folder, "swiss_Nearest.png");
    }

    private BufferedImage generator_Of_Test_SwissQR_Cross_Nearest()
    {
        ComplexBarcodeGenerator gen = new ComplexBarcodeGenerator(defaultSwissQR());
        gen.getParameters().setAutoSizeMode(AutoSizeMode.NEAREST);
        gen.getParameters().getImageHeight().setPixels(400);
        gen.getParameters().getImageWidth().setPixels(600);
        return gen.generateBarCodeImage();
    }
}
