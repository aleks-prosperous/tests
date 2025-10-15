//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33703.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="10.09.2013 11:08:48">
//     Copyright (c) 2001-2011 Aspose Pty Ltd. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------------------------------------------

package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


@Test(description = "Tests for Issue33703.")
public class Issue33703
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33703");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    protected boolean CheckAngleInList(List<Float> angles, float RequiredAngle, float MaxAngleDiff)
    {
        for (int i = 0; i < angles.size(); ++i)
        {
            float lDiff = Math.abs((360 + angles.get(i) - RequiredAngle) % 360);
            if (lDiff <= MaxAngleDiff)
                return true;
        }

        return false;
    }

    @Test
    public void patchCodeVI()
    {
        List<String> values = new ArrayList<String>();
        List<Float> angles = new ArrayList<Float>();

        BarCodeReader reader = new BarCodeReader(Global.pathCombine(folder, "PatchVI.png"), DecodeType.PATCH_CODE);
        for(BarCodeResult result : reader.readBarCodes())
        {
            values.add(result.getCodeText());
            angles.add((float)result.getRegion().getAngle());
        }

        Assert.assertEquals(4, values.size());
        for (String s : (Iterable<String>) values)
        {
            Assert.assertEquals(s, "Patch VI");
        }

        Assert.assertTrue(CheckAngleInList(angles, 359, 5));
        Assert.assertTrue(CheckAngleInList(angles, 90, 5));
        Assert.assertTrue(CheckAngleInList(angles, 180, 5));
        Assert.assertTrue(CheckAngleInList(angles, 270, 5));
    }
}

