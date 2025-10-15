package com.aspose.external.barcode.tester.releases.v19_4;

import com.aspose.barcode.auxiliary.Global;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;
import utils.TestExternalHelper;

import java.util.ArrayList;
import java.util.List;

public class Issue37053
{
    /// <summary>
    /// Path to folder with files for testing Issue37053.
    /// </summary>
    private static final String folder = Global.getTestDataFolder("Issues\\Issue37053");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
        @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    /// <summary>
    /// Tests recogntion AllSupportedTypes.
    /// </summary>
        @Test
    public void test_172_cut()
    {
        String fileName = Global.pathCombine(folder, "172_cut.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);
        reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Location ID: 853491, Chart ID: 25900945, Member First Name: PAUL, Member Last Name: SCHONEWOLF, DOB: 02/09/1937", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    /// <summary>
    /// Tests recogntion AllSupportedTypes.
    /// </summary>
        @Test
    public void test_188_cut()
    {
        String fileName = Global.pathCombine(folder, "188_cut.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Location ID: 594482, Chart ID: 26189153, Member First Name: NATHALIE J, Member Last Name: LABRECQUE, DOB: 05/31/1968", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    /// <summary>
    /// Tests recogntion AllSupportedTypes.
    /// </summary>
        @Test
    public void test_226_cut()
    {
        String fileName = Global.pathCombine(folder, "226_cut.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Location ID: 644761, Chart ID: 26057955, Member First Name: POLANESIAN, Member Last Name: DANIELS, DOB: 07/03/1970", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    /// <summary>
    /// Tests recogntion AllSupportedTypes.
    /// </summary>
        @Test
    public void test_merged_3()
    {
        String fileName = Global.pathCombine(folder, "merged_3.png");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ALL_SUPPORTED_TYPES);
        reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
        {
            List<String> lCodetexts = new ArrayList<String>();
            for(BarCodeResult result : reader.readBarCodes())
            lCodetexts.add(result.getCodeText());

            Assert.assertEquals(3, lCodetexts.size());
            TestExternalHelper.contains("Location ID: 853491, Chart ID: 25900945, Member First Name: PAUL, Member Last Name: SCHONEWOLF, DOB: 02/09/1937", lCodetexts);
            TestExternalHelper.contains("Location ID: 594482, Chart ID: 26189153, Member First Name: NATHALIE J, Member Last Name: LABRECQUE, DOB: 05/31/1968", lCodetexts);
            TestExternalHelper.contains("Location ID: 644761, Chart ID: 26057955, Member First Name: POLANESIAN, Member Last Name: DANIELS, DOB: 07/03/1970", lCodetexts);
        }
    }

    /// <summary>
    /// Tests recogntion with symbology.
    /// </summary>
        @Test
    public void test_O2181123000172()
    {
        String fileName = Global.pathCombine(folder, "O2181123000172.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, new MultyDecodeType(DecodeType.QR, DecodeType.GS_1_QR));
        reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Location ID: 853491, Chart ID: 25900945, Member First Name: PAUL, Member Last Name: SCHONEWOLF, DOB: 02/09/1937", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    /// <summary>
    /// Tests recogntion with symbology.
    /// </summary>
        @Test
    public void test_O2181123000188()
    {
        String fileName = Global.pathCombine(folder, "O2181123000188.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, new MultyDecodeType(DecodeType.QR, DecodeType.GS_1_QR));
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Location ID: 594482, Chart ID: 26189153, Member First Name: NATHALIE J, Member Last Name: LABRECQUE, DOB: 05/31/1968", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    /// <summary>
    /// Tests recogntion with symbology.
    /// </summary>
        @Test
    public void test_O2181123000226()
    {
        String fileName = Global.pathCombine(folder, "O2181123000226.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, new MultyDecodeType(DecodeType.QR, DecodeType.GS_1_QR));
        {
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("Location ID: 644761, Chart ID: 26057955, Member First Name: POLANESIAN, Member Last Name: DANIELS, DOB: 07/03/1970", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
