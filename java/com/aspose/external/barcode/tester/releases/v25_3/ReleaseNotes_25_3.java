package com.aspose.external.barcode.tester.releases.v25_3;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.generation.BarCodeImageFormat;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import com.aspose.barcode.licensing.LicenseType;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.IOException;

public class ReleaseNotes_25_3
{
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense(LicenseType.Total);
    }

    private static final String folder = Global.getTestDataFolder("Generated/Release_25_3");
    @Test
    public void testGeneratingPDF() throws IOException
    {
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.CODE_128, "Aspose");
        generator.save(folder + "code128_Java.pdf", BarCodeImageFormat.PDF);
    }
}
