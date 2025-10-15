package com.aspose.external.barcode.tester.releases.v75;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.generation.BarCodeImageFormat;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class Issue34294
{
    final String folder = Global.getGeneratedImagesFolder("Issues" + File.separator + "Issue34294");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void test() throws IOException
    {
        BarcodeGenerator b = new BarcodeGenerator(EncodeTypes.GS_1_CODE_128, "(01)90013670000396(3400)123456"); // Or any of the above values
        b.save(Global.pathCombine(folder, "OutGS1Code128.png"), BarCodeImageFormat.PNG);
    }
}
