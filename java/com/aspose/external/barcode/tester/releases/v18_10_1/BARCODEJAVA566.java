package com.aspose.external.barcode.tester.releases.v18_10_1;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.generation.AutoSizeMode;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import com.aspose.barcode.generation.ITF14BorderType;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.IOException;

public class BARCODEJAVA566
{
    private final String path = Global.getBarcodejavaIssuesGeneratedImagesFolder("BARCODEJAVA566");
    private final double POINTS_PER_INCH = 72.0;
    private final double MM_PER_INCH = 25.4;
    private final double POINTS_PER_MM = POINTS_PER_INCH / MM_PER_INCH;
    private final String version = "18.10.1";


    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    public double pointToMm(double points)
    {
        return (points / POINTS_PER_MM);
    }

    @Test
    public void test() throws IOException
    {
        BarcodeGenerator builder = new BarcodeGenerator(EncodeTypes.ITF_6, "111111");
        builder.getParameters().setAutoSizeMode(AutoSizeMode.NONE);;
        builder.getParameters().getBarcode().getBarHeight().setMillimeters(((float) pointToMm(70.5)));
        builder.getParameters().getBarcode().getBarHeight().setMillimeters(((float) pointToMm(162.0)));
        builder.getParameters().getBarcode().getITF().setItfBorderType(ITF14BorderType.FRAME);
        String fullPath = path + "java-" + version + ".png";
        builder.save(fullPath);
        System.out.println("saved to " + fullPath);
    }
}
