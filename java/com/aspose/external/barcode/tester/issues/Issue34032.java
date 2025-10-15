package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;


/**
 * <p>
 * Tests Issue34032 tests. Performance issue while reading PDF417 and Code128 codes
 * </p>
 */
public class Issue34032
{
    private static final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue34032");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    /**
     * <p>
     * Tests recognition of image 20141029152021675_00052.tif
     * </p>
     */
    @Test
    public void recognitionBigPicture()
    {
        String fileName = Global.pathCombine(folder, "20141029152021675_00052.tif");

        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PDF_417, DecodeType.CODE_128);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("EXP|KY|IRTF|2|1172|2013|1|A55|!", reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals(DecodeType.CODE_128, reader.getFoundBarCodes()[0].getCodeType());
    }
}

