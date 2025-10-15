package com.aspose.external.barcode.tester.releases.v24_5;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.licensing.LicenseType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class Issue38878
{
    private final String Folder = Global.getTestDataFolder("Issues/Issue38878");

    @BeforeMethod
    public void setUp(Method testMethod)
    {
        utils.LicenseAssistant.setupLicense(LicenseType.Total);
    }

    @Test
    public void test_CodetextWithUnicode()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "image.png"), DecodeType.QR);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("SPC\n0200\n1\nDK5030000010745136\nK\n Creditor Name: Ɋ  ɈJ \nCreditor Address Line 1: MorgenstrasseɊ131 3018 Bern\nCreditor Address Line 2: Ωω Ψψ Χχ Φφ Σσ /ς Ρρ Π π Ξ ξ Μ μ Λ λ Θ θ Η η \n\n\nCH\n\n\n\n\n\n\n\n1234.00\nCHF\nK\nDebtor Name: ɊÅØÆ\nDebtor Address Line 1: ÄÖÜßɊ\nDebtor Address Line 2: Ε ε Δ δ Γ γ Β β  Α α ёЁ Ґґ\n\n\nCH\nQRR\nref\nAdditional unstructered message: 민족문화상징\nEPD\nBill information: 汉字 漢字", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    @Test
    public void test_CodetextWithUnicode2()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "2023-07-19_17-00-12.png"), DecodeType.QR);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("你好", reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
