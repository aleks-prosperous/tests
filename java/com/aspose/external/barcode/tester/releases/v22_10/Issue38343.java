package com.aspose.external.barcode.tester.releases.v22_10;

import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.BarCodeImageFormat;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import com.aspose.barcode.generation.Pdf417MacroTerminator;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Issue38343 {
    @BeforeMethod
    public void setUp() {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void MacroPdf417_With_AutoTerminator_WithoutSegmentsCount() throws IOException {
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.MACRO_PDF_417); {
            generator.setCodeText("SampleCodetext");
            generator.getParameters().getBarcode().getPdf417().setPdf417MacroSegmentID(0);
            generator.getParameters().getBarcode().getPdf417().setPdf417MacroFileID(100);
            ByteArrayOutputStream barcodeStream = new ByteArrayOutputStream();
            generator.save(barcodeStream, BarCodeImageFormat.PNG);
            BarCodeReader reader = new BarCodeReader(new ByteArrayInputStream(barcodeStream.toByteArray()), DecodeType.MACRO_PDF_417);
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals("SampleCodetext", reader.getFoundBarCodes()[0].getCodeText());
                Assert.assertEquals(false, reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417Terminator());
            }
        }
    }

    @Test
    public void MacroPdf417_With_AutoTerminator_NotLastSegment() throws IOException {
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.MACRO_PDF_417);
        {
            generator.setCodeText("SampleCodetext");
            generator.getParameters().getBarcode().getPdf417().setPdf417MacroSegmentID(1);
            generator.getParameters().getBarcode().getPdf417().setPdf417MacroSegmentsCount(3);
            generator.getParameters().getBarcode().getPdf417().setPdf417MacroFileID(100);
            ByteArrayOutputStream barcodeStream = new ByteArrayOutputStream();
            generator.save(barcodeStream, BarCodeImageFormat.PNG);
            BarCodeReader reader = new BarCodeReader(new ByteArrayInputStream(barcodeStream.toByteArray()), DecodeType.MACRO_PDF_417);
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(false, reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417Terminator());
            }
        }
    }

    @Test
    public void MacroPdf417_With_AutoTerminator_LastSegment() throws IOException {
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.MACRO_PDF_417);
        {
            generator.setCodeText("SampleCodetext");
            generator.getParameters().getBarcode().getPdf417().setPdf417MacroSegmentID(2);
            generator.getParameters().getBarcode().getPdf417().setPdf417MacroSegmentsCount(3);
            generator.getParameters().getBarcode().getPdf417().setPdf417MacroFileID(100);
            ByteArrayOutputStream barcodeStream = new ByteArrayOutputStream();
            generator.save(barcodeStream, BarCodeImageFormat.PNG);
            BarCodeReader reader = new BarCodeReader(new ByteArrayInputStream(barcodeStream.toByteArray()), DecodeType.MACRO_PDF_417);
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(true, reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417Terminator());
            }
        }
    }

    @Test
    public void MacroPdf417_With_SetTerminator() throws IOException {
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.MACRO_PDF_417);
        {
            generator.setCodeText("SampleCodetext");
            generator.getParameters().getBarcode().getPdf417().setPdf417MacroSegmentID(1);
            generator.getParameters().getBarcode().getPdf417().setPdf417MacroSegmentsCount(3);
            generator.getParameters().getBarcode().getPdf417().setPdf417MacroFileID(100);
            generator.getParameters().getBarcode().getPdf417().setPdf417MacroTerminator(Pdf417MacroTerminator.SET);
            ByteArrayOutputStream barcodeStream = new ByteArrayOutputStream();
            generator.save(barcodeStream, BarCodeImageFormat.PNG);
            BarCodeReader reader = new BarCodeReader(new ByteArrayInputStream(barcodeStream.toByteArray()), DecodeType.MACRO_PDF_417);
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(true, reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417Terminator());
            }
        }
    }

    @Test
    public void MacroPdf417_With_NoneTerminator() throws IOException {
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.MACRO_PDF_417);
        {
            generator.setCodeText("SampleCodetext");
            generator.getParameters().getBarcode().getPdf417().setPdf417MacroSegmentID(2);
            generator.getParameters().getBarcode().getPdf417().setPdf417MacroSegmentsCount(3);
            generator.getParameters().getBarcode().getPdf417().setPdf417MacroFileID(100);
            generator.getParameters().getBarcode().getPdf417().setPdf417MacroTerminator(Pdf417MacroTerminator.NONE);
            ByteArrayOutputStream barcodeStream = new ByteArrayOutputStream();
            generator.save(barcodeStream, BarCodeImageFormat.PNG);
            BarCodeReader reader = new BarCodeReader(new ByteArrayInputStream(barcodeStream.toByteArray()), DecodeType.MACRO_PDF_417);
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(false, reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417Terminator());
            }
        }
    }
}
