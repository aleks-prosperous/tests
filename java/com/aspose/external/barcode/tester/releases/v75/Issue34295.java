package com.aspose.external.barcode.tester.releases.v75;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.generation.BarCodeImageFormat;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class Issue34295
{
    final String folder = Global.getGeneratedImagesFolder("Issues" + File.separator + "Issue34295");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void test() throws IOException
    {
        BarcodeGenerator builder = new BarcodeGenerator(EncodeTypes.GS_1_DATA_MATRIX, "(01)90013670000396(3400)123456"); // Or any of the above values
        builder.save(Global.pathCombine(folder, "GS1DataMatrix.png"), BarCodeImageFormat.PNG);
    }
}
