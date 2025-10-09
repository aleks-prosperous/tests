package com.aspose.external.barcode.tester.barcodjava;

import com.aspose.barcode.*;
import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.generation.BarCodeImageFormat;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class BARCODJAVA33478
{
    String folder = Global.getGeneratedImagesFolder("barcodjava_issues" + File.separator + this.getClass().getSimpleName());

    @BeforeMethod
    public void setLicense() throws Exception
    {
        com.aspose.barcode.LicenseAssistant.setupLicense();
    }

    @Test(description = "Test for BARCODJAVA-33478 issue")
    public void testIssue() throws IOException
    {
        BarcodeGenerator barCodeBuilder = new BarcodeGenerator(EncodeTypes.DATA_MATRIX);
        barCodeBuilder.getParameters().setResolution(600);
        barCodeBuilder.setCodeText("text to be converted into the datamatrix barcode");

        barCodeBuilder.save(folder + "filename-600.png", BarCodeImageFormat.PNG);
    }
}
