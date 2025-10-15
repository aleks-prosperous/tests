package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;

public class Issue34190
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue34190");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testIssue34190SwissPostParcelPngSwissPostParcel()
    {
        BarCodeReader reader = new BarCodeReader(folder + "SwissPostParcel.png", DecodeType.SWISS_POST_PARCEL);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("994299671234561789", reader.getFoundBarCodes()[0].getCodeText());
        System.out.println("Test for \"Issue34190\\SwissPostParcel.png\" has completed successfully.");
    }
}
