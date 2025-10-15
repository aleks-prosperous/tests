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

public class Issue36297
{
    final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue36297");
    final String generatedFolder = Global.getGeneratedImagesFolder("Issues" + File.separator + "Issue36297");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void test1() throws IOException
    {
        BarcodeGenerator b = new BarcodeGenerator(EncodeTypes.CODE_128);
        b.setCodeText("0123456789");
        b.getParameters().getBarcode().getCodeTextParameters().setLocation(CodeLocation.NONE);
        b.save(generatedFolder + "Barcode_Issue36297_Code128C.png");
        TestExternalHelper.compareImages(folder + "Barcode_Issue36297_Code128C_expected.png",
                generatedFolder + "Barcode_Issue36297_Code128C.png");

        b = new BarcodeGenerator(EncodeTypes.CODE_128);
        b.setCodeText("AAA0123456789zzzzz");
        b.getParameters().getBarcode().getCodeTextParameters().setLocation(CodeLocation.NONE);
        b.save(generatedFolder + "Barcode_Issue36297_Code128B.png");
        TestExternalHelper.compareImages(folder + "Barcode_Issue36297_Code128B_expected.png",
                generatedFolder + "Barcode_Issue36297_Code128B.png");

        b = new BarcodeGenerator(EncodeTypes.CODE_128);
        b.setCodeText("AAA\\t\\r\\n0123456789\\t\\r\\nZZZ");
        b.getParameters().getBarcode().getCodeTextParameters().setLocation(CodeLocation.NONE);
        b.save(generatedFolder + "Barcode_Issue36297_Code128A.png");
        TestExternalHelper.compareImages(folder + "Barcode_Issue36297_Code128A_expected.png",
                generatedFolder + "Barcode_Issue36297_Code128A.png");
    }
}
