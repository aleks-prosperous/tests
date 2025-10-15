//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33611.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="24.07.2013 13:42:52">
//     Copyright (c) 2001-2011 Aspose Pty Ltd. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------------------------------------------

package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


@Test(description = "Tests for Issue33611.")
public class Issue33611
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33611");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void datamatrixModes()
    {
        List<String> values = new ArrayList<String>();

        String fileName = Global.pathCombine(folder, "DMMS-Coversheet_1.tif");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATA_MATRIX);
        for(BarCodeResult result : reader.readBarCodes())
        values.add(result.getCodeText());

        Assert.assertEquals(6, values.size());
        Assert.assertTrue(values.contains("FORM-99990003"));
        Assert.assertTrue(values.contains("BC1-DMMSCH"));
        Assert.assertTrue(values.contains("BC2-DMMSCHRS"));
        Assert.assertTrue(values.contains("I01=CC0F951E-C746-743F-E1E5-38FF5F72C3BF"));
        Assert.assertTrue(values.contains("I02=EmailDocument"));
        Assert.assertTrue(values.contains("A01=SupportMatter;A02=2.10.40145;A03=3AF1E5D2-46FD-403A-82AF-552CC82EE6E2;A04=Aktiv;A05=CC0F951E-C746-743F-E1E5-38FF5F72C3BF"));
    }
}

