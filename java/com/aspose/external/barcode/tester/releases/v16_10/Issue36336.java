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

public class Issue36336
{
    private final String generatedFolder = Global.getGeneratedImagesFolder("Issues" + File.separator + "Issue36336");
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue36336");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void test() throws IOException
    {
        BarcodeGenerator barCodeBuilder = new BarcodeGenerator(EncodeTypes.CODE_93);
        barCodeBuilder.setCodeText("15-11-48-02-1386");
        barCodeBuilder.getParameters().getBarcode().getCodeTextParameters().setLocation(CodeLocation.NONE);
        barCodeBuilder.save(generatedFolder + "actualCode93ChecksumFix.png");
        TestExternalHelper.compareImages(folder + "expectedCode93ChecksumFix.png", generatedFolder + "actualCode93ChecksumFix.png");
    }
}
