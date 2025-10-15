package com.aspose.external.barcode.tester.releases.v16_12;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.CodeLocation;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.TestExternalHelper;

import java.io.File;
import java.io.IOException;

public class Issue36381
{
    final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue36381");
    final String generatedFolder = Global.getGeneratedImagesFolder("Issues" + File.separator + "Issue36381");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void test1() throws IOException
    {
        BarcodeGenerator builder = new BarcodeGenerator(EncodeTypes.CODABLOCK_F,"012345601234560123456");
        builder.getParameters().getBarcode().getCodeTextParameters().setLocation(CodeLocation.NONE);
        builder.save(generatedFolder + "actualCodaBlockF.png");
        TestExternalHelper.compareImages(folder + "expectedCodaBlockF.png", generatedFolder + "actualCodaBlockF.png");
    }
}
