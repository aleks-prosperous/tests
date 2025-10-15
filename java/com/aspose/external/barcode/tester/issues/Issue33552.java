package com.aspose.external.barcode.tester.issues;

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

public class Issue33552
{
    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void testMacroPDF417() throws IOException
    {
        List<ByteArrayOutputStream> msList = new ArrayList<ByteArrayOutputStream>();

        int nSize = 4;
        String[] lstCodeText = new String[]{"code-1", "code-2", "code-3", "code-4"};
        String strFileID = "1";

        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.MACRO_PDF_417);
        for (int nCount = 1; nCount <= nSize; nCount++)
        {
            gen.setCodeText(lstCodeText[nCount - 1]);
            gen.getParameters().getBarcode().getPdf417().setPdf417MacroFileID(Integer.parseInt(strFileID));
            gen.getParameters().getBarcode().getPdf417().setPdf417MacroSegmentID(nCount);
            gen.getParameters().getBarcode().getPdf417().setPdf417MacroSegmentsCount(nSize);

            msList.add(new ByteArrayOutputStream());
            gen.save(msList.get(msList.size() - 1), BarCodeImageFormat.PNG);
        }

        for (int i = 0; i < msList.size(); ++i)
        {
            BarCodeReader reader = new BarCodeReader(new ByteArrayInputStream(msList.get(i).toByteArray()), DecodeType.MACRO_PDF_417);
            Assert.assertEquals(reader.readBarCodes().length, 1);
            Assert.assertEquals("code-" + ( i + 1), reader.getFoundBarCodes()[0].getCodeText());
            Assert.assertEquals("1", reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417FileID());
            Assert.assertEquals(i + 1, reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417SegmentID());
            Assert.assertEquals(msList.size(), reader.getFoundBarCodes()[0].getExtended().getPdf417().getMacroPdf417SegmentsCount());

            msList.get(i).close();
        }
    }
}
