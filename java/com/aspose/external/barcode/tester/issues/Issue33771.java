package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


@Test(description = "Tests for Issue33771.")
public class Issue33771
{
    final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33771");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }


    @Test
    public void test()
    {
        String fileName = Global.pathCombine(folder, "tmp466F.pdf.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("4009885854", reader.getFoundBarCodes()[0].getCodeText());
    }


    @Test
    public void testAllSupportedTypes()
    {
        List<BaseDecodeType> readTypes = new ArrayList<BaseDecodeType>();
        List<String> codetexts = new ArrayList<String>();
        String fileName = Global.pathCombine(folder, "tmp466F.pdf.png");
        BarCodeReader reader = new BarCodeReader(fileName);
        reader.getQualitySettings().setXDimension(XDimensionMode.SMALL);
        {
            for(BarCodeResult result : reader.readBarCodes())
            {
                readTypes.add(result.getCodeType());
                codetexts.add(result.getCodeText());
            }
            Assert.assertTrue(codetexts.contains("4009885854"));
            Assert.assertEquals(1, codetexts.size());
        }
    }
}

