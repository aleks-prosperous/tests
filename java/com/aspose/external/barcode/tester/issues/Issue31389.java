// Copyright (c) 2001-2011 Aspose Pty Ltd. All Rights Reserved.
package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.File;
import utils.LicenseAssistant;

import java.io.IOException;


@Test(description = "Tests for Issue-31389.")
public class Issue31389
{
    final String generatedFolder = Global.getGeneratedImagesFolder("Issues" + java.io.File.separator + "Issue31389");
    final String folder = Global.getTestDataFolder("Issues" + java.io.File.separator + "Issue31389");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void demo() throws IOException
    {
        final String file = "shortpdf.bmp";
        final String copyFile = "shortpdf_.bmp";
        String fullPath = Global.pathCombine(folder, file);
        String copyFullPath = Global.pathCombine(generatedFolder, copyFile);
        try
        {
            File.copy(fullPath, copyFullPath, true);
        } catch (Exception e)
        {
            e.printStackTrace();
        }

        for (int i = 0; i < 10; i++)
        {
            BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.CODE_39);
            gen.save(Global.getTempFolder(file));
        }
    }
}

