package com.aspose.external.barcode.tester.releases.v20_5;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.DataMatrixEncodeMode;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.awt.image.BufferedImage;

public class Issue37435
{
    /// <summary>
    /// Path to folder with files for testing Issue37391.
    /// </summary>
    private String Folder = Global.getTestDataFolder("Issues\\Issue37417");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void SetUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test_DataMatrix_with_arabic_text_throws_no_exception()
    {
        String BarCodeText = "منحة";

        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.DATA_MATRIX, BarCodeText);

        generator.getParameters().getBarcode().getDataMatrix().setDataMatrixEncodeMode(DataMatrixEncodeMode.BYTES);
        generator.getParameters().getBarcode().getXDimension().setPixels(2);

        BufferedImage imgBarcode = generator.generateBarCodeImage();
    }
}
