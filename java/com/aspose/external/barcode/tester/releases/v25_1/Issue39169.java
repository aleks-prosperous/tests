package com.aspose.external.barcode.tester.releases.v25_1;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.BarCodeImageFormat;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.CodeLocation;
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

public class Issue39169
{
    static final String folder = Global.getTestDataFolder("Issues/Issue39169");

    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense(LicenseType.Total);
    }

    //[Test]
    //generates test results
        // [Category("OneCode")]
//    public void testDemo()
//    {
//        GenerateOneCode("0027090323734116180477077361580", "0027090323734116180477077361580.png");
//        GenerateOneCode("0427090323734116180477077361580", "0427090323734116180477077361580.png");
//        GenerateOneCode("6027090323734116180477077361580", "6027090323734116180477077361580.png");
//        GenerateOneCode("00270903237341161804", "00270903237341161804.png");//Routing Code 0
//        GenerateOneCode("0027090323734116180412345", "0027090323734116180412345.png");//Routing Code 5
//        GenerateOneCode("00270903237341161804123456789", "00270903237341161804123456789.png");//Routing Code 9
//        GenerateOneCode("0027090323734116180412345678901", "0027090323734116180412345678901.png");//Routing Code 11
//    }

    @Test
        // [Category("OneCode")]
    public void test_Recognize() throws IOException
    {
        recognizeOneCode("0027090323734116180477077361580", "0027090323734116180477077361580.png");
        recognizeOneCode("0427090323734116180477077361580", "0427090323734116180477077361580.png");
        recognizeOneCode("6027090323734116180477077361580", "6027090323734116180477077361580.png");
        recognizeOneCode("00270903237341161804", "00270903237341161804.png");//Routing Code 0
        recognizeOneCode("0027090323734116180412345", "0027090323734116180412345.png");//Routing Code 5
        recognizeOneCode("00270903237341161804123456789", "00270903237341161804123456789.png");//Routing Code 9
        recognizeOneCode("0027090323734116180412345678901", "0027090323734116180412345678901.png");//Routing Code 11
    }

    @Test
        // [Category("OneCode")]
    public void test_GenerateAndRecognize()
    {
        GenerateAndrecognizeOneCode("0027090323734116180477077361580");
        GenerateAndrecognizeOneCode("0427090323734116180477077361580");
        GenerateAndrecognizeOneCode("6027090323734116180477077361580");
        GenerateAndrecognizeOneCode("00270903237341161804");//Routing Code 0
        GenerateAndrecognizeOneCode("0027090323734116180412345");//Routing Code 5
        GenerateAndrecognizeOneCode("00270903237341161804123456789");//Routing Code 9
        GenerateAndrecognizeOneCode("0027090323734116180412345678901");//Routing Code 11
    }

    @Test
    public void testReadOneCode() throws IOException
    {
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.ONE_CODE, "0027090323734116180477077361580");
        {
            generator.save(folder + "one-code.png", BarCodeImageFormat.PNG);
            BarCodeReader reader = new BarCodeReader(generator.generateBarCodeImage(), DecodeType.ONE_CODE);
            BarCodeResult[] barCodeResults = reader.readBarCodes();
            for(BarCodeResult result : barCodeResults)
            {
                System.out.printf("CodeType: %s%nCodeText: %s%n", result.getCodeTypeName(), result.getCodeText());
            }
        }
    }

    private void generateOneCode(String codetext, String file) throws IOException
    {
        String filename = Global.pathCombine(folder, file);
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.ONE_CODE, codetext);
        {
            gen.getParameters().getBarcode().getCodeTextParameters().setLocation(CodeLocation.NONE);
            ByteArrayOutputStream ms = new ByteArrayOutputStream();
            gen.save(ms, BarCodeImageFormat.PNG);
            IOTestUtils.saveMemoryStreamToFile(filename, new ByteArrayInputStream(ms.toByteArray()));
        }
    }

    private void recognizeOneCode(String codetext, String file) throws IOException
    {
        String filename = Global.pathCombine(folder, file);
        InputStream ms = IOTestUtils.loadToMemoryStreamExternal(filename);
        BarCodeReader reader = new BarCodeReader(ms, DecodeType.ONE_CODE);
        {
            Assert.assertEquals(1, reader.readBarCodes().length);
            Assert.assertEquals("OneCode", reader.getFoundBarCodes()[0].getCodeTypeName());
            Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
        }
    }

    private void GenerateAndrecognizeOneCode(String codetext)
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.ONE_CODE, codetext);
        {
            gen.getParameters().getBarcode().getCodeTextParameters().setLocation(CodeLocation.NONE);
            BarCodeReader reader = new BarCodeReader(gen.generateBarCodeImage(), DecodeType.ONE_CODE);
            {
                Assert.assertEquals(1, reader.readBarCodes().length);
                Assert.assertEquals("OneCode", reader.getFoundBarCodes()[0].getCodeTypeName());
                Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }
}
