package com.aspose.external.barcode.tester.releases.v18_11;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.generation.BarCodeImageFormat;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import com.aspose.barcode.generation.TextAlignment;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;
import utils.TestExternalHelper;

import java.io.IOException;

public class BARCODEJAVA555
{
    private final static String Folder = Global.getTestDataFolder("barcodjava_issues/BARCODEJAVA555");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test() throws IOException
    {
        String expectedFileName = "expected.png";
        String actualFileName = "actual.png";
        String GTIN1 = "(01)00766907146318(13)991012(10)12345678901234567890";
        float xdim=0.20f;
        // Generate and save the image to file
        BarcodeGenerator builder = new BarcodeGenerator(EncodeTypes.DATABAR_EXPANDED_STACKED);
        // Set code text
        builder.setCodeText(GTIN1);

        builder.getParameters().getCaptionBelow().setAlignment(TextAlignment.CENTER);

        builder.getParameters().setResolution(96f);

        //        builder.setCodeTextSpace(0.5f);
        builder.getParameters().getBarcode().getDataBar().setRows(2);

        builder.getParameters().getBarcode().getXDimension().setMillimeters(xdim);
        builder.getParameters().getBarcode().getBarHeight().setMillimeters(14.2f);

        builder.save(Global.pathCombine(Folder, actualFileName), BarCodeImageFormat.PNG);

        TestExternalHelper.compareImages(Global.pathCombine(Folder, expectedFileName), Global.pathCombine(Folder, actualFileName));
    }
}
