package com.aspose.external.barcode.tester.issues;

import com.aspose.barcode.auxiliary.Global;
import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.CodeLocation;
import com.aspose.barcode.generation.DataMatrixEncodeMode;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LicenseAssistant;

import java.awt.image.BufferedImage;
import java.io.File;

public class Issue33258
{
    final String folder = Global.getTestDataFolder("Issues" + File.separator + "Issue33258");

    @BeforeMethod
    public void setUp()
    {
        LicenseAssistant.setupLicense();
    }

    @Test
    public void demo()
    {
        BarCodeReader reader = new BarCodeReader(folder + "aspose.png", DecodeType.DATA_MATRIX);
        Assert.assertEquals(reader.readBarCodes().length, 1);
        String s = ((Character)((char)240)).toString();
        for (int i = 0; i < 1000 - 1; ++i)
            s += (char)240;
        System.out.println(reader.getFoundBarCodes()[0].getCodeText());
        Assert.assertEquals(s, reader.getFoundBarCodes()[0].getCodeText());
    }

        @Test
    public void BuildAndRecognize249Symbols()
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATA_MATRIX);
        {
            String text = "" + ((char)240);
            for (int i = 0; i < 249 - 1; ++i)
                text += (char)240;

            gen.setCodeText(text);
            gen.getParameters().getBarcode().getCodeTextParameters().setLocation(CodeLocation.NONE);
            gen.getParameters().getBarcode().getDataMatrix().setDataMatrixEncodeMode(DataMatrixEncodeMode.BYTES);

            BufferedImage bitmap = gen.generateBarCodeImage();
            {
                BarCodeReader reader = new BarCodeReader(bitmap, DecodeType.DATA_MATRIX);
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(text, reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }

        @Test
    public void BuildAndRecognize250Symbols()
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATA_MATRIX);
        {
            String text = "" + ((char)240);
            for (int i = 0; i < 250 - 1; ++i)
                text += (char)240;

            gen.setCodeText(text);
            gen.getParameters().getBarcode().getCodeTextParameters().setLocation(CodeLocation.NONE);
            gen.getParameters().getBarcode().getDataMatrix().setDataMatrixEncodeMode(DataMatrixEncodeMode.BYTES);

            BufferedImage bitmap = gen.generateBarCodeImage();
            {

                BarCodeReader reader = new BarCodeReader(bitmap, DecodeType.DATA_MATRIX);
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(text, reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }

        @Test
    public void BuildAndRecognize1000Symbols()
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATA_MATRIX);
        {
            String text = "" + ((char)240);
            for (int i = 0; i < 1000 - 1; ++i)
                text += (char)240;

            gen.setCodeText(text);
            gen.getParameters().getBarcode().getCodeTextParameters().setLocation(CodeLocation.NONE);
            gen.getParameters().getBarcode().getDataMatrix().setDataMatrixEncodeMode(DataMatrixEncodeMode.BYTES);

            BufferedImage bitmap = gen.generateBarCodeImage();
            {

                BarCodeReader reader = new BarCodeReader(bitmap, DecodeType.DATA_MATRIX);
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(text, reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }

        @Test
    public void BuildAndRecognizeBrutForce()
    {
        for (int Size = 1; Size <= 425; Size++)
        {
            //Doesn't work with 72x72 size
            if (Size > 277 && Size < 365)
                continue;
            //Doesn't work with barcodes (incorrect recognition)
            if (Size == 390)
                continue;
            if (Size == 416)
                continue;
            if (Size == 424)
                continue;

            BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATA_MATRIX);
            {
                String text = "" + ((char)240);
                for (int i = 0; i < Size - 1; ++i)
                    text += (char)240;

                gen.setCodeText(text);
                gen.getParameters().getBarcode().getCodeTextParameters().setLocation(CodeLocation.NONE);
                gen.getParameters().getBarcode().getDataMatrix().setDataMatrixEncodeMode(DataMatrixEncodeMode.BYTES);

                BufferedImage bitmap = gen.generateBarCodeImage();
                {

                    BarCodeReader reader = new BarCodeReader(bitmap, DecodeType.DATA_MATRIX);
                    Assert.assertEquals(reader.readBarCodes().length, 1);
                    Assert.assertEquals(text, reader.getFoundBarCodes()[0].getCodeText());
                    Assert.assertEquals(text.length(), reader.getFoundBarCodes()[0].getCodeText().length());
                }
            }
        }
    }

        @Test
    public void BuildAndRecognize1301Symbols()
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATA_MATRIX);
        {
            String text = "" + ((char)240);
            for (int i = 0; i < 1301 - 1; ++i)
                text += (char)240;

            gen.setCodeText(text);
            gen.getParameters().getBarcode().getCodeTextParameters().setLocation(CodeLocation.NONE);
            gen.getParameters().getBarcode().getDataMatrix().setDataMatrixEncodeMode(DataMatrixEncodeMode.BYTES);

            BufferedImage bitmap = gen.generateBarCodeImage();
            {

                BarCodeReader reader = new BarCodeReader(bitmap, DecodeType.DATA_MATRIX);
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(text, reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }

        @Test
    public void BuildAndRecognize1300Symbols()
    {
        BarcodeGenerator gen = new BarcodeGenerator(EncodeTypes.DATA_MATRIX);
        {
            String text = "" + ((char)240);
            for (int i = 0; i < 1300 - 1; ++i)
                text += (char)240;

            gen.setCodeText(text);
            gen.getParameters().getBarcode().getCodeTextParameters().setLocation(CodeLocation.NONE);
            gen.getParameters().getBarcode().getDataMatrix().setDataMatrixEncodeMode(DataMatrixEncodeMode.BYTES);

            BufferedImage bitmap = gen.generateBarCodeImage();
            {

                BarCodeReader reader = new BarCodeReader(bitmap, DecodeType.DATA_MATRIX);
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(text, reader.getFoundBarCodes()[0].getCodeText());
            }
        }
    }
}
