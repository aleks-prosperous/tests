package com.aspose.external.barcode.tester.releases.v22_1;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.generation.BarCodeImageFormat;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.CodeLocation;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BARCODEJAVA1241
{
    /// <summary>
    /// Path to folder with files for testing Issue37812.
    /// </summary>
    private final static String Folder = Global.getTestDataFolder("Issues/BARCODEJAVA1241/");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test() throws IOException
    {
        FileInputStream expectedFIS = new FileInputStream(Global.pathCombine(Folder, "basic_qr.emf"));
        byte[] expectedBuffer = new byte[expectedFIS.available()];
        Assert.assertEquals(expectedFIS.read(expectedBuffer), expectedBuffer.length);

        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.QR, "Barcode 123456");
        gen.getParameters().getBarcode().getCodeTextParameters().setLocation(CodeLocation.BELOW);

        ByteArrayOutputStream actualBAOS = new ByteArrayOutputStream();
        gen.save(actualBAOS, BarCodeImageFormat.EMF);
        byte[] actualBuffer = actualBAOS.toByteArray();

        Assert.assertEquals(actualBuffer, expectedBuffer);
    }
}
