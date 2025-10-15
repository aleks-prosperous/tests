//-----------------------------------------------------------------------------------------------------------
// <copyright file="Issue33322.cs" company="Aspose Pty Ltd" author="A. Tyutyunik" date="29.08.2012 15:43:46">
//     Copyright (c) 2001-2011 Aspose Pty Ltd. All rights reserved.
// </copyright>
//-----------------------------------------------------------------------------------------------------------

package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;


@Test(description = "Tests for Issue-33322.")
public class Issue33322
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33322");

    private static final String CodeText = "~Name=Level M|~Email=jhatten@somewhere.com|~Site=http://agwsvr01/Sites/bda/|~Organizational Unit=Accounts Receivable|~Organizational Unit GUID={A1EFFECA-AEA2-4156-879C-E0667739E286}|~Library=Invoices|~Library GUID={8AF7CC6D-06A4-48B5-9781-7BD2EBC07801}|~Document Type=Voucher|~Document Type GUID={7F175688-C9EF-4242-AA21-5D97A9971078}|~Content Type GUID={8024AE28-09BC-46A6-A4A1-0F6BAF4CB7C4}|~~|~Invoice Number=234567A|~Amount=$3.14|~Voucher=2";

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void recognize1()
    {
        String fileName = Global.pathCombine(folder, "aspose.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(CodeText, reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void recognize2()
    {
        String fileName = Global.pathCombine(folder, "QR.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(CodeText, reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void recognize3()
    {
        String fileName = Global.pathCombine(folder, "IMG0.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.QR);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(CodeText, reader.getFoundBarCodes()[0].getCodeText());
    }
}

