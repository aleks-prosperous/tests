package com.aspose.external.barcode.tester.releases.v21_5;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
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

public class BARCODEJAVA1130
{
    /// <summary>
    /// Path to folder with files for testing Issue37703.
    /// </summary>
    private static final String Folder = Global.getTestDataFolder("Issues\\Issue37703");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void SetUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test_SwissQR_Cross() throws IOException
    {
        String expectedFilepath = Global.pathCombine(Folder, "output_Aspose_SwissQRCode.png");
        BarCodeReader r = new BarCodeReader(expectedFilepath, DecodeType.QR);
        BarCodeResult[] res = r.readBarCodes();
        SwissQRCodetext swissQRCodetext = defaultSwissQR();
        swissQRCodetext.initFromString(res[0].getCodeText());
        ComplexBarcodeGenerator gen = new ComplexBarcodeGenerator(swissQRCodetext);
        BufferedImage expected = ImageIO.read(new File(expectedFilepath));
        TestExternalHelper.compareBitmaps(expected, gen.generateBarCodeImage());
    }

    private SwissQRCodetext defaultSwissQR()
    {
        SwissQRCodetext swissQRCodetext = new SwissQRCodetext();
        swissQRCodetext.getBill().setAccount("CH450023023099999999A");
        swissQRCodetext.getBill().getCreditor().setName("Name");
        swissQRCodetext.getBill().getCreditor().setCountryCode("NL");

        return swissQRCodetext;
    }
}
