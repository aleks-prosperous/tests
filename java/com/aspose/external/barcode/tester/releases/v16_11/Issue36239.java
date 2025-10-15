package com.aspose.external.barcode.tester.releases.v16_11;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.generation.BarCodeImageFormat;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Issue36239
{
    private final String generatedFolder = Global.getGeneratedImagesFolder("Issues" + File.separator + "Issue36239");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void test1() throws IOException
    {
        BarcodeGenerator barcode = new BarcodeGenerator(EncodeTypes.QR, "1234567890");
        barcode.getParameters().setResolution(200);
        barcode.getParameters().getBarcode().setBarColor(Color.BLUE);
        barcode.getParameters().getBarcode().getCodeTextParameters().setColor(Color.RED);
        barcode.getParameters().setBackColor(Color.PINK);
        barcode.save(generatedFolder + "actual_qr_in_cmyk.tiff", BarCodeImageFormat.TIFF_IN_CMYK);
    }
}
