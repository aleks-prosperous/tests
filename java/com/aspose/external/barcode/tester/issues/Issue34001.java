package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.QualitySettings;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


/**
 * <p>
 * Tests Issue34001 tests. Incorrect recognition of a linear code from JPG image
 * </p>
 */
@Test(description = "Tests for Issue34001.")
public class Issue34001
{
    /**
     * <p>
     * Path to generatedFolder with files for testing Issue34001.
     * </p>
     */
    private final String folder = Global.getTestDataFolder("Issues/Issue34001");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

    /**
     * <p>
     * Tests recogntion with symbology Code128.
     * The picture "c3.jpg" can be recognized.
     * </p>
     */
    @Test
    public void testRecognitionAsCode128()
    {
        String fileName = Global.pathCombine(folder, "c3.jpg");

        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("<FNC1>4157707212489953802013023010122029", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals(DecodeType.CODE_128, reader.getFoundBarCodes()[0].getCodeType());
    }

    /**
     * <p>
     * Tests recogntion without EncodeTypes.
     * The picture "c3.jpg" can be recognized.
     * </p>
     */
    @Test
    public void testRecognitionFromAll()
    {
        String fileName = Global.pathCombine(folder, "c3.jpg");
        final BarCodeReader reader = new BarCodeReader(fileName);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("(415)7707212489953(8020)13023010122029", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals(DecodeType.GS_1_CODE_128, reader.getFoundBarCodes()[0].getCodeType());
    }

    /**
     * <p>
     * Tests recogntion a picture with high quality.
     * </p>
     */
    @Test
    public void testRecognitionHighQuality()
    {
        String fileName = Global.pathCombine(folder, "c3right.png");

        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
        reader.setQualitySettings(QualitySettings.getHighPerformance());
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("<FNC1>4157707212489953802013023010122029", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals(DecodeType.CODE_128, reader.getFoundBarCodes()[0].getCodeType());
    }
}

