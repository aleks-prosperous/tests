package com.aspose.external.barcode.tester.releases.v80;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.DeconvolutionMode;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class Issue34163
{
    final String Folder = Global.getTestDataFolder("Issues/Issue34163");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    @Test
    public void test() throws IOException
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.Folder, "test1_orig.jpg"), DecodeType.AZTEC);
        {
            reader.getQualitySettings().setDeconvolution(DeconvolutionMode.SLOW);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("IwQAANtYAAJDAP8xAHwAQgBBAPtLADAAORr3NgA4Ar00KjHaCho19y4zIm8eUABSAP5FAFoAWQBE/w5OAFQAIPcATQAuCu9TAFQPvVeOUu8aWg5Xe058UrUWSe9aTF5Je9pBSt1CErsOQQFPBvcYAUsWbk5VAEz2g569T2ZM1lcBjr5LXzEOLjfgRtcPLRrtMgAy1xuHr1dba1I2Tt8zY1R7mlkG3lQ/zQND7x5SBkzfAExfMnvuMA7eRLY07QpCSnBe5w8bQUVa2DAD7zWuMg83uDIadD8tESveMCot9gMOg0fbwUH7d0u6BpODVGOHf0FOH9gnBaFzBmO8OLtaDzL4BzKtP5bzGrw59zAfSyMS0LpF8b9Ni0q75zh+3kMONQhzqDbS7DcANBNYoR8eZ4o1Qw2GDzLxO0+7fAA0YkvH8685JixvPzYAsTYX8UQAINgP8BP0DzQfpzMAsHz3cFNoUsCru05IANNr7k8m0wZCpkdBF0uXLSM3OdqXN0F9AzheQzjwvjbdjzJWQ+4DOAAwSwzLs0d8aydmA05C2TO+OQsyW3eCSSSSSoD/AA==f", reader.getFoundBarCodes()[0].getCodeText());
        }
        System.out.println("Test for \"Issue34163\\test1_orig.jpg\" has completed successfully.");}
}
