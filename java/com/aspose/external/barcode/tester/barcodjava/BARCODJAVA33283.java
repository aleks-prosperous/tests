package com.aspose.external.barcode.tester.barcodjava;

import com.aspose.barcode.barcoderecognition.BarCodeResult;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;
import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.FontUnit;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Test
public class BARCODJAVA33283
{
    String folder = Global.getGeneratedImagesFolder("barcodjava_issues" + File.separator + this.getClass().getSimpleName());

    @BeforeClass
    public void setLicense() throws Exception
    {
        com.aspose.barcode.LicenseAssistant.setupLicense();
    }

    @Test
    public void testOne()
    {
        BarcodeGenerator builder = new BarcodeGenerator(EncodeTypes.CODE_128);
        builder.setCodeText("Code text here");
        builder.generateBarCodeImage();
        builder.getParameters().getBarcode().getCodeTextParameters().setColor(Color.RED);

        builder.getParameters().getBarcode().getCodeTextParameters().getFont().setFamilyName("Book Antiqua");
        builder.getParameters().getBarcode().getCodeTextParameters().getFont().setStyle(Font.PLAIN);
        builder.getParameters().getBarcode().getCodeTextParameters().getFont().getSize().setPoint(30);
        List<String> files = new ArrayList<String>();
        files.add(folder + "outputBARCODJAVA33283.png");

        for (String fileName : files)
        {
            try
            {

                builder.save(fileName);

                BarCodeReader reader = new BarCodeReader(fileName, DecodeType.CODE_128);

                int counter = 0;
                for (BarCodeResult result : reader.readBarCodes())
                {
                    counter++;
                    Assert.assertNotNull(result.getCodeText());

                    Assert.assertEquals(result.getCodeText(), "Code text here");
                    Assert.assertNotNull(result.getCodeType());
                }

                Assert.assertNotEquals(counter, 0);
            } catch (Exception e)
            {
                Assert.fail("Exception", e);
            }

        }
    }
}
