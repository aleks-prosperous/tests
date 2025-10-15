package com.aspose.external.barcode.tester.releases.v17_12;

import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

public class Issue36672
{
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

        @Test
        ////[Category("DatabarExpandedStacked")]
    public void test_MinSize_DatabarExpandedStacked()
    {
            final String codetext = "(8102)03";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATABAR_EXPANDED_STACKED, codetext);
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.DATABAR_EXPANDED_STACKED);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        ////[Category("DatabarExpanded")]
    public void test_MinSize_DatabarExpanded_01()
    {
            final String codetext = "(8102)03";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATABAR_EXPANDED, codetext);
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.DATABAR_EXPANDED);

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        ////[Category("DatabarExpanded")]
    public void test_MinSize_DatabarExpanded_02()
    {
            final String codetext = "(22)3";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATABAR_EXPANDED, codetext);
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.DATABAR_EXPANDED);

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        ////[Category("DatabarLimited")]
    public void test_MinSize_DatabarLimited_01()
    {
            final String codetext = "(01)15012345678907";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATABAR_LIMITED, codetext);
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.DATABAR_LIMITED);

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        ////[Category("DatabarLimited")]
    public void test_MinSize_DatabarLimited_02()
    {
            final String codetext = "(01)1501234567890";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATABAR_LIMITED, codetext);
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.DATABAR_LIMITED);

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)15012345678907", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        ////[Category("DatabarLimited")]
    public void test_MinSize_DatabarLimited_03()
    {
            final String codetext = "(01)05012345678900";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATABAR_LIMITED, codetext);
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.DATABAR_LIMITED);

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        ////[Category("DatabarLimited")]
    public void test_MinSize_DatabarLimited_04()
    {
            final String codetext = "(01)0501234567890";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATABAR_LIMITED, codetext);
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.DATABAR_LIMITED);

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)05012345678900", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        ////[Category("DatabarOmniDirectional")]
    public void test_MinSize_DatabarOmniDirectional_01()
    {
            final String codetext = "(01)2401234567890";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATABAR_OMNI_DIRECTIONAL, codetext);
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.DATABAR_OMNI_DIRECTIONAL);

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)24012345678905", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        ////[Category("DatabarOmniDirectional")]
    public void test_MinSize_DatabarOmniDirectional_02()
    {
            final String codetext = "(01)24012345678905";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATABAR_OMNI_DIRECTIONAL, codetext);
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.DATABAR_OMNI_DIRECTIONAL);

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        ////[Category("DatabarOmniDirectional")]
    public void test_MinSize_DatabarOmniDirectional_03()
    {
            final String codetext = "(01)9401234567890";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATABAR_OMNI_DIRECTIONAL, codetext);
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.DATABAR_OMNI_DIRECTIONAL);

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("(01)94012345678904", reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        ////[Category("DatabarStacked")]
    public void test_MinSize_DatabarStacked_01()
    {
            final String codetext = "(01)10123456789019";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATABAR_STACKED, codetext);
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.DATABAR_STACKED);

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        ////[Category("DatabarStacked")]
    public void test_MinSize_DatabarStacked_02()
    {
            final String codetext = "(01)24012345678905";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATABAR_STACKED, codetext);
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.DATABAR_STACKED);

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        ////[Category("DatabarStackedOmniDirectional")]
    public void test_MinSize_DatabarStackedOmniDirectional_01()
    {
            final String codetext = "(01)10123456789019";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATABAR_STACKED_OMNI_DIRECTIONAL, codetext);
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.DATABAR_STACKED);

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        ////[Category("DatabarStackedOmniDirectional")]
    public void test_MinSize_DatabarStackedOmniDirectional_02()
    {
            final String codetext = "(01)24012345678905";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATABAR_STACKED_OMNI_DIRECTIONAL, codetext);
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.DATABAR_STACKED);

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        ////[Category("DatabarTruncated")]
    public void test_MinSize_DatabarTruncated_01()
    {
            final String codetext = "(01)10123456789019";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATABAR_TRUNCATED, codetext);
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.DATABAR_TRUNCATED);

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

        @Test
        ////[Category("DatabarTruncated")]
    public void test_MinSize_DatabarTruncated_02()
    {
            final String codetext = "(01)24012345678905";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATABAR_TRUNCATED, codetext);
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.DATABAR_TRUNCATED);

            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
