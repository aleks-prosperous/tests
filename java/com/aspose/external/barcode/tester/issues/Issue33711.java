//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33711.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="10.09.2013 11:08:48">
//     Copyright (c) 2001-2011 Aspose Pty Ltd. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------------------------------------------

package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.BarCodeException;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


@Test(description = "Tests for Issue33711.")
public class Issue33711
{
    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void generationNoException()
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.PHARMACODE, "999999");
            try
            {
                gen.generateBarCodeImage();
        } catch (Exception ex)
        {
            Assert.fail("No exception must be thrown, " + ex.getMessage());
        }

    }

    @Test
    public void generationException()
    {
        try
        {
            BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.PHARMACODE, "999999");
                gen.getParameters().getBarcode().setThrowExceptionWhenCodeTextIncorrect(true);
                gen.generateBarCodeImage();
        } catch (BarCodeException ex)
        {
            return;
        }
        Assert.fail("BarCodeException expected");
    }
}

