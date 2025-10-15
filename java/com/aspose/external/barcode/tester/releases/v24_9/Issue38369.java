package com.aspose.external.barcode.tester.releases.v24_9;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.BarCodeImageFormat;
import com.aspose.barcode.generation.BarcodeGenerator;
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

public class Issue38369
{
    final String Folder = Global.getTestDataFolder("Issues/Issue38369");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense(LicenseType.Total);
    }

    @Test
    public void test_RecognizeInternetPZN() throws IOException {
        recognizePZN("-1234562", "Pharmazentralnummer-(PZN).png");
        recognizePZN("-02530498", "PZN Pharma Barcode Example.png");
        recognizePZN("-1234562", "pzn7_tec_01.png");
        recognizePZN("-12345678", "pzn8_tec_01.png");
        recognizePZN("-1234562", "pzn7_int_01.png");
        recognizePZN("-12345678", "pzn8_int_01.png");
    }

    @Test
    public void test_recognizePZN() throws IOException {
        //PZN7 generation
        recognizePZN("-1234562", "pzn-123456.png");

        //PZN8 generation
        recognizePZN("-12345678", "pzn-12345678.png");
    }


    @Test
    public void test_generateAndrecognizePZN()
    {
        //PZN7 generation
        generateAndrecognizePZN("z123", "-1230009");
        generateAndrecognizePZN("-123", "-1230009");
        generateAndrecognizePZN("123456", "-1234562");
        generateAndrecognizePZN("-123456", "-1234562");

        //PZN8 generation
        generateAndrecognizePZN("z1234567", "-12345678");
        generateAndrecognizePZN("z12345678", "-12345678");
        generateAndrecognizePZN("-1234567", "-12345678");
        generateAndrecognizePZN("1234567", "-12345678");
        generateAndrecognizePZN("-12345678", "-12345678");
    }

    private void generateAndrecognizePZN(String codetext, String recognized)
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.PZN, codetext);
        {
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.PZN);
            {
                Assert.assertEquals(1, reader.readBarCodes().length);
                Assert.assertEquals("PZN", reader.getFoundBarCodes()[0].getCodeTypeName());
                Assert.assertEquals(recognized, reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }

    private void recognizePZN(String recognized, String file) throws IOException {
        String filename = Global.pathCombine(Folder, file);
        InputStream ms = IOTestUtils.loadToMemoryStreamExternal(filename);
        BarCodeReader reader = new BarCodeReader(ms, DecodeType.PZN);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("PZN", reader.getFoundBarCodes()[0].getCodeTypeName());
            Assert.assertEquals(recognized, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    private void GeneratePZN(String codetext, String file) throws IOException {
        String filename = Global.pathCombine(Folder, file);
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.PZN, codetext);
        {
            ByteArrayOutputStream ms = new ByteArrayOutputStream();
            gen.save(ms, BarCodeImageFormat.PNG);
            IOTestUtils.saveMemoryStreamToFile(filename, new ByteArrayInputStream(ms.toByteArray()));
        }
    }
}
