package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Issue34265
{
    private final String folder = Global.getGeneratedImagesFolder("Issues" + File.separator + "Issue34265");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }


    @Test
    public void test() throws IOException
    {
        BarcodeGenerator b = new BarcodeGenerator(EncodeTypes.ITF_14, "00850006000227");
//        b.getParameters().getBarcode().setAutoSizeMode(AutoSizeMode.NEAREST);;
        b.getParameters().getBarcode().getITF().setItfBorderType(ITF14BorderType.BAR);
        b.getParameters().getBorder().getWidth().setMillimeters(0.990f);
        b.getParameters().getBarcode().getCodeTextParameters().getFont().setFamilyName("OCR B Std");
        b.getParameters().getBarcode().getCodeTextParameters().getFont().setStyle(Font.PLAIN);
        b.getParameters().getBarcode().getCodeTextParameters().getFont().getSize().setPoint(8);
        b.getParameters().getBarcode().getXDimension().setMillimeters(0.495f);
        b.getParameters().getBarcode().getBarHeight().setMillimeters(12.7f);
//        b.setCodeTextSpace(0.5f);
        b.getParameters().setResolution(1200.0f);
        b.save(folder + "ITF14 - Border Sizing.png", BarCodeImageFormat.PNG);
    }
}
