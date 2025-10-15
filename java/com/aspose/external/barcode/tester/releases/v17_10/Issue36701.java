package com.aspose.external.barcode.tester.releases.v17_10;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.File;

public class Issue36701
{
    private String folder = Global.getTestDataFolder("Issues" + File.separatorChar + "Issue36701");

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
    public void testDatabarLimitedWithCorrectCodeText2()
    {
        String codetext = "(01)17777777777779";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATABAR_LIMITED, codetext);
        BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.DATABAR_LIMITED);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals(DecodeType.DATABAR_LIMITED, reader.getFoundBarCodes()[0].getCodeType());
    }

    @Test
    public void testDatabarLimitedIncorrect()
    {
        String fileName = folder + "gen_limited_incorrect.png";
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATABAR_LIMITED);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("(01)17776307870942", reader.getFoundBarCodes()[0].getCodeText());
    }

    @Test
    public void testDatabarLimitedCorrect()
    {
        String fileName = folder + "gen_limited_correct.png";
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATABAR_LIMITED);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("(01)17777777777779", reader.getFoundBarCodes()[0].getCodeText());
    }
}
