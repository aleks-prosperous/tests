package com.aspose.external.barcode.tester.releases.v16_12;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.CodeLocation;
import com.aspose.barcode.generation.EncodeTypes;
import com.aspose.barcode.generation.ITF14BorderType;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.TestExternalHelper;

import java.io.File;
import java.io.IOException;

public class Issue36419
{
    final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue36419");
    final String generatedFolder = Global.getGeneratedImagesFolder("Issues" + File.separator + "Issue36419");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void test1() throws IOException
    {
        BarcodeGenerator builder = new BarcodeGenerator(EncodeTypes.ITF_14);
        builder.setCodeText("1234567890");
        builder.getParameters().getBarcode().getITF().setItfBorderType(ITF14BorderType.FRAME_OUT);
        builder.getParameters().getBarcode().getXDimension().setMillimeters(1f);
        builder.getParameters().getBarcode().getCodeTextParameters().setLocation(CodeLocation.NONE);
        builder.save(generatedFolder + "actualITF14_quietZone.png");
        TestExternalHelper.compareImages(folder + "expectedITF14_quietZone.png", generatedFolder + "actualITF14_quietZone.png");
    }
}
