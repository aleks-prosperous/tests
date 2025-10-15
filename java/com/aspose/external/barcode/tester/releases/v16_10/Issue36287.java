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

public class Issue36287
{
    String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue36287");
    String generatedFolder = Global.getGeneratedImagesFolder("Issues" + File.separator + "Issue36287");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void test() throws IOException
    {
        BarcodeGenerator barCodeBuilder = new BarcodeGenerator(EncodeTypes.UPCA_GS_1_CODE_128_COUPON);

        // upca part is "514141100906", GS1Code128 part is "(8102)03"
        barCodeBuilder.setCodeText("514141100906(8102)03");
        barCodeBuilder.getParameters().getBarcode().getCodeTextParameters().setLocation(CodeLocation.NONE);
        barCodeBuilder.save(generatedFolder + "actualUpcaGs1Code128Coupon.png");
        TestExternalHelper.compareImages(folder + "expectedUpcaGs1Code128Coupon.png", generatedFolder + "actualUpcaGs1Code128Coupon.png");
    }
}
