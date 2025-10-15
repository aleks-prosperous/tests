package com.aspose.external.barcode.tester.issues;

// ********* THIS FILE IS AUTO PORTED *********

import com.aspose.barcode.barcoderecognition.BarCodeReader;
import com.aspose.barcode.barcoderecognition.ChecksumValidation;
import com.aspose.barcode.barcoderecognition.DecodeType;
import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.BaseEncodeType;
import com.aspose.barcode.generation.EnableChecksum;
import com.aspose.barcode.generation.EncodeTypes;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.image.BufferedImage;


@Test(description = "Tests for Issue33687.")
public class Issue33687
{
    @BeforeMethod
    public void setUp()
    {
        utils.LicenseAssistant.setupLicense();
    }

        @Test
    public void Planet()
    {
        BufferedImage bmp = generate(EncodeTypes.PLANET, "12345");
        {
            String offCodetext;
            BarCodeReader reader = new BarCodeReader(bmp, DecodeType.PLANET);
            {
                reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.OFF);
                Assert.assertEquals(reader.readBarCodes().length, 1);
                offCodetext = reader.getFoundBarCodes()[0].getExtended().getOneD().getValue();
            }

            reader = new BarCodeReader(bmp, DecodeType.PLANET);
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(offCodetext, reader.getFoundBarCodes()[0].getExtended().getOneD().getValue() + reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum());
            }
        }
    }

        @Test
    public void Postnet()
    {
        BufferedImage bmp = generate(EncodeTypes.POSTNET, "12345");
        {
            String offCodetext;
            BarCodeReader reader = new BarCodeReader(bmp, DecodeType.POSTNET);
            {
                reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.OFF);
                Assert.assertEquals(reader.readBarCodes().length, 1);
                offCodetext = reader.getFoundBarCodes()[0].getExtended().getOneD().getValue();
            }

            reader = new BarCodeReader(bmp, DecodeType.POSTNET);
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(offCodetext, reader.getFoundBarCodes()[0].getExtended().getOneD().getValue() + reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum());
            }
        }
    }

        @Test
    public void RM4SCC()
    {
        BufferedImage bmp = generate(EncodeTypes.RM_4_SCC, "12345");
        {
            String offCodetext;

            BarCodeReader reader = new BarCodeReader(bmp, DecodeType.RM_4_SCC);
            {
                reader.getBarcodeSettings().setChecksumValidation(ChecksumValidation.OFF);
                Assert.assertEquals(reader.readBarCodes().length, 1);
                offCodetext = reader.getFoundBarCodes()[0].getExtended().getOneD().getValue();
            }

            reader = new BarCodeReader(bmp, DecodeType.RM_4_SCC);
            {
                Assert.assertEquals(reader.readBarCodes().length, 1);
                Assert.assertEquals(offCodetext, reader.getFoundBarCodes()[0].getExtended().getOneD().getValue() + reader.getFoundBarCodes()[0].getExtended().getOneD().getCheckSum());
            }
        }
    }

    private static BufferedImage generate(BaseEncodeType symbology, String codetext)
    {
        BarcodeGenerator gen = new BarcodeGenerator(symbology, codetext);
        {
            gen.getParameters().getBarcode().setChecksumEnabled(EnableChecksum.DEFAULT);
            return gen.generateBarCodeImage();
        }
    }
}

