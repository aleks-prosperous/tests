package com.aspose.external.barcode.tester.barcodjava;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.pdf.facades.PdfExtractor;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class BARCODJAVA33504
{
    String Folder = Global.getTestDataFolder("BarCodeRelease/BARCODJAVA33504");

    @BeforeClass
    public void setLicense() throws Exception
    {
        com.aspose.barcode.LicenseAssistant.setupLicense();
    }

    @Test
    public void test() throws IOException
    {
        String IMAGEPATH = Folder;//"src/test/resources/testdata/BarCodeRelease/BARCODJAVA33504/";
        int imageIndex = 0;
        List<String> Items = new ArrayList<String>();
        Items.add("FATTP00000000001.pdf");
        Items.add("FATTP00000000005.pdf");
        Items.add("66401.pdf");
        for (String item : Items)
        {
            List<String> filenames = new ArrayList<String>();
            PdfExtractor extractor = new PdfExtractor();
            extractor.bindPdf(IMAGEPATH + item);
            extractor.extractImage();

            while (extractor.hasNextImage())
            {
                String fname = IMAGEPATH + "IMG" + imageIndex + ".png";
                OutputStream stream = null;
                try
                {
                    stream = new FileOutputStream(fname);
                } catch (FileNotFoundException e)
                {
                    e.printStackTrace();
                }
                extractor.getNextImage(stream);
                filenames.add(fname);
                imageIndex++;
            }
            boolean recognized = false;
            for (String fileName : filenames)
            {
                BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);
                if (reader.readBarCodes().length > 0)
                {
                    System.out.println("recognized " + fileName);
                    recognized = true;
                }
            }
            Assert.assertTrue(recognized);
        }
    }
}
