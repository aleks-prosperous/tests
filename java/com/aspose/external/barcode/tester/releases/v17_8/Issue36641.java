package com.aspose.external.barcode.tester.releases.v17_8;

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

public class Issue36641
{
    /**
     * <p>
     * Path to folder with files for testing Issue36641.
     * </p>
     */
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue36641");

    /**
     * <p>
     * Prepares to run these tests.
     * </p>
     */
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testReadSupplement()
    {
        String fileName = Global.pathCombine(folder, "OT_2017_31.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.EAN_13, DecodeType.SUPPLEMENT);
        checkRecognitionResultEan13Supplement(reader, "9771560547007", "03217");
    }

    @Test
    public void testReadSupplementFromCuttedAndRotatedPicture()
    {
        String fileName = Global.pathCombine(folder, "OT_2017_31_cuttedAndRotated.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.EAN_13, DecodeType.SUPPLEMENT);
        checkRecognitionResultEan13Supplement(reader, "9771560547007", "03217");
    }

    @Test
    public void testReadOnlySupplementFromCuttedAndRotatedPicture()
    {
        String fileName = Global.pathCombine(folder, "OT_2017_31_cuttedAndRotated.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.SUPPLEMENT);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("03217", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testReadSupplementFromCuttedPicture()
    {
        String fileName = Global.pathCombine(folder, "OT_2017_31_cutted.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.EAN_13, DecodeType.SUPPLEMENT);
        checkRecognitionResultEan13Supplement(reader, "9771560547007", "03217");
    }

    @Test
    public void testReadSupplementFromCuttedPicture2()
    {
        String fileName = Global.pathCombine(folder, "OT_2017_31_cutted2.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.EAN_13, DecodeType.SUPPLEMENT);
        checkRecognitionResultEan13Supplement(reader, "9771560547007", "03217");
    }

    @Test
    public void testReadOnlySupplementFromCuttedPicture2()
    {
        String fileName = Global.pathCombine(folder, "OT_2017_31_cutted2.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.SUPPLEMENT);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("03217", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testReadOnlySupplementFromCuttedAndRotatedPicture2()
    {
        String fileName = Global.pathCombine(folder, "OT_2017_31_cuttedAndRotated2.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.SUPPLEMENT);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("03217", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testReadOnlySupplementFromCuttedAndRotatedPicture3()
    {
        String fileName = Global.pathCombine(folder, "OT_2017_31_cuttedAndRotated3.jpg");
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.SUPPLEMENT);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("03217", reader.getFoundBarCodes()[0].getCodeText());
    }

    private void checkRecognitionResultEan13Supplement(BarCodeReader reader, String expectedEan13, String expectedSupplement)
    {
        checkRecognitionResult(reader, expectedEan13, DecodeType.EAN_13, expectedSupplement);
    }

    private void checkRecognitionResult(BarCodeReader reader, String firstExpected, SingleDecodeType decodeType, String expectedSupplement)
    {
        List<String> actualData = new ArrayList<String>();
        for(BarCodeResult result : reader.readBarCodes())
        actualData.add(result.getCodeText() + " " + result.getCodeType().toString());

        Assert.assertEquals(2, actualData.size(), "Incorrect number of recognized barcodes.");
        Assert.assertTrue(actualData.contains(firstExpected + " " + decodeType), String.format("Not recognized %s (%s)", decodeType, firstExpected));
        Assert.assertTrue(actualData.contains(expectedSupplement + " " + DecodeType.SUPPLEMENT), String.format("Not recognized %s (%s)", DecodeType.SUPPLEMENT, expectedSupplement));
    }
}
