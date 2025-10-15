package com.aspose.external.barcode.tester.releases.v21_1;

import com.aspose.barcode.generation.BarCodeImageFormat;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Issue37702
{
    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void SetUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test_Formats() throws IOException {
        GenerateAndCheckNotZero(BarCodeImageFormat.BMP);
        GenerateAndCheckNotZero(BarCodeImageFormat.GIF);
        GenerateAndCheckNotZero(BarCodeImageFormat.JPEG);
        GenerateAndCheckNotZero(BarCodeImageFormat.PNG);
        GenerateAndCheckNotZero(BarCodeImageFormat.SVG);
        GenerateAndCheckNotZero(BarCodeImageFormat.TIFF);
        GenerateAndCheckNotZero(BarCodeImageFormat.TIFF_IN_CMYK);
    }

    @Test
    public void test_Emf_Format() throws IOException {
        GenerateAndCheckNotZero(BarCodeImageFormat.EMF);
    }

    private void GenerateAndCheckNotZero(BarCodeImageFormat format) throws IOException {
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.CODE_39, "0123456789");
        ByteArrayOutputStream mstr = new ByteArrayOutputStream();
        {
            generator.save(mstr, format);
            if (0 == mstr.size())
                Assert.fail("Saved barcode with format:" + format.toString() + " is zero size.");
        }
    }
}
