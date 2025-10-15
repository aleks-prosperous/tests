package com.aspose.external.barcode.tester.releases.v74;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.generation.BarCodeImageFormat;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Issue34283
{
    final String folder = Global.getGeneratedImagesFolder("Issues" + File.separator + "Issue34283");

    @Test
    public void test1() throws IOException
    {
        BarcodeGenerator b = new BarcodeGenerator(EncodeTypes.ITF_14, "(01)90013670000396(3200)15(11)150819");
//        b.getParameters().getBarcode().setAutoSizeMode(AutoSizeMode.NEAREST);
        b.getParameters().getBarcode().getCodeTextParameters().getFont().setFamilyName("OCR B Std");
        b.getParameters().getBarcode().getCodeTextParameters().getFont().setStyle( Font.PLAIN);
        b.getParameters().getBarcode().getCodeTextParameters().getFont().getSize().setPoint(10);
        b.getParameters().getBarcode().getXDimension().setMillimeters(0.495f);
        b.getParameters().getBarcode().getBarHeight().setMillimeters(31.75f);
//        b.setCodeTextSpace(0.5f);
        b.getParameters().setResolution(1200.0f);
        b.save(folder + "ITF14 Sample at 1200dpi.png", BarCodeImageFormat.PNG);
    }

    @Test
    public void test2() throws IOException
    {
        BarcodeGenerator b = new BarcodeGenerator(EncodeTypes.ITF_14, "01900136700005");
//        b.getParameters().getBarcode().setAutoSizeMode(AutoSizeMode.NEAREST);
        b.getParameters().getBarcode().getCodeTextParameters().getFont().setFamilyName("OCR B Std");
        b.getParameters().getBarcode().getCodeTextParameters().getFont().setStyle( Font.PLAIN);
        b.getParameters().getBarcode().getCodeTextParameters().getFont().getSize().setPoint(10);
        b.getParameters().getBarcode().getXDimension().setMillimeters(0.495f);
        b.getParameters().getBarcode().getBarHeight().setMillimeters(31.75f);
//        b.setCodeTextSpace(0.5f);
        b.getParameters().setResolution(1200.0f);
        b.save(folder + "ITF14 Sample at 1200dpi-1.png", BarCodeImageFormat.PNG);
    }
}
