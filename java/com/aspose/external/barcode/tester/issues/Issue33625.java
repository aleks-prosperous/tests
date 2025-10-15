//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33625.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="07.08.2013 16:15:10">
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


@Test(description = "Tests for Issue-33625.")
public class Issue33625
{
    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void fail1()
    {
        try
        {
            BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.AUSTRALIAN_POSTE_PARCEL, "1");
            gen.generateBarCodeImage();
        } catch (BarCodeException ex)
        {
            Assert.assertTrue((ex.getMessage().contains("Barcode length is incorrect")));
            return;
        }
        Assert.fail("Dont go here.");
    }

    @Test
    public void fail2()
    {
        try
        {
            BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.AUSTRALIAN_POSTE_PARCEL, "12345678901234567890123456789");
            gen.generateBarCodeImage();
        } catch (BarCodeException ex)
        {
            Assert.assertTrue(ex.getMessage().contains("Australia Post ID / RSD Trigger is incorrect"));
            return;
        }
        Assert.fail("Dont go here.");
    }

    @Test
    public void fail3()
    {
        try
        {
            BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.AUSTRALIAN_POSTE_PARCEL, "997AAA78901234567890123456789");
            gen.generateBarCodeImage();
        } catch (BarCodeException ex)
        {
            Assert.assertTrue(ex.getMessage().contains("RSD Application ID is incorrect"));
            return;
        }
        Assert.fail("Dont go here.");
    }

    @Test
    public void fail4()
    {
        try
        {
            BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.AUSTRALIAN_POSTE_PARCEL, "997123AA901234567890123456789");
            gen.generateBarCodeImage();
        } catch (BarCodeException ex)
        {
            Assert.assertTrue(ex.getMessage().contains("Product Code is incorrect"));
            return;
        }
        Assert.fail("Dont go here.");
    }

    @Test
    public void fail5()
    {
        try
        {
            BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.AUSTRALIAN_POSTE_PARCEL, "99712345+-1234567890123456789");
            gen.generateBarCodeImage();
        } catch (BarCodeException ex)
        {
            Assert.assertTrue(ex.getMessage().contains("Merchant Location ID is incorrect"));
            return;
        }
        Assert.fail("Dont go here.");
    }

    @Test
    public void fail6()
    {
        try
        {
            BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.AUSTRALIAN_POSTE_PARCEL, "9971234567AAAAAAA890123456789");
            gen.generateBarCodeImage();
        } catch (BarCodeException ex)
        {
            Assert.assertTrue(ex.getMessage().contains("Consignment Suffix is incorrect"));
            return;
        }
        Assert.fail("Dont go here.");
    }

    @Test
    public void fail7()
    {
        try
        {
            BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.AUSTRALIAN_POSTE_PARCEL, "997123456789012345AA012345678");
            gen.generateBarCodeImage();
        } catch (BarCodeException ex)
        {
            Assert.assertTrue(ex.getMessage().contains("Article Suffix is incorrect"));
            return;
        }
        Assert.fail("Dont go here.");
    }

    @Test
    public void fail8()
    {
        try
        {
            BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.AUSTRALIAN_POSTE_PARCEL, "99712345678901234567AA2345678");
            gen.generateBarCodeImage();
        } catch (BarCodeException ex)
        {
            Assert.assertTrue(ex.getMessage().contains("Service Code is incorrect"));
            return;
        }
        Assert.fail("Dont go here.");
    }

    @Test
    public void fail9()
    {
        try
        {
            BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.AUSTRALIAN_POSTE_PARCEL, "9971234567890123456789A345678");
            gen.generateBarCodeImage();
        } catch (BarCodeException ex)
        {
            Assert.assertTrue(ex.getMessage().contains("Last Article Indicator is incorrect"));
            return;
        }
        Assert.fail("Dont go here.");
    }

    @Test
    public void fail10()
    {
        try
        {
            BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.AUSTRALIAN_POSTE_PARCEL, "99712345678901234567890A45678");
            gen.generateBarCodeImage();
        } catch (BarCodeException ex)
        {
            Assert.assertTrue(ex.getMessage().contains("Human readable check digit is incorrect"));
            return;
        }
        Assert.fail("Dont go here.");
    }

    @Test
    public void fail11()
    {
        try
        {
            BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.AUSTRALIAN_POSTE_PARCEL, "997123456789012345678901A5678");
            gen.generateBarCodeImage();
        } catch (BarCodeException ex)
        {
            Assert.assertTrue(ex.getMessage().contains("Available character is incorrect"));
            return;
        }
        Assert.fail("Dont go here.");
    }

    @Test
    public void fail12()
    {
        try
        {
            BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.AUSTRALIAN_POSTE_PARCEL, "9971234567890123456789010AAAA");
            gen.generateBarCodeImage();
        } catch (BarCodeException ex)
        {
            Assert.assertTrue(ex.getMessage().contains("Destination postcode is incorrect"));
            return;
        }
        Assert.fail("Dont go here.");
    }
}

