package com.aspose.external.barcode.tester.releases.v82;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.CodeLocation;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.TestExternalHelper;

import java.io.File;
import java.io.IOException;

public class Issue36308
{
    final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue36308");
    final String generatedFolder = Global.getGeneratedImagesFolder("Issues" + File.separator + "Issue36308");


    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test(expectedExceptions = BarCodeException.class)
    public void generateTest1() throws IOException
    {
        BarcodeGenerator builder = new BarcodeGenerator(EncodeTypes.MAXI_CODE, "111");
        builder.getParameters().getBarcode().getXDimension().setMillimeters(0.22f);
        builder.getParameters().setResolution(72);
        builder.generateBarCodeImage();
    }

    @Test
    public void generateTest2() throws IOException
    {
        BarcodeGenerator builder = new BarcodeGenerator(EncodeTypes.AZTEC, "111");
        builder.getParameters().getBarcode().getXDimension().setMillimeters(3f);
        builder.getParameters().getBarcode().getCodeTextParameters().setLocation(CodeLocation.NONE);
        builder.save(generatedFolder + "actual.png");
        TestExternalHelper.compareImages(folder + "expected.png", generatedFolder + "actual.png");
    }
}
