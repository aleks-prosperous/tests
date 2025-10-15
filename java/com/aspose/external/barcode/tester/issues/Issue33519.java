//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33519.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="12.11.2012 14:45:35">
//     Copyright (c) 2001-2011 Aspose Pty Ltd. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------------------------------------------

package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Test(description = "Tests for Issue-33519.")
public class Issue33519
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33519");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void noFreeze()
    {
        List<String> values = new ArrayList<String>();
        List<BaseDecodeType> readTypes = new ArrayList<BaseDecodeType>();
        String fileName = Global.pathCombine(folder, "A20131082000003.tif");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);

        reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);
        reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
        for(BarCodeResult result : reader.readBarCodes())
        {
            values.add(result.getCodeText());
            readTypes.add(result.getCodeType());
        }
        Assert.assertTrue(values.contains("RSA20131062000047"));
        Assert.assertTrue(readTypes.contains(DecodeType.CODE_39));
        Assert.assertEquals(5, values.size());

        int patchCount = 0;
        for (int i = 0; i < values.size(); ++i)
        {
            if ("Patch IV".equals(values.get(i)))
            {
                patchCount++;
            }
        }
        Assert.assertEquals(4, patchCount);
    }

    @Test
    public void cut1Patch()
    {
        List<String> values = new ArrayList<String>();
        List<BaseDecodeType> readTypes = new ArrayList<BaseDecodeType>();
        String fileName = Global.pathCombine(folder, "A20131082000003_cut1.tif");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);
        for(BarCodeResult result : reader.readBarCodes())
        {
            values.add(result.getCodeText());
            readTypes.add(result.getCodeType());
        }
        Assert.assertEquals(1, values.size());

        int patchCount = 0;
        for (int i = 0; i < values.size(); ++i)
        {
            if ("Patch IV".equals(values.get(i)))
            {
                patchCount++;
            }
        }
        Assert.assertEquals(1, patchCount);
    }
}

