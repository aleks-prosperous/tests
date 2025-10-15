package com.aspose.external.barcode.tester.releases.v75;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.generation.BarCodeImageFormat;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class Issue34319
{
    final String folder = Global.getGeneratedImagesFolder("Issues" + File.separator + "Issue34319");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void test() throws IOException
    {
        BarcodeGenerator b = new BarcodeGenerator(EncodeTypes.DATABAR_STACKED_OMNI_DIRECTIONAL, "(01)90013670000396(3200)15(11)150819");
        b.getParameters().getBarcode().getXDimension().setMillimeters(0.330f);
        b.getParameters().getBarcode().getBarHeight().setMillimeters(27.77f);
        b.getParameters().setResolution(1200.0f);
        b.save(Global.pathCombine(folder, "Barheight.png"), BarCodeImageFormat.PNG);
    }
}
