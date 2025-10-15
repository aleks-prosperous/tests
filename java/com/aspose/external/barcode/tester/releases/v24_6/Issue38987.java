package com.aspose.external.barcode.tester.releases.v24_6;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.barcoderecognition.QualitySettings;
import com.aspose.barcode.generation.BarCodeImageFormat;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.CodabarSymbol;
import com.aspose.barcode.generation.EncodeTypes;
import com.aspose.barcode.licensing.LicenseType;
import helpers.IOTestUtils;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Issue38987
{
    public static final String Folder = Global.getTestDataFolder("Issues\\Issue38987");

    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense(LicenseType.Total);
    }

    @Test
    public void test_Recognize() throws IOException {
        recognizeCodabar("12345", CodabarSymbol.A, CodabarSymbol.A, "A12345A.png");
        recognizeCodabar("12345", CodabarSymbol.B, CodabarSymbol.B, "B12345B.png");
        recognizeCodabar("12345", CodabarSymbol.C, CodabarSymbol.C, "C12345C.png");
        recognizeCodabar("12345", CodabarSymbol.D, CodabarSymbol.D, "D12345D.png");
        recognizeCodabar("12345", CodabarSymbol.C, CodabarSymbol.B, "C12345B.png");
        recognizeCodabar("12345", CodabarSymbol.D, CodabarSymbol.A, "D12345A.png");
    }

    @Test
    public void test_GenerateAndRecognize()
    {
        GenerateAndrecognizeCodabar("12345", CodabarSymbol.A, CodabarSymbol.A);
        GenerateAndrecognizeCodabar("12345", CodabarSymbol.B, CodabarSymbol.B);
        GenerateAndrecognizeCodabar("12345", CodabarSymbol.C, CodabarSymbol.C);
        GenerateAndrecognizeCodabar("12345", CodabarSymbol.D, CodabarSymbol.D);
        GenerateAndrecognizeCodabar("12345", CodabarSymbol.C, CodabarSymbol.B);
        GenerateAndrecognizeCodabar("12345", CodabarSymbol.D, CodabarSymbol.A);
    }

    private void GenerateAndrecognizeCodabar(String codetext, short start, short stop)
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.CODABAR, codetext);
        {
            gen.getParameters().getBarcode().getCodabar().setCodabarStartSymbol(start);
            gen.getParameters().getBarcode().getCodabar().setCodabarStopSymbol(stop);
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.CODABAR);
            {
                reader.setQualitySettings(QualitySettings.getHighPerformance());
                Assert.assertEquals(1, reader.readBarCodes().length);
                Assert.assertEquals("Codabar", reader.getFoundBarCodes()[0].getCodeTypeName());
                Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
                Assert.assertEquals(start, reader.getFoundBarCodes()[0].getExtended().getCodabar().getCodabarStartSymbol());
                Assert.assertEquals(stop, reader.getFoundBarCodes()[0].getExtended().getCodabar().getCodabarStopSymbol());
            }
        }
    }

    private void recognizeCodabar(String codetext, int start, int stop, String file) throws IOException
    {
        String filename = Global.pathCombine(Folder, file);
        InputStream ms = IOTestUtils.loadToMemoryStreamExternal(filename);
        BarCodeReader reader = new BarCodeReader(ms, DecodeType.CODABAR);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("Codabar", reader.getFoundBarCodes()[0].getCodeTypeName());
            Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals(start, reader.getFoundBarCodes()[0].getExtended().getCodabar().getCodabarStartSymbol());
            Assert.assertEquals(stop, reader.getFoundBarCodes()[0].getExtended().getCodabar().getCodabarStopSymbol());
        }
    }

    private void generateCodabar(String codetext, short start, short stop, String file) throws IOException {
        String filename = Global.pathCombine(Folder, file);
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.CODABAR, codetext);
        {
            gen.getParameters().getBarcode().getCodabar().setCodabarStartSymbol(start);
            gen.getParameters().getBarcode().getCodabar().setCodabarStopSymbol(stop);
            ByteArrayOutputStream ms = new ByteArrayOutputStream();
            gen.save(ms, BarCodeImageFormat.PNG);
            IOTestUtils.saveMemoryStreamToFile(filename, new ByteArrayInputStream(ms.toByteArray()));
        }
    }
}
