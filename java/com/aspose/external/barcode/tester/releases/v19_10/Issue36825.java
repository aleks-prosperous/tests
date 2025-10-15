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

public class Issue36825
{
    /// <summary>
    /// Path to folder with files for testing Issue36825.
    /// </summary>
    private String Folder = Global.getIssuesTestImagePath("Issue36825");

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
            List<String> lCodetexts = new ArrayList<>();
            for(BarCodeResult result : reader.readBarCodes())
            lCodetexts.add(result.getCodeText());

            Assert.assertEquals(0, lCodetexts.size(), aFilename + " is ok, need to fix this test");
        }
    }

    @Test
    public void test_PDF417_Image1()
    {
        String lCodetext = "0001022379294B1 C1 A2        C CARDOZO                  LOPEZ                    ANGEL                    2Ã¿Ã\u0098Ã¿Ã \u0000\u0010JFIF\u0000\u0001\u0001\u0001\u0000`\u0000`\u0000\u0000Ã¿Ã\u009B\u0000C\u0000\b\u0006\u0006\u0007\u0006\u0005\b\u0007\u0007\u0007\t\t\b\n" +
                "\f\u0014\n" +
                "\f\u000B\u000B\f\u0019\u0012\u0013\u000F\u0014\u001D\u001A\u001F\u001E\u001D\u001A\u001C\u001C $.' \",#\u001C\u001C(7),01444\u001F'0Ã¿Ã\u0098Ã¿Ã \u0000\u0010JFIF\u0000\u0001\u0001\u0001\u0000`\u0000`\u0000\u0000Ã¿Ã\u009B\u0000C\u0000\b\u0006\u0006\u0007\u0006\u0005\b\u0007\u0007\u0007\t\t\b\n" +
                "\f\u0014\n" +
                "\f\u000B\u000B\f\u0019\u0012\u0013\u000F\u0014\u001D\u001A\u001F\u001E\u001D\u001A\u001C\u001C $.' \",#\u001C\u001C(7),01444\u001F'";
        testRecognizedImage(Folder, "1a1fb9ca-7b48-434e-9977-40076549441c.jpg", DecodeType.PDF_417, lCodetext.replace('\r', '\n'));
    }

    @Test
    public void test_PDF417_Image2()
    {
        String lCodetext = "0325398221\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000PubDSK_1\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000359294\u0000\u00001022379294CARDOZO\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000LOPEZ\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000ANGEL\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000YESID\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00000M19921107150010A+\u00002\u0002C\u0000\u008B\\ÿ\u0080\u0080ylr³\u0082s[\u008EÓVG|±c¹fÊ¥ÜpÈUÐLØ\u0080Ù\u0088¯UÃ6µ3¸L\u009DZaP\u0098_¤7¨NwR\u0093U\u00974w¢\u0095\u0095\u009F¨l´\u0092Ã\u009C\u008F\u0095p u¤\u008Bª\u0081«Á¬\u0095®º¶¤T\u0089¯u¸\u008B¼®E|¼¸¹{ºo»\u009D½lÄª¾\u0087¾\u009FÇ\u0095ÑeàaË\u0094Õ\u0088KkZi\\`dLhg\u0082Rgmud\u0083e\u009EÛÎJ\u0092\u0085ñ?E\u0081BRBÕg\u0094ÿ\u00007\u0002C\u0000¡[ÿ\u0080\u0080\u0080\u0080\u0086}\u008CÏU¸\u008E±G\u008BY\u0084;\u008A^}Ý\u009CÉ{±sßzÆdnr8g¿b¦pÊUAY¦j·\\Î?WO®2ÃLÄA£<©_UAUMoY\u009DT£[£h¥I}^\u0090Â\u0098ÁL´\u009E¶¬¾£«¦\u0094²²^\u008Eµ\u009F¿Á«\u008CÈ´º\u009EÓv×rÈ\u0098Ó£Ò\u008BÞ\u008B®;½9¥6\\J\u0097l\u009ABK@`M\u0089zt`çòIÍ\u0096\u0084\u0090\u0080ý[\u008CHdþ)¢ÿ\u0000M©T\u0083q\\©\u0099i^ûbáiy\u0001Ð\u0097\u008BAE/\u0013\u00821\"\u0095æ$ G\u00830\u0014\u007F497#b";
        testRecognizedImage(Folder, "b570629f-098c-4bf6-991d-17ac0bb021d3.jpg", DecodeType.PDF_417, lCodetext);
    }
}