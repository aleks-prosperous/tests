package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;


@Test(description = "Tests for Issue-Issue29718.")
public class Issue29718
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue29718");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testPDF417WithEmptyDataRow()
    {
        final String codeText = "UniqueID:18597734-8B5E-41C5-AF25-D7072E06924D|DocumentCategory:Accounting|DocumentName:Doc Stamp|FileNumber:001039F01";
        final String file = "Pdf417EmptyWords.bmp";
        String fullPath = Global.pathCombine(folder, file);
        recognize(fullPath, codeText);
    }

    private void recognize(String fullPath, String requiredCodeText)
    {
        final BarCodeReader reader = new BarCodeReader(fullPath, DecodeType.PDF_417);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(requiredCodeText, reader.getFoundBarCodes()[0].getCodeText());
    }
}


