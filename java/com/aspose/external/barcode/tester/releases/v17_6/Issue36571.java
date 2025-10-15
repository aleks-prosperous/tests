package com.aspose.external.barcode.tester.releases.v17_6;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.SingleDecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Issue36571
{
    /**
     * Path to folder with files for testing Issue36571.
     */
    private String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue36571");

    /**
     * Prepares to run these tests
     */
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testReadEAN13WithSupplement1()
    {
        String fileName = Global.pathCombine(folder, "_XXXX_BKSK_2017_07.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.EAN_13, DecodeType.SUPPLEMENT);
        checkRecognitionResultEan13Supplement(reader, "9772541755008", "00717");

    }

    @Test
    public void testReadISNNWithSupplement1()
    {
        String fileName = Global.pathCombine(folder, "_XXXX_BKSK_2017_07.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ISSN, DecodeType.SUPPLEMENT);
        CheckRecognitionResultISSNSupplement(reader, "2541755X", "00717");

    }

    @Test
    public void testReadISNNWithSupplement1Cut()
    {
        String fileName = Global.pathCombine(folder, "_XXXX_BKSK_2017_07_cut.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.ISSN, DecodeType.SUPPLEMENT);
        CheckRecognitionResultISSNSupplement(reader, "2541755X", "00717");
    }

    @Test
    public void testReadEAN13WithSupplement1Cut()
    {
        String fileName = Global.pathCombine(folder, "_XXXX_BKSK_2017_07_cut.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.SUPPLEMENT);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("00717", reader.getFoundBarCodes()[0].getCodeText());

    }

    @Test
    public void testReadEAN13WithSupplement2()
    {
        String fileName = Global.pathCombine(folder, "_XXXX_LTRO_2017_08.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.EAN_13, DecodeType.SUPPLEMENT);

        checkRecognitionResultEan13Supplement(reader, "9771998492009", "00817");

    }

    @Test
    public void testReadEAN13WithSupplement2Cut()
    {
        String fileName = Global.pathCombine(folder, "_XXXX_LTRO_2017_08_cut.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.EAN_13, DecodeType.SUPPLEMENT);

        checkRecognitionResultEan13Supplement(reader, "9771998492009", "00817");

    }

    @Test
    public void testReadEAN13WithSupplement3()
    {
        String fileName = Global.pathCombine(folder, "_XXXX_RGSU_2017_07.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.EAN_13, DecodeType.SUPPLEMENT);

        checkRecognitionResultEan13Supplement(reader, "9772542239002", "00717");
    }

    @Test
    public void testReadEAN13WithSupplement3Cut()
    {
        String fileName = Global.pathCombine(folder, "_XXXX_RGSU_2017_07_cut.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.EAN_13, DecodeType.SUPPLEMENT);

        checkRecognitionResultEan13Supplement(reader, "9772542239002", "00717");

    }

    private void checkRecognitionResultEan13Supplement(BarCodeReader reader, String expectedEan13, String expectedSupplement)
    {
        CheckRecognitionResult(reader, expectedEan13, DecodeType.EAN_13, expectedSupplement);
    }

    private void CheckRecognitionResultISSNSupplement(BarCodeReader reader, String expectedISSN, String expectedSupplement)
    {
        CheckRecognitionResult(reader, expectedISSN, DecodeType.ISSN, expectedSupplement);
    }

    private void CheckRecognitionResult(BarCodeReader reader, String firstExpected, SingleDecodeType decodeType, String expectedSupplement)
    {
        List<String> actualData = new ArrayList<String>();
        for(BarCodeResult result : reader.readBarCodes())
        actualData.add(result.getCodeText() + " " + result.getCodeType().toString());

        Assert.assertEquals(2, actualData.size(), "Incorrect number of recognized barcodes.");
        Assert.assertTrue(actualData.contains(firstExpected + " " + decodeType), String.format("Not recognized %s (%s)", decodeType, firstExpected));
        Assert.assertTrue(actualData.contains(expectedSupplement + " " + DecodeType.SUPPLEMENT), String.format("Not recognized %s (%s)", DecodeType.SUPPLEMENT, expectedSupplement));
    }
}
