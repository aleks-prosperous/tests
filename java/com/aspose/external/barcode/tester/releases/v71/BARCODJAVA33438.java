package com.aspose.external.barcode.tester.releases.v71;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.generation.BarCodeImageFormat;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class BARCODJAVA33438
{
    final String folder = Global.getGeneratedImagesFolder("barcodjava_issues" + File.separator + "BARCODJAVA33438");

    @BeforeMethod
    public void setLicense() throws Exception
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void testIssue() throws IOException
    {
        BarcodeGenerator builder = new BarcodeGenerator(EncodeTypes.CODE_128);
        char FNC3 = 201;
        builder.setCodeText(FNC3 + "1234567");
        builder.save(folder + "code128.png", BarCodeImageFormat.PNG);
    }
}
