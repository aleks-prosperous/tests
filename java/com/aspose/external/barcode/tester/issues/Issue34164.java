package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;

public class Issue34164
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue34164");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testIssue34164Test1MonoPngAztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.folder, "test1_mono.png"), DecodeType.AZTEC);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("IwQAANtYAAJDAP8xAHwAQgBBAPtLADAAORr3NgA4Ar00KjHaCho19y4zIm8eUABSAP5FAFoAWQBE/w5OAFQAIPcATQAuCu9TAFQPvVeOUu8aWg5Xe058UrUWSe9aTF5Je9pBSt1CErsOQQFPBvcYAUsWbk5VAEz2g569T2ZM1lcBjr5LXzEOLjfgRtcPLRrtMgAy1xuHr1dba1I2Tt8zY1R7mlkG3lQ/zQND7x5SBkzfAExfMnvuMA7eRLY07QpCSnBe5w8bQUVa2DAD7zWuMg83uDIadD8tESveMCot9gMOg0fbwUH7d0u6BpODVGOHf0FOH9gnBaFzBmO8OLtaDzL4BzKtP5bzGrw59zAfSyMS0LpF8b9Ni0q75zh+3kMONQhzqDbS7DcANBNYoR8eZ4o1Qw2GDzLxO0+7fAA0YkvH8685JixvPzYAsTYX8UQAINgP8BP0DzQfpzMAsHz3cFNoUsCru05IANNr7k8m0wZCpkdBF0uXLSM3OdqXN0F9AzheQzjwvjbdjzJWQ+4DOAAwSwzLs0d8aydmA05C2TO+OQsyW3eCSSSSSoD/AA==f", reader.getFoundBarCodes()[0].getCodeText());
        }
        System.out.println("Test for \"Issue34164\\test1_mono.png\" has completed successfully.");
    }
}
