package com.aspose.external.barcode.tester.releases.v16_10;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.CodeLocation;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.TestExternalHelper;

import java.io.File;
import java.io.IOException;

public class Issue36247
{
    String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue36247");
    String generatedFolder = Global.getGeneratedImagesFolder("Issues" + File.separator + "Issue36247");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void test() throws IOException
    {
        BarcodeGenerator barCodeBuilder = new BarcodeGenerator(EncodeTypes.ISSN);
        barCodeBuilder.setCodeText("0002-8231");
        barCodeBuilder.getParameters().getBarcode().setThrowExceptionWhenCodeTextIncorrect(true);
//        barCodeBuilder.getParameters().getBarcode().setAutoSizeMode(AutoSizeMode.NEAREST);
        barCodeBuilder.getParameters().getBarcode().getCodeTextParameters().setLocation(CodeLocation.NONE);
        // Save the image
        barCodeBuilder.save(generatedFolder + "actualIssn.png");
        TestExternalHelper.compareImages(folder + "expectedIssn.png", generatedFolder + "actualIssn.png");
    }
}
