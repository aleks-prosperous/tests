package com.aspose.external.barcode.tester.releases.v23_7;

import com.aspose.barcode.auxiliary.Global;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ApiTests_23_7
{
    private static final String folder = Global.getGeneratedImagesFolder("ApiTests_23_7");
    @BeforeMethod
    public void setUp() throws IOException
    {
        Files.createDirectories(Paths.get(folder));
        LicenseAssistant.setupLicense();
    }
    @Test
    public void test1() throws IOException
    {
        String codetext = "犬Right狗";
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.DATA_MATRIX, codetext);
        generator.getParameters().getBarcode().getDataMatrix().setECIEncoding(ECIEncodings.UTF8);
        generator.save(folder + "test1_Java.bmp");
    }

    @Test
    public void test2() throws IOException
    {
        byte[] encodedArr = {(byte) 0xFF, (byte) 0xFE, (byte) 0xFD, (byte) 0xFC, (byte) 0xFB, (byte) 0xFA, (byte) 0xF9};
        //encode array to String
        StringBuilder strBld = new StringBuilder();
        for (byte bval : encodedArr)
        {
            strBld.append((char) bval);
            String codetext = strBld.toString();
            BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.DATA_MATRIX, codetext);
            generator.getParameters().getBarcode().getDataMatrix().setDataMatrixEncodeMode(DataMatrixEncodeMode.BYTES);
            generator.save(folder + "test2_Java.bmp");
        }
    }

    @Test
    public void test3() throws IOException
    {
        //Extended codetext mode
        //create codetext
        DataMatrixExtCodetextBuilder codetextBuilder = new DataMatrixExtCodetextBuilder();
        codetextBuilder.addECICodetextWithEncodeMode(ECIEncodings.UTF8, DataMatrixEncodeMode.BYTES, "World");
        codetextBuilder.addPlainCodetext("Will");
        codetextBuilder.addECICodetext(ECIEncodings.UTF8, "犬Right狗");
        codetextBuilder.addCodetextWithEncodeMode(DataMatrixEncodeMode.C40, "ABCDE");
        //generate codetext
        String codetext = codetextBuilder.getExtendedCodetext();
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.DATA_MATRIX, codetext);
        generator.getParameters().getBarcode().getDataMatrix().setDataMatrixEncodeMode(DataMatrixEncodeMode.EXTENDED_CODETEXT);
        generator.getParameters().getBarcode().getCodeTextParameters().setTwoDDisplayText("My Text");
        generator.save(folder + "test3_Java1.bmp");
    }
}
