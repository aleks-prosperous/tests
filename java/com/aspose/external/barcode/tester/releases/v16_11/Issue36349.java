package com.aspose.external.barcode.tester.releases.v16_11;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.CodeLocation;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.TestExternalHelper;

import java.io.File;
import java.io.IOException;

@Test
public class Issue36349
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue36349");
    private final String generatedFolder = Global.getGeneratedImagesFolder("Issues" + File.separator + "Issue36349");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void test1() throws IOException
    {
        BarcodeGenerator builder = new BarcodeGenerator(EncodeTypes.CODE_128);
        builder.setCodeText("3-5-7-11");
        builder.getParameters().getBarcode().getCodeTextParameters().setLocation(CodeLocation.NONE);
        builder.save(generatedFolder + "actualBarcode.png");
        TestExternalHelper.compareImages(folder + "expectedBarcode.png", generatedFolder + "actualBarcode.png");
    }
}
