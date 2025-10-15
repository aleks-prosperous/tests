// Copyright (c) 2001-2011 Aspose Pty Ltd. All Rights Reserved.
package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.auxiliary.StringExtensions;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;


@Test(description = "Tests for Issue-26883.")
public class Issue26883
{
    //http://www.idautomation.com/barcode/mil-std-130-uid-label.html
    private final String folder = Global.getGeneratedImagesFolder("Issues" + File.separator + "Issue26883");

    @Test
    public void generateDemoCodeWithGS1() throws IOException
    {
        String text = "[)><RS>05<GS>800406141419999960MH80312<GS>21MH80312<GS>950614141<GS>24099999<RS><EOT>";
        text = text.replace("<RS>", StringExtensions.concat("", (char) 30));
        text = text.replace("<GS>", StringExtensions.concat("", (char) 29));
        text = text.replace("<EOT>", StringExtensions.concat("", (char) 4));
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATA_MATRIX, text);
        {
            gen.getParameters().setResolution(200);
            gen.save(Global.getTempFolder("datamatrix_with_gs1.png"));
        }
    }
}

