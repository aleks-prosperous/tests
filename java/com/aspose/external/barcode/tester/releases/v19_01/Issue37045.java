package com.aspose.external.barcode.tester.releases.v19_01;

import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Issue37045
{
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void test_Pdf417_with_parentheses() throws IOException
    {
        String[] testCases = new String[]{"Sample.Code.Text(Example).20181203_150435",
                "Sample.Code.(Text(Example).20181203_150435",
                "Sample.Code.Text(Example).20181203_(150435",
                "Sample.Code(.Text(Example).20181203(_150435",
                "Sample.Code.Text(Example).(20181203_150435",
                "Sample.Code.Text(Example().20181203_150435",
                "Sample.Code.Text((Example).20181203_150435"};
        for (String codetext : testCases)
        {
            BarcodeGenerator b = new BarcodeGenerator(EncodeTypes.PDF_417);
            b.getParameters().getBarcode().getPdf417().setPdf417CompactionMode(Pdf417CompactionMode.TEXT);
            b.getParameters().getBarcode().getPdf417().setPdf417ErrorLevel(Pdf417ErrorLevel.LEVEL_2);
            b.getParameters().getBarcode().getPdf417().setColumns(4);
            b.getParameters().getBarcode().getPdf417().setRows(12);
            b.getParameters().getBarcode().getXDimension().setPixels(3);
            b.getParameters().getBarcode().getPdf417().setAspectRatio(1.33F);
            b.setCodeText(codetext);

            ByteArrayOutputStream barcodeOutputStream = new ByteArrayOutputStream();
            b.save(barcodeOutputStream, BarCodeImageFormat.PNG);
            barcodeOutputStream.flush();

            byte[] buffer = barcodeOutputStream.toByteArray();

            ByteArrayInputStream barcodeInputStream = new ByteArrayInputStream(buffer);

            BarCodeReader reader = new BarCodeReader(barcodeInputStream, DecodeType.PDF_417);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals(codetext, reader.getFoundBarCodes()[0].getCodeText());
        }
    }
}
