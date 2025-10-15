package com.aspose.external.barcode.tester.releases.v25_1;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BaseDecodeType;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.QualitySettings;
import com.aspose.barcode.licensing.LicenseType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.CollectionAssert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Issue37362
{
    /// <summary>
    /// Path to folder with files for testing Issue37362.
    /// </summary>
    private static final String Folder = Global.getTestDataFolder("Issues/Issue37362");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense(LicenseType.Total);
    }

    @Test
        // [Category("Interleaved2of5")]
    public void test_FromCloud1()
    {
        recognize("1-interleaved2of5-969835B8A833631C57DCD082D2FA410A.png", "00010001001382408271743303", DecodeType.INTERLEAVED_2_OF_5, QualitySettings.getHighPerformance());
    }

    @Test
        // [Category("Interleaved2of5")]
    public void test_FromCloud2()
    {
        recognize("1-interleaved2of5-A529B6890064C165B66A10CBE4FE6970.jpeg", "061942400391801080390000000199", DecodeType.INTERLEAVED_2_OF_5, QualitySettings.getHighPerformance());
    }

    @Test
        // [Category("Interleaved2of5")]
    public void test_FromCloud3()
    {
        recognize("1-interleaved2of5-AD60979BB4CD1934F485F92B5B5F7CB5.jpeg", "0820230000696524", DecodeType.INTERLEAVED_2_OF_5, QualitySettings.getNormalQuality());
    }

    @Test
        // [Category("Interleaved2of5")]
    public void test_FromCloud4()
    {
        recognize("1-interleaved2of5-B96D5B676CC0AA666E5068433F45D0FE.jpeg", "000109", DecodeType.INTERLEAVED_2_OF_5, QualitySettings.getHighPerformance());
    }

    @Test
        // [Category("Interleaved2of5")]
    public void test_FromCloud5()
    {
        recognize("1-interleaved2of5-BE67788BE66F773227BE7BF1B70E92E6.jpeg", "101437", DecodeType.INTERLEAVED_2_OF_5, QualitySettings.getHighPerformance());
    }

    @Test
        // [Category("Interleaved2of5")]
    public void test_FromCloud6()
    {
        recognize("1-interleaved2of5-C6129CE5C9683B6AC6F40D410BE60768.jpeg", "20399225141759", DecodeType.INTERLEAVED_2_OF_5, QualitySettings.getHighPerformance());
    }

    @Test
        // [Category("Interleaved2of5")]
    public void test_FromCloud7()
    {
        recognize("1-interleaved2of5-DBE527B800B48A34B70B7CBCB6439731.jpeg", "9014441000106588", DecodeType.INTERLEAVED_2_OF_5, QualitySettings.getHighPerformance());
    }

    @Test
        // [Category("Interleaved2of5")]
    public void test_FromCloud8()
    {
        recognize("1-interleaved2of5-DC5A1699685793BB6A36302E89EEBCCC.png", "10651082071364", DecodeType.INTERLEAVED_2_OF_5, QualitySettings.getHighPerformance());
    }

    @Test
        // [Category("Interleaved2of5")]
    public void test_FromCloud9()
    {
        recognize("1-interleaved2of5-E5AC45B2D5EEEFAA0A16603FAE8BDA3B.jpeg", "091362792890704242070000006998", DecodeType.INTERLEAVED_2_OF_5, QualitySettings.getHighPerformance());
    }

    @Test
        // [Category("Interleaved2of5")]
    public void test_FromCloud10()
    {
        recognize("1-interleaved2of5-E0249266FD6304359957A2A41F04D251.jpeg", "069882790321003282000000002100", DecodeType.INTERLEAVED_2_OF_5, QualitySettings.getHighPerformance());
    }

    @Test
        // [Category("MSI")]
    public void test_FromCloud11()
    {
        recognize("1-msi-1C972B1340E4E380C1AD369E0FABA433.jpeg", "411557002", DecodeType.MSI, QualitySettings.getHighPerformance());
    }

    @Test
        // [Category("MSI")]
    public void test_FromCloud12()
    {
        recognize("1-msi-3F324B328492145C335D8759B81F15C8.jpeg", "239129", DecodeType.MSI, QualitySettings.getHighPerformance());
    }

    @Test
        // [Category("MSI")]
    public void test_FromCloud13()
    {
        recognize("1-msi-8B04377EF4A4AC053F9EC8AE04D53696.png", "1785146", DecodeType.MSI, QualitySettings.getHighPerformance());
    }

    @Test
        // [Category("MSI")]
    public void test_FromCloud14()
    {
        recognize("1-msi-25D885152C2981C5855F8E19B2A7C6D4.jpeg", "411557002", DecodeType.MSI, QualitySettings.getHighPerformance());
    }

    @Test
        // [Category("Standard2of5")]
    public void test_FromCloud15()
    {
        recognize("1-standard2of5-0EBB43B7F1633DB315672498C6611A29.jpeg", "511020240816", DecodeType.STANDARD_2_OF_5, QualitySettings.getHighPerformance());
    }

    @Test
        // [Category("Interleaved2of5")]
    public void test_FromCloud16()
    {
        recognize("2-interleaved2of5-34C4BC05382C33B2F26730BDBBDBD7B4.jpeg", new String[] { "022223871656", "022223871656" }, DecodeType.INTERLEAVED_2_OF_5, QualitySettings.getHighPerformance());
    }

    @Test
        // [Category("Interleaved2of5")]
    public void test_FromCloud17()
    {
        recognize("2-interleaved2of5-C60CA2B5C6701FEAEF79673CE61AFF43.jpeg", new String[] { "118123181181002012070000000799", "118123181191002012000000000876" }, DecodeType.INTERLEAVED_2_OF_5, QualitySettings.getHighPerformance());
    }

    @Test
        // [Category("Interleaved2of5")]
    public void test_FromCloud18()
    {
        recognize("0-interleaved2of5-46F2941AC434196BE1B33D9E97C8D250.jpeg", "126822230451602070340000001949", DecodeType.INTERLEAVED_2_OF_5, QualitySettings.getHighPerformance());
    }

    @Test
        // [Category("Interleaved2of5")]
    public void test_FromCloud19()
    {
        recognize("0-interleaved2of5-B0A172F2E6BB71F7B61FCD6A7B8F71E0.jpeg", "115413127521106282040000001702", DecodeType.INTERLEAVED_2_OF_5, QualitySettings.getHighPerformance());
    }

    @Test
        // [Category("Interleaved2of5")]
    public void test_FromCloud20()
    {
        recognize("1-interleaved2of5-3DF3C6E0BE55EBDA7AFCDA81E8849C87.jpeg", "235685879580214021040000021218", DecodeType.INTERLEAVED_2_OF_5, QualitySettings.getHighPerformance());
    }

    @Test
        // [Category("Interleaved2of5")]
    public void test_FromCloud21()
    {
        recognize("1-interleaved2of5-4E641990D5D3492B2F6D6460D397AB75.png", "7271121234123001", DecodeType.INTERLEAVED_2_OF_5, QualitySettings.getHighPerformance());
    }

    @Test
        // [Category("Interleaved2of5")]
    public void test_FromCloud22()
    {
        recognize("1-interleaved2of5-6E29853F09DEE3DF57BBB5CBCB8F3764.jpeg", "227569079257325992490000021319", DecodeType.INTERLEAVED_2_OF_5, QualitySettings.getHighPerformance());
    }

    @Test
        // [Category("Interleaved2of5")]
    public void test_FromCloud23()
    {
        recognize("1-interleaved2of5-7A2AB7B6D9029E0ED80FAB28F348B9A7.png", "0500000013", DecodeType.INTERLEAVED_2_OF_5, QualitySettings.getHighPerformance());
    }

    @Test
        // [Category("Interleaved2of5")]
    public void test_FromCloud24()
    {
        recognize("1-interleaved2of5-27D13FE869D4293E216D4054F056567B.jpeg", "012340288500255001503900", DecodeType.INTERLEAVED_2_OF_5, QualitySettings.getHighPerformance());
    }

    @Test
        // [Category("Interleaved2of5")]
    public void test_FromCloud25()
    {
        recognize("1-interleaved2of5-42C58CA5284A821E5224E248BCAE8F1E.jpeg", "014236299604255000560000", DecodeType.INTERLEAVED_2_OF_5, QualitySettings.getHighPerformance());
    }

    @Test
        // [Category("Interleaved2of5")]
    public void test_FromCloud26()
    {
        recognize("1-interleaved2of5-60C0A27DFACAAFD80B28F1542C16B968.jpeg", "000055", DecodeType.INTERLEAVED_2_OF_5, QualitySettings.getHighPerformance());
    }

    @Test
        // [Category("Interleaved2of5")]
    public void test_FromCloud27()
    {
        recognize("1-interleaved2of5-61D93A6DAFB312CB6E73ACEA6A20A481.jpeg", "14441000106588", DecodeType.INTERLEAVED_2_OF_5, QualitySettings.getHighPerformance());
    }

    @Test
        // [Category("Interleaved2of5")]
    public void test_FromCloud28()
    {
        recognize("1-interleaved2of5-62B019BC6BBB13BFDAC199CB1B220DB2.jpeg", "032962247822205240330000002760", DecodeType.INTERLEAVED_2_OF_5, QualitySettings.getHighPerformance());
    }

    @Test
        // [Category("Interleaved2of5")]
    public void test_FromCloud29()
    {
        recognize("1-interleaved2of5-974D8BC3EA8206C749F8A88AD382BE99.jpeg", "061942400391801080390000000199", DecodeType.INTERLEAVED_2_OF_5, QualitySettings.getHighPerformance());
    }

    @Test
        // [Category("Interleaved2of5")]
    public void test_FromCloud30()
    {
        recognize("1-interleaved2of5-4373A1FB42C6E3DFEF7837E331A66B5F.jpeg", "34430393093121254900", DecodeType.INTERLEAVED_2_OF_5, QualitySettings.getHighPerformance());
    }

    @Test
        // [Category("Interleaved2of5")]
    public void test_FromCloud31()
    {
        recognize("1-interleaved2of5-501498B04913AF7B43B1D5F1235470D1.jpeg", "045294101381603220360000002899", DecodeType.INTERLEAVED_2_OF_5, QualitySettings.getHighPerformance());
    }

    private void recognize(String fileName, String codeText, BaseDecodeType decodeType, QualitySettings qualitySettings)
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, fileName), decodeType);
        {
            reader.setQualitySettings(qualitySettings);

            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals(decodeType, reader.getFoundBarCodes()[0].getCodeType());
            Assert.assertEquals(codeText, reader.getFoundBarCodes()[0].getCodeText());
        }
    }


    private void recognize(String fileName, String[] codeTexts, BaseDecodeType decodeType, QualitySettings qualitySettings)
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, fileName), decodeType);
        {
            reader.setQualitySettings(qualitySettings);

            Assert.assertEquals(codeTexts.length, reader.readBarCodes().length);
            List<String> actualResults = new ArrayList<>();
            for (int i = 0; i < reader.getFoundBarCodes().length; i++)
            {
                Assert.assertEquals(decodeType, reader.getFoundBarCodes()[i].getCodeType());
                actualResults.add(reader.getFoundBarCodes()[i].getCodeText());
            }
            CollectionAssert.areEquivalent(actualResults, Arrays.asList(codeTexts));
        }
    }
}
