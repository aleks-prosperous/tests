// Copyright (c) 2001-2011 Aspose Pty Ltd. All Rights Reserved.
package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.License;
import com.aspose.barcode.PleaseReportException;
import com.aspose.barcode.auxiliary.Global;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;


@Test(description = "Tests for Issue-33139.")
public class Issue33139
{
    String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33139");

    public void demo() throws Exception
    {
        try
        {
            String fullFileName = folder + "Aspose.BarCode.lic";
            // set license for barcode generation
            License licGen = new License();
            licGen.setLicense(fullFileName);
            // set license for barcode recognition
            License licRec = new License();
            licRec.setLicense(fullFileName);
        } catch (PleaseReportException ex)
        {
            return;
        }
        Assert.fail("InvalidOperationException expected");
    }
}

