package com.aspose.external.barcode.tester.releases.v21_7;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.generation.BarCodeImageFormat;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.IOException;

public class BARCODEJAVA1113
{
    private final static String folder = Global.getTestDataFolder("Issues/BARCODEJAVA1113/");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test()
    {
        String GTIN1 = "(01)01082503101704";
        int row = 2;

        float xdim = 0.33f;
        float height = 23.44f;

// Generate and save the image to file
        BarcodeGenerator builder = new BarcodeGenerator(EncodeTypes.DATABAR_EXPANDED_STACKED);
// Set code text
        builder.setCodeText(GTIN1);

        builder.getParameters().getBarcode().getDataBar().setRows(row);
        builder.getParameters().getBarcode().getXDimension().setMillimeters(xdim);
        builder.getParameters().getBarcode().getBarHeight().setMillimeters(height);

        builder.getParameters().getBarcode().getPadding().getLeft().setMillimeters(0);
        builder.getParameters().getBarcode().getPadding().getRight().setMillimeters(0);
        builder.getParameters().getBarcode().getPadding().getTop().setMillimeters(0);
        builder.getParameters().getBarcode().getPadding().getBottom().setMillimeters(0);
        builder.getParameters().setResolution(600f);
        try
        {
            builder.save(folder + "213.png", BarCodeImageFormat.PNG);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
