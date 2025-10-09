package com.aspose.external.barcode.tester.barcodjava;

import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import com.aspose.barcode.auxiliary.Global;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class BARCODJAVA33532
{
    String folder = Global.getGeneratedImagesFolder("barcodjava_issues" + File.separator + this.getClass().getSimpleName());

    @Test
    public void reproduceTest() throws IOException
    {
        BarcodeGenerator builder = new BarcodeGenerator(EncodeTypes.PHARMACODE);
        String txt = "333";
        builder.setCodeText(txt);
        // set symbology type
        // save the image to file
        builder.save(folder + "33400_Pharmacode001.png");
    }
}
