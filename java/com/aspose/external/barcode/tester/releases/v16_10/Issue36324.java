package com.aspose.external.barcode.tester.releases.v16_10;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.CodeLocation;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;
import utils.TestExternalHelper;

import java.io.File;
import java.io.IOException;

public class Issue36324
{
    String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue36324");
    String generatedFolder = Global.getGeneratedImagesFolder("Issues" + File.separator + "Issue36324");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test() throws IOException
    {
        BarcodeGenerator barCodeBuilder = new BarcodeGenerator(EncodeTypes.UPCA_GS_1_DATABAR_COUPON);
        // upca part is "514141100906", GS1Databar part is "(8110)001234502239811110555"
        barCodeBuilder.setCodeText("512345678900(8110)001234502239811110555");
        barCodeBuilder.getParameters().getCaptionAbove().setText("012345-022398");
        barCodeBuilder.getParameters().getBarcode().getCodeTextParameters().setLocation(CodeLocation.NONE);
        barCodeBuilder.save(generatedFolder + "actualCouponUpcaDatabar.png");
        TestExternalHelper.compareImages(folder + "expectedCouponUpcaDatabar.png", generatedFolder + "actualCouponUpcaDatabar.png");
    }
}
