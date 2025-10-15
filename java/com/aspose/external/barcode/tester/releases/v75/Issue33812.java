package com.aspose.external.barcode.tester.releases.v75;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.generation.BarCodeImageFormat;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class Issue33812
{
    final String folder = Global.getGeneratedImagesFolder("Issues" + File.separator + "Issue33812");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void test() throws IOException
    {
        String text = "(01)04912345123459(15)970331(30)128(10)ABC123";
        BarcodeGenerator builder = new BarcodeGenerator(EncodeTypes.GS_1_QR, text);
        builder.save(Global.pathCombine(folder, "GS1QR.png"), BarCodeImageFormat.PNG);
    }
}
