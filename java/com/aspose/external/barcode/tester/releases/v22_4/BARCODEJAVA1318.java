package com.aspose.external.barcode.tester.releases.v22_4;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.complexbarcode.ComplexBarcodeGenerator;
import com.aspose.barcode.complexbarcode.SwissQRCodetext;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;
import utils.TestExternalHelper;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class BARCODEJAVA1318
{
    private final static String Folder = Global.getTestDataFolder("Issues/BARCODEJAVA1318");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test() throws IOException
    {
        String expectedImagePath = Global.pathCombine(Folder, "expected.png");
        SwissQRCodetext swissQRCodetext = new SwissQRCodetext();
        swissQRCodetext.getBill().setAccount("CH450023023099999999A");
        swissQRCodetext.getBill().getCreditor().setName("Name");
        swissQRCodetext.getBill().getCreditor().setCountryCode("NL");

        ComplexBarcodeGenerator gen = new ComplexBarcodeGenerator(swissQRCodetext);
        BufferedImage actual = gen.generateBarCodeImage();
        BufferedImage expected = ImageIO.read(new File(expectedImagePath));
        TestExternalHelper.compareBitmaps(expected, actual);
    }
}
