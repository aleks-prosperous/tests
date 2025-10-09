package com.aspose.external.barcode.tester.barcodjava;

import com.aspose.barcode.generation.BarCodeImageFormat;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import com.aspose.barcode.auxiliary.Global;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class BARCODJAVA33356
{
    String folder = Global.getGeneratedImagesFolder("barcodjava_issues" + File.separator + this.getClass().getSimpleName());

    @BeforeMethod
    public void setLicense() throws Exception
    {
        com.aspose.barcode.LicenseAssistant.setupLicense();
    }

    @Test
    public void testOne() throws IOException
    {
        BarcodeGenerator bb = new BarcodeGenerator(EncodeTypes.PDF_417);
        bb.setCodeText("QWERTYUIOP");
        bb.getParameters().setResolution(300);
        //Save barcode image to MemoryStream in TIF format
        bb.save(folder + "barcode_java_5420.tif", BarCodeImageFormat.TIFF);
    }
}
