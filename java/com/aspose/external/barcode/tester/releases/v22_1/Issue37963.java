package com.aspose.external.barcode.tester.releases.v22_1;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.BarcodeQualityMode;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.complexbarcode.ComplexBarcodeGenerator;
import com.aspose.barcode.complexbarcode.SwissQRCodetext;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

public class Issue37963
{
    /// <summary>
    /// Path to folder with files for testing Issue37963.
    /// </summary>
    private final static String Folder = Global.getTestDataFolder("Issues\\Issue37963");
    private final static String Etalon = "SPC\n0200\n1\nCH5204835012345671000\nS\nSample Foundation\nP.O. Box\n\n3001\nBern\nCH\n\n\n\n\n\n\n\n\nCHF\n\n\n\n\n\n\n\nNON\n\n\nEPD";

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test_SwissQr_Users_Codetext()
    {
        BarCodeReader reader = new BarCodeReader(Global.pathCombine(Folder, "swissQr.png"), DecodeType.QR);
        reader.getQualitySettings().setBarcodeQuality(BarcodeQualityMode.LOW);
        Assert.assertEquals(1, reader.readBarCodes().length);
        // Check that etalon differs form user's codetext just by symbol 'K'
        // So etalon is the desired codetext
        Assert.assertEquals(new StringBuilder(Etalon).insert(88, "K").toString(), reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void test_SwissQr_Etalon_Codetext()
    {
        SwissQRCodetext bill = new SwissQRCodetext();
        bill.getBill().setAccount("CH5204835012345671000");
        bill.getBill().getCreditor().setCountryCode("CH");
        bill.getBill().getCreditor().setName("Sample Foundation");
        bill.getBill().getCreditor().setPostalCode("3001");
        bill.getBill().getCreditor().setStreet("P.O. Box");
        bill.getBill().getCreditor().setTown("Bern");
        bill.getBill().setCurrency("CHF");
        String codetext = bill.getConstructedCodetext();
        Assert.assertEquals(Etalon, codetext);

        ComplexBarcodeGenerator gen = new ComplexBarcodeGenerator(bill);
        BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.QR);
        BarCodeResult[] readRes = reader.readBarCodes();
        Assert.assertEquals(1, readRes.length);
        Assert.assertEquals(Etalon, readRes[0].getCodeText());
    }
}
