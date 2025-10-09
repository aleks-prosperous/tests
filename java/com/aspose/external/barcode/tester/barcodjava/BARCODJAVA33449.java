package com.aspose.external.barcode.tester.barcodjava;

import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import com.aspose.barcode.generation.StringAlignment;
import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.generation.TextAlignment;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class BARCODJAVA33449
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
        //Instantiate BarCodeBuilder object
        BarcodeGenerator builder = new BarcodeGenerator(EncodeTypes.CODE_128, "123456");
        builder.getParameters().getCaptionBelow().setAlignment(TextAlignment.CENTER);
        builder.save(folder + "left.png");
    }
}
