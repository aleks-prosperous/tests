package com.aspose.external.barcode.tester.releases.v18_5;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;

public class Issue36869
{
    /// <summary>
    /// Path to folder with files for testing Issue36869.
    /// </summary>
//    private static final String Folder = Global.getRelativeTestDataFolder("Issues\\Issue36869");
    private static final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue36869");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }


    @Test
    public void test_MicrE13B_CsFile()
    {
        String file = Global.pathCombine(folder, "000_000000.cs.png");
        BarCodeReader reader = new BarCodeReader(file, DecodeType.MICR_E_13_B);
        Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
    }

    @Test
    public void test_AllSupportedTypes_CsFile()
    {
        String file = Global.pathCombine(folder, "000_000000.cs.png");
        BarCodeReader reader = new BarCodeReader(file);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("000000", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test_MicrE13B_Cpp1AFile()
    {
        String file = Global.pathCombine(folder, "1A_000001.cpp.png");
        BarCodeReader reader = new BarCodeReader(file, DecodeType.MICR_E_13_B);
        Assert.assertEquals(reader.readBarCodes().length, 0, "false is ok");
    }

    @Test
    public void test_AllSupportedTypes_Cpp1AFile()
    {
        String file = Global.pathCombine(folder, "1A_000001.cpp.png");
        BarCodeReader reader = new BarCodeReader(file);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("000001", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test_AllSupportedTypes_Cpp1File()
    {
        String file = Global.pathCombine(folder, "1_000001.cpp.png");
        BarCodeReader reader = new BarCodeReader(file);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("000001", reader.getFoundBarCodes()[0].getCodeText());
    }
}
