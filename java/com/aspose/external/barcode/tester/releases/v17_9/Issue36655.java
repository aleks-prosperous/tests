package com.aspose.external.barcode.tester.releases.v17_9;

import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Issue36655
{
    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
        @BeforeMethod
    public void SetUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
        //[Category("MacroPdf417")]
    public void testGeneratingSimpleMacroPdf417AndRecognizeMacroPdf417()
    {
            final String codetext = "123457";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.MACRO_PDF_417, codetext);
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.MACRO_PDF_417);
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
                Assert.assertEquals(DecodeType.MACRO_PDF_417, reader.getFoundBarCodes()[0].getCodeType());
            }
        }
    }

        @Test
        //[Category("MacroPdf417")]
        //[Category("Pdf417")]
    public void testGeneratingSimpleMacroPdf417AndRecognizePdf417()
    {
            final String codetext = "123457";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.MACRO_PDF_417, codetext);
        {
            gen.getParameters().getBarcode().getPdf417().setPdf417MacroFileID(1);
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.MACRO_PDF_417, DecodeType.PDF_417);
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
                Assert.assertEquals(DecodeType.MACRO_PDF_417, reader.getFoundBarCodes()[0].getCodeType());
            }
        }
    }

        @Test
        //[Category("MacroPdf417")]
        //[Category("AllSupportedTypes")]
    public void testGeneratingSimpleMacroPdf417AndRecognizeAllSupportedTypes()
    {
            final String codetext = "123457";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.MACRO_PDF_417, codetext);
        {
            gen.getParameters().getBarcode().getPdf417().setPdf417MacroFileID(1);
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage());
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
                Assert.assertEquals(DecodeType.MACRO_PDF_417, reader.getFoundBarCodes()[0].getCodeType());
            }
        }
    }

        @Test
        //[Category("MacroPdf417")]
    public void testGeneratingMacroPdf417WithFileIdAndRecognizeMacroPdf417()
    {
            final String codetext = "123457";
        String fileId = "1753";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.MACRO_PDF_417, "123457");
        {
            gen.getParameters().getBarcode().getPdf417().setPdf417MacroFileID(Integer.parseInt(fileId));
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.MACRO_PDF_417);
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
                Assert.assertEquals(DecodeType.MACRO_PDF_417, reader.getFoundBarCodes()[0].getCodeType());
                Assert.assertEquals(fileId, reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417FileID());
            }
        }
    }

        @Test
        //[Category("MacroPdf417")]
        //[Category("Pdf417")]
    public void testGeneratingMacroPdf417WithFileIdAndRecognizeMacroPdf417AndPdf417()
    {
            final String codetext = "123457";
        String fileId = "1753";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.MACRO_PDF_417, "123457");
        {
            gen.getParameters().getBarcode().getPdf417().setPdf417MacroFileID(Integer.parseInt(fileId));
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.MACRO_PDF_417, DecodeType.PDF_417);
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
                Assert.assertEquals(DecodeType.MACRO_PDF_417, reader.getFoundBarCodes()[0].getCodeType());
                Assert.assertEquals(fileId, reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417FileID());
            }
        }
    }

        @Test
        //[Category("MacroPdf417")]
        //[Category("AllSupportedTypes")]
    public void testGeneratingMacroPdf417WithFileIdAndRecognizeAllSupportedTypes()
    {
            final String codetext = "123457";
        String fileId = "1753";
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.MACRO_PDF_417, "123457");
        {
            gen.getParameters().getBarcode().getPdf417().setPdf417MacroFileID(Integer.parseInt(fileId));
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage());
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
                Assert.assertEquals(DecodeType.MACRO_PDF_417, reader.getFoundBarCodes()[0].getCodeType());
                Assert.assertEquals(fileId, reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417FileID());
            }
        }
    }

        @Test
        //[Category("MacroPdf417")]
    public void testGeneratingMacroPdf417WithAllFieldsAndRecognizeMacroPdf417()
    {
            final String codetext = "123457";
        String fileId = "1753";
        int segmentID = 12;
        int segmentsCount = 5;
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.MACRO_PDF_417, "123457");
        {
            gen.getParameters().getBarcode().getPdf417().setPdf417MacroFileID(Integer.parseInt(fileId));
            gen.getParameters().getBarcode().getPdf417().setPdf417MacroSegmentID(segmentID);
            gen.getParameters().getBarcode().getPdf417().setPdf417MacroSegmentsCount(segmentsCount);
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.MACRO_PDF_417);
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
                Assert.assertEquals(DecodeType.MACRO_PDF_417, reader.getFoundBarCodes()[0].getCodeType());
                Assert.assertEquals(fileId, reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417FileID());
                Assert.assertEquals(segmentID, reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417SegmentID());
                Assert.assertEquals(segmentsCount, reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417SegmentsCount());
            }
        }
    }

        @Test
        //[Category("MacroPdf417")]
    public void testGeneratingMacroPdf417WithAllFieldsAndRecognizePdf417()
    {
            final String codetext = "123457";
        String fileId = "1753";
        int segmentID = 12;
        int segmentsCount = 5;
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.MACRO_PDF_417, "123457");
        {
            gen.getParameters().getBarcode().getPdf417().setPdf417MacroFileID(Integer.parseInt(fileId));
            gen.getParameters().getBarcode().getPdf417().setPdf417MacroSegmentID(segmentID);
            gen.getParameters().getBarcode().getPdf417().setPdf417MacroSegmentsCount(segmentsCount);
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.PDF_417);
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
                Assert.assertEquals(DecodeType.MACRO_PDF_417, reader.getFoundBarCodes()[0].getCodeType());
                Assert.assertEquals(fileId, reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417FileID());
                Assert.assertEquals(segmentID, reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417SegmentID());
                Assert.assertEquals(segmentsCount, reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417SegmentsCount());
            }
        }
    }

        @Test
        //[Category("MacroPdf417")]
        //[Category("Pdf417")]
    public void testGeneratingMacroPdf417WithAllFieldsAndRecognizeMacroPdf417AndPdf417()
    {
            final String codetext = "123457";
        String fileId = "1753";
        int segmentID = 12;
        int segmentsCount = 5;
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.MACRO_PDF_417, "123457");
        {
            gen.getParameters().getBarcode().getPdf417().setPdf417MacroFileID(Integer.parseInt(fileId));
            gen.getParameters().getBarcode().getPdf417().setPdf417MacroSegmentID(segmentID);
            gen.getParameters().getBarcode().getPdf417().setPdf417MacroSegmentsCount(segmentsCount);
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.MACRO_PDF_417, DecodeType.PDF_417);
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
                Assert.assertEquals(DecodeType.MACRO_PDF_417, reader.getFoundBarCodes()[0].getCodeType());
                Assert.assertEquals(fileId, reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417FileID());
                Assert.assertEquals(segmentID, reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417SegmentID());
                Assert.assertEquals(segmentsCount, reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417SegmentsCount());
            }
        }
    }

        @Test
        //[Category("MacroPdf417")]
        //[Category("AllSupportedTypes")]
    public void testGeneratingMacroPdf417WithAllFieldsAndRecognizeAllSupportedTypes()
    {
            final String codetext = "123457";
        String fileId = "1753";
        int segmentID = 12;
        int segmentsCount = 5;
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.MACRO_PDF_417, "123457");
        {
            gen.getParameters().getBarcode().getPdf417().setPdf417MacroFileID(Integer.parseInt(fileId));
            gen.getParameters().getBarcode().getPdf417().setPdf417MacroSegmentID(segmentID);
            gen.getParameters().getBarcode().getPdf417().setPdf417MacroSegmentsCount(segmentsCount);
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage());
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
                Assert.assertEquals(DecodeType.MACRO_PDF_417, reader.getFoundBarCodes()[0].getCodeType());
                Assert.assertEquals(fileId, reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417FileID());
                Assert.assertEquals(segmentID, reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417SegmentID());
                Assert.assertEquals(segmentsCount, reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417SegmentsCount());
            }
        }
    }
}
