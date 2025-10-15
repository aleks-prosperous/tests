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
 * Tests Issue 33869 tests.
 * </p>
 */
@Test(description = "Tests for Issue33869.")
public class Issue33869
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33869");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    /**
     * <p>
     * The main test for issue 33896.
     * </p>
     */
    @Test
    public void testIassue()
    {
        String fileName = Global.pathCombine(folder, "1.tif");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PDF_417);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("Segundo|Gonzalez|11797 102nd Trce|Live Oak|FL|32060-6787|62| |RP7035", reader.getFoundBarCodes()[0].getCodeText());
    }

    /**
     * <p>
     * Tests cutted image "1.tif" from issue 33896.
     * </p>
     */
    @Test
    public void testCutted()
    {
        String fileName = Global.pathCombine(folder, "1_cutted.tif");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PDF_417);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("Segundo|Gonzalez|11797 102nd Trce|Live Oak|FL|32060-6787|62| |RP7035", reader.getFoundBarCodes()[0].getCodeText());

    }


    /**
     * <p>
     * Tests changed (manualy) image "1.tif" from issue 33896.
     * </p>
     */
    @Test
    public void testChanged()
    {
        String fileName = Global.pathCombine(folder, "changed.png");
        final BarCodeReader reader = new BarCodeReader(fileName, DecodeType.PDF_417);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("Segundo|Gonzalez|11797 102nd Trce|Live Oak|FL|32060-6787|62| |RP7035", reader.getFoundBarCodes()[0].getCodeText());

    }

}

