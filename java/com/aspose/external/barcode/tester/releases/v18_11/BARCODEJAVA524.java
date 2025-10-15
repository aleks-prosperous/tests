package com.aspose.external.barcode.tester.releases.v18_11;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.generation.AutoSizeMode;
import com.aspose.barcode.generation.BarCodeImageFormat;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;
import java.io.IOException;

public class BARCODEJAVA524
{
    private static final String Folder = Global.getTestDataFolder("barcodjava_issues" + File.separator + "BARCODEJAVA524");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test(expectedExceptions = BarCodeException.class)
    public void test1() throws IOException
    {
        String GTIN1 = "(01)00766907146318(17)180902(10)12347891012(17)991210(13)991211(11)991011(21)9990023295";
        // Generate and save the image to file
        BarcodeGenerator builder = new BarcodeGenerator(EncodeTypes.DATABAR_EXPANDED_STACKED);
        // Set code text
        builder.setCodeText(GTIN1);

        builder.getParameters().setAutoSizeMode(AutoSizeMode.NEAREST);;
        //builder.setColumns(6);

        builder.getParameters().getBarcode().getXDimension().setMillimeters(0.254f);
        builder.getParameters().getBarcode().getBarHeight().setMillimeters(65.02f);

        int cols = builder.getParameters().getBarcode().getDataBar().getColumns();
        int rows = builder.getParameters().getBarcode().getDataBar().getRows();
        builder.getParameters().getBarcode().getDataBar().setRows(7);
        builder.save(Folder + "DATABAR_EXPANDED_STACKED.png", BarCodeImageFormat.PNG);
    }
}
