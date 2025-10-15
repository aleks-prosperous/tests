package com.aspose.external.barcode.tester.releases.v19_10;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.BaseDecodeType;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.util.ArrayList;
import java.util.List;

public class Issue37198
{
    /// <summary>
    /// Path to folder with files for testing Issue37198.
    /// </summary>
    private String Folder = Global.getIssuesTestImagePath("Issue37198");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    private void testRecognizedImage(String aFolder, String aFilename, BaseDecodeType aDecodeType, String CodeText)
    {
        String fileName = Global.pathCombine(aFolder, aFilename);
        BarCodeReader reader = new BarCodeReader(fileName, aDecodeType);
        {
            List<String> lCodetexts = new ArrayList<>();
            for(BarCodeResult result : reader.readBarCodes())
                lCodetexts.add(result.getCodeText());

            Assert.assertEquals(1, lCodetexts.size(), "Recognition of " + aFilename + " failed");
            Assert.assertEquals(lCodetexts.get(0).replace('\r', '\n'),CodeText);
        }
    }

    private void testFailedImage(String aFolder, String aFilename, BaseDecodeType aDecodeType)
    {
        String fileName = Global.pathCombine(aFolder, aFilename);
        BarCodeReader reader = new BarCodeReader(fileName, aDecodeType);
        {
            List<String> lCodetexts = new ArrayList<String>();
            for(BarCodeResult result : reader.readBarCodes())
            lCodetexts.add(result.getCodeText());

            Assert.assertEquals(0, lCodetexts.size(), aFilename + " is ok, need to fix this test");
        }
    }

        @Test
    public void test_PDF417_IMG_20190128_WA0003()
    {
        String lCodetext = "Ver_7.0000IfNaeVTA02\u0001&5M[àÛ\u008E\u0091F;Êp÷ÁÐF)m±\u0092à¶±ã\u0016\u0092\u0099á\u001A¼§P\n" +
                "\u0006\u009F$yÐ5á^\u0088\u0016^ØÓç£\u000Bg\u001B\u008BG¸\u0004y\u0084\u0004TYGÝ±EóÐH\u0012\u0091$\u0013\u00AD\u0017\u00ADpf\u0092\u00822båÜ\u0001Ã\u00199kØKÈ9Ý\u009Fû\u001BÁÙÐ§N¦à¨(¼zM87\n" +
                "K\u0083Â ²à¦\\\u0018IÆ\u0012·ÎÆm©^×ñu(ÂÅå@\u0000zq¤IÎ%G×\u0088\u0096\u0089\u0082DÒ\u0081(}È}ðÍ¬zR\u001C¼?®=\u0080Uµcæ\u0099Õ\u008DÀÖÐX{ßw£\u009CºÒ\u0013;\u000EoÒxð\u008FåÓ\fx1¿m\u0006»-ñ°\u0088KáÍR&s1àcÎå'¹× \u0018Ä\u0005e¼\t'³Ò¼\u0086ÉÏlð÷\u008Ai!G¥\u0086\u0084c\"ý\u0085\u009E\u0093þ&Å\t\u009D3ôòp¬Qd¤\t±Ô\u0080þV\u008AØ\u0084\u0081¤w\n" +
                "îjTl\u0002\u0088Ãh\u0086\u0003L`\u0080\u001E°G\u009COÔ\u008E\u0092\u00AD®hY\u009Dw\u001AH\u0094\f\u000B\u0006§\u0089Ï|à;%ëH\u001CuN\u0011òKHÌjÎ®âS\u0006ØI\u000ETú1\u0013õÐt\u0085Ñu<2lðôYzLßÞ¶\u001EP\u007FG\u001CÊµ>>Ì\u0017B8¥\u000F¢¨1\b8¾p\u0095k\u0090>ÍA\u0019<L@B\u0094t¤XÖç/\u0015è\u0093ïÁ\u0086X\u009CÞÖ@è²d¤\u0080¡\u0092ÔöOÏïµ\u0011SZéÐª^\f\u009Cù-As¡\u00ADÆ\u009D®\u001D\n" +
                "Í\"eyÓ\u0089&o» Â,¯bÞ2\u0092Î\u0013Nô <ófó\u0083\\þí\u009E\u0081#h\u0013£ºÅ\u000Br\u0095n³ÞåqüVÃØ\u009C²Á\u0007.¿\u0002Õ\u0088\u001E\u0016V¢\u0082z\u0018ñÄÑõ'\u009C\n" +
                "\u0001Yh\u008E¬Ò[`[ØÇÃ\\Ø=ÿX\u0096£\u008AÌ\u0003\t\u000Bs\f¿d\u0092WE¥0\u001A\u001Bð²]\u000EÈI\u007Fñ¾DÖ\u008A;RO´\u0011!³'Q\u008C°\u0089§Òµé\u001CÊ_ Ð\u0003áÄ#\u001Aw\u0019ñ\u0081*a±\t¨¤\u009DìÕ\u008DÈóÓ)ò\u008Fù\u001B\u0091XÐ[ù\b\f\b©Ï\u00177ì\u0003?5#,ö|Í,éå)þÈ=ô\u001D#í\u0096ú?ûm[\"W§\u001E\fX G#\u0010\u0083\u0084ËÙßKä\u0083ò\u0013.Ü«>¸Ê\u0017»úü\u008F¼-\u0084ÊnúÐ\u0007\u008F\u0012ÿ\u0082Fk\u008E\n" +
                "á®Ý #¶Õ\u0011è \"\u0013r\u0098\u001Dh\u009C 8sÝ\u001B m\u0092þÚj¤cn\u009D\u00872ëÜB0^N\u0089[H.V_2%¼æe½ïÔ¶\u008BÒ\u0017ßO-#\u001EÉÀÿðl¶Ù\u0090Oºõ\u008A\u0006s<=Í\u0005\u001F¡\u0003éR8PSKàxä_ãÿ\u0095$GñÆ[\u0086\u0014yÙ+³Ãdç¢ñàh\u0098\u0084Ì\b\u0099\u009C\t<è\u008B÷s\u0019Åq\u000FWÌ¥rxTì\f\u007Fü7Õ*0ÌØ\u0005\\ÿà\u008A\u0007\u0007\u0080\u0013J>s\u001D.UNå]xt\u0088\t7\u0000\n" +
                "@\u000386Ë\u009BZ\u0001óÒ\u0094\u009C´vHÍ\u0093K¿\n" +
                "\u0099ÍÛ\u001C©²|?©e4EÃ÷ºÙ@\u008DA\u0004\u009C\u0019pËï\u00ADËeÓÒQëÎ\u008B=\u0001Ô(È\"ëy\u008E\u009Fz?å\u000F¦ís\u0000À\u0010a1×\u001C\u0084&\u0084\u0018\u009D¯!ti\f[\u008FúêíDû";
        testRecognizedImage(Folder, "IMG-20190128-WA0003.jpg", DecodeType.PDF_417, lCodetext.replace('\r', '\n'));
    }

        @Test
    public void test_PDF417_TempCard_Red()
    {
        String lCodetext = "@\n" +
                "\u001E\n" +
                "ANSI 636061050002DL00430287ZW03300013DLDCA3\n" +
                "DCBA\n" +
                "DCDNONE\n" +
                "DBA03312021\n" +
                "DCSSAMPLE\n" +
                "DACTINA\n" +
                "DADA\n" +
                "DBD03282016\n" +
                "DBB03281996\n" +
                "DBC2\n" +
                "DAYGRN\n" +
                "DAU67 in \n" +
                "DAG123 ANYSTREET\n" +
                "DAIANYCITY\n" +
                "DAJAA\n" +
                "DAK000000000  \n" +
                "DAQY999999\n" +
                "DCF20160412115517MARKS072015\n" +
                "DCGUSA\n" +
                "DDEU\n" +
                "DDFU\n" +
                "DDGU\n" +
                "DAH\n" +
                "DAZBRO\n" +
                "DCJ\n" +
                "DDAM\n" +
                "DDB01011753\n" +
                "DAW120\n" +
                "DDH03282014\n" +
                "DDI03282015\n" +
                "DDJ03282017\n" +
                "ZWZWAWVDL_DL\n";
        testRecognizedImage(Folder, "TempCard_Red.jpg", DecodeType.PDF_417, lCodetext.replace('\r', '\n'));
    }

        @Test
    public void test_PDF417_USADL1()
    {
        String lCodetext = "@\n\u001e\rANSI 6360100102DL00390196ZF02350052DLDAALICENSE,SAMPLE,DRIVER\nDAG2900 APALACHEE PKWY\nDAITALLAHASSEE\nDAJFL\nDAK32399-6552 \nDAQL252784655541\nDARE   \nDAS          \nDAT     \nDBA20120214\nDBB19650214\nDBC2\nDBD20061121\nDBHN         \nDAU507\rZFZFADUPLICATE: 20080715\nZFB \nZFCQ010807150020\nZFD \r";
        testRecognizedImage(Folder, "USADL1.png", DecodeType.PDF_417, lCodetext.replace('\r', '\n'));
    }

        @Test
    public void test_PDF417_USADL2()
    {
        String lCodetext = "@\n\u001e\rANSI 6360100102DL00390201ZF02400052DLDAASAMPLE,IDENTIFICATION,CARD\nDAG2900 APALACHEE PKWY\nDAITALLAHASSEE\nDAJFL\nDAK32399-6552 \nDAQS514403827471\nDARI   \nDAS          \nDAT     \nDBA20110707\nDBB19820707\nDBC2\nDBD20070502\nDBHN         \nDAU507\rZFZFADUPLICATE: 20070504\nZFB \nZFCQ010705040016\nZFD \r";
        testRecognizedImage(Folder, "USADL2.png", DecodeType.PDF_417, lCodetext.replace('\r', '\n'));
    }

        @Test
    public void test_PDF417_WhatsApp()
    {
        String lCodetext = "@\n\u001e\rANSI 636002080002DL00410268ZM03090033DLDCAD\nDCBB\nDCDNONE\nDBA07242023\nDCSLEUNG\nDACRICHARD\nDADNONE\nDBD07242018\nDBB07241970\nDBC1\nDAYBRO\nDAU069 in\nDAG14 APPLETON ST\nDAHAPT 3\nDAIQUINCY\nDAJMA\nDAK021712047  \nDAQS98863733\nDCF07242018 REV 02222016\nDCGUSA\nDDEN\nDDFN\nDDGN\nDCK18205S988637330601\nDDAF\nDDB02222016\nDDK1\rZMZMA509\nZMB07242018\nZMC\nZMD\nZME\r";
        testRecognizedImage(Folder, "WhatsApp Image 2018-12-12 at 3.00.04 PM.jpeg", DecodeType.PDF_417, lCodetext.replace('\r', '\n'));
    }
}
