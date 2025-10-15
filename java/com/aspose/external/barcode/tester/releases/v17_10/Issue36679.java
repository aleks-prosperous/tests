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

public class Issue36679
{
    private final String folder = Global.getTestDataFolder("Issues" + File.separatorChar + "Issue36679");

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
    public void testDatabarStacked()
    {
        String fileName = folder + "DatabarStacked_(01)7401234567890.png";
        BarCodeReader reader = new BarCodeReader(fileName, DecodeType.DATABAR_STACKED);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        Assert.assertEquals("(01)74012345678900", reader.getFoundBarCodes()[0].getCodeText());
    }

        @Test
        ////[Category("DatabarStacked")]
    public void test_DatabarStacked_GenerationAndRecognition1()
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATABAR_STACKED, "(01)7401234567890");
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.DATABAR_STACKED);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)74012345678900", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        ////[Category("DatabarStacked")]
    public void test_DatabarStacked_GenerationAndRecognition2()
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATABAR_STACKED, "(01)8401234567890");
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.DATABAR_STACKED);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)84012345678907", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        ////[Category("DatabarStacked")]
    public void test_DatabarStacked_GenerationAndRecognition3()
    {
            final String codetext = "(01)94012345678904";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATABAR_STACKED, codetext);
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.DATABAR_STACKED);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        ////[Category("DatabarStacked")]
    public void test_DatabarStacked_GenerationAndRecognition3xxx()
    {
            final String codetext = "(01)1441950951323";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATABAR_STACKED, codetext);
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.DATABAR_STACKED);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)14419509513233", reader.getFoundBarCodes()[0].getCodeText());
        }
    }


    @Test
    public void test_GenerationDatabarExpandedStackedMany()
    {
        String[] codetexts = new String[]{"(01)1441950951323",
                "(01)6145439204352",
                "(01)3006274115200",
                "(01)2235088300477",
                "(01)6877212372328",
                "(01)1993656790746",
                "(01)0638363801222",
                "(01)7601420460410",
                "(01)8226471876350",
                "(01)8226471876350",
                "(01)0717960962432",
                "(01)0425508190432",
                "(01)8857621865122",
                "(01)4349330912544",
                "(01)1906794990565",
                "(01)9517008471868",
                "(01)4503016798900",
                "(01)6464979570505",
                "(01)7712824288480",
                "(01)5523662651547",
                "(01)3648309050528",
                "(01)9724306749086",
                "(01)3808083081634",
                "(01)8072457098418",
                "(01)3843623722056",
                "(01)9848677217140",
                "(01)8992743289984",
                "(01)1819819601392",
                "(01)8795875115420",
                "(01)0822136533856"};
        for (int i = 0; i < codetexts.length; i++)
        {
            String codetext = codetexts[i];
            BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATABAR_STACKED, codetext);
                System.out.println(codetext);
                BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.DATABAR_STACKED);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getExtended().getOneD().getValue());
        }
    }
}
