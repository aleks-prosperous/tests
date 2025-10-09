package com.aspose.external.barcode.tester.barcodjava;

import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import com.aspose.barcode.auxiliary.Global;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

@Test
public class BARCODJAVA33459
{
    String folder = Global.getGeneratedImagesFolder("barcodjava_issues" + File.separator + this.getClass().getSimpleName());

    @BeforeMethod
    public void setLicense() throws Exception
    {
        com.aspose.barcode.LicenseAssistant.setupLicense();
    }

    @Test(description = "Test fo BARCODJAVA-33459")
    public void testIssue() throws IOException
    {
        BarcodeGenerator builder = new BarcodeGenerator(EncodeTypes.CODE_128);
        builder.setCodeText("f");
        String strImagePath = Global.pathCombine(folder, "Test128-f.jpg");
        builder.save(strImagePath);
    }
}
