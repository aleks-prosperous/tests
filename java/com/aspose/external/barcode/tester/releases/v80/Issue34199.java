package com.aspose.external.barcode.tester.releases.v80;

import com.aspose.barcode.auxiliary.Global;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Issue34199
{
    final String Folder = Global.getTestDataFolder("Issues/Issue34199");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
    public void test_Issue34199_1_png_Code128()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.Folder, "1.png"), DecodeType.CODE_128);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            String actualText = reader.getFoundBarCodes()[0].getCodeText();
            Assert.assertEquals("7530009720911", actualText, "Expected and Actual text comparison: @\'Issue34199\\1.png\' failed. ");
        }
        System.out.println("Test for \"Issue34199\\1.png\" has completed successfully.");
    }

        @Test
    public void test_Issue34199_2DBarcodeIssue2_png_DataMatrix()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.Folder, "2DBarcodeIssue2.png"), DecodeType.DATA_MATRIX);
        {
            reader.getQualitySettings().setDeconvolution(DeconvolutionMode.SLOW);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            String actualText = reader.getFoundBarCodes()[0].getCodeText();
            Assert.assertEquals("1847918-1010", actualText, "Expected and Actual text comparison: @\'Issue34199\\2DBarcodeIssue2.png\' failed. ");
        }
        System.out.println("Test for \"Issue34199\\2DBarcodeIssue2.png\" has completed successfully.");
    }

        @Test
    public void test_Issue34199_AztecInvert_png_Aztec()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(this.Folder, "AztecInvert.png"), DecodeType.AZTEC);
        {
            reader.getQualitySettings().setInverseImage(InverseImageMode.ENABLED);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            String actualText = reader.getFoundBarCodes()[0].getCodeText();
            Assert.assertEquals("INVERT IMAGE TEST", actualText, "Expected and Actual text comparison: @\'Issue34199\\AztecInvert.png\' failed. ");
        }
        System.out.println("Test for \"Issue34199\\AztecInvert.png\" has completed successfully.");
    }
}
