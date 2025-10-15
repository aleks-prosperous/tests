package com.aspose.external.barcode.tester.releases.v19_07;

import com.aspose.barcode.auxiliary.Global;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.CollectionAssert;
import utils.LicenseAssistant;

import java.util.ArrayList;
import java.util.List;

public class Issue37213
{
    /// <summary>
    /// Path to folder with files for testing Issue37213.
    /// </summary>
    private String Folder = Global.getIssuesTestImagePath("Issue37213");
    private String AztecCodetext =
            "#UT011181000040-\u0002\u0015\u0000\u008A\u008D\u001DÛÿç9<\u009E\u0088uì\nK^\u001F\u00AD\u0096#°\u0002\u00140}BXa\u0011õv8¤©ý½´NÜ\u0089/Öc\u0000\u0000\u00000306x\u009CMP_KÃ0\u0010\u007Fï§8ú¼\u0095»$]\u009A>\bÕ\u0015\u001C\u0013\u001Du\u009Dø4êÌl±f£[ÑMüf¾ùÅ¼8\u0090\u0005\u0092\u0090Ëýþ]¹¼Î³1\u0012b,\u0089\u0012\u00122ÑBK-e¬\u008D6\b¼P \u0012H\u0086F\u0094à³\u0005(\u0097ó\u009Bì\u0091A\u0092Dq5\u0017\u00888âM¨b¾Ð¨Å]\u0091BÞ¸£m×UÝí\u0083`¼\u0019\u0000ª\b²m\u0007\u009E\u000Bú7@\u0093\n\u0013¬\u007F¾;°\u008D³ç\u0000hÜ©V4«zß»\u0017ØÔü*Ý>\u008A\"b\u0002$¯ÊÎ&îµ\u008Dà¡±.\u0085©íÜqã,\u0087\u0011ìMq\u0083ÔãÞmë\u0003Ü6UÛ\u0006ô\u0001y÷^\u00ADê\u009Du¶\u000BD\u0004Ó¶Úí,IF\u0010\u0019\u009FÂÌ\u008A|rï\u0083C^\u0016@É\u0080\u0089\u0012\u0096\u0014¤½dìÅ`x\u0011Ìª\u0083í\u009E¢aaÙ¤uUOtÆâg:ô\u001EO\u0087\u0094Fû\u0001\u009B¿\u000F¥?ÃË0\r¹M¡\"!L8\b\u0017ÿ\u0005Ô\\øú\u0005,®kf";

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
        @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    private void TestRecognizedImage(String aFolder, String aFilename, BaseDecodeType aDecodeType, QualitySettings aQuality, int aTimeout, String CodeText)
    {
        String fileName = Global.pathCombine(aFolder, aFilename);
        BarCodeReader reader = new BarCodeReader(fileName, aDecodeType);
        {
            reader.setQualitySettings(aQuality);
            reader.setTimeout(aTimeout);

            List<String> lCodetexts = new ArrayList<>();
            for(BarCodeResult result : reader.readBarCodes())
                lCodetexts.add(result.getCodeText());

            Assert.assertEquals(1, lCodetexts.size(), "Recognition of " + aFilename + " failed");
                        CollectionAssert.contains(CodeText, lCodetexts);
        }
    }

    private void TestNotHungImage(String aFolder, String aFilename, BaseDecodeType aDecodeType, QualitySettings aQuality,
                                  int aTimeout, int RequiredCompletionTime, boolean isIgnoreFakes)
    {
        String fileName = Global.pathCombine(aFolder, aFilename);
        BarCodeReader reader = new BarCodeReader(fileName, aDecodeType);
        {
            reader.setQualitySettings(aQuality);
            reader.setTimeout(aTimeout);

            List<String> lCodetexts = new ArrayList<>();

            long watch = System.currentTimeMillis();

            for(BarCodeResult result : reader.readBarCodes())
                lCodetexts.add(result.getCodeText());

            int lScanDuration = (int) (System.currentTimeMillis() - watch);

            if (!isIgnoreFakes)
                Assert.assertEquals(0, lCodetexts.size(), "found fake");
            if (RequiredCompletionTime < lScanDuration)
                Assert.fail(aFilename + " hungs.");
        }
    }

    @Test
    public void test_seal37213_MSI_NormalQuality()
    {
        TestNotHungImage(Folder, "seal37213.png", DecodeType.MSI, QualitySettings.getNormalQuality(), 20000, 10000, false);
    }

    @Test
    public void test_seal37213_MSI_HighQuality()
    {
        QualitySettings qualitySettings = QualitySettings.getHighQuality();
        TestNotHungImage(Folder, "seal37213.png", DecodeType.MSI, qualitySettings, 20000, 15000, true);
    }

    @Test
    public void test_Page3_MSI_NormalQuality()
    {
        TestNotHungImage(Folder, "Page3.jpg", DecodeType.MSI, QualitySettings.getNormalQuality(), 30000, 20000, false);
    }

    @Test
    public void test_Page3_Aztec_NormalQuality()
    {
        TestRecognizedImage(Folder, "Page3.jpg", DecodeType.AZTEC, QualitySettings.getNormalQuality(), 20000, AztecCodetext);
    }

    @Test
    public void test_Page3_AztecMSICode128_NormalQuality()
    {
        TestRecognizedImage(Folder, "Page3.jpg", new MultyDecodeType(DecodeType.AZTEC, DecodeType.MSI, DecodeType.CODE_128), QualitySettings.getNormalQuality(), 50000, AztecCodetext);
    }
}
