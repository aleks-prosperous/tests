package com.aspose.external.barcode.tester.releases.v22_9;

import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.BarCodeImageFormat;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Issue38292
{
    /// <summary>
    /// Prepares to run these tests.
    /// </summary>
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    /// <summary>
    /// Tests Code128 generates correct barcode with chars in extended mode.
    /// </summary>
    @Test
    public void test_Code128_with_extended_chars() throws IOException {
        BarcodeGenerator b = new BarcodeGenerator(EncodeTypes.CODE_128);

        for(String codetext : getCode128Extended())
        {
            b.setCodeText(codetext);
            ByteArrayOutputStream barcodeStream = new ByteArrayOutputStream();
            b.save(barcodeStream, BarCodeImageFormat.PNG);
            BarCodeReader reader = new BarCodeReader(new ByteArrayInputStream(barcodeStream.toByteArray()), DecodeType.CODE_128);
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }

    /// <summary>
    /// Tests CodablockF generates correct barcode with chars in extended mode.
    /// </summary>
    @Test
    public void test_CodablockF_with_extended_chars() throws IOException
    {
        BarcodeGenerator b = new BarcodeGenerator(EncodeTypes.CODABLOCK_F);

        for(String codetext : getCode128Extended())
        {
            b.setCodeText(codetext);
            ByteArrayOutputStream barcodeStream = new ByteArrayOutputStream();
            b.save(barcodeStream, BarCodeImageFormat.PNG);
            BarCodeReader reader = new BarCodeReader(new ByteArrayInputStream(barcodeStream.toByteArray()), DecodeType.CODABLOCK_F);
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }

    /// <summary>
    /// Tests CodablockF generates correct barcode with chars in extended mode
    /// </summary>
    @Test
    public void test_CodablockF_with_extended_chars_with_line_splitting() throws IOException {
        BarcodeGenerator b = new BarcodeGenerator(EncodeTypes.CODABLOCK_F);

        for(String codetext : getCodalockFExtendedWIthLineSplitting())
        {
            b.setCodeText(codetext);
            b.getParameters().getBarcode().getCodablock().setColumns(10);
            ByteArrayOutputStream barcodeStream = new ByteArrayOutputStream();
            b.save(barcodeStream, BarCodeImageFormat.PNG);
            BarCodeReader reader = new BarCodeReader(new ByteArrayInputStream(barcodeStream.toByteArray()), DecodeType.CODABLOCK_F);
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }

    public List<String> getCode128Extended()
    {
        List<String> list = new ArrayList<>();
        list.add("0123" + (char) 129 + (char) 129 + (char) 129 + (char) 129);
        list.add("0123" + (char) 129);
        list.add("" + (char) 31 + "ÿÿÿÿ");
        list.add("" + (char) 129 + (char) 129 + (char) 129 + (char) 129);
        list.add((char) 31 + "ÿ");
        list.add(" " + (char) 129);
        list.add("" + (char) 129 + (char) 129 + (char) 129 + (char) 129 + "012345678");
        list.add("" + (char) 129 + "0123");
        list.add("" + (char) 129 + (char) 129 + (char) 129 + (char) 129 + "a");
        list.add("" + (char) 129 + "a");
        list.add("" + (char) 129 + (char) 129 + "ÿ" + (char) 129 + "ÿÿÿ");
        list.add("" + (char) 129 + (char) 129 + "ÿÿÿÿÿ");
        list.add("ÿÿ" + (char) 129 + "ÿ" + (char) 129 + (char) 129 + (char) 129);
        list.add("ÿÿ" + (char) 129 + (char) 129 + (char) 129 + (char) 129 + (char) 129);
        
        return list;
    }

    public List<String> getCodalockFExtendedWIthLineSplitting()
    {
        List<String> list = new ArrayList<>();
        list.add("aÿÿÿÿÿÿabcbdefgh");
        list.add("aaa" + (char)31 + (char)31 + (char)31 + (char)31 + (char)31 + (char)31 + (char)31 +"abcdefgh");
        return list;
    }
}
