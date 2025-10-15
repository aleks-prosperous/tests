package com.aspose.external.barcode.tester.releases.v81;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.CodeLocation;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.TestExternalHelper;

import java.io.File;
import java.io.IOException;

public class Issue36232
{
    final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue36232");
    final String generatedFolder = Global.getGeneratedImagesFolder("Issues" + File.separator + "Issue36232");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void testBarcodeBuilderRecognizer() throws IOException
    {
        String expectedFileName = "expectedDatabarExpandedLong.png";
        String actualFileName = "actualDatabarExpandedLong.png";

        BarcodeGenerator barcode = new BarcodeGenerator(EncodeTypes.DATABAR_EXPANDED);

        String text = "8110106141411234562891101201212085010048000214025610048000310123191000";

        barcode.setCodeText(text);
        barcode.getParameters().getBarcode().getCodeTextParameters().setLocation(CodeLocation.NONE);
        barcode.save(Global.pathCombine(generatedFolder, actualFileName));
        TestExternalHelper.compareImages(Global.pathCombine(folder, expectedFileName), Global.pathCombine(generatedFolder, actualFileName));
    }
}
