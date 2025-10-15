package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;


@Test(description = "Tests for Issue-33169.")
public class Issue33169
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33169");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testdocument_code128()
    {
        String fileName = Global.pathCombine(folder, "document_code128.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("What about your 10,000 promises ?", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testdocument_code128_short()
    {
        String fileName = Global.pathCombine(folder, "document_code128_short.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("My life", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test20120216142419172()
    {
        String fileName = Global.pathCombine(folder, "20120216142419172.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39);
        Assert.assertEquals(reader.readBarCodes().length, 2);
        Assert.assertEquals("DTID%127", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals("OID%707095", reader.getFoundBarCodes()[1].getCodeText());
    }

    @Test
    public void test20120217093924801()
    {
        String fileName = Global.pathCombine(folder, "20120217093924801.tif");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_39);
        Assert.assertEquals(reader.readBarCodes().length, 2);
        Assert.assertEquals("DTID%127", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals("OID%707095", reader.getFoundBarCodes()[1].getCodeText());
    }
}

